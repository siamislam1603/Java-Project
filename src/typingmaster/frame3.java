
package typingmaster;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import static typingmaster.frame4.jBSemi;
import static typingmaster.frame4.jBSpace;
import static typingmaster.frame4.jBa;
import static typingmaster.frame4.jBd;
import static typingmaster.frame4.jBf;
import static typingmaster.frame4.jBj;
import static typingmaster.frame4.jBk;
import static typingmaster.frame4.jBl;
import static typingmaster.frame4.jBs;


public class frame3 extends javax.swing.JFrame implements ActionListener,KeyListener {

    public frame3() throws IOException {
        initComponents();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addJLabel();
        readFile();
        c=ch.get(count);
        wordColorChange();
        addHandLabel();
        addhandImage();
        handIndicator();
        addButton();
        buttonIndicator();
        colorIndicator();
        buttonList.get(buttonIndicate).setBackground(Color.DARK_GRAY);
        timerCount=1;
        t=new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(timerCount==0){
                    buttonList.get(buttonIndicate).setBackground(Color.DARK_GRAY);
                    timerCount=1;
                }
                else{
                    buttonList.get(buttonIndicate).setBackground(color.get(colorCount));
                    timerCount=0;
                }
            }
        });
        t.start();
        showTime(); 
    }
    
    void readFile() throws IOException{
        char g;
        c="";
        FileReader fr=null;
        try{
            fr=new FileReader("sentence.txt");
            int in;
            while((in=fr.read())!=-1){
                g=(char)in;
                if(g!='.'){
                    c=c+g;
                }
                else if(g=='.'){
                    c=c+"> ";
                    ch.add(c);
                    c="";
                }
            }  
        }
        finally{
            if(fr!=null){
                fr.close();
            }
        }
    }
    
    void showTime(){
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
                    frame.setSize(1375,734);
                    frame.setVisible(true);
                }
            }
            
        });
        timer.start();
        //System.out.println(currentTime.toString());
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
        jBt = new javax.swing.JButton();
        jBp = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jBi = new javax.swing.JButton();
        jBo = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jBw = new javax.swing.JButton();
        jBe = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jBq = new javax.swing.JButton();
        jBy = new javax.swing.JButton();
        jBu = new javax.swing.JButton();
        jBr = new javax.swing.JButton();
        jBh = new javax.swing.JButton();
        jBj = new javax.swing.JButton();
        jBf = new javax.swing.JButton();
        jBg = new javax.swing.JButton();
        jBSemi = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jBk = new javax.swing.JButton();
        jBl = new javax.swing.JButton();
        jBenter = new javax.swing.JButton();
        jBs = new javax.swing.JButton();
        jBd = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jBa = new javax.swing.JButton();
        jBn = new javax.swing.JButton();
        jBm = new javax.swing.JButton();
        jBv = new javax.swing.JButton();
        jBb = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jBComma = new javax.swing.JButton();
        jBdot = new javax.swing.JButton();
        jBx = new javax.swing.JButton();
        jBc = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jBz = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jBSpace = new javax.swing.JButton();
        jL1 = new javax.swing.JLabel();
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
        jLabel3 = new javax.swing.JLabel();
        jLTime = new javax.swing.JLabel();
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
        getContentPane().setLayout(null);

        jButton21.setBackground(new java.awt.Color(255, 204, 204));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 102, 102));
        jButton21.setText("2");
        getContentPane().add(jButton21);
        jButton21.setBounds(126, 194, 54, 44);

        jButton22.setBackground(new java.awt.Color(153, 255, 153));
        jButton22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton22.setForeground(new java.awt.Color(0, 204, 0));
        jButton22.setText("3");
        getContentPane().add(jButton22);
        jButton22.setBounds(186, 194, 63, 44);

        jButton23.setBackground(new java.awt.Color(204, 204, 255));
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 51, 255));
        jButton23.setText(".");
        jButton23.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton23);
        jButton23.setBounds(14, 194, 49, 44);

        jButton24.setBackground(new java.awt.Color(204, 204, 255));
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton24.setForeground(new java.awt.Color(0, 51, 255));
        jButton24.setText("1");
        getContentPane().add(jButton24);
        jButton24.setBounds(65, 194, 59, 44);

        jButton25.setBackground(new java.awt.Color(255, 102, 255));
        jButton25.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton25.setForeground(new java.awt.Color(204, 0, 204));
        jButton25.setText("6");
        getContentPane().add(jButton25);
        jButton25.setBounds(405, 194, 60, 44);

        jButton26.setBackground(new java.awt.Color(255, 102, 255));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton26.setForeground(new java.awt.Color(204, 0, 204));
        jButton26.setText("7");
        getContentPane().add(jButton26);
        jButton26.setBounds(471, 194, 60, 44);

        jButton27.setBackground(new java.awt.Color(255, 102, 255));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton27.setForeground(new java.awt.Color(204, 0, 204));
        jButton27.setText("4");
        getContentPane().add(jButton27);
        jButton27.setBounds(259, 194, 61, 44);

        jButton28.setBackground(new java.awt.Color(255, 102, 255));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton28.setForeground(new java.awt.Color(204, 0, 204));
        jButton28.setText("5");
        getContentPane().add(jButton28);
        jButton28.setBounds(326, 194, 61, 44);

        jButton29.setBackground(new java.awt.Color(204, 204, 255));
        jButton29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton29.setForeground(new java.awt.Color(0, 51, 255));
        jButton29.setText("0");
        getContentPane().add(jButton29);
        jButton29.setBounds(677, 194, 62, 44);

        jButton30.setBackground(new java.awt.Color(204, 204, 255));
        jButton30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton30.setForeground(new java.awt.Color(0, 51, 255));
        jButton30.setText("-");
        getContentPane().add(jButton30);
        jButton30.setBounds(745, 194, 61, 44);

        jButton31.setBackground(new java.awt.Color(153, 255, 153));
        jButton31.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(0, 204, 0));
        jButton31.setText("8");
        getContentPane().add(jButton31);
        jButton31.setBounds(537, 194, 63, 44);

        jButton32.setBackground(new java.awt.Color(255, 204, 204));
        jButton32.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 102, 102));
        jButton32.setText("9");
        getContentPane().add(jButton32);
        jButton32.setBounds(606, 194, 65, 44);

        jButton33.setBackground(new java.awt.Color(204, 204, 255));
        jButton33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton33.setForeground(new java.awt.Color(0, 51, 255));
        jButton33.setText("=");
        getContentPane().add(jButton33);
        jButton33.setBounds(812, 194, 62, 44);

        jButton35.setBackground(new java.awt.Color(204, 204, 255));
        jButton35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton35.setForeground(new java.awt.Color(0, 51, 255));
        jButton35.setText("Back");
        jButton35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jButton35);
        jButton35.setBounds(880, 194, 80, 44);

        jBt.setBackground(new java.awt.Color(255, 102, 255));
        jBt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBt.setForeground(new java.awt.Color(204, 0, 204));
        jBt.setText("T");
        getContentPane().add(jBt);
        jBt.setBounds(334, 244, 69, 44);

        jBp.setBackground(new java.awt.Color(204, 204, 255));
        jBp.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBp.setForeground(new java.awt.Color(0, 51, 255));
        jBp.setText("P");
        getContentPane().add(jBp);
        jBp.setBounds(701, 244, 62, 44);

        jButton38.setBackground(new java.awt.Color(204, 204, 255));
        jButton38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton38.setForeground(new java.awt.Color(0, 51, 255));
        jButton38.setText("[");
        getContentPane().add(jButton38);
        jButton38.setBounds(769, 244, 61, 44);

        jBi.setBackground(new java.awt.Color(153, 255, 153));
        jBi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBi.setForeground(new java.awt.Color(0, 204, 0));
        jBi.setText("I");
        getContentPane().add(jBi);
        jBi.setBounds(561, 244, 63, 44);

        jBo.setBackground(new java.awt.Color(255, 204, 204));
        jBo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jBo.setForeground(new java.awt.Color(255, 102, 102));
        jBo.setText("O");
        getContentPane().add(jBo);
        jBo.setBounds(630, 244, 65, 44);

        jButton41.setBackground(new java.awt.Color(204, 204, 255));
        jButton41.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton41.setForeground(new java.awt.Color(0, 51, 255));
        jButton41.setText("]");
        getContentPane().add(jButton41);
        jButton41.setBounds(836, 244, 62, 44);

        jButton42.setBackground(new java.awt.Color(204, 204, 255));
        jButton42.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton42.setForeground(new java.awt.Color(0, 51, 255));
        jButton42.setText("\\");
            getContentPane().add(jButton42);
            jButton42.setBounds(904, 244, 56, 44);

            jBw.setBackground(new java.awt.Color(255, 204, 204));
            jBw.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jBw.setForeground(new java.awt.Color(255, 102, 102));
            jBw.setText("W");
            getContentPane().add(jBw);
            jBw.setBounds(142, 244, 54, 44);

            jBe.setBackground(new java.awt.Color(153, 255, 153));
            jBe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBe.setForeground(new java.awt.Color(0, 204, 0));
            jBe.setText("E");
            getContentPane().add(jBe);
            jBe.setBounds(198, 244, 63, 44);

            jButton45.setBackground(new java.awt.Color(204, 204, 255));
            jButton45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jButton45.setForeground(new java.awt.Color(0, 51, 255));
            jButton45.setText("Tab");
            jButton45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jButton45.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
            getContentPane().add(jButton45);
            jButton45.setBounds(14, 244, 61, 44);

            jBq.setBackground(new java.awt.Color(204, 204, 255));
            jBq.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBq.setForeground(new java.awt.Color(0, 51, 255));
            jBq.setText("Q");
            getContentPane().add(jBq);
            jBq.setBounds(77, 244, 59, 44);

            jBy.setBackground(new java.awt.Color(255, 102, 255));
            jBy.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBy.setForeground(new java.awt.Color(204, 0, 204));
            jBy.setText("Y");
            getContentPane().add(jBy);
            jBy.setBounds(429, 244, 60, 44);

            jBu.setBackground(new java.awt.Color(255, 102, 255));
            jBu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBu.setForeground(new java.awt.Color(204, 0, 204));
            jBu.setText("U");
            getContentPane().add(jBu);
            jBu.setBounds(495, 244, 60, 44);

            jBr.setBackground(new java.awt.Color(255, 102, 255));
            jBr.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBr.setForeground(new java.awt.Color(204, 0, 204));
            jBr.setText("R");
            getContentPane().add(jBr);
            jBr.setBounds(267, 244, 61, 44);

            jBh.setBackground(new java.awt.Color(255, 102, 255));
            jBh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBh.setForeground(new java.awt.Color(204, 0, 204));
            jBh.setText("H");
            getContentPane().add(jBh);
            jBh.setBounds(455, 294, 60, 45);

            jBj.setBackground(new java.awt.Color(255, 102, 255));
            jBj.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBj.setForeground(new java.awt.Color(204, 0, 204));
            jBj.setText("J");
            getContentPane().add(jBj);
            jBj.setBounds(521, 294, 60, 44);

            jBf.setBackground(new java.awt.Color(255, 102, 255));
            jBf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBf.setForeground(new java.awt.Color(204, 0, 204));
            jBf.setText("F");
            getContentPane().add(jBf);
            jBf.setBounds(305, 294, 61, 45);

            jBg.setBackground(new java.awt.Color(255, 102, 255));
            jBg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBg.setForeground(new java.awt.Color(204, 0, 204));
            jBg.setText("G");
            getContentPane().add(jBg);
            jBg.setBounds(372, 294, 61, 45);

            jBSemi.setBackground(new java.awt.Color(204, 204, 255));
            jBSemi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBSemi.setForeground(new java.awt.Color(0, 51, 255));
            jBSemi.setText(";");
            getContentPane().add(jBSemi);
            jBSemi.setBounds(727, 295, 62, 44);

            jButton55.setBackground(new java.awt.Color(204, 204, 255));
            jButton55.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton55.setForeground(new java.awt.Color(0, 51, 255));
            jButton55.setText("'");
            getContentPane().add(jButton55);
            jButton55.setBounds(795, 295, 61, 44);

            jBk.setBackground(new java.awt.Color(153, 255, 153));
            jBk.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBk.setForeground(new java.awt.Color(0, 204, 0));
            jBk.setText("K");
            getContentPane().add(jBk);
            jBk.setBounds(587, 294, 63, 44);

            jBl.setBackground(new java.awt.Color(255, 204, 204));
            jBl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBl.setForeground(new java.awt.Color(255, 102, 102));
            jBl.setText("l");
            getContentPane().add(jBl);
            jBl.setBounds(656, 295, 65, 44);

            jBenter.setBackground(new java.awt.Color(204, 204, 255));
            jBenter.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBenter.setForeground(new java.awt.Color(0, 51, 255));
            jBenter.setText("Enter");
            getContentPane().add(jBenter);
            jBenter.setBounds(862, 295, 98, 44);

            jBs.setBackground(new java.awt.Color(255, 204, 204));
            jBs.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBs.setForeground(new java.awt.Color(255, 102, 102));
            jBs.setText("S");
            getContentPane().add(jBs);
            jBs.setBounds(176, 294, 54, 45);

            jBd.setBackground(new java.awt.Color(153, 255, 153));
            jBd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBd.setForeground(new java.awt.Color(0, 204, 0));
            jBd.setText("D");
            getContentPane().add(jBd);
            jBd.setBounds(236, 295, 63, 44);

            jButton62.setBackground(new java.awt.Color(204, 204, 255));
            jButton62.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton62.setForeground(new java.awt.Color(0, 51, 255));
            jButton62.setText("caps");
            getContentPane().add(jButton62);
            jButton62.setBounds(14, 294, 91, 44);

            jBa.setBackground(new java.awt.Color(204, 204, 255));
            jBa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBa.setForeground(new java.awt.Color(0, 51, 255));
            jBa.setText("A");
            getContentPane().add(jBa);
            jBa.setBounds(111, 294, 59, 45);

            jBn.setBackground(new java.awt.Color(255, 102, 255));
            jBn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBn.setForeground(new java.awt.Color(204, 0, 204));
            jBn.setText("N");
            getContentPane().add(jBn);
            jBn.setBounds(472, 345, 60, 44);

            jBm.setBackground(new java.awt.Color(255, 102, 255));
            jBm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBm.setForeground(new java.awt.Color(204, 0, 204));
            jBm.setText("M");
            getContentPane().add(jBm);
            jBm.setBounds(538, 345, 60, 44);

            jBv.setBackground(new java.awt.Color(255, 102, 255));
            jBv.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBv.setForeground(new java.awt.Color(204, 0, 204));
            jBv.setText("V");
            getContentPane().add(jBv);
            jBv.setBounds(326, 345, 61, 44);

            jBb.setBackground(new java.awt.Color(255, 102, 255));
            jBb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBb.setForeground(new java.awt.Color(204, 0, 204));
            jBb.setText("B");
            getContentPane().add(jBb);
            jBb.setBounds(393, 345, 61, 44);

            jButton68.setBackground(new java.awt.Color(204, 204, 255));
            jButton68.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton68.setForeground(new java.awt.Color(0, 51, 255));
            jButton68.setText("/");
            getContentPane().add(jButton68);
            jButton68.setBounds(740, 345, 62, 44);

            jButton69.setBackground(new java.awt.Color(204, 204, 255));
            jButton69.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton69.setForeground(new java.awt.Color(0, 51, 255));
            jButton69.setText("Shift");
            getContentPane().add(jButton69);
            jButton69.setBounds(814, 345, 146, 44);

            jBComma.setBackground(new java.awt.Color(153, 255, 153));
            jBComma.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBComma.setForeground(new java.awt.Color(0, 204, 0));
            jBComma.setText(",");
            getContentPane().add(jBComma);
            jBComma.setBounds(604, 345, 59, 44);

            jBdot.setBackground(new java.awt.Color(255, 204, 204));
            jBdot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBdot.setForeground(new java.awt.Color(255, 102, 102));
            jBdot.setText(".");
            getContentPane().add(jBdot);
            jBdot.setBounds(669, 345, 65, 44);

            jBx.setBackground(new java.awt.Color(255, 204, 204));
            jBx.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBx.setForeground(new java.awt.Color(255, 102, 102));
            jBx.setText("X");
            getContentPane().add(jBx);
            jBx.setBounds(197, 345, 54, 44);

            jBc.setBackground(new java.awt.Color(153, 255, 153));
            jBc.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBc.setForeground(new java.awt.Color(0, 204, 0));
            jBc.setText("C");
            getContentPane().add(jBc);
            jBc.setBounds(257, 345, 63, 44);

            jButton76.setBackground(new java.awt.Color(204, 204, 255));
            jButton76.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton76.setForeground(new java.awt.Color(0, 51, 255));
            jButton76.setText("Shift");
            getContentPane().add(jButton76);
            jButton76.setBounds(14, 345, 116, 44);

            jBz.setBackground(new java.awt.Color(204, 204, 255));
            jBz.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBz.setForeground(new java.awt.Color(0, 51, 255));
            jBz.setText("Z");
            getContentPane().add(jBz);
            jBz.setBounds(132, 345, 59, 44);

            jButton78.setBackground(new java.awt.Color(204, 204, 255));
            jButton78.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jButton78.setForeground(new java.awt.Color(0, 51, 255));
            jButton78.setText("cntrl");
            getContentPane().add(jButton78);
            jButton78.setBounds(14, 395, 74, 40);

            jButton81.setBackground(new java.awt.Color(204, 204, 255));
            jButton81.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jButton81.setForeground(new java.awt.Color(0, 51, 255));
            jButton81.setText("cntrl");
            getContentPane().add(jButton81);
            jButton81.setBounds(837, 395, 123, 40);

            jBSpace.setBackground(new java.awt.Color(204, 204, 0));
            jBSpace.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jBSpace.setForeground(new java.awt.Color(102, 102, 0));
            jBSpace.setText("Space");
            getContentPane().add(jBSpace);
            jBSpace.setBounds(257, 395, 334, 40);

            jL1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            jL1.setForeground(new java.awt.Color(51, 153, 0));
            jL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jL1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            jL1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
            jL1.setPreferredSize(new java.awt.Dimension(45, 23));
            getContentPane().add(jL1);
            jL1.setBounds(20, 60, 960, 90);

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/Tenyér (1).png"))); // NOI18N
            jLabel1.setPreferredSize(new java.awt.Dimension(750, 100));
            getContentPane().add(jLabel1);
            jLabel1.setBounds(30, 460, 770, 400);

            jButton1.setBackground(new java.awt.Color(204, 204, 255));
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton1);
            jButton1.setBounds(714, 395, 117, 40);

            jButton2.setBackground(new java.awt.Color(204, 204, 0));
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton2);
            jButton2.setBounds(163, 395, 88, 40);

            jButton3.setBackground(new java.awt.Color(204, 204, 0));
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton3);
            jButton3.setBounds(597, 395, 111, 40);

            jButton4.setBackground(new java.awt.Color(204, 204, 255));
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton4ActionPerformed(evt);
                }
            });
            getContentPane().add(jButton4);
            jButton4.setBounds(94, 395, 63, 40);

            jLHand1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/blue.png"))); // NOI18N
            getContentPane().add(jLHand1);
            jLHand1.setBounds(26, 534, 30, 50);

            jLHand2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/orange.png"))); // NOI18N
            getContentPane().add(jLHand2);
            jLHand2.setBounds(94, 464, 40, 50);

            jLHand3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/green.png"))); // NOI18N
            getContentPane().add(jLHand3);
            jLHand3.setBounds(204, 430, 16, 40);

            jLHand4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/purple.png"))); // NOI18N
            getContentPane().add(jLHand4);
            jLHand4.setBounds(300, 470, 40, 50);

            jLHand5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/brown.png"))); // NOI18N
            getContentPane().add(jLHand5);
            jLHand5.setBounds(360, 640, 20, 50);

            jLHand6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/brown.png"))); // NOI18N
            getContentPane().add(jLHand6);
            jLHand6.setBounds(436, 654, 16, 20);

            jLHand7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/purple.png"))); // NOI18N
            getContentPane().add(jLHand7);
            jLHand7.setBounds(490, 460, 30, 70);

            jLHand8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/green.png"))); // NOI18N
            getContentPane().add(jLHand8);
            jLHand8.setBounds(590, 430, 30, 40);

            jLHand9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/orange.png"))); // NOI18N
            getContentPane().add(jLHand9);
            jLHand9.setBounds(700, 480, 30, 20);

            jLHand10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/blue.png"))); // NOI18N
            getContentPane().add(jLHand10);
            jLHand10.setBounds(770, 550, 20, 20);

            jBcancel.setText("Cancel");
            jBcancel.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jBcancelActionPerformed(evt);
                }
            });
            getContentPane().add(jBcancel);
            jBcancel.setBounds(1140, 570, 90, 40);

            jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel3.setText("Time");
            getContentPane().add(jLabel3);
            jLabel3.setBounds(1130, 450, 70, 30);

            jLTime.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            getContentPane().add(jLTime);
            jLTime.setBounds(1130, 490, 110, 50);

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel4.setText("Speed(WPS)");
            getContentPane().add(jLabel4);
            jLabel4.setBounds(1130, 310, 151, 40);

            jLspeed.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
            getContentPane().add(jLspeed);
            jLspeed.setBounds(1130, 370, 150, 60);

            jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/typingmaster/bG.png"))); // NOI18N
            getContentPane().add(jLabel2);
            jLabel2.setBounds(0, 0, 1370, 705);

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

    private void jBcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelActionPerformed
        dispose();
        frame1 f=new frame1();
        f.setSize(1375,734);
        f.setVisible(true);
    }//GEN-LAST:event_jBcancelActionPerformed

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new frame3().setVisible(true);
                } catch (IOException ex) {
                    
                }
                try {
                    new frame3().setSize(1375, 734);
                } catch (IOException ex) {
                    
                }
                
                
            }
        });
    }
    
    /////////////////******************//////////////////
    
    public void addJLabel(){
        list.add(jL1);
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
        buttonList.add(jBe);
        buttonList.add(jBi);
        buttonList.add(jBenter);
        buttonList.add(jBb);
        buttonList.add(jBc);
        buttonList.add(jBd);
        buttonList.add(jBe);
        buttonList.add(jBg);
        buttonList.add(jBh);
        buttonList.add(jBm);
        buttonList.add(jBn);
        buttonList.add(jBo);
        buttonList.add(jBp);
        buttonList.add(jBq);
        buttonList.add(jBr);
        buttonList.add(jBt);
        buttonList.add(jBu);
        buttonList.add(jBv);
        buttonList.add(jBw);
        buttonList.add(jBx);
        buttonList.add(jBy);
        buttonList.add(jBz);
        buttonList.add(jBComma);
        buttonList.add(jBdot);
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
        if(c.charAt(prev) == 'a'||c.charAt(prev) == 'q'||c.charAt(prev) == 'z'||c.charAt(prev) == ';'||c.charAt(prev) == 'p'||c.charAt(prev)=='>'){
            colorIndicate=0;
        }
        else if(c.charAt(prev) == 'w'||c.charAt(prev) == 's'||c.charAt(prev) == 'x'||c.charAt(prev) == 'o'||c.charAt(prev) == 'l'||c.charAt(prev) == '.'){
            colorIndicate=1;
        }
        else if(c.charAt(prev) == 'e'||c.charAt(prev) == 'd'||c.charAt(prev) == 'c'||c.charAt(prev) == 'i'||c.charAt(prev) == 'k'||c.charAt(prev) == ','){
            colorIndicate=2;
        }
        else if(c.charAt(prev) == 'r'||c.charAt(prev) == 't'||c.charAt(prev) == 'y'||c.charAt(prev) == 'u'||c.charAt(prev) == 'f'||c.charAt(prev) == 'g'||c.charAt(prev) == 'h'||c.charAt(prev) == 'v'||c.charAt(prev) == 'b'||c.charAt(prev) == 'j'||c.charAt(prev) == 'n'||c.charAt(prev) == 'm'){
            colorIndicate=3;
        }
        else if(c.charAt(prev) == ' '){
            colorIndicate=4;
        }
        color.add(buttonList.get(colorIndicate).getBackground());
        colorCount++;
    }
    
    /////////////***********////////////////////
    
    ////ButtonIndicator indiacates the button which should be coloured next
    
    public void buttonIndicator(){
        buttonIndicate=0;
        String s1=c.charAt(prev)+"";
        if(s1.equals(">")){
            s1="enter";
        }
        else if(s1.equals(" ")){
            s1="space";
        }
        while(buttonIndicate<buttonList.size()){
            if(s1.equalsIgnoreCase(buttonList.get(buttonIndicate).getText())){
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
        buttonList.get(buttonIndicate).setBackground(Color.DARK_GRAY);
        timerCount=1;
        t=new Timer(1000,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(timerCount==0){
                    buttonList.get(buttonIndicate).setBackground(Color.DARK_GRAY);
                    timerCount=1;
                }
                else{
                    buttonList.get(buttonIndicate).setBackground(color.get(colorCount));
                    timerCount=0;
                }
            }
        });
        t.start();
        ///////indicator button color has been changed
    }
    
    //////////*********//////////////////////////////
    
    public void wordColorChange(){
        k=prev;
        String s1;
        s1=c;
        if(c.charAt(k)==' '){
            jL1.setText(String.format("<html>%s<u>%s</u><font color='red'>%s</font></html>", 
            s2+">"," ",s1.substring(k,s1.length())));
        }
        else{
            while(c.charAt(k)!=' '){
                k++;
            }
            jL1.setText(String.format("<html>%s<u>%s</u>%s<font color='red'>%s</font></html>", 
            s2+">",""+s1.charAt(prev),s1.substring(prev+1,k),s1.substring(k,s1.length()))); 
        }
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
        if(c.charAt(prev)== 'a'||c.charAt(prev)=='q'||c.charAt(prev)=='z'){
            handIndicate=0;
        }
        else if(c.charAt(prev)=='w'||c.charAt(prev)=='s'||c.charAt(prev)=='x'){
            handIndicate=1;
        }
        else if(c.charAt(prev)=='e'||c.charAt(prev)=='d'||c.charAt(prev)=='c'){
            handIndicate=2;
        }
        else if(c.charAt(prev)=='r'||c.charAt(prev)=='t'||c.charAt(prev)=='f'||c.charAt(prev)=='g'||c.charAt(prev)=='v'||c.charAt(prev)=='b'){
            handIndicate=3;
        }
        else if(c.charAt(prev)==' '){
            handIndicate=4;
        }
        else if(c.charAt(prev)=='y'||c.charAt(prev)=='u'||c.charAt(prev)=='h'||c.charAt(prev)=='j'||c.charAt(prev)=='n'||c.charAt(prev)=='m'){
            handIndicate=6;
        }
        else if(c.charAt(prev)=='i'||c.charAt(prev)=='k'||c.charAt(prev)==','){
            handIndicate=7;
        }
        else if(c.charAt(prev)=='o'||c.charAt(prev)=='l'||c.charAt(prev)=='.'){
            handIndicate=8;
        }
        else if(c.charAt(prev)=='p'||c.charAt(prev)==';'||c.charAt(prev)=='>'){
            handIndicate=9;
        }
        handLabel.get(handIndicate).setIcon(iC.get(handIndicate));//////Indicator hand color has been changed && prevHandIndicate is used to get previous hand Indicator icon color
        if(count==0){
            for(int i=0;i<10;i++){
                    if(i!=handIndicate)
                        handLabel.get(i).setIcon(null);/////At first every icon image become null except c[prev]
            }
        }
        else if(prevHandIndicate!=handIndicate){
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
        
        if(code==KeyEvent.VK_A && c.charAt(prev)=='a'){
            prev=prev+1;
            wordCount++;
            s2=s2+" ";
            wordColorChange();
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        else if(code==KeyEvent.VK_B && c.charAt(prev)=='b'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_C && c.charAt(prev)=='c'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_D && c.charAt(prev)=='d'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange(); 
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_E && c.charAt(prev)=='e'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_F && c.charAt(prev)=='f'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();    
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_G && c.charAt(prev)=='g'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_H && c.charAt(prev)=='h'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_I && c.charAt(prev)=='i'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_J && c.charAt(prev)=='j'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange(); 
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_K && c.charAt(prev)=='k'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        else if(code==KeyEvent.VK_L && c.charAt(prev)=='l'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_M && c.charAt(prev)=='m'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_N && c.charAt(prev)=='n'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        else if(code==KeyEvent.VK_O && c.charAt(prev)=='o'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_P && c.charAt(prev)=='p'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_Q && c.charAt(prev)=='q'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_R && c.charAt(prev)=='r'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }

        else if(code==KeyEvent.VK_S && c.charAt(prev)=='s'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_T && c.charAt(prev)=='t'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_U && c.charAt(prev)=='u'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_V && c.charAt(prev)=='v'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_W && c.charAt(prev)=='w'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_X && c.charAt(prev)=='x'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_Y && c.charAt(prev)=='y'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_Z && c.charAt(prev)=='z'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        
        else if(code==KeyEvent.VK_SEMICOLON && c.charAt(prev)==';'){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        else if(code==KeyEvent.VK_SPACE && c.charAt(prev)==' '){
            wordCount++;
            prev=prev+1;
            s2=s2+" ";
            wordColorChange();   
            a=prev-1;
            if(c.charAt(a)!=c.charAt(prev)){
                buttonColorChange();
                handIndicator();
            }
        }
        else if(code==KeyEvent.VK_ENTER && c.charAt(prev)=='>'){
            wordCount++;
            t.stop();
            if(count!=ch.size()-1){
            prev=0;
            c=ch.get(++count);
            s2="";
            wordColorChange();
            buttonColorChange();
            handIndicator();
            }
            else{
            timer.stop();
            t.stop();
            speed=speed/((initialTime-time)/(double)60000);
            JOptionPane.showMessageDialog(new frame2(), "Speed(WPM):"+speed);
            if(JOptionPane.OK_OPTION==0){
                dispose();
            } 
            frame1 f1=new frame1();
            f1.setSize(1375,734);
            f1.setVisible(true);
            }
        }
        else{
            music();
        }
        
        
    }
    
    ArrayList<ImageIcon> iC=new ArrayList<ImageIcon>();
    ArrayList<JLabel> list = new ArrayList<JLabel>();
    ArrayList<JButton> buttonList=new ArrayList<JButton>();
    ArrayList<String> ch=new ArrayList<String>();
    ArrayList<Color> color=new ArrayList<Color>();
    ArrayList<JLabel> handLabel=new ArrayList<JLabel>();
    int prev=0,current=0,count=0,buttonIndicate=0,colorIndicate=0,a=0,colorCount=-1,handIndicate,prevHandIndicate=0,k=0;
    long time=300000,initialTime=300000;
    int minute=0,second1=0,second2=0,wordCount=0,timerCount=0;
    double speed=0;
    Timer timer,t;
    String c,s2="";
    String c1="all lads sell dill salad> ";
    String c2="alike silas sal feels sad> ";
    String c3="jeff likes sea lakes fields> ";
    String c4="lila jade is fake said kafka> ";
    String c5="eddie likes lilies daisisies> ";
    String c6="elsie leads jill fiji seaside> ";
    String c7="jill sees eddie aside leslie> ";
    String c8="all see aidless lassie is said> ";
    String c9="feed lassie adelia> ";
    String c10="laddies lasses like daisisies> ";
    String c11="idle deeds fill seasides> ";
    String c12="fiddledeedee said all lasses> ";
    String c13="fiddledeedee said laddies> ";
    String c14="lasses lads like sea life> ";
    String c15="lake life sea life lakeside> ";
    String c16="all kids like added deeds> ";
    String c17="dad jeff sees eddie is safe> ";
    String c18="a fled flee is a fake idea> ";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBComma;
    public static javax.swing.JButton jBSemi;
    public static javax.swing.JButton jBSpace;
    public static javax.swing.JButton jBa;
    private javax.swing.JButton jBb;
    private javax.swing.JButton jBc;
    private javax.swing.JButton jBcancel;
    public static javax.swing.JButton jBd;
    private javax.swing.JButton jBdot;
    private javax.swing.JButton jBe;
    private javax.swing.JButton jBenter;
    public static javax.swing.JButton jBf;
    private javax.swing.JButton jBg;
    private javax.swing.JButton jBh;
    private javax.swing.JButton jBi;
    public static javax.swing.JButton jBj;
    public static javax.swing.JButton jBk;
    public static javax.swing.JButton jBl;
    private javax.swing.JButton jBm;
    private javax.swing.JButton jBn;
    private javax.swing.JButton jBo;
    private javax.swing.JButton jBp;
    private javax.swing.JButton jBq;
    private javax.swing.JButton jBr;
    public static javax.swing.JButton jBs;
    private javax.swing.JButton jBt;
    private javax.swing.JButton jBu;
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
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jBv;
    private javax.swing.JButton jBw;
    private javax.swing.JButton jBx;
    private javax.swing.JButton jBy;
    private javax.swing.JButton jBz;
    private javax.swing.JCheckBox jCheckBox1;
    public static javax.swing.JLabel jL1;
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
