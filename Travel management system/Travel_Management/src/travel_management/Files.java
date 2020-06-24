/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_management;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author toshiba
 */
public class Files {
    
    
    
    public static void FileWriteer(ArrayList<Trip>trips,ArrayList<Tour_Guide>tour_guide,ArrayList<Client>clients)
    {
       
                   try{
                  java.io.File fng=new java.io.File("saveTourGuide.txt");
                  FileWriter fwg=new FileWriter(fng);
                  Writer output=new BufferedWriter(fwg);
                         int size=tour_guide.size();
                         for(int i =0;i<size;i++)
                         {
                         output.write(tour_guide.get(i).getID());
                         output.write("*");
                         output.write(tour_guide.get(i).getName());
                         output.write("*");
                         output.write(String.valueOf(tour_guide.get(i).getAge()));
                         output.write("*");
                         output.write(String.valueOf(tour_guide.get(i).getSalary()));
                         output.write("*");
                             if (tour_guide.get(i).available==true) {
                         output.write(String.valueOf(1));
                             }
                             else{
                                 output.write(String.valueOf(0));
                             }
                         output.write("*");
                             if (tour_guide.get(i).getTrip()!=null) {
                         output.write(tour_guide.get(i).getTrip().getDate());
                         output.write("*");
                         output.write(tour_guide.get(i).getTrip().getEnd_Date());
                         output.write("*");
                         output.write(tour_guide.get(i).getTrip().getName());
                             }
                         output.write("*");
                          for (Trip tripS :tour_guide.get(i).prev_trip) {
                 
                                 output.write(tripS.getDate());
                                 output.write("$");
                                 output.write(tripS.getEnd_Date());
                                output.write("$");
                                output.write(tripS.getName());
                                output.write("#");                              
                             }
                         output.write("\n");
                         }
                         output.close();
               }catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                     }
                 
