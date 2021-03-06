/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_management;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class View_client extends javax.swing.JPanel {

    /**
     * Creates new form View_client
     */
         Client client;
         ArrayList<Trip>prev_trips=new ArrayList<Trip>();
         ArrayList<Trip>curr_trips=new ArrayList<Trip>();
         ArrayList<Trip>coming_trips=new ArrayList<Trip>();
          ArrayList<Trip> trips;
         customized c;
         GridBagLayout layout =new GridBagLayout();
    public View_client(Client client, ArrayList<Trip> trips)throws ParseException {
        initComponents();
        this.client=client;
        this.trips=trips;
        previouspanel.setLayout(layout);
        currentpanel.setLayout(layout);
        comingpanel.setLayout(layout);
        GridBagConstraints c1=new GridBagConstraints();
        GridBagConstraints c2=new GridBagConstraints();
        GridBagConstraints c3=new GridBagConstraints();
        c1.gridx=c2.gridx=c3.gridx=0;
        c1.gridy=c2.gridy=c3.gridy=0;
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date currentdate=sdf.parse(sdf.format(new Date()));
        for(Trip trip : this.client.getTrips()){
                Date tripdate=sdf.parse(trip.getDate());
            if (currentdate.compareTo(tripdate)<0) {
                coming_trips.add(trip);
            }
            else if(currentdate.compareTo(tripdate)>0){
                prev_trips.add(trip);
            }
            else if (currentdate.compareTo(tripdate)==0) {
                curr_trips.add(trip);
            }
        }
        nametext.setText(client.getName());
        nametext.setEditable(false);
        agetext.setText(String.valueOf(client.getAge()));
        agetext.setEditable(false);
        idtext.setText(client.getID());
        idtext.setEditable(false);
        ArrayList<Client> clients=new ArrayList<Client>();
        for (Trip trip : prev_trips) {
            c=new customized(trip,client,clients,trips,2);
            previouspanel.add(c,c1);
            c.setVisible(true);
            c1.gridy+=10;
        }
         for (Trip trip : curr_trips) {
            c=new customized(trip,client,clients,trips,2);
            currentpanel.add(c,c2);
            c.setVisible(true);
            c2.gridy+=10;
        }
          for (Trip trip : coming_trips) {
            c=new customized(trip,client,clients,trips,3);
            comingpanel.add(c,c3);
            c.setVisible(true);
            c3.gridy+=10;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nametext = new javax.swing.JTextField();
        agetext = new javax.swing.JTextField();
        idtext = new javax.swing.JTextField();
        tripspanel = new javax.swing.JTabbedPane();
        previoustrips = new javax.swing.JScrollPane();
        previouspanel = new javax.swing.JPanel();
        currenttrips = new javax.swing.JScrollPane();
        currentpanel = new javax.swing.JPanel();
        comingtrips = new javax.swing.JScrollPane();
        comingpanel = new javax.swing.JPanel();
        refreshbutton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51), 5));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Age :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("ID : ");

        nametext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametextActionPerformed(evt);
            }
        });

        agetext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        idtext.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        tripspanel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        javax.swing.GroupLayout previouspanelLayout = new javax.swing.GroupLayout(previouspanel);
        previouspanel.setLayout(previouspanelLayout);
        previouspanelLayout.setHorizontalGroup(
            previouspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 934, Short.MAX_VALUE)
        );
        previouspanelLayout.setVerticalGroup(
            previouspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );

        previoustrips.setViewportView(previouspanel);

        tripspanel.addTab("Previous Trips", previoustrips);

        javax.swing.GroupLayout currentpanelLayout = new javax.swing.GroupLayout(currentpanel);
        currentpanel.setLayout(currentpanelLayout);
        currentpanelLayout.setHorizontalGroup(
            currentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 934, Short.MAX_VALUE)
        );
        currentpanelLayout.setVerticalGroup(
            currentpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );

        currenttrips.setViewportView(currentpanel);

        tripspanel.addTab("Current Trips", currenttrips);

        javax.swing.GroupLayout comingpanelLayout = new javax.swing.GroupLayout(comingpanel);
        comingpanel.setLayout(comingpanelLayout);
        comingpanelLayout.setHorizontalGroup(
            comingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 934, Short.MAX_VALUE)
        );
        comingpanelLayout.setVerticalGroup(
            comingpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );

        comingtrips.setViewportView(comingpanel);

        tripspanel.addTab("Coming Trips", comingtrips);

        refreshbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel_management/refreshicon.png"))); // NOI18N
        refreshbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tripspanel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nametext, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                            .addComponent(idtext)
                            .addComponent(agetext))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refreshbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametext))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agetext, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idtext, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tripspanel, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametextActionPerformed

    private void refreshbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbuttonActionPerformed
             try {
                 // TODO add your handling code here:
                 GridBagConstraints c3=new GridBagConstraints();
                 c3.gridx=c3.gridy=0;
                 SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
                 Date currentdate=sdf.parse(sdf.format(new Date()));
                 coming_trips=new ArrayList<Trip>();
                ArrayList<Client> clients=new ArrayList<Client>();
                 for(Trip trip : this.client.getTrips()){
                     Date tripdate=sdf.parse(trip.getDate());
                     if (currentdate.compareTo(tripdate)<0) {
                         coming_trips.add(trip);
                     }
                 }
                 for (Trip trip : coming_trips) {
                     c=new customized(trip,client,clients,trips,3);
                     comingpanel.add(c,c3);
                     c.setVisible(true);
                     c3.gridy+=10;
                 }    } catch (ParseException ex) {
                 Logger.getLogger(View_client.class.getName()).log(Level.SEVERE, null, ex);
             }
             
          //   this.repaint();
           //  this.validate();
        
    }//GEN-LAST:event_refreshbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agetext;
    private javax.swing.JPanel comingpanel;
    private javax.swing.JScrollPane comingtrips;
    private javax.swing.JPanel currentpanel;
    private javax.swing.JScrollPane currenttrips;
    private javax.swing.JTextField idtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nametext;
    private javax.swing.JPanel previouspanel;
    private javax.swing.JScrollPane previoustrips;
    private javax.swing.JButton refreshbutton;
    private javax.swing.JTabbedPane tripspanel;
    // End of variables declaration//GEN-END:variables
}
