import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

public class APP {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_plane_mine=new JLabel();
    JLabel label_background=new JLabel();
    int row=0,column=0;
    int CELL=128;




    public APP() {
       myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    row--;
                    label_plane_mine.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    row++;
                    label_plane_mine.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    column--;
                    label_plane_mine.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    column++;
                    label_plane_mine.setBounds(column*CELL,row*CELL,CELL,CELL);
                }
            }
        });
    }


    //显示窗体方法
    void go(){
        java.net.URL imgUR1 = APP.class.getResource("plane0.png");
        label_plane_mine.setIcon(new ImageIcon(imgUR1));
        label_plane_mine.setBounds(0,0,CELL,CELL);
        myPanel.add(label_plane_mine);

        java.net.URL imgUR2 = APP.class.getResource("background.png");
        label_background.setIcon(new ImageIcon(imgUR2));
        label_background.setBounds(0,0,986,1648);
        myPanel.add(label_background);




        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,986,1648);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new APP().go();
    }
}
