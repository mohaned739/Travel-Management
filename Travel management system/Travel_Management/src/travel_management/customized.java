/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel_management;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class customized extends javax.swing.JPanel {

    /**
     * Creates new form customized
     */
    Trip trip;
    static int choice;
    ArrayList<Client>clients;
    ArrayList<Trip> trips;
    Client client1;
    static int joined;
    public customized(Trip trip,ArrayList<Client>clients,int choice) {
        initComponents();
        this.trip=trip;
        this.choice=choice;
        this.clients=clients;
        nametext.setText(trip.getName());
        datetext.setText(trip.getDate());
        pricetext.setText(String.valueOf(trip.getPrice()));
        if (choice==1) {
            cancel_post.setVisible(false);
            view.setVisible(true);
            edit.setVisible(false);
            delete.setVisible(false);
            book.setVisible(false);
            select.setVisible(false);
            profit.setVisible (false);
        }
        else if (choice==2) {
            cancel_post.setVisible(false);
            view.setVisible(false);
            edit.setVisible(false);
            delete.setVisible(false);
            book.setVisible(false);
            select.setVisible(false);
            profit.setVisible (false);
        }
        else if (choice==3) {
            cancel_post.setVisible(true);
            view.setVisible(false);
            edit.setVisible(false);
            delete.setVisible(false);
            book.setVisible(false);
            select.setVisible(false);
            profit.setVisible (false);
        }
        else if (choice==4) {
            cancel_post.setVisible(false);
            view.setVisible(false);
            edit.setVisible(false);
            delete.setVisible(false);
            book.setVisible(true);
            select.setVisible(false);
            profit.setVisible (false);
        }
        else if (choice==5) {
            cancel_post.setVisible(false);
            view.setVisible(false);
            edit.setVisible(false);
            delete.setVisible(false);
            book.setVisible(false);
            select.setVisible(true);
            profit.setVisible (false);
        }
        else if (choice==6) {
             cancel_post.setVisible(false);
            view.setVisible(false);
            edit.setVisible(true);
            delete.setVisible(false);
            book.setVisible(false);
            select.setVisible(false);
            profit.setVisible (false);
        }
         else if (choice ==0)
        {
            cancel_post.setVisible(false);
            view.setVisible(false);
            edit.setVisible(false);
            delete.setVisible(false);
            book.setVisible(false);
            select.setVisible(false);
            profit.setVisible (true);
        }
         else if(choice==7){
            cancel_post.setVisible(false);
            view.setVisible(false);
            edit.setVisible(false);
            delete.setVisible(true);
            book.setVisible(false);
            select.setVisible(false);
            profit.setVisible (false);    
         }
    }
    
     public customized(Trip trip,Client client1,ArrayList<Client> clients, ArrayList<Trip> trips,int choice) {
        this(trip, clients, choice);
         initComponents();
      //  this.trip=trip;
      //  this.choice=choice;
      //  this.clients=clients;
        this.trips=trips;
        this.client1=client1;
        nametext.setText(trip.getName());
        datetext.setText(trip.getDate());
        pricetext.setText(String.valueOf(trip.getPrice()));
        if (choice==1) {
            cancel_post.setVisible(false);
            view.setVisible(true);
            edit.setVisible(false);
            delete.setVisible(false);
            book.setVisible(false);
            select.setVisible(false);
            profit.setVisible (false);
        }
        else if (choice==2) {
            cancel_post.setVisible(false);
            view.setVisible(false);
            edit.setVisible(false);
            delete.setVisible(false);
            book.setVisible(false);
            select.setVisible(false);
            profit.setVisible (false);
        }
        else if (choice==3) {
            cancel_post.setVisible(true);
            view.setVisible(false);
            edit.setVisible(false);
            delete.setVisible(false);
            book.setVisible(false);
            select.setVisible(false);
            profit.setVisible (false);
        }
        else if (choice==4) {
            cancel_post.setVisible(false);
            view.setVisible(false);
            edit.setVisible(false);
            delete.setVisible(false);
            book.setVisible(true);
            select.setVisible(false);
            profit.setVisible (false);
        }
        else if (choice==5) {
            cancel_post.setVisible(false);
            view.setVisible(false);
            edit.setVisible(false);
            delete.setVisible(false);
            book.setVisible(false);
            select.setVisible(true);
            profit.setVisible (false);

        }
        else if (choice==6) {
            cancel_post.setVisible(false);
            view.setVisible(false);
            edit.setVisible(true);
            delete.setVisible(false);
            book.setVisible(false);
            select.setVisible(false);
             profit.setVisible (false);
        }
         else if (choice ==0)
        {
            cancel_post.setVisible(false);
            view.setVisible(false);
            edit.setVisible(false);
            delete.setVisible(false);
            book.setVisible(false);
            select.setVisible(false);
            profit.setVisible (true);
        }
        else if(choice==7){
            cancel_post.setVisible(false);
            view.setVisible(false);
            edit.setVisible(false);
            delete.setVisible(true);
            book.setVisible(false);
            select.setVisible(false);
            profit.setVisible (false);    
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

        jPanel1 = new javax.swing.JPanel();
        namelabel = new javax.swing.JLabel();
        nametext = new javax.swing.JTextField();
        datelabel = new javax.swing.JLabel();
        datetext = new javax.swing.JTextField();
        pricelabel = new javax.swing.JLabel();
        pricetext = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        view = new javax.swing.JPanel();
        viewbutton = new javax.swing.JButton();
        edit = new javax.swing.JPanel();
        editbutton = new javax.swing.JButton();
        delete = new javax.swing.JPanel();
        deletebutton = new javax.swing.JButton();
        book = new javax.swing.JPanel();
        bookbutton = new javax.swing.JButton();
        cancel_post = new javax.swing.JPanel();
        cancelbutton = new javax.swing.JButton();
        postbutton = new javax.swing.JButton();
        select = new javax.swing.JPanel();
        selectbutton = new javax.swing.JButton();
        profit = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(0, 102, 102));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        namelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namelabel.setText("Name : ");

        nametext.setEditable(false);
        nametext.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        nametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametextActionPerformed(evt);
            }
        });

        datelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        datelabel.setText("Date :");

        datetext.setEditable(false);
        datetext.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        datetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetextActionPerformed(evt);
            }
        });

        pricelabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pricelabel.setText("Price :");

        pricetext.setEditable(false);
        pricetext.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        pricetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricetextActionPerformed(evt);
            }
        });

        viewbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewbutton.setText("View");
        viewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(viewbutton)
                .addGap(0, 0, 0))
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        editbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editbutton.setText("Edit");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(editbutton)
                .addGap(0, 0, 0))
        );
        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        deletebutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deletebutton))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bookbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bookbutton.setText("Book");
        bookbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookLayout = new javax.swing.GroupLayout(book);
        book.setLayout(bookLayout);
        bookLayout.setHorizontalGroup(
            bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookLayout.createSequentialGroup()
                .addComponent(bookbutton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bookLayout.setVerticalGroup(
            bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bookbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cancelbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelbutton.setText("Cancel");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });

        postbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        postbutton.setText("Postpone");
        postbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cancel_postLayout = new javax.swing.GroupLayout(cancel_post);
        cancel_post.setLayout(cancel_postLayout);
        cancel_postLayout.setHorizontalGroup(
            cancel_postLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancel_postLayout.createSequentialGroup()
                .addComponent(postbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelbutton)
                .addGap(0, 0, 0))
        );
        cancel_postLayout.setVerticalGroup(
            cancel_postLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancel_postLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(cancel_postLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(postbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        selectbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selectbutton.setText("Select");
        selectbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectLayout = new javax.swing.GroupLayout(select);
        select.setLayout(selectLayout);
        selectLayout.setHorizontalGroup(
            selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(selectbutton))
        );
        selectLayout.setVerticalGroup(
            selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(selectbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        profit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        profit.setText("Profit");
        profit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(profit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel_post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel_post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(profit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(select, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(view, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(edit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(delete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(book, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cancel_post, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(select, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(profit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namelabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datetext, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pricetext, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane1)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pricetext, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametextActionPerformed

    }//GEN-LAST:event_nametextActionPerformed

    private void datetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetextActionPerformed

    }//GEN-LAST:event_datetextActionPerformed

    private void pricetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricetextActionPerformed

    }//GEN-LAST:event_pricetextActionPerformed

    private void viewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbuttonActionPerformed
        // TODO add your handling code here:
        Secondary_Frame sf=new Secondary_Frame(trip, client1, trips, 3);
        sf.setLocationRelativeTo(null);
        sf.setVisible(true);
    }//GEN-LAST:event_viewbuttonActionPerformed

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        // TODO add your handling code here:
        int choice2=JOptionPane.showConfirmDialog(null,"Are You Sure You Want To Cancel This Reservation ?");
        if (choice2==0) {
        this.setVisible(false);
        int update= trip.getNumber_of_joined();
         int i=0;
         for(Trip trip1:client1.getTrips()){
             if (trip1.equals(trip)) {
                 update-=trip1.tickets.get(i);
                 trip1.setNumber_of_joined(update);
                 break;
             }
             i++;
         }
        client1.trips.remove(trip); 
     
        }
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void bookbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookbuttonActionPerformed
        // TODO add your handling code here:
         String name=JOptionPane.showInputDialog("Enter Client's Name");
         String id=JOptionPane.showInputDialog(" Enter ID Of The Client You Want To Edit ");
            boolean found=false;
            for (Client client : clients) {
                if (name.equals(client.getName())&&id.equals(client.getID())){
                     int num_of_joined=Integer.valueOf(JOptionPane.showInputDialog(" How Many Tickets You Want To Book "));
                     if (num_of_joined>(trip.getNumber_of_tourists()-trip.getNumber_of_joined())) {
                        JOptionPane.showMessageDialog(null,"There is only ( "+(trip.getNumber_of_tourists()-trip.getNumber_of_joined())+" ) Place Available");
                     found = true;
                     break;
                     }
                     else{
                   // client.setTickets(num_of_joined);
                         trip.tickets.add(num_of_joined);
//            for(Trip trip1:client.getTrips()){
//             if (trip1.equals(trip)) {
//                 trip1.tickets.add(num_of_joined);
//                 break;
//             }
                     client.trips.add(trip);
                     trip.Client.add(client);
                     int joined=(num_of_joined+trip.getNumber_of_joined());
                     trip.setNumber_of_joined(joined);
                     JOptionPane.showMessageDialog(null, "Booked Successfully");
                     found = true;
                     break;
                
                     }
                }
            }
            if (found==false) {
                JOptionPane.showMessageDialog(null,"CAN NOT FIND CLIENT","Error",JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_bookbuttonActionPerformed

    private void postbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postbuttonActionPerformed
        // TODO add your handling code here:
        client1.trips.remove(trip);
        trip.Client.remove(client1);
       // this.setVisible(false);
        int update= trip.getNumber_of_joined();
        joined= trip.getNumber_of_joined();
        int i=0;
        for(Trip trip1:client1.getTrips()){
             if (trip1.equals(trip)) {
                 update-=trip1.tickets.get(i);
                 trip1.setNumber_of_joined(update);
                 break;
             }
             i++;
         }
        //trip.setNumber_of_joined(update);
        Secondary_Frame sf=new Secondary_Frame(trip, client1, trips, 1);
        sf.setLocationRelativeTo(null);
        sf.setVisible(true);
    }//GEN-LAST:event_postbuttonActionPerformed

    private void selectbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbuttonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Trip is Postponed Successfully ,Please Close This Frame And Click Refresh Button");
        trip.setNumber_of_joined(joined+trip.getNumber_of_joined());
        client1.trips.add(trip);
        client1.trips.get(client1.trips.size()-1).tickets.add(joined);
        trip.tickets.add(joined);
    }//GEN-LAST:event_selectbuttonActionPerformed

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
        // TODO add your handling code here:
        Secondary_Frame sf=new Secondary_Frame(trip, client1, trips, 2);
        sf.setLocationRelativeTo(null);
        sf.setVisible(true);
    }//GEN-LAST:event_editbuttonActionPerformed

    private void profitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profitActionPerformed
        // TODO add your handling code here:
            trip.setProfit(trip.getNumber_of_joined()*trip.getPrice()) ;
            Secondary_Frame s= new Secondary_Frame(trip, client1, trips, choice);
            s.setVisible(true);
    }//GEN-LAST:event_profitActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
        trip.getGuide().available=true;
        trip.getGuide().setTrip(null);
        for(Client client3 : clients){    
        for(Trip trip1 : client3.trips){
            if (trip.equals(trip1)) {
                client3.trips.remove(trip1);
            }
        }
        }
        trips.remove(trip);
        this.setVisible(false);
    }//GEN-LAST:event_deletebuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel book;
    private javax.swing.JButton bookbutton;
    private javax.swing.JPanel cancel_post;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JLabel datelabel;
    private javax.swing.JTextField datetext;
    private javax.swing.JPanel delete;
    private javax.swing.JButton deletebutton;
    private javax.swing.JPanel edit;
    private javax.swing.JButton editbutton;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namelabel;
    private javax.swing.JTextField nametext;
    private javax.swing.JButton postbutton;
    private javax.swing.JLabel pricelabel;
    private javax.swing.JTextField pricetext;
    private javax.swing.JButton profit;
    private javax.swing.JPanel select;
    private javax.swing.JButton selectbutton;
    private javax.swing.JPanel view;
    private javax.swing.JButton viewbutton;
    // End of variables declaration//GEN-END:variables
}
