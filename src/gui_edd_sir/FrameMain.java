/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_edd_sir;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author MERC-LAB-01
 */
public class FrameMain extends javax.swing.JFrame {

    /**
     * Creates new form FrameMain
     */
    public FrameMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        poaout = new javax.swing.JTextField();
        ddout = new javax.swing.JTextField();
        mmout = new javax.swing.JTextField();
        yyyyout = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        yyyyin = new javax.swing.JTextField();
        mmin = new javax.swing.JTextField();
        ddin = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        calculatebutton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

        jLabel9.setText("POA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        poaout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poaoutActionPerformed(evt);
            }
        });
        getContentPane().add(poaout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 52, -1));

        ddout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddoutActionPerformed(evt);
            }
        });
        getContentPane().add(ddout, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 70, -1));

        mmout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmoutActionPerformed(evt);
            }
        });
        getContentPane().add(mmout, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 70, -1));

        yyyyout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yyyyoutActionPerformed(evt);
            }
        });
        getContentPane().add(yyyyout, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 80, -1));

        jLabel8.setText("Year (yyyy)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 70, -1));

        jLabel7.setText("Month(mm)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 70, -1));

        jLabel6.setText("Date (dd)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 60, -1));

        jLabel5.setText("EDD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jLabel1.setText("Enter LRMP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel2.setText("Date (dd)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel3.setText("Month(mm)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jLabel4.setText("Year (yyyy)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        yyyyin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yyyyinActionPerformed(evt);
            }
        });
        getContentPane().add(yyyyin, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 80, -1));

        mmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mminActionPerformed(evt);
            }
        });
        getContentPane().add(mmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 52, -1));

        ddin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddinActionPerformed(evt);
            }
        });
        getContentPane().add(ddin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 52, -1));

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        calculatebutton.setText("Calculate");
        calculatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(calculatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("EDD Calculator");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 220, -1));

        jLabel12.setBackground(new java.awt.Color(255, 0, 51));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_edd_sir/gynae2.jpg"))); // NOI18N
        jLabel12.setText("No Image");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 470));

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mminActionPerformed

    private void ddinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddinActionPerformed

    private void yyyyinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yyyyinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yyyyinActionPerformed

    private void ddoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddoutActionPerformed

    private void mmoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmoutActionPerformed

    private void yyyyoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yyyyoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yyyyoutActionPerformed

    private void poaoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poaoutActionPerformed

    }//GEN-LAST:event_poaoutActionPerformed

    private void calculatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatebuttonActionPerformed
        int dd, mm, yyyy;
        try {
            dd = Integer.parseInt(ddin.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Incorrect Day !!    ");
            yyyyin.requestFocus();
            return;

        }

        try {
            mm = Integer.parseInt(mmin.getText()) - 1;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Incorect Month ");
            mmin.requestFocus();
            return;
        }

        try {
            yyyy = Integer.parseInt(yyyyin.getText().trim());
        } catch (Exception e) {
            System.out.println("e=" + e);
            JOptionPane.showMessageDialog(null, "Incorrect Year !!   ");
            yyyyin.requestFocus();
            return;
        }

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, yyyy);
        c.set(Calendar.MONTH, mm);
        c.set(Calendar.DATE, dd);

        c.add(Calendar.DATE, 280);
        yyyyout.setText(c.get(Calendar.YEAR) + "");
        mmout.setText(c.get(Calendar.MONTH) + 1 + "");
        ddout.setText(c.get(Calendar.DATE) + "");

        Calendar a = Calendar.getInstance();
        Calendar b = Calendar.getInstance();

        b.set(Calendar.YEAR, yyyy);
        b.set(Calendar.MONTH, mm);
        b.set(Calendar.DATE, dd);

        long poa = (a.getTimeInMillis() - b.getTimeInMillis()) / (1000 * 60 * 60 * 24 * 7);
        poaout.setText(poa + "");


    }//GEN-LAST:event_calculatebuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        yyyyin.setText("");
        ddin.setText("");
        mmin.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculatebutton;
    private javax.swing.JTextField ddin;
    private javax.swing.JTextField ddout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mmin;
    private javax.swing.JTextField mmout;
    private javax.swing.JTextField poaout;
    private javax.swing.JTextField yyyyin;
    private javax.swing.JTextField yyyyout;
    // End of variables declaration//GEN-END:variables
}