               try{
                  java.io.File fnc=new java.io.File("saveClient.txt");
                  FileWriter fwc=new FileWriter(fnc);
                  Writer output=new BufferedWriter(fwc);
                         int size=clients.size();
                         for(int i =0;i<size;i++){          
                         output.write(clients.get(i).getName());
                         output.write("*");
                         output.write(String.valueOf(String.valueOf(clients.get(i).getAge())));
                         output.write("*");
                         output.write(clients.get(i).getID());
                         output.write("*");
                              for (Trip tripS :clients.get(i).getTrips()) {
                                 int j=0;
                                 output.write(tripS.getName());
                                 output.write("$");
                                 output.write(tripS.getDate());
                                 output.write("$");
                                 output.write(tripS.getEnd_Date());
                                 output.write("$");
                                  if (tripS.tickets.size()>=0) {
                                 output.write(String.valueOf(tripS.tickets.get(j)));     
                                  }
                                 output.write("#");
                                 j++;
                             }
                         output.write("\n");
                         
                         }
                         output.close();
               }catch (IOException ex) {
                         JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                     }
                     try {
                            java.io.File fn=new java.io.File("save.txt");
                         FileWriter fw=new FileWriter(fn);
                         Writer output=new BufferedWriter(fw);
                         int size=trips.size();
                         for(int i =0;i<size;i++)
         {
         
         output.write(trips.get(i).getID1());
         output.write("*");
         output.write(trips.get(i).getDate());
         output.write("*");
          output.write(trips.get(i).getEnd_Date());
          output.write("*");
          output.write(trips.get(i).getName());
          output.write("*");
          output.write(String.valueOf(trips.get(i).getPrice()));
          output.write("*");
          output.write(String.valueOf(trips.get(i).getNumber_of_tourists()));
          output.write("*");
          output.write(trips.get(i).getCategory());
          output.write("*");
          output.write(trips.get(i).getDescription());
          output.write("*");
          output.write(trips.get(i).getGuide().getID());
          output.write("*");
          output.write(String.valueOf(trips.get(i).getNumber_of_joined()));
          output.write("*");
          int j=0;
                             for (Client client :trips.get(i).Client) {
                                 output.write(client.getID());
                                 output.write("$");
                                 output.write(String.valueOf(trips.get(i).tickets.get(j)));
                                 output.write("#");
                                 j++;
                             }                   
          output.write("*");
             if (trips.get(i).getPath()!=null) {
                output.write(trips.get(i).getPath());
             }
          output.write("\n"); 
        }
                         output.close();
                         
                     } catch (IOException ex) {
                         JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                     }
    }
    
    public static void readfromfile(ArrayList<Trip>trips,ArrayList<Client>clients,ArrayList<Tour_Guide>tour_guides){
        try {
           Scanner scanner=new Scanner(new File("save.txt"));
           while(scanner.hasNext()){
               String line=scanner.nextLine();
               String[]data=line.split("\\*");
              Trip t=new Trip();
              t.setID1(data[0]);
              t.setDate(data[1]);
              t.setEnd_Date(data[2]);
              t.setName(data[3]);
              t.setPrice(Double.valueOf(data[4]));
              t.setNumber_of_tourists(Integer.valueOf(data[5]));
              t.setCategory(data[6]);
              t.setDescription(data[7]);
              Tour_Guide tg=new Tour_Guide();
              tg.setID(data[8]);
              t.setGuide(tg);
              t.setNumber_of_joined(Integer.valueOf(data[9]));
               if (data.length==12) {
              t.setPath(data[11]);     
               }
               if (data.length>10) {
              String[]clientdata=data[10].split("#");
              //int []tickets=new int[clientdata.length];
               if (!"".equals(clientdata[0])) {
               for (int i = 0; i < clientdata.length; i++) {
                   String[]data2=clientdata[i].split("\\$");
                   Client client=new Client();
                   client.setID(data2[0]);
                   client.trips.add(t);
                   //tickets[i]=Integer.valueOf(data2[1]);
                  
                   t.tickets.add(Integer.valueOf(data2[1]));    
                   t.Client.add(client);
               }
               }
               }
//               int i =0;
//               for(Client client : t.Client){
//                   for(Trip trip:client.trips){
//                       if (trip.equals(t)) {
//                           trip.setTickets(tickets[i]);
//                       }
//                   }
//                  i++; 
//               }
               trips.add(t);
           }
            scanner.close();
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            Scanner scanner=new Scanner(new File("saveClient.txt"));
            while(scanner.hasNext()){
               String line=scanner.nextLine();
               String[]data=line.split("\\*"); 
               Client client=new Client();
               client.setName(data[0]);
               client.setAge(Integer.valueOf(data[1]));
               client.setID(data[2]);
                if (data.length>3) {
               String[]clientdata=data[3].split("#");
               for (int i = 0; i < clientdata.length; i++) {
                   String[]data2=clientdata[i].split("\\$");
                   Trip trip=new Trip();
                   trip.setName(data2[0]);
                   trip.setDate(data2[1]);
                   trip.setEnd_Date(data2[2]);
                   trip.tickets.add(Integer.valueOf(data2[3]));
                   client.trips.add(trip);
               }
                }
               clients.add(client);
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        try {
            Scanner scanner=new Scanner(new File("saveTourGuide.txt"));
            while(scanner.hasNext()){
               String line=scanner.nextLine();
               String[]data=line.split("\\*"); 
               Tour_Guide tg=new Tour_Guide();
               tg.setID(data[0]);
               tg.setName(data[1]);
               tg.setAge(Integer.valueOf(data[2]));
               tg.setSalary(Double.valueOf(data[3]));
                if (data[4]=="1") {
                 tg.available=true;   
                }
                else{
                     tg.available=false;
                }
                Trip trip1=new Trip();
                trip1.setDate(data[5]);
                trip1.setEnd_Date(data[6]);
                trip1.setName(data[7]);
                tg.setTrip(trip1);
                if (data.length>8) {
               String[] tripdata=data[8].split("#");
                for (int i = 0; i < tripdata.length; i++) {
                   String[]data2=tripdata[i].split("\\$");
                   Trip trip=new Trip();
                   trip.setName(data2[2]);
                   trip.setDate(data2[0]);
                   trip.setEnd_Date(data2[1]);
                   tg.prev_trip.add(trip);
               }
                }
                tour_guides.add(tg);
            }
            scanner.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        for(Trip trip:trips){
            for(Tour_Guide tg:tour_guides){
                if(tg.getID().equals(trip.getGuide().getID())){
                    trip.setGuide(tg);
                    break;
                }
            }
            for(Client c1:trip.Client){
            for(Client client:clients){
                if (client.getID().equals(c1.getID())) {
                    c1.setName(client.getName());
                    c1.setAge(client.getAge());
                }
            }
        }
        }
        for(Client client:clients){
            for(Trip trip1:client.trips ){
            for(Trip trip:trips){
                if (trip.getDate().equals(trip1.getDate())&&trip.getEnd_Date().equals(trip1.getEnd_Date())&&trip.getName().equals(trip1.getName())) {
                    trip1.setCategory(trip.getCategory());
                    trip1.setDescription(trip.getDescription());
                    trip1.setGuide(trip.getGuide());
                    trip1.setNumber_of_joined(trip.getNumber_of_joined());
                    trip1.setNumber_of_tourists(trip.getNumber_of_tourists());
                    trip1.setPrice(trip.getPrice());
                    trip1.setProfit(trip.getProfit());
                    break;
                }
            }
         }
       }
      for(Tour_Guide tg:tour_guides){
          for(Trip trip1:tg.prev_trip ){
            for(Trip trip:trips){
                 if (trip.getDate().equals(trip1.getDate())&&trip.getEnd_Date().equals(trip1.getEnd_Date())&&trip.getName().equals(trip1.getName())) {
                    trip1.setCategory(trip.getCategory());
                    trip1.setDescription(trip.getDescription());
                    trip1.setGuide(trip.getGuide());
                    trip1.setNumber_of_joined(trip.getNumber_of_joined());
                    trip1.setNumber_of_tourists(trip.getNumber_of_tourists());
                    trip1.setPrice(trip.getPrice());
                    trip1.setProfit(trip.getProfit());
                    break;
                }
                
            }
          }
      }  
        
    }
    
    
    
    
    
}
