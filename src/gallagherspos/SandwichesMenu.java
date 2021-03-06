/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallagherspos;

import javax.swing.JOptionPane;

/**
 *
 * @author TrollOutpost
 */
public class SandwichesMenu extends javax.swing.JFrame {
    String message = "";
    MainMenu mainMenu;
    /**
     * Creates new form SandwichesMenu
     * @param mm
     */
    public SandwichesMenu(MainMenu mm) {
        initComponents();
        sandwichGroup.add(selectBBQBeef);
        sandwichGroup.add(selectBuffChickSandwich);
        sandwichGroup.add(selectCheesesteakSandwich);
        sandwichGroup.add(selectChickSandwich);
        sandwichGroup.add(selectComboSandwich);
        sandwichGroup.add(selectEggplant);
        sandwichGroup.add(selectGrinder);
        sandwichGroup.add(selectGyro);
        sandwichGroup.add(selectHamburger);
        sandwichGroup.add(selectHotDog);
        sandwichGroup.add(selectItalBeef);
        sandwichGroup.add(selectItalSausage);
        sandwichGroup.add(selectItalianSub);
        sandwichGroup.add(selectLakePerchSandwich);
        sandwichGroup.add(selectMeatball);
        sandwichGroup.add(selectPhilly);
        sandwichGroup.add(selectSarasota);
        sandwichGroup.add(selectSouthwest);
        sandwichGroup.add(selectVeggieSandwich);
        mainMenu = mm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sandwichGroup = new javax.swing.ButtonGroup();
        lblHeader = new javax.swing.JLabel();
        selectItalBeef = new javax.swing.JRadioButton();
        selectBBQBeef = new javax.swing.JRadioButton();
        selectMeatball = new javax.swing.JRadioButton();
        selectChickSandwich = new javax.swing.JRadioButton();
        selectGrinder = new javax.swing.JRadioButton();
        selectItalianSub = new javax.swing.JRadioButton();
        selectCheesesteakSandwich = new javax.swing.JRadioButton();
        selectComboSandwich = new javax.swing.JRadioButton();
        selectBuffChickSandwich = new javax.swing.JRadioButton();
        selectSouthwest = new javax.swing.JRadioButton();
        selectPhilly = new javax.swing.JRadioButton();
        selectItalSausage = new javax.swing.JRadioButton();
        selectSarasota = new javax.swing.JRadioButton();
        selectEggplant = new javax.swing.JRadioButton();
        selectVeggieSandwich = new javax.swing.JRadioButton();
        selectLakePerchSandwich = new javax.swing.JRadioButton();
        selectGyro = new javax.swing.JRadioButton();
        selectHotDog = new javax.swing.JRadioButton();
        selectHamburger = new javax.swing.JRadioButton();
        bMessage = new javax.swing.JButton();
        bSubmit = new javax.swing.JButton();
        bDone = new javax.swing.JButton();
        checkBasket = new javax.swing.JCheckBox();
        bClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setText("Sandwiches");

        selectItalBeef.setText("Italian Beef");

        selectBBQBeef.setText("BBQ Beef");

        selectMeatball.setText("Meatball");

        selectChickSandwich.setText("Italian Chicken Sandwich");

        selectGrinder.setText("Grinder");

        selectItalianSub.setText("Italian Sub");

        selectCheesesteakSandwich.setText("Cheesesteak Sandwich");

        selectComboSandwich.setText("Combo Sandwich");

        selectBuffChickSandwich.setText("Buffalo Chicken Sandwich");

        selectSouthwest.setText("Southwest Chicken Sandwich");

        selectPhilly.setText("Philly-Buster Sandwich");

        selectItalSausage.setText("Italian Sausage");

        selectSarasota.setText("Sarasota Sub");

        selectEggplant.setText("Eggplant Parmesan Sandwich");

        selectVeggieSandwich.setText("Veggie Sandwich");

        selectLakePerchSandwich.setText("Lake Perch Sandwich");

        selectGyro.setText("Gyro");

        selectHotDog.setText("Hot Dog");

        selectHamburger.setText("Hamburger");

        bMessage.setText("Message");
        bMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMessageActionPerformed(evt);
            }
        });

        bSubmit.setText("Submit");
        bSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubmitActionPerformed(evt);
            }
        });

        bDone.setText("Done");
        bDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDoneActionPerformed(evt);
            }
        });

        checkBasket.setText("Basket");

        bClear.setText("Clear all");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(lblHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectItalBeef)
                            .addComponent(selectBBQBeef)
                            .addComponent(selectMeatball)
                            .addComponent(selectChickSandwich)
                            .addComponent(selectGrinder)
                            .addComponent(selectItalianSub)
                            .addComponent(selectCheesesteakSandwich)
                            .addComponent(selectComboSandwich)
                            .addComponent(selectBuffChickSandwich))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectPhilly)
                            .addComponent(selectItalSausage)
                            .addComponent(selectSarasota)
                            .addComponent(selectHamburger)
                            .addComponent(selectHotDog)
                            .addComponent(selectGyro)
                            .addComponent(selectLakePerchSandwich)
                            .addComponent(selectVeggieSandwich)
                            .addComponent(selectEggplant))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(selectSouthwest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(checkBasket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bClear, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bMessage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bDone, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectItalBeef)
                    .addComponent(selectEggplant))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectBBQBeef)
                    .addComponent(selectVeggieSandwich))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectMeatball)
                    .addComponent(selectLakePerchSandwich))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectChickSandwich)
                    .addComponent(selectGyro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectGrinder)
                    .addComponent(selectHotDog))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectItalianSub)
                    .addComponent(selectHamburger))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectPhilly)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectItalSausage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectSarasota)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(checkBasket))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bSubmit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDone))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectCheesesteakSandwich)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectComboSandwich)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectBuffChickSandwich)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectSouthwest)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(bClear))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDoneActionPerformed
        this.dispose();
    }//GEN-LAST:event_bDoneActionPerformed

    private void bMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMessageActionPerformed
        message = JOptionPane.showInputDialog(null, "Enter Message:");
    }//GEN-LAST:event_bMessageActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        int sure = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if(sure == JOptionPane.YES_OPTION) {
            sandwichGroup.clearSelection();
            checkBasket.setEnabled(false);
        }
    }//GEN-LAST:event_bClearActionPerformed

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitActionPerformed
        if(checkButtons()) {
            OrderItem oi = new OrderItem();
            oi.setMessage(message);
            oi.setName(getTheName());
            oi.setPrice(getPrice());
            mainMenu.addToOrder(oi);
        }
    }//GEN-LAST:event_bSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(SandwichesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SandwichesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SandwichesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SandwichesMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SandwichesMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClear;
    private javax.swing.JButton bDone;
    private javax.swing.JButton bMessage;
    private javax.swing.JButton bSubmit;
    private javax.swing.JCheckBox checkBasket;
    private javax.swing.JLabel lblHeader;
    private javax.swing.ButtonGroup sandwichGroup;
    private javax.swing.JRadioButton selectBBQBeef;
    private javax.swing.JRadioButton selectBuffChickSandwich;
    private javax.swing.JRadioButton selectCheesesteakSandwich;
    private javax.swing.JRadioButton selectChickSandwich;
    private javax.swing.JRadioButton selectComboSandwich;
    private javax.swing.JRadioButton selectEggplant;
    private javax.swing.JRadioButton selectGrinder;
    private javax.swing.JRadioButton selectGyro;
    private javax.swing.JRadioButton selectHamburger;
    private javax.swing.JRadioButton selectHotDog;
    private javax.swing.JRadioButton selectItalBeef;
    private javax.swing.JRadioButton selectItalSausage;
    private javax.swing.JRadioButton selectItalianSub;
    private javax.swing.JRadioButton selectLakePerchSandwich;
    private javax.swing.JRadioButton selectMeatball;
    private javax.swing.JRadioButton selectPhilly;
    private javax.swing.JRadioButton selectSarasota;
    private javax.swing.JRadioButton selectSouthwest;
    private javax.swing.JRadioButton selectVeggieSandwich;
    // End of variables declaration//GEN-END:variables

    private double getPrice() {
        double thePrice = 0.0;
        if(selectBBQBeef.isSelected()) {
            thePrice += Prices.BBQ_BEEF_PRICE;
        } else if(selectBuffChickSandwich.isSelected()) {
            thePrice += Prices.BUFFALO_CHICKEN_PRICE;
        } else if(selectCheesesteakSandwich.isSelected()) {
            thePrice += Prices.CHEESESTEAK_PRICE;
        } else if(selectChickSandwich.isSelected()) {
            thePrice += Prices.CHICKEN_SANDWICH_PRICE;
        } else if(selectComboSandwich.isSelected()) {
            thePrice += Prices.COMBO_PRICE;
        } else if(selectEggplant.isSelected()) {
            thePrice += Prices.EGGPLANT_PARMESAN_PRICE;
        } else if(selectGrinder.isSelected()) {
            thePrice += Prices.GRINDER_PRICE;
        } else if(selectGyro.isSelected()) {
            thePrice += Prices.GYRO_PRICE;
        } else if(selectHamburger.isSelected()) {
            thePrice += Prices.HAMBURGER_PRICE;
        } else if(selectHotDog.isSelected()) {
            thePrice += Prices.HOT_DOG_PRICE;
        } else if(selectItalBeef.isSelected()) {
            thePrice += Prices.ITALIAN_BEEF_PRICE;
        } else if(selectItalSausage.isSelected()) {
            thePrice += Prices.ITALIAN_SAUSAGE_PRICE;
        } else if(selectItalianSub.isSelected()) {
            thePrice += Prices.ITALIAN_SUB_PRICE;
        } else if(selectLakePerchSandwich.isSelected()) {
            thePrice += Prices.PERCH_PRICE;
        } else if(selectMeatball.isSelected()) {
            thePrice += Prices.MEATBALL_PRICE;
        } else if(selectPhilly.isSelected()) {
            thePrice += Prices.PHILLY_BUSTER_PRICE;
        } else if(selectSarasota.isSelected()) {
            thePrice += Prices.SARASOTA_SUB_PRICE;
        } else if(selectSouthwest.isSelected()) {
            thePrice += Prices.SOUTHWEST_CHICKEN_PRICE;
        } else if(selectVeggieSandwich.isSelected()) {
            thePrice += Prices.VEGGIE_PRICE;
        }
        if(checkBasket.isSelected()) {
            thePrice += Prices.BASKET_PRICE;
        }
        return thePrice;
    }
    
    public String getTheName() {
        String theName = "";
        if(selectBBQBeef.isSelected()) {
            theName += "BBQ Beef Sandwich ";
        } else if(selectBuffChickSandwich.isSelected()) {
            theName += "Buffalo Chicken Sandwich ";
        } else if(selectCheesesteakSandwich.isSelected()) {
            theName += "Cheesesteak Sandwich ";
        } else if(selectChickSandwich.isSelected()) {
            theName += "Chicken Sandwich ";
        } else if(selectComboSandwich.isSelected()) {
            theName += "Combo Sandwich ";
        } else if(selectEggplant.isSelected()) {
            theName += "Eggplant Parmesan Sandwich ";
        } else if(selectGrinder.isSelected()) {
            theName += "Grinder Sandwich ";
        } else if(selectGyro.isSelected()) {
            theName += "Gyro ";
        } else if(selectHamburger.isSelected()) {
            theName += "Hamburger ";
        } else if(selectHotDog.isSelected()) {
            theName += "Hot Dog ";
        } else if(selectItalBeef.isSelected()) {
            theName += "Italian Beef Sandwich ";
        } else if(selectItalSausage.isSelected()) {
            theName += "Italian Suasage Sandwich ";
        } else if(selectItalianSub.isSelected()) {
            theName += "Italian Sub ";
        } else if(selectLakePerchSandwich.isSelected()) {
            theName += "Lake Perch Sandwich ";
        } else if(selectMeatball.isSelected()) {
            theName += "Meatball Sub ";
        } else if(selectPhilly.isSelected()) {
            theName += "Philly-Buster Sandwich ";
        } else if(selectSarasota.isSelected()) {
            theName += "Sarasota Sub ";
        } else if(selectSouthwest.isSelected()) {
            theName += "Southwest Chicken Sandwich ";
        } else if(selectVeggieSandwich.isSelected()) {
            theName += "Veggie Sandwich ";
        }
        if(checkBasket.isSelected()) {
            theName += "Basket ";
        }
        return theName;
    }

    private boolean checkButtons() {
        boolean check = false;
        if(selectBBQBeef.isSelected()) {
            check = true;
        } else if(selectBuffChickSandwich.isSelected()) {
            check = true;
        } else if(selectCheesesteakSandwich.isSelected()) {
            check = true;
        } else if(selectChickSandwich.isSelected()) {
            check = true;
        } else if(selectComboSandwich.isSelected()) {
            check = true;
        } else if(selectEggplant.isSelected()) {
            check = true;
        } else if(selectGrinder.isSelected()) {
            check = true;
        } else if(selectGyro.isSelected()) {
            check = true;
        } else if(selectHamburger.isSelected()) {
            check = true;
        } else if(selectHotDog.isSelected()) {
            check = true;
        } else if(selectItalBeef.isSelected()) {
            check = true;
        } else if(selectItalSausage.isSelected()) {
            check = true;
        } else if(selectItalianSub.isSelected()) {
            check = true;
        } else if(selectLakePerchSandwich.isSelected()) {
            check = true;
        } else if(selectMeatball.isSelected()) {
            check = true;
        } else if(selectPhilly.isSelected()) {
            check = true;
        } else if(selectSarasota.isSelected()) {
            check = true;
        } else if(selectSouthwest.isSelected()) {
            check = true;
        } else if(selectVeggieSandwich.isSelected()) {
            check = true;
        }
        return check;
    }
}
