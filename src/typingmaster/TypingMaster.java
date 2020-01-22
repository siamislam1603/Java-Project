
package typingmaster;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TypingMaster {
    static int count;
    static JFrame f;
    public static void main(String[] args) {
        f=new JFrame();
        NFrame n=new NFrame();
        f.add(n);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setSize(1365, 723);
        f.setTitle("Typing Master");
    }
    static class NFrame extends JPanel implements ActionListener{
        Timer t;
        JLabel l1;
        ImageIcon loadingFrame;
        boolean loadable=true,userable=false;
        UserFrame newUser;

        Timer timer;
        NFrame(){
            loadingFrame=new ImageIcon("D:\\TypingMaster\\src\\typingmaster\\type.jpg");
            l1=new JLabel(loadingFrame);
            add(l1);
            count=0;
            timer = new Timer(1, this);
            timer.setInitialDelay(1000);
            timer.start();
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(loadable){
                loadable=false;
                userable=true;
                newUser=new UserFrame();
                count++;
            }

            else if(userable){
                f.dispose();
                setVisible(false);
                newUser.setVisible(true);
                newUser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newUser.setSize(1365, 723);
                newUser.setTitle("Typing Master");
                count++;
                timer.stop();
            }

        }

    }
    
}
