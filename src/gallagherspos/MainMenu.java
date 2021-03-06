/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallagherspos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author TrollOutpost
 */
public class MainMenu extends javax.swing.JFrame {

    ArrayList<OrderItem> order;
    double cost;
    DefaultListModel orderModel;
    private NumberFormat currencyFormat;
    
    /**
     * Creates new form MainMenu
     */
    String username;
    public MainMenu(String user) {
        orderModel = new DefaultListModel();
        initComponents();
        order = new ArrayList<>();
        username = user;
        lblUsername.setText(username);
        currencyFormat = NumberFormat.getCurrencyInstance();
        try {
            
            Socket clientSocket = new Socket("localhost", 3213);
            OutputStream os = clientSocket.getOutputStream();  
            ObjectOutputStream oos = new ObjectOutputStream(os); 
        } catch (IOException ex) {
            JOptionPane.showConfirmDialog(null, "Socket Creation Failed","Socket Creation Failed", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    public void addToOrder(OrderItem oi) {
        order.add(oi);
        cost += oi.price;
        orderModel.addElement(oi.toString());
        lblSubTotal.setText(String.format("%10.2f",cost));
        lblTax.setText(String.format("%10.2f",.055*cost));
        lblTotal.setText(String.format("%10.2f",1.055*cost));
        
        //jFormattedTextField1.set
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        openPizzaMenu = new javax.swing.JButton();
        openPastaMenu = new javax.swing.JButton();
        setDelivery = new javax.swing.JButton();
        setPickup = new javax.swing.JButton();
        setDineIn = new javax.swing.JButton();
        lblOrderType = new javax.swing.JLabel();
        bSubmit = new javax.swing.JButton();
        orderListPane = new javax.swing.JScrollPane();
        orderList = new javax.swing.JList(orderModel);
        bAppetizerMenu = new javax.swing.JButton();
        bSpecialtiesMenu = new javax.swing.JButton();
        bSandwichesMenu = new javax.swing.JButton();
        bSalads = new javax.swing.JButton();
        bBeverages = new javax.swing.JButton();
        bLogout = new javax.swing.JButton();
        lblLoggedin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblSubTotals = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lbltaxes = new javax.swing.JLabel();
        lbltotals = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        openPizzaMenu.setText("Pizza");
        openPizzaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openPizzaMenuActionPerformed(evt);
            }
        });

        openPastaMenu.setText("Pasta");
        openPastaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openPastaMenuActionPerformed(evt);
            }
        });

        setDelivery.setText("Delivery");
        setDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDeliveryActionPerformed(evt);
            }
        });

        setPickup.setText("Pick-up");
        setPickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setPickupActionPerformed(evt);
            }
        });

        setDineIn.setText("Dine-in");
        setDineIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDineInActionPerformed(evt);
            }
        });

        lblOrderType.setText("Select order type");

        bSubmit.setBackground(new java.awt.Color(51, 255, 51));
        bSubmit.setText("Submit");
        bSubmit.setEnabled(false);

        orderList.setToolTipText("");
        orderList.setVisibleRowCount(10);
        orderListPane.setViewportView(orderList);

        bAppetizerMenu.setText("Appetizers");
        bAppetizerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAppetizerMenuActionPerformed(evt);
            }
        });

        bSpecialtiesMenu.setText("Specialties");
        bSpecialtiesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSpecialtiesMenuActionPerformed(evt);
            }
        });

        bSandwichesMenu.setText("Sandwiches");
        bSandwichesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSandwichesMenuActionPerformed(evt);
            }
        });

        bSalads.setText("Salads");
        bSalads.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaladsActionPerformed(evt);
            }
        });

        bBeverages.setText("Beverages");

        bLogout.setText("Logout");
        bLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLogoutActionPerformed(evt);
            }
        });

        lblLoggedin.setText("Logged in as: ");

        lblSubTotals.setText("Subtotal:");

        lblSubTotal.setText("0.00");

        lbltaxes.setText("Tax (5.5%): ");

        lbltotals.setText("Total:");

        lblTax.setText("0.00");

        lblTotal.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLoggedin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(openPizzaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bAppetizerMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(openPastaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bSandwichesMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bSpecialtiesMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bSalads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bBeverages, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orderListPane, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbltaxes)
                                            .addComponent(lblSubTotals)
                                            .addComponent(lbltotals))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTotal)
                                            .addComponent(lblSubTotal)
                                            .addComponent(lblTax))))))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bLogout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(setDelivery)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(setPickup)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(setDineIn))
                            .addComponent(lblOrderType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(openPizzaMenu)
                        .addGap(18, 18, 18)
                        .addComponent(bAppetizerMenu)
                        .addGap(20, 20, 20)
                        .addComponent(bSandwichesMenu)
                        .addGap(18, 18, 18)
                        .addComponent(openPastaMenu)
                        .addGap(18, 18, 18)
                        .addComponent(bSpecialtiesMenu)
                        .addGap(18, 18, 18)
                        .addComponent(bSalads)
                        .addGap(18, 18, 18)
                        .addComponent(bBeverages))
                    .addComponent(orderListPane))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblOrderType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bLogout)
                                    .addComponent(setDelivery)
                                    .addComponent(setPickup)
                                    .addComponent(setDineIn)))
                            .addComponent(bSubmit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSubTotals)
                            .addComponent(lblSubTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltaxes)
                            .addComponent(lblTax))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltotals)
                            .addComponent(lblTotal))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoggedin)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDeliveryActionPerformed
        lblOrderType.setText("Order Type: Delivery");
        bSubmit.setEnabled(true);
    }//GEN-LAST:event_setDeliveryActionPerformed

    private void setPickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setPickupActionPerformed
        lblOrderType.setText("Order Type: Pick-up");
        bSubmit.setEnabled(true);
    }//GEN-LAST:event_setPickupActionPerformed

    private void setDineInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDineInActionPerformed
        lblOrderType.setText("Order Type: Dine-in");
        bSubmit.setEnabled(true);
    }//GEN-LAST:event_setDineInActionPerformed

    private void openPizzaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openPizzaMenuActionPerformed
        PizzaMenu pm = new PizzaMenu(this);
        pm.setVisible(true);
    }//GEN-LAST:event_openPizzaMenuActionPerformed

    private void openPastaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openPastaMenuActionPerformed
        PastaMenu pm = new PastaMenu(this);
        pm.setVisible(true);
    }//GEN-LAST:event_openPastaMenuActionPerformed

    private void bSpecialtiesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSpecialtiesMenuActionPerformed
        SpecialtyMenu sm = new SpecialtyMenu(this);
        sm.setVisible(true);
    }//GEN-LAST:event_bSpecialtiesMenuActionPerformed

    private void bAppetizerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAppetizerMenuActionPerformed
        AppetizerMenu am = new AppetizerMenu(this);
        am.setVisible(true);
    }//GEN-LAST:event_bAppetizerMenuActionPerformed

    private void bSandwichesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSandwichesMenuActionPerformed
        SandwichesMenu sm = new SandwichesMenu(this);
        sm.setVisible(true);
    }//GEN-LAST:event_bSandwichesMenuActionPerformed

    private void bLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLogoutActionPerformed
        int setting = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION); 
        if(setting == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_bLogoutActionPerformed

    private void bSaladsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaladsActionPerformed
        SaladMenu sm = new SaladMenu(this);
        sm.setVisible(true);
    }//GEN-LAST:event_bSaladsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAppetizerMenu;
    private javax.swing.JButton bBeverages;
    private javax.swing.JButton bLogout;
    private javax.swing.JButton bSalads;
    private javax.swing.JButton bSandwichesMenu;
    private javax.swing.JButton bSpecialtiesMenu;
    private javax.swing.JButton bSubmit;
    private javax.swing.JLabel lblLoggedin;
    private javax.swing.JLabel lblOrderType;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblSubTotals;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lbltaxes;
    private javax.swing.JLabel lbltotals;
    private javax.swing.JButton openPastaMenu;
    private javax.swing.JButton openPizzaMenu;
    private javax.swing.JList orderList;
    private javax.swing.JScrollPane orderListPane;
    private javax.swing.JButton setDelivery;
    private javax.swing.JButton setDineIn;
    private javax.swing.JButton setPickup;
    // End of variables declaration//GEN-END:variables
}
