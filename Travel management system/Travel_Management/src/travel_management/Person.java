/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_management;
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Dell
 */
abstract public class Person {
   private String name;
   private String ID;
   private int age;
   
   abstract public  Person search(ArrayList<? extends Person>person);
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}


class Client extends Person{
    protected ArrayList<Trip> trips=new ArrayList<Trip>();
      public Client(){
      super();
      }

    public ArrayList<Trip> getTrips() {
        return trips;
    }

    public void setTrips(ArrayList<Trip> trips) {
        this.trips = trips;
    }

//    public int getTickets() {
//        return tickets;
//    }
//
//    public void setTickets(int tickets) {
//        this.tickets = tickets;
//    }

    @Override
   public Person search(ArrayList<? extends Person> person) {
       Person person1=null;
       String name=JOptionPane.showInputDialog("Enter Client's Name");
            String id=JOptionPane.showInputDialog(" Enter ID Of The Client");
            boolean found=false;
            for (Person client : person) {
                if (name.equals(client.getName())&&id.equals(client.getID())){
                found=true;
                person1=client;
                   break;
                } 
            }
            if (found==false) {
                JOptionPane.showMessageDialog(null,"CAN NOT FIND CLIENT","Error",JOptionPane.ERROR_MESSAGE);
            }
            return person1;
    }
    
}

class Tour_Guide extends Person{
                
    boolean available;
    private double salary;
    private Trip trip;
    ArrayList<Trip>prev_trip=new ArrayList<Trip>();
   
    public Tour_Guide ()
    { 
        super();
        available=true;
    }
    

   public void check ()throws ParseException{
       if (trip!=null) {    
         SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
         Date currentdate=sd.parse(sd.format(new Date()));
          Date tripdatee=sd.parse(trip.getEnd_Date());
            if(currentdate.compareTo(tripdatee)>0){
                prev_trip.add(trip);
                available=true;
            }
       }
    }
   

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
   
     public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    @Override
    public Person search(ArrayList<? extends Person> person) {
   Person person1=null;
       String name=JOptionPane.showInputDialog("Enter Tour Guide's Name");
            String id=JOptionPane.showInputDialog(" Enter ID Of The Tour Guide");
            boolean found=false;
            for (Person tour_guide : person) {
                if (name.equals(tour_guide.getName())&&id.equals(tour_guide.getID())){
                found=true;
                person1=tour_guide;
                break;
                } 
            }
            if (found==false) {
                JOptionPane.showMessageDialog(null,"CAN NOT FIND TOUR GUIDE","Error",JOptionPane.ERROR_MESSAGE);
            }
            return person1;
    }

   
}



