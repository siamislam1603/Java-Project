
package typingmaster;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import sun.audio.*;


public class frame2 extends javax.swing.JFrame implements ActionListener,KeyListener {

    public frame2() {
        initComponents();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addJLabel();
        addString();
        c=ch.get(count);
        addHandLabel();
        addhandImage();
        handIndicator();
        count++;
        addButton();
        buttonIndicator();
        colorIndicator();
        wordTyped=jBa.getBackground();
        initialBgColor=list.get(prev).getBackground();
        initialFgColor=list.get(prev).getForeground();
        buttonList.get(buttonIndicate).setBackground(Color.DARK_GRAY);
        list.get(prev).setBackground(fgColor.get(colorCount));
        list.get(prev).setForeground(Color.WHITE);
        showTime();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jBj = new javax.swing.JButton();
        jBf = new javax.swing.JButton();
        jBg = new javax.swing.JButton();
        jBSemi = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jBk = new javax.swing.JButton();
        jBl = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jBs = new javax.swing.JButton();
        jBd = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jBa = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jBSpace = new javax.swing.JButton();
        jL1 = new javax.swing.JLabel();
        jL3 = new javax.swing.JLabel();
        jL2 = new javax.swing.JLabel();
        jL6 = new javax.swing.JLabel();
        jL10 = new javax.swing.JLabel();
        jL7 = new javax.swing.JLabel();
        jL4 = new javax.swing.JLabel();
        jL9 = new javax.swing.JLabel();
        jL8 = new javax.swing.JLabel();
        jL5 = new javax.swing.JLabel();
        jL11 = new javax.swing.JLabel();
        jL12 = new javax.swing.JLabel();
        jL13 = new javax.swing.JLabel();
        jL14 = new javax.swing.JLabel();
        jL15 = new javax.swing.JLabel();
        jL16 = new javax.swing.JLabel();
        jL17 = new javax.swing.JLabel();
        jL18 = new javax.swing.JLabel();
        jL19 = new javax.swing.JLabel();
        jL20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLHand1 = new javax.swing.JLabel();
        jLHand2 = new javax.swing.JLabel();
        jLHand3 = new javax.swing.JLabel();
        jLHand4 = new javax.swing.JLabel();
        jLHand5 = new javax.swing.JLabel();
        jLHand6 = new javax.swing.JLabel();
        jLHand7 = new javax.swing.JLabel();
        jLHand8 = new javax.swing.JLabel();
        jLHand9 = new javax.swing.JLabel();
        jLHand10 = new javax.swing.JLabel();
        jBcancel = new javax.swing.JButton();
        jLTime = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLspeed = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Typing Master");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1365, 723));
        setMinimumSize(new java.awt.Dimension(1365, 723));
        setPreferredSize(new java.awt.Dimension(1365, 723));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton21.setBackground(new java.awt.Color(255, 204, 204));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 102, 102));
        jButton21.setText("2");
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 194, 54, 44));

        jButton22.setBackground(new java.awt.Color(153, 255, 153));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton22.setForeground(new java.awt.Color(0, 204, 0));
        jButton22.setText("3");
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 194, 63, 44));

        jButton23.setBackground(new java.awt.Color(204, 204, 255));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 51, 255));
        jButton23.setText(".");
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 194, 49, 44));

        jButton24.setBackground(new java.awt.Color(204, 204, 255));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton24.setForeground(new java.awt.Color(0, 51, 255));
        jButton24.setText("1");
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 194, 59, 44));

        jButton25.setBackground(new java.awt.Color(255, 102, 255));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(204, 0, 204));
        jButton25.setText("6");
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 194, 60, 44));

        jButton26.setBackground(new java.awt.Color(255, 102, 255));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(204, 0, 204));
        jButton26.setText("7");
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 194, 60, 44));

        jButton27.setBackground(new java.awt.Color(255, 102, 255));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton27.setForeground(new java.awt.Color(204, 0, 204));
        jButton27.setText("4");
        getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 194, 61, 44));

        jButton28.setBackground(new java.awt.Color(255, 102, 255));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton28.setForeground(new java.awt.Color(204, 0, 204));
        jButton28.setText("5");
        getContentPane().add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 194, 61, 44));

        jButton29.setBackground(new java.awt.Color(204, 204, 255));
        jButton29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton29.setForeground(new java.awt.Color(0, 51, 255));
        jButton29.setText("0");
        getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 194, 62, 44));

        jButton30.setBackground(new java.awt.Color(204, 204, 255));
        jButton30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(0, 51, 255));
        jButton30.setText("-");
        getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 194, 61, 44));

        jButton31.setBackground(new java.awt.Color(153, 255, 153));
        jButton31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(0, 204, 0));
        jButton31.setText("8");
        getContentPane().add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 194, 63, 44));

        jButton32.setBackground(new java.awt.Color(255, 204, 204));
        jButton32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 102, 102));
        jButton32.setText("9");
        getContentPane().add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 194, 65, 44));

        jButton33.setBackground(new java.awt.Color(204, 204, 255));
        jButton33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton33.setForeground(new java.awt.Color(0, 51, 255));
        jButton33.setText("=");
        getContentPane().add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 194, 62, 44));

        jButton35.setBackground(new java.awt.Color(204, 204, 255));
        jButton35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton35.setForeground(new java.awt.Color(0, 51, 255));
        jButton35.setText("Back");
        getContentPane().add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 194, 80, 44));

        jButton36.setBackground(new java.awt.Color(255, 102, 255));
        jButton36.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton36.setForeground(new java.awt.Color(204, 0, 204));
        jButton36.setText("T");
        getContentPane().add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 244, 69, 44));

        jButton37.setBackground(new java.awt.Color(204, 204, 255));
        jButton37.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton37.setForeground(new java.awt.Color(0, 51, 255));
        jButton37.setText("P");
        getContentPane().add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 244, 62, 44));

        jButton38.setBackground(new java.awt.Color(204, 204, 255));
        jButton38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton38.setForeground(new java.awt.Color(0, 51, 255));
        jButton38.setText("[");
        getContentPane().add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 244, 61, 44));

        jButton39.setBackground(new java.awt.Color(153, 255, 153));
        jButton39.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton39.setForeground(new java.awt.Color(0, 204, 0));
        jButton39.setText("I");
        getContentPane().add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 244, 63, 44));

        jButton40.setBackground(new java.awt.Color(255, 204, 204));
        jButton40.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 102, 102));
        jButton40.setText("O");
        getContentPane().add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 244, 65, 44));

        jButton41.setBackground(new java.awt.Color(204, 204, 255));
        jButton41.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton41.setForeground(new java.awt.Color(0, 51, 255));
        jButton41.setText("]");
        getContentPane().add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(836, 244, 62, 44));

        jButton42.setBackground(new java.awt.Color(204, 204, 255));
        jButton42.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton42.setForeground(new java.awt.Color(0, 51, 255));
        jButton42.setText("\\");
            getContentPane().add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 244, 56, 44));

            jButton43.setBackground(new java.awt.Color(255, 204, 204));
            jButton43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jButton43.setForeground(new java.awt.Color(255, 102, 102));
            jButton43.setText("W");
            getContentPane().add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 244, 54, 44));

            jButton44.setBackground(new java.awt.Color(153, 255, 153));
            jButton44.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton44.setForeground(new java.awt.Color(0, 204, 0));
            jButton44.setText("E");
            getContentPane().add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 244, 63, 44));

            jButton45.setBackground(new java.awt.Color(204, 204, 255));
            jButton45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jButton45.setForeground(new java.awt.Color(0, 51, 255));
            jButton45.setText("Tab");
            getContentPane().add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 244, 61, 44));

            jButton46.setBackground(new java.awt.Color(204, 204, 255));
            jButton46.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton46.setForeground(new java.awt.Color(0, 51, 255));
            jButton46.setText("Q");
            getContentPane().add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 244, 59, 44));

            jButton47.setBackground(new java.awt.Color(255, 102, 255));
            jButton47.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton47.setForeground(new java.awt.Color(204, 0, 204));
            jButton47.setText("Y");
            getContentPane().add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 244, 60, 44));

            jButton48.setBackground(new java.awt.Color(255, 102, 255));
            jButton48.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton48.setForeground(new java.awt.Color(204, 0, 204));
            jButton48.setText("U");
            getContentPane().add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 244, 60, 44));

            jButton49.setBackground(new java.awt.Color(255, 102, 255));
            jButton49.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton49.setForeground(new java.awt.Color(204, 0, 204));
            jButton49.setText("R");
            getContentPane().add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 244, 61, 44));

            jButton50.setBackground(new java.awt.Color(255, 102, 255));
            jButton50.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton50.setForeground(new java.awt.Color(204, 0, 204));
            jButton50.setText("H");
            getContentPane().add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 294, 60, 45));

            jBj.setBackground(new java.awt.Color(255, 102, 255));
            jBj.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBj.setForeground(new java.awt.Color(204, 0, 204));
            jBj.setText("J");
            getContentPane().add(jBj, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 294, 60, 44));

            jBf.setBackground(new java.awt.Color(255, 102, 255));
            jBf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBf.setForeground(new java.awt.Color(204, 0, 204));
            jBf.setText("F");
            getContentPane().add(jBf, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 294, 61, 45));

            jBg.setBackground(new java.awt.Color(255, 102, 255));
            jBg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBg.setForeground(new java.awt.Color(204, 0, 204));
            jBg.setText("G");
            getContentPane().add(jBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 294, 61, 45));

            jBSemi.setBackground(new java.awt.Color(204, 204, 255));
            jBSemi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBSemi.setForeground(new java.awt.Color(0, 51, 255));
            jBSemi.setText(";");
            getContentPane().add(jBSemi, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 295, 62, 44));

            jButton55.setBackground(new java.awt.Color(204, 204, 255));
            jButton55.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton55.setForeground(new java.awt.Color(0, 51, 255));
            jButton55.setText("'");
            getContentPane().add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 295, 61, 44));

            jBk.setBackground(new java.awt.Color(153, 255, 153));
            jBk.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBk.setForeground(new java.awt.Color(0, 204, 0));
            jBk.setText("K");
            getContentPane().add(jBk, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 294, 63, 44));

            jBl.setBackground(new java.awt.Color(255, 204, 204));
            jBl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBl.setForeground(new java.awt.Color(255, 102, 102));
            jBl.setText("l");
            getContentPane().add(jBl, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 295, 65, 44));

            jButton58.setBackground(new java.awt.Color(204, 204, 255));
            jButton58.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton58.setForeground(new java.awt.Color(0, 51, 255));
            jButton58.setText("Enter");
            getContentPane().add(jButton58, new org.netbeans.lib.awtextra.AbsoluteConstraints(862, 295, 98, 44));

            jBs.setBackground(new java.awt.Color(255, 204, 204));
            jBs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBs.setForeground(new java.awt.Color(255, 102, 102));
            jBs.setText("S");
            getContentPane().add(jBs, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 294, 54, 45));

            jBd.setBackground(new java.awt.Color(153, 255, 153));
            jBd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBd.setForeground(new java.awt.Color(0, 204, 0));
            jBd.setText("D");
            getContentPane().add(jBd, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 295, 63, 44));

            jButton62.setBackground(new java.awt.Color(204, 204, 255));
            jButton62.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton62.setForeground(new java.awt.Color(0, 51, 255));
            jButton62.setText("caps");
            getContentPane().add(jButton62, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 294, 91, 44));

            jBa.setBackground(new java.awt.Color(204, 204, 255));
            jBa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBa.setForeground(new java.awt.Color(0, 51, 255));
            jBa.setText("A");
            getContentPane().add(jBa, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 294, 59, 45));

            jButton64.setBackground(new java.awt.Color(255, 102, 255));
            jButton64.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton64.setForeground(new java.awt.Color(204, 0, 204));
            jButton64.setText("N");
            getContentPane().add(jButton64, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 345, 60, 44));

            jButton65.setBackground(new java.awt.Color(255, 102, 255));
            jButton65.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton65.setForeground(new java.awt.Color(204, 0, 204));
            jButton65.setText("M");
            getContentPane().add(jButton65, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 345, 60, 44));

            jButton66.setBackground(new java.awt.Color(255, 102, 255));
            jButton66.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton66.setForeground(new java.awt.Color(204, 0, 204));
            jButton66.setText("V");
            getContentPane().add(jButton66, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 345, 61, 44));

            jButton67.setBackground(new java.awt.Color(255, 102, 255));
            jButton67.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton67.setForeground(new java.awt.Color(204, 0, 204));
            jButton67.setText("B");
            getContentPane().add(jButton67, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 345, 61, 44));

            jButton68.setBackground(new java.awt.Color(204, 204, 255));
            jButton68.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton68.setForeground(new java.awt.Color(0, 51, 255));
            jButton68.setText("/");
            getContentPane().add(jButton68, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 345, 62, 44));

            jButton69.setBackground(new java.awt.Color(204, 204, 255));
            jButton69.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton69.setForeground(new java.awt.Color(0, 51, 255));
            jButton69.setText("Shift");
            getContentPane().add(jButton69, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 345, 146, 44));

            jButton70.setBackground(new java.awt.Color(153, 255, 153));
            jButton70.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton70.setForeground(new java.awt.Color(0, 204, 0));
            jButton70.setText(",");
            getContentPane().add(jButton70, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 345, 59, 44));

            jButton71.setBackground(new java.awt.Color(255, 204, 204));
            jButton71.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton71.setForeground(new java.awt.Color(255, 102, 102));
            jButton71.setText(".");
            getContentPane().add(jButton71, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 345, 65, 44));

            jButton74.setBackground(new java.awt.Color(255, 204, 204));
            jButton74.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton74.setForeground(new java.awt.Color(255, 102, 102));
            jButton74.setText("X");
            getContentPane().add(jButton74, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 345, 54, 44));

            jButton75.setBackground(new java.awt.Color(153, 255, 153));
            jButton75.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton75.setForeground(new java.awt.Color(0, 204, 0));
            jButton75.setText("C");
            getContentPane().add(jButton75, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 345, 63, 44));

            jButton76.setBackground(new java.awt.Color(204, 204, 255));
            jButton76.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton76.setForeground(new java.awt.Color(0, 51, 255));
            jButton76.setText("Shift");
            getContentPane().add(jButton76, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 345, 116, 44));

            jButton77.setBackground(new java.awt.Color(204, 204, 255));
            jButton77.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton77.setForeground(new java.awt.Color(0, 51, 255));
            jButton77.setText("Z");
            getContentPane().add(jButton77, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 345, 59, 44));

            jButton78.setBackground(new java.awt.Color(204, 204, 255));
            jButton78.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jButton78.setForeground(new java.awt.Color(0, 51, 255));
            jButton78.setText("cntrl");
            getContentPane().add(jButton78, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 395, 74, 40));

            jButton81.setBackground(new java.awt.Color(204, 204, 255));
            jButton81.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton81.setForeground(new java.awt.Color(0, 51, 255));
            jButton81.setText("cntrl");
            getContentPane().add(jButton81, new org.netbeans.lib.awtextra.AbsoluteConstraints(837, 395, 123, 40));

            jBSpace.setBackground(new java.awt.Color(204, 204, 0));
            jBSpace.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBSpace.setForeground(new java.awt.Color(102, 102, 0));
            jBSpace.setText("space");
            getContentPane().add(jBSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 395, 334, 40));

            jL1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL1.setForeground(new java.awt.Color(0, 0, 153));
            jL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL1.setText("a");
            jL1.setToolTipText("");
            jL1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jL1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jL1.setOpaque(true);
            jL1.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 40));

            jL3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL3.setForeground(new java.awt.Color(0, 0, 153));
            jL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL3.setText("j");
            jL3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL3.setOpaque(true);
            jL3.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 40));

            jL2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL2.setForeground(new java.awt.Color(0, 0, 153));
            jL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL2.setText("j");
            jL2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL2.setOpaque(true);
            jL2.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, 40));

            jL6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL6.setForeground(new java.awt.Color(0, 0, 153));
            jL6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL6.setText("a");
            jL6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL6.setOpaque(true);
            jL6.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, 40));

            jL10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL10.setForeground(new java.awt.Color(0, 0, 153));
            jL10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL10.setText("space");
            jL10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL10.setOpaque(true);
            jL10.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 120, 40));

            jL7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL7.setForeground(new java.awt.Color(0, 0, 153));
            jL7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL7.setText("j");
            jL7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL7.setOpaque(true);
            jL7.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, -1, 40));

            jL4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL4.setForeground(new java.awt.Color(0, 0, 153));
            jL4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL4.setText("a");
            jL4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL4.setOpaque(true);
            jL4.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, 40));

            jL9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL9.setForeground(new java.awt.Color(0, 0, 153));
            jL9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL9.setText("a");
            jL9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL9.setOpaque(true);
            jL9.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, 40));

            jL8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL8.setForeground(new java.awt.Color(0, 0, 153));
            jL8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL8.setText("j");
            jL8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL8.setOpaque(true);
            jL8.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, 40));

            jL5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL5.setForeground(new java.awt.Color(0, 0, 153));
            jL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL5.setText("space");
            jL5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL5.setOpaque(true);
            jL5.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 120, 40));

            jL11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL11.setForeground(new java.awt.Color(0, 0, 153));
            jL11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL11.setText("a");
            jL11.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL11.setOpaque(true);
            jL11.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 40));

            jL12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL12.setForeground(new java.awt.Color(0, 0, 153));
            jL12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL12.setText("k");
            jL12.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL12.setOpaque(true);
            jL12.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 40));

            jL13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL13.setForeground(new java.awt.Color(0, 0, 153));
            jL13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL13.setText("k");
            jL13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL13.setOpaque(true);
            jL13.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, 40));

            jL14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL14.setForeground(new java.awt.Color(0, 0, 153));
            jL14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL14.setText("a");
            jL14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL14.setOpaque(true);
            jL14.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, 40));

            jL15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL15.setForeground(new java.awt.Color(0, 0, 153));
            jL15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL15.setText("space");
            jL15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL15.setOpaque(true);
            jL15.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 120, 40));

            jL16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL16.setForeground(new java.awt.Color(0, 0, 153));
            jL16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL16.setText("a");
            jL16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL16.setOpaque(true);
            jL16.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, 40));

            jL17.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL17.setForeground(new java.awt.Color(0, 0, 153));
            jL17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL17.setText("k");
            jL17.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL17.setOpaque(true);
            jL17.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, 40));

            jL18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL18.setForeground(new java.awt.Color(0, 0, 153));
            jL18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL18.setText("k");
            jL18.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL18.setOpaque(true);
            jL18.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, 40));

            jL19.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL19.setForeground(new java.awt.Color(0, 0, 153));
            jL19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL19.setText("a");
            jL19.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL19.setOpaque(true);
            jL19.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, 40));

            jL20.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL20.setForeground(new java.awt.Color(0, 0, 153));
            jL20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL20.setText("space");
            jL20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
            jL20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jL20.setOpaque(true);
            jL20.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 120, 40));

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/Tenyér (1).png"))); // NOI18N
            jLabel1.setPreferredSize(new java.awt.Dimension(750, 100));
            getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 770, 400));

            jButton1.setBackground(new java.awt.Color(204, 204, 255));
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 395, 117, 40));

            jButton2.setBackground(new java.awt.Color(204, 204, 0));
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 395, 88, 40));

            jButton3.setBackground(new java.awt.Color(204, 204, 0));
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 395, 111, 40));

            jButton4.setBackground(new java.awt.Color(204, 204, 255));
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 395, 63, 40));

            jLHand1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/blue.png"))); // NOI18N
            getContentPane().add(jLHand1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 534, 30, 50));

            jLHand2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/orange.png"))); // NOI18N
            getContentPane().add(jLHand2, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 464, 40, 50));

            jLHand3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/green.png"))); // NOI18N
            getContentPane().add(jLHand3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 30, 40));

            jLHand4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/purple.png"))); // NOI18N
            getContentPane().add(jLHand4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 40, 50));

            jLHand5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/brown.png"))); // NOI18N
            getContentPane().add(jLHand5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 640, 20, 50));

            jLHand6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/brown.png"))); // NOI18N
            getContentPane().add(jLHand6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 654, 40, 30));

            jLHand7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/purple.png"))); // NOI18N
            getContentPane().add(jLHand7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 30, 50));

            jLHand8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/green.png"))); // NOI18N
            getContentPane().add(jLHand8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 30, 40));

            jLHand9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/orange.png"))); // NOI18N
            getContentPane().add(jLHand9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 30, -1));

            jLHand10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/blue.png"))); // NOI18N
            getContentPane().add(jLHand10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 30, 40));

            jBcancel.setText("Cancel");
            jBcancel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBcancelActionPerformed(evt);
                }
            });
            getContentPane().add(jBcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 580, 110, 40));

            jLTime.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            getContentPane().add(jLTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 480, 140, 50));

            jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel3.setText("Time");
            getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 450, -1, -1));

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel4.setText("Speed(wps)");
            getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 340, -1, -1));

            jLspeed.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            getContentPane().add(jLspeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 380, 140, 50));

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/bG.png"))); // NOI18N
            getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    void showTime(){
        jLspeed.setText(""+wordCount);
        jLTime.setText("05:00");
        timer=new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date currentTime=new Date();
                time-=1000;
                jLspeed.setText(""+wordCount);
                speed=speed+wordCount;
                wordCount=0;
                currentTime.setTime(time);
                jLTime.setText(currentTime.toString().substring(14, 19));
                if((minute==currentTime.toString().charAt(15)-'0')&&(second1==currentTime.toString().charAt(17)-'0')&&(second1==currentTime.toString().charAt(18)-'0')){
                    timer.stop();
                    speed=speed/(initialTime/(double)60000);
                    JOptionPane.showMessageDialog(new frame2(), "Speed(WPM):"+speed);
                    if(JOptionPane.OK_OPTION==0){
                        dispose();
                    }
                    frame1 frame=new frame1();
                    frame.setSize(1365, 723);
                    frame.setVisible(true);
                }
            }
            
        });
        timer.start();
    }
    private void jBcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelActionPerformed
        dispose();
        frame1 f6=new frame1();
        f6.setSize(1365, 723);
        f6.setVisible(true);
    }//GEN-LAST:event_jBcancelActionPerformed

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new frame2().setVisible(true);
                new frame2().setSize(1365, 723);  
            }
        });
    }
    
    /////////////////******************//////////////////
    
    public void addJLabel(){
        list.add(jL1);
        list.add(jL2);
        list.add(jL3);
        list.add(jL4);
        list.add(jL5);
        list.add(jL6);
        list.add(jL7);
        list.add(jL8);
        list.add(jL9);
        list.add(jL10);
        list.add(jL11);
        list.add(jL12);
        list.add(jL13);
        list.add(jL14);
        list.add(jL15);
        list.add(jL16);
        list.add(jL17);
        list.add(jL18);
        list.add(jL19);
        list.add(jL20);
    }
    
    //////////////////*******************////////////////
    
    public void addString(){
        ch.add(c1);
        ch.add(c2);
        ch.add(c3);
        ch.add(c4);
        ch.add(c5);
        ch.add(c6);
        ch.add(c7);
        ch.add(c8);
        ch.add(c9);
        ch.add(c10);
        ch.add(c11);
        ch.add(c12);
        ch.add(c13);
        ch.add(c14);
        ch.add(c15);
        ch.add(c16);
        ch.add(c17);
        ch.add(c18);
    }
    
    /////////////////************************//////////////////
    
    public void addButton(){
        buttonList.add(jBa);
        buttonList.add(jBs);
        buttonList.add(jBd);
        buttonList.add(jBf);
        buttonList.add(jBSpace);
        buttonList.add(jBj);
        buttonList.add(jBk);
        buttonList.add(jBl);
        buttonList.add(jBSemi);
        
    }
    
    //////////////////////***********************///////////////////
    
    public void addHandLabel(){
        handLabel.add(jLHand1);
        handLabel.add(jLHand2);
        handLabel.add(jLHand3);
        handLabel.add(jLHand4);
        handLabel.add(jLHand5);
        handLabel.add(jLHand6);
        handLabel.add(jLHand7);
        handLabel.add(jLHand8);
        handLabel.add(jLHand9);
        handLabel.add(jLHand10);
    }
    
    //////***********///////////////
    
    //ColorIndicator indiactes the color of this specific buttons & colorCount is the index of color arrayList
    
    public void colorIndicator(){
        if(c[prev] == "a"||c[prev] == "q"||c[prev] == "z"||c[prev] == ";"||c[prev] == "p"){
            colorIndicate=0;
        }
        else if(c[prev] == "w"||c[prev] == "s"||c[prev] == "x"||c[prev] == "o"||c[prev] == "l"||c[prev]=="."){
            colorIndicate=1;
        }
        else if(c[prev] == "e"||c[prev] == "d"||c[prev] == "c"||c[prev] == "i"||c[prev] == "k"||c[prev]==","){
            colorIndicate=2;
        }
        else if(c[prev] == "r"||c[prev] == "t"||c[prev] == "y"||c[prev] == "u"||c[prev] == "f"||c[prev]=="g"||c[prev]=="h"||c[prev]=="j"||c[prev]=="v"||c[prev]=="b"||c[prev]=="n"||c[prev]=="m"){
            colorIndicate=3;
        }
        else if(c[prev]=="space"){
            colorIndicate=4;
        }
        color.add(buttonList.get(colorIndicate).getBackground());
        fgColor.add(buttonList.get(colorIndicate).getForeground());
        colorCount++;
    }
    
    /////////////***********////////////////////
    
    ////ButtonIndicator indiacates the button which should be coloured next
    
    public void buttonIndicator(){
        buttonIndicate=0;
        while(buttonIndicate<buttonList.size()){
            if(c[prev].equalsIgnoreCase(buttonList.get(buttonIndicate).getText())){
                break;
            }
            else
                buttonIndicate++;
        }
    }
    
    ////////******/////////////////////////////////
    
    ////////ButtonColorChange change the color of buttons
    
    public void buttonColorChange(){
        buttonList.get(buttonIndicate).setBackground(color.get(colorCount));////Previous button color change to default
        colorIndicator();
        buttonIndicator();
        buttonList.get(buttonIndicate).setBackground(Color.DARK_GRAY);///////indicator button color has been changed
    }
    
    //////////*********//////////////////////////////
    
    public void borderColorChange(){
        list.get(prev).setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.green, Color.green, Color.GREEN, Color.GREEN));
        list.get(prev).setBackground(initialBgColor);
        list.get(prev).setForeground(wordTyped);
        ++current;
        prev=current;
    }
    
    //////////*************////////////////////////////
    
    public void addhandImage(){
        iC.add((ImageIcon) handLabel.get(0).getIcon());
        iC.add((ImageIcon) handLabel.get(1).getIcon());
        iC.add((ImageIcon) handLabel.get(2).getIcon());
        iC.add((ImageIcon) handLabel.get(3).getIcon());
        iC.add((ImageIcon) handLabel.get(4).getIcon());
        iC.add((ImageIcon) handLabel.get(5).getIcon());
        iC.add((ImageIcon) handLabel.get(6).getIcon());
        iC.add((ImageIcon) handLabel.get(7).getIcon());
        iC.add((ImageIcon) handLabel.get(8).getIcon());
        iC.add((ImageIcon) handLabel.get(9).getIcon());
    }
    
    //////////************///////////////////////////////
    //////////Indicate the specific hand/////////////////
    
    public void handIndicator(){
        if(c[prev]=="a"||c[prev]=="q"||c[prev]=="z"){
            handIndicate=0;
        }
        else if(c[prev]=="w"||c[prev]=="s"||c[prev]=="x"){
            handIndicate=1;
        }
        else if(c[prev]=="e"||c[prev]=="d"||c[prev]=="c"){
            handIndicate=2;
        }
        else if(c[prev]=="r"||c[prev]=="t"||c[prev]=="f"||c[prev]=="g"||c[prev]=="v"||c[prev]=="b"){
            handIndicate=3;
        }
        else if(c[prev]=="space"){
            handIndicate=4;
        }
        else if(c[prev]=="y"||c[prev]=="u"||c[prev]=="h"||c[prev]=="j"||c[prev]=="n"||c[prev]=="m"){
            handIndicate=6;
        }
        else if(c[prev]=="i"||c[prev]=="k"||c[prev]==","){
            handIndicate=7;
        }
        else if(c[prev]=="o"||c[prev]=="l"||c[prev]=="."){
            handIndicate=8;
        }
        else if(c[prev]=="p"||c[prev]==";"){
            handIndicate=9;
        }
        handLabel.get(handIndicate).setIcon(iC.get(handIndicate));//////Indicator hand color has been changed && prevHandIndicate is used to get previous hand Indicator icon color
        if(count==0){
            for(int i=0;i<10;i++){
                    if(i!=handIndicate)
                        handLabel.get(i).setIcon(null);/////At first every icon image become null except c[prev]
            }
        }
        else{
            handLabel.get(prevHandIndicate).setIcon(null);
        }
        prevHandIndicate=handIndicate;
    }
    
    public void music(){
        InputStream in;
        try{
            in=new FileInputStream(new File("D:\\TypingMaster\\src\\typingmaster\\sound.wav"));
            AudioStream audio=new AudioStream(in);
            AudioPlayer.player.start(audio);
        }
        catch(Exception e){
            
        }
    }
    ///////////***************///////////////////////////
    
    
    @Override
    public void keyPressed(KeyEvent e){
        int code=e.getKeyCode();
        
        if(code==KeyEvent.VK_A && c[prev]=="a"){
            wordCount++;
            borderColorChange();
            a=prev-1;
            if(c[a]!=c[prev]){
                buttonColorChange();
                handIndicator();
            }
            list.get(prev).setBackground(fgColor.get(colorCount));
            list.get(prev).setForeground(Color.WHITE);
        }
        else if(code==KeyEvent.VK_S && c[prev]=="s"){
            wordCount++;
            borderColorChange();
            a=prev-1;
            if(c[a]!=c[prev]){
                buttonColorChange();
                handIndicator();
            }
            list.get(prev).setBackground(fgColor.get(colorCount));
            list.get(prev).setForeground(Color.white);
        }
        else if(code==KeyEvent.VK_D && c[prev]=="d"){
            wordCount++;
            borderColorChange(); 
            a=prev-1;
            if(c[a]!=c[prev]){
                buttonColorChange();
                handIndicator();
            }
            list.get(prev).setBackground(fgColor.get(colorCount));
            list.get(prev).setForeground(Color.white);
        }
        else if(code==KeyEvent.VK_F && c[prev]=="f"){
            wordCount++;
            borderColorChange();    
            a=prev-1;
            if(c[a]!=c[prev]){
                buttonColorChange();
                handIndicator();
            }
            list.get(prev).setBackground(fgColor.get(colorCount));
            list.get(prev).setForeground(Color.white);
        }
        else if(code==KeyEvent.VK_J && c[prev]=="j"){
            wordCount++;
            borderColorChange(); 
            a=prev-1;
            if(c[a]!=c[prev]){
                buttonColorChange();
                handIndicator();
            }
            list.get(prev).setBackground(fgColor.get(colorCount));
            list.get(prev).setForeground(Color.white);
        }
        else if(code==KeyEvent.VK_K && c[prev]=="k"){
            wordCount++;
            borderColorChange();
            a=prev-1;
            if(c[a]!=c[prev]){
                buttonColorChange();
                handIndicator();
            }
            list.get(prev).setBackground(fgColor.get(colorCount));
            list.get(prev).setForeground(Color.white);
        }
        else if(code==KeyEvent.VK_L && c[prev]=="l"){
            wordCount++;
            borderColorChange();   
            a=prev-1;
            if(c[a]!=c[prev]){
                buttonColorChange();
                handIndicator();
            }
            list.get(prev).setBackground(fgColor.get(colorCount));
            list.get(prev).setForeground(Color.white);
        }
        
        else if(code==KeyEvent.VK_SEMICOLON && c[prev]==";"){
            wordCount++;
            borderColorChange();   
            a=prev-1;
            if(c[a]!=c[prev]){
                buttonColorChange();
                handIndicator();
            }
            list.get(prev).setBackground(fgColor.get(colorCount));
            list.get(prev).setForeground(Color.white);
        }
        else if(code==KeyEvent.VK_SPACE && c[prev]=="space"){
            wordCount++;
            if(prev==c.length-1){
                list.get(prev).setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, null, null, null, null));
                prev=0;
                current=0;
                if(count>0 && count<18){
                    c=ch.get(count);
                }
                else{
                    timer.stop();
                    speed=speed/((initialTime-time)/(double)60000);
                    JOptionPane.showMessageDialog(new frame2(), "Speed(WPM):"+speed);
                    if(JOptionPane.OK_OPTION==0){
                        dispose();
                    }
                    
                    frame1 frame=new frame1();
                    frame.setSize(1365, 723);
                    frame.setVisible(true);
                }
                for(int j=0;j<20;j++){
                    list.get(j).setForeground(initialFgColor);
                    list.get(j).setBackground(initialBgColor);
                    list.get(j).setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,null,null,null,null));
                    if(list.get(j).getText()!=c[j]){
                        list.get(j).setText(c[j]);
                    }
                }
                handIndicator();
                buttonColorChange();
                list.get(prev).setBackground(fgColor.get(colorCount));
                list.get(prev).setForeground(Color.white);
                count++;
            }
            else{
                borderColorChange(); 
                a=prev-1;
                if(c[a]!=c[prev]){
                    buttonColorChange();
                    handIndicator();
                }
                list.get(prev).setBackground(fgColor.get(colorCount));
                list.get(prev).setForeground(Color.white);
            }
            
        }
        else{
            music();
        }
    }
    
    ArrayList<ImageIcon> iC=new ArrayList<ImageIcon>();
    ArrayList<JLabel> list = new ArrayList<JLabel>();
    ArrayList<JButton> buttonList=new ArrayList<JButton>();
    ArrayList<String[]> ch=new ArrayList<String[]>();
    ArrayList<Color> color=new ArrayList<Color>();
    ArrayList<Color> fgColor=new ArrayList<Color>();
    ArrayList<JLabel> handLabel=new ArrayList<JLabel>();
    Color wordTyped,initialBgColor,initialFgColor;
    long initialTime=300000,time=300000;
    int minute=0,second1=0,second2=0;
    double wordCount=0,speed=0;
    Timer timer;
    
    int prev=0,current=0,count=0,buttonIndicate=0,colorIndicate=0,a=0,colorCount=-1,handIndicate,prevHandIndicate=0;
    String c[]=new String[20];
    String c1[]={"a","j","j","a","space","a","j","j","a","space","a","k","k","a","space","a","k","k","a","space"};
    String c2[]={"a","l","l","a","space","a","l","l","a","space","a",";",";","a","space","a",";",";","a","space"};
    String c3[]={"j","a","a","j","space","j","a","a","j","space","j","s","s","j","space","j","s","s","j","space"};
    String c4[]={"j","d","d","j","space","j","d","d","j","space","j","f","f","j","space","j","f","f","j","space"};
    String c5[]={"s","k","k","s","space","s","k","k","s","space","d","l","l","d","space","d","l","l","d","space"};
    String c6[]={"d","j","j","d","space","d","j","j","d","space","f",";",";","f","space","f",";",";","f","space"};
    String c7[]={"a","s","j","k","space","a","s","j","k","space","a","s","l",";","space","a","s","l",";","space"};
    String c8[]={"d","f","l",";","space","d","f","l",";","space","d","f","j","k","space","d","f","j","k","space"};
    String c9[]={"j","a","s","d","space","j","a","s","d","space","k","s","d","f","space","k","s","d","f","space"};
    String c10[]={"f","j","k","l","space","f","j","k","l","space","d","k","l",";","space","d","k","l",";","space"};
    String c11[]={"l","a","k","s","space","l","a","k","s","space","j","d",";","f","space","j","d",";","f","space"};
    String c12[]={"s","j","a","l","space","s","j","a","l","space","a","k","f",";","space","a","k","f",";","space"};
    String c13[]={"l","d","a","j","space","l","d","a","j","space",";","a","k","d","space",";","a","k","d","space"};
    String c14[]={"j","f","d","s","space","j","f","d","s","space","k","d","s","a","space","k","d","s","a","space"};
    String c15[]={";","s","a","f","space",";","s","a","f","space","l","f","d","a","space","l","f","d","a","space"};
    String c16[]={"a","j","k",";","space","a","j","k",";","space","f","l",";","j","space","f","l",";","j","space"};
    String c17[]={"k","a","k","s","space","k","a","k","s","space","l","d","l","f","space","l","d","l","f","space"};
    String c18[]={"a","j","a","f","space","a","j","a","f","space","s","k","s","l","space","s","k","s","l","space"};
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jBSemi;
    public static javax.swing.JButton jBSpace;
    public static javax.swing.JButton jBa;
    private javax.swing.JButton jBcancel;
    public static javax.swing.JButton jBd;
    public static javax.swing.JButton jBf;
    private javax.swing.JButton jBg;
    public static javax.swing.JButton jBj;
    public static javax.swing.JButton jBk;
    public static javax.swing.JButton jBl;
    public static javax.swing.JButton jBs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton81;
    private javax.swing.JCheckBox jCheckBox1;
    public static javax.swing.JLabel jL1;
    public static javax.swing.JLabel jL10;
    public static javax.swing.JLabel jL11;
    public static javax.swing.JLabel jL12;
    public static javax.swing.JLabel jL13;
    public static javax.swing.JLabel jL14;
    public static javax.swing.JLabel jL15;
    public static javax.swing.JLabel jL16;
    public static javax.swing.JLabel jL17;
    public static javax.swing.JLabel jL18;
    public static javax.swing.JLabel jL19;
    public static javax.swing.JLabel jL2;
    public static javax.swing.JLabel jL20;
    public static javax.swing.JLabel jL3;
    public static javax.swing.JLabel jL4;
    public static javax.swing.JLabel jL5;
    public static javax.swing.JLabel jL6;
    public static javax.swing.JLabel jL7;
    public static javax.swing.JLabel jL8;
    public static javax.swing.JLabel jL9;
    private javax.swing.JLabel jLHand1;
    private javax.swing.JLabel jLHand10;
    private javax.swing.JLabel jLHand2;
    private javax.swing.JLabel jLHand3;
    private javax.swing.JLabel jLHand4;
    private javax.swing.JLabel jLHand5;
    private javax.swing.JLabel jLHand6;
    private javax.swing.JLabel jLHand7;
    private javax.swing.JLabel jLHand8;
    private javax.swing.JLabel jLHand9;
    private javax.swing.JLabel jLTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLspeed;
    // End of variables declaration//GEN-END:variables

    

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
}
