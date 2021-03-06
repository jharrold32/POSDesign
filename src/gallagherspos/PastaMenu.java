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
public class PastaMenu extends javax.swing.JFrame implements Prices{

    MainMenu mainMenu = null;
    String message;
    /**
     * Creates new form PastaMenu
     */
    public PastaMenu(MainMenu mm) {
        initComponents();
        pastaGroup.add(selectBMosta);
        pastaGroup.add(selectBakedChickTetra);
        pastaGroup.add(selectChickFettAlf);
        pastaGroup.add(selectChickParmig);
        pastaGroup.add(selectChickRav);
        pastaGroup.add(selectChsRav);
        pastaGroup.add(selectChsStuf);
        pastaGroup.add(selectEggParmig);
        pastaGroup.add(selectMosta);
        pastaGroup.add(selectSpag);
        pastaGroup.add(selectSpinRav);
        
        sauceGroup.add(selectMarin);
        sauceGroup.add(selectMeat);
        mainMenu = mm;
        
    }
    public double getPrice() {
        double thePrice = 0.0;
        if(selectBMosta.isSelected()) {
            thePrice += Prices.BAKED_MOSTACCIOLI_PRICE;
        } else if(selectBakedChickTetra.isSelected()) {
            thePrice += Prices.TETRAZZINI_PRICE;
        } else if(selectChickFettAlf.isSelected()) {
            thePrice += Prices.CHICKEN_FETTUCCINI_ALFREDO_PRICE;
        } else if(selectChickParmig.isSelected()) {
            thePrice += Prices.PARMIGIANA_PRICE;
        } else if(selectChickRav.isSelected()) {
            thePrice += Prices.RAVIOLI_PRICE;
        } else if(selectChsRav.isSelected()) {
            thePrice += Prices.RAVIOLI_PRICE;
        } else if(selectChsStuf.isSelected()) {
            thePrice += Prices.STUFF_SHELLS_PRICE;
        } else if(selectEggParmig.isSelected()) {
            thePrice += Prices.PARMIGIANA_PRICE;
        } else if(selectMosta.isSelected()) {
            thePrice += Prices.MOSTACCIOLI_PRICE;
        } else if(selectSpag.isSelected()) {
            thePrice += Prices.SPAGETTI_PRICE;
        } else if(selectSpinRav.isSelected()) {
            thePrice += Prices.RAVIOLI_PRICE;
        } 
        if(addAlfredo.isSelected()) {
            thePrice += Prices.ALFREDO_SAUCE_PRICE;
        }
        if(addVege.isSelected()) {
            thePrice += Prices.ADD_VEGETABLES_PRICE;
        }
        return thePrice;
    }
    public String getName() {
        String theName = "";
        if(selectBMosta.isSelected()) {
            theName += "Baked Mostaccioli ";
        } else if(selectBakedChickTetra.isSelected()) {
            theName += "Baked Chicken Tetrazzini ";
        } else if(selectChickFettAlf.isSelected()) {
            theName += "Chicken Fettuccini Alfredo ";
        } else if(selectChickParmig.isSelected()) {
            theName += "Chicken Parmigiana ";
        } else if(selectChickRav.isSelected()) {
            theName += "Chicken Ravioli ";
        } else if(selectChsRav.isSelected()) {
            theName += "Cheese Ravioli ";
        } else if(selectChsStuf.isSelected()) {
            theName += "Cheese Stuffed Shells ";
        } else if(selectEggParmig.isSelected()) {
            theName += "Eggplant Parmigiana ";
        } else if(selectMosta.isSelected()) {
            theName += "Mostaccioli ";
        } else if(selectSpag.isSelected()) {
            theName += "Spaghetti ";
        } else if(selectSpinRav.isSelected()) {
            theName += "Spinach Ravioli ";
        } 
        if(addAlfredo.isSelected()) {
            theName += "Add Alfredo ";
        }
        if(addVege.isSelected()) {
            theName += "Add Vegetables ";
        }
        if(selectMarin.isSelected()) {
            theName += "Marinara";
        } else if(selectMeat.isSelected()) {
            theName += "Meat Sauce";
        }
        return theName;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pastaGroup = new javax.swing.ButtonGroup();
        sauceGroup = new javax.swing.ButtonGroup();
        lblMenuName = new javax.swing.JLabel();
        bSubmit = new javax.swing.JButton();
        bDone = new javax.swing.JButton();
        selectSpag = new javax.swing.JRadioButton();
        selectMosta = new javax.swing.JRadioButton();
        selectBMosta = new javax.swing.JRadioButton();
        selectBakedChickTetra = new javax.swing.JRadioButton();
        selectChickFettAlf = new javax.swing.JRadioButton();
        selectChsStuf = new javax.swing.JRadioButton();
        selectChickParmig = new javax.swing.JRadioButton();
        selectEggParmig = new javax.swing.JRadioButton();
        selectChsRav = new javax.swing.JRadioButton();
        selectChickRav = new javax.swing.JRadioButton();
        selectSpinRav = new javax.swing.JRadioButton();
        lblBasic = new javax.swing.JLabel();
        lblRavStuff = new javax.swing.JLabel();
        lblSpec = new javax.swing.JLabel();
        addAlfredo = new javax.swing.JCheckBox();
        selectMarin = new javax.swing.JRadioButton();
        selectMeat = new javax.swing.JRadioButton();
        bMessage = new javax.swing.JButton();
        addVege = new javax.swing.JCheckBox();
        bClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        lblMenuName.setText("Pasta");

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

        selectSpag.setText("Spaghetti w/ Garlic Bread");

        selectMosta.setText("Mostaccioli w/ Garlic Bread");

        selectBMosta.setText("Baked Mostaccioli w/ Garlic Bread");

        selectBakedChickTetra.setText("Baked Chicken Tetrazzini");

        selectChickFettAlf.setText("Chicken Fettuccini Alfredo w/ Garlic Bread");

        selectChsStuf.setText("Cheese Stuffed Shells w/ Garlic Bread");

        selectChickParmig.setText("Chicken Parmigiana w/ Garlic Bread");

        selectEggParmig.setText("Eggplant Parmigiana w/ Garlic Bread");

        selectChsRav.setText("Cheese Ravioli w/ Garlic Bread");

        selectChickRav.setText("Chicken Ravioli w/ Garlic Bread");

        selectSpinRav.setText("Spinach Ravioli w/ Garlic Bread");

        lblBasic.setText("Basic Pasta");

        lblRavStuff.setText("Ravioli and Stuffed Shells");

        lblSpec.setText("Special");

        addAlfredo.setText("Alfredo Sauce");

        selectMarin.setText("Marinara Sauce");

        selectMeat.setText("Meat Sauce");

        bMessage.setText("Message");
        bMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMessageActionPerformed(evt);
            }
        });

        addVege.setText("Vegetables");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(lblMenuName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectMosta)
                                    .addComponent(selectSpag)
                                    .addComponent(selectBMosta)
                                    .addComponent(selectChickFettAlf)
                                    .addComponent(lblBasic))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSpec)
                                    .addComponent(selectChickParmig)
                                    .addComponent(selectEggParmig)
                                    .addComponent(selectBakedChickTetra)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectChickRav)
                                    .addComponent(selectChsRav)
                                    .addComponent(selectSpinRav))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addVege)
                                    .addComponent(addAlfredo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectChsStuf)
                                    .addComponent(lblRavStuff))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectMarin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectMeat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bMessage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bDone, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bClear, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bSubmit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDone))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblMenuName)
                                .addGap(15, 15, 15)
                                .addComponent(lblBasic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectSpag)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectMosta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectBMosta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectChickFettAlf)
                                .addGap(46, 46, 46)
                                .addComponent(lblRavStuff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectChsStuf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectChsRav)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(selectChickRav)
                                    .addComponent(addAlfredo))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(selectSpinRav)
                                    .addComponent(addVege)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(lblSpec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectBakedChickTetra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectChickParmig)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectEggParmig)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectMarin)
                            .addComponent(selectMeat))))
                .addGap(11, 11, 11)
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
            pastaGroup.clearSelection();
            sauceGroup.clearSelection();
            addAlfredo.setEnabled(false);
            addVege.setEnabled(false);
        }
    }//GEN-LAST:event_bClearActionPerformed

    private void bSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubmitActionPerformed
        if(checkButtons()) {
            OrderItem pi = new OrderItem();
            pi.setPrice(getPrice());
            pi.setName(getName());
            pi.setMessage(message);
            
            mainMenu.addToOrder(pi);
        }
        pastaGroup.clearSelection();
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
            java.util.logging.Logger.getLogger(PastaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PastaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PastaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PastaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new PastaMenu(mainMenu).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox addAlfredo;
    private javax.swing.JCheckBox addVege;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bDone;
    private javax.swing.JButton bMessage;
    private javax.swing.JButton bSubmit;
    private javax.swing.JLabel lblBasic;
    private javax.swing.JLabel lblMenuName;
    private javax.swing.JLabel lblRavStuff;
    private javax.swing.JLabel lblSpec;
    private javax.swing.ButtonGroup pastaGroup;
    private javax.swing.ButtonGroup sauceGroup;
    private javax.swing.JRadioButton selectBMosta;
    private javax.swing.JRadioButton selectBakedChickTetra;
    private javax.swing.JRadioButton selectChickFettAlf;
    private javax.swing.JRadioButton selectChickParmig;
    private javax.swing.JRadioButton selectChickRav;
    private javax.swing.JRadioButton selectChsRav;
    private javax.swing.JRadioButton selectChsStuf;
    private javax.swing.JRadioButton selectEggParmig;
    private javax.swing.JRadioButton selectMarin;
    private javax.swing.JRadioButton selectMeat;
    private javax.swing.JRadioButton selectMosta;
    private javax.swing.JRadioButton selectSpag;
    private javax.swing.JRadioButton selectSpinRav;
    // End of variables declaration//GEN-END:variables

    private boolean checkButtons() {
        boolean check = false;
        if(selectBMosta.isSelected()) {
            check = true;
        } else if(selectBakedChickTetra.isSelected()) {
            check = true;
        } else if(selectChickFettAlf.isSelected()) {
            check = true;
        } else if(selectChickParmig.isSelected()) {
            check = true;
        } else if(selectChickRav.isSelected()) {
            check = true;
        } else if(selectChsRav.isSelected()) {
            check = true;
        } else if(selectChsStuf.isSelected()) {
            check = true;
        } else if(selectEggParmig.isSelected()) {
            check = true;
        }  else if(selectMosta.isSelected()) {
            check = true;
        } else if(selectSpag.isSelected()) {
            check = true;
        } else if(selectSpinRav.isSelected()) {
            check = true;
        }
        return check;
    }
}
