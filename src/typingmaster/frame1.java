/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingmaster;
import javax.swing.*;
import java.io.*;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class frame1 extends javax.swing.JFrame {

    public frame1() {
        initComponents();
        jPanel2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCombo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA = new javax.swing.JTextArea();
        jBCancel = new javax.swing.JButton();
        jBSave = new javax.swing.JButton();
        jCombo2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Typing Master");
        setAlwaysOnTop(true);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1366, 695));
        setMaximumSize(new java.awt.Dimension(1365, 723));
        setMinimumSize(new java.awt.Dimension(1365, 723));
        setPreferredSize(new java.awt.Dimension(1365, 723));
        setResizable(false);
        setSize(new java.awt.Dimension(1365, 723));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        jButton1.setText("Key Drill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 100, 240, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Touch typing course ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 70, 650, 90);

        jButton3.setText("Paragraph Drill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(320, 220, 240, 30);

        jButton2.setText("Sentence Drill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(320, 160, 240, 30);

        jCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Where to Copy...", "Sentence Drill", "Paragraph Drill" }));
        jCombo.setToolTipText("");
        jCombo.setFocusTraversalPolicyProvider(true);
        jCombo.setName(""); // NOI18N
        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });
        jPanel1.add(jCombo);
        jCombo.setBounds(320, 290, 240, 30);
        jCombo.getAccessibleContext().setAccessibleName("");

        jPanel2.setBackground(new java.awt.Color(231, 255, 197));
        jPanel2.setLayout(null);

        jTA.setColumns(20);
        jTA.setLineWrap(true);
        jTA.setRows(5);
        jScrollPane1.setViewportView(jTA);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 280, 150);

        jBCancel.setBackground(new java.awt.Color(244, 115, 65));
        jBCancel.setText("Cancel");
        jPanel2.add(jBCancel);
        jBCancel.setBounds(200, 150, 80, 40);

        jBSave.setBackground(new java.awt.Color(244, 115, 65));
        jBSave.setText("Save");
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });
        jPanel2.add(jBSave);
        jBSave.setBounds(0, 150, 80, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(320, 340, 280, 190);

        jCombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Override", "Append" }));
        jCombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCombo2);
        jCombo2.setBounds(320, 270, 80, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/MenuImage.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1390, 695);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        frame2 f2=new frame2();
        f2.setSize(1365, 723);
        f2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        try {
            frame3 f3 = new frame3();
            f3.setSize(1365, 723);
            f3.setVisible(true);
        } catch (IOException ex) {
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        frame4 f4=new frame4();
        f4.setSize(1365, 723);
        f4.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
        if(jCombo.getSelectedIndex()!=0){
            jPanel2.setVisible(true);
            jTA.setText("");
        }
    }//GEN-LAST:event_jComboActionPerformed

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        if(jTA.getText()!=null){
            FileWriter fw;
            if(jCombo.getSelectedIndex()==1){
                try{
                    File f=new File("sentence.txt");
                    if(jCombo2.getSelectedIndex()==0){
                        fw=new FileWriter(f);
                        fw.write(jTA.getText());
                    }
                    else{
                        fw=new FileWriter(f,true);
                        fw.append(jTA.getText());
                    }
                    fw.close();
                    JOptionPane.showMessageDialog(new frame1(), "Succesdfully Saved!");
                    if(JOptionPane.OK_OPTION==0){
                        jPanel2.setVisible(false);
                        jCombo.setSelectedIndex(0);
                    }
                } catch (Exception ie) {
                    JOptionPane.showMessageDialog(new frame1(), "FIle not Found");
                }
            }
            else{
                try{
                    File f=new File("paragraph.txt");
                    if(jCombo2.getSelectedIndex()==0){
                        fw=new FileWriter(f);
                        fw.write(jTA.getText());
                    }
                    else{
                        fw=new FileWriter(f,true);
                        fw.append(jTA.getText());
                    }
                    fw.close();
                    JOptionPane.showMessageDialog(new frame1(), "Successfully Saved!");
                    if(JOptionPane.OK_OPTION==0){
                        jPanel2.setVisible(false);
                        jCombo.setSelectedIndex(0);
                    }
                } catch (Exception ie) {
                    JOptionPane.showMessageDialog(new frame1(), "FIle not Found");
                }
            }
        }
    }//GEN-LAST:event_jBSaveActionPerformed

    private void jCombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombo2ActionPerformed

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }
    JMenuBar menuBar;
    JMenu menu;
    JRadioButtonMenuItem sentence;
    JRadioButtonMenuItem paragraph;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancel;
    private javax.swing.JButton jBSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCombo;
    private javax.swing.JComboBox<String> jCombo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTA;
    // End of variables declaration//GEN-END:variables

}
