import java.awt.event.KeyEvent;
import java.net.URL;

public class APP {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_plane_mine=new JLabel();
    JLabel label_background=new JLabel();
    JLabel label_basket=new JLabel();
    int row=0,column=0;
    int CELL=68;




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
                if      (label_plane_mine.getX() + label_plane_mine.getWidth()  > label_basket.getX() &&
                        label_basket.getX() + label_basket.getWidth()  > label_plane_mine.getX() &&
                        label_plane_mine.getY() + label_plane_mine.getHeight() > label_basket.getY() &&
                        label_basket.getY() + label_basket.getHeight() > label_plane_mine.getY()){
                        label_txt.setText("YOU ARE WIN!");
                }
            }
        });
    }


    //显示窗体方法
    void go(){
        java.net.URL imgUR1 = APP.class.getResource("img/ball.gif");
        label_plane_mine.setIcon(new ImageIcon(imgUR1));
        label_plane_mine.setBounds(0,0,CELL,CELL);
        myPanel.add(label_plane_mine);

        java.net.URL imgUR2 = APP.class.getResource("img/basket.jpg");
        label_basket.setIcon(new ImageIcon(imgUR2));
        label_basket.setBounds(476,544,68,68);
        myPanel.add(label_basket);

        label_txt.setBounds(400,400,200,200);
        label_txt.setForeground(Color.red);
        label_txt.setFont(new Font("Arial",Font.PLAIN,25 ));
        myPanel.add(label_txt);


        java.net.URL imgUR3 = APP.class.getResource("img/background.jpg");
        label_background.setIcon(new ImageIcon(imgUR3));
        label_background.setBounds(0,0,1000,1000);
        myPanel.add(label_background);




        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,1000);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new APP().go();
    }
}
