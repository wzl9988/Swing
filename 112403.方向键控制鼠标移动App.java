import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class app {
    JPanel myPanel=new JPanel();
    JLabel a=new JLabel();
    JLabel b=new JLabel();
    JFrame frame = new JFrame("飞机大大");
    int x=500,y=500;
    //构造方法
    public app() {
        a.setBounds(100,100,60,60);
        myPanel.add(a);
        b.setBounds(100,100,1024,720);
        myPanel.add(b);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==KeyEvent.VK_DOWN){
                    y=y+20;
                    a.setBounds(x,y,200,200);
                }
                if(e.getKeyCode()==KeyEvent.VK_UP){
                    y=y-20;
                    a.setBounds(x,y,200,200);
                }
                if(e.getKeyCode()==KeyEvent.VK_LEFT){
                    x=x-20;
                    a.setBounds(x,y,200,200);
                }
                if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                    x=x+20;
                    a.setBounds(x,y,200,200);
                }
            }
        });
    }
    //显示窗体方法
    void go(){

        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        a.setIcon(new ImageIcon("src/plane4.png"));
        a.setBounds(500,500,60,60);
        b.setIcon(new ImageIcon("src/background.png"));;
        b.setBounds(0,0,1024,720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new app().go();
    }
}