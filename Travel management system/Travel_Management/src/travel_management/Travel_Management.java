/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_management;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JFrame;
/**
 *
 * @author Dell
 */
public class Travel_Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ParseException {
        ArrayList<Client> clients=new ArrayList<Client>();
        ArrayList<Trip> trips=new ArrayList<Trip>();
        ArrayList<Trip> history=new ArrayList<Trip>();
        ArrayList<Tour_Guide> tour_guide=new ArrayList<Tour_Guide>();
        Files.readfromfile(trips, clients, tour_guide);
        Mainframe w=new Mainframe(clients,trips,tour_guide,history);
        w.setLocationRelativeTo(null);
        w.setExtendedState(w.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        w.setVisible(true);
        
    }
    
}
