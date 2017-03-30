/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sauvik.bhowmik.anik;

import java.awt.Color;

/**
 *
 * @author ANIK
 */
public class BusSchedule extends javax.swing.JFrame {

    /**
     * Creates new form BusSchedule
     */
    public BusSchedule() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(595, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        upButton.setBackground(new java.awt.Color(51, 153, 0));
        upButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        upButton.setForeground(new java.awt.Color(255, 0, 51));
        upButton.setText("আপ ");
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });
        getContentPane().add(upButton);
        upButton.setBounds(500, 90, 73, 20);

        downButton.setBackground(new java.awt.Color(51, 153, 0));
        downButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        downButton.setForeground(new java.awt.Color(255, 0, 51));
        downButton.setText("ডাউন ");
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });
        getContentPane().add(downButton);
        downButton.setBounds(500, 130, 70, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\JavaPrograms\\NetBeans_Projects\\BusSchedule\\bus2.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 290);

        jButton3.setText("jButton3");
        getContentPane().add(jButton3);
        jButton3.setBounds(500, 150, 73, 23);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Siyam Rupali", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 51, 255));
        jTextField1.setText("ক্ষণিকা বাস (গাজীপুর টু ঢাবি) সময়সূচী ");
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(150, 300, 320, 70);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField3.setText("           Developed by @nik");
        jTextField3.setBorder(null);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(210, 450, 170, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
        BusSchedule schedule = new BusSchedule();
        schedule.setVisible(false);
        UpSchedule upschedule = new UpSchedule();
        upschedule.setVisible(true);
    }//GEN-LAST:event_upButtonActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
        BusSchedule schedule = new BusSchedule();
        schedule.setVisible(false);
        DownSchedule downschedule = new DownSchedule();
        downschedule.setVisible(true);
    }//GEN-LAST:event_downButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BusSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton downButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
}