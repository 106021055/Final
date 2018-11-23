package go;

// 11/23 左鍵按住拖動急急棒

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Finalgo extends JFrame{
    public static void main(String[] args) {
//        new Finalgo().setVisible(true);
    }
    private JLabel stick = new JLabel();
    private ImageIcon img1 = new ImageIcon("stick.PNG");
    private Final frame;

    public Finalgo(Final frame){
        this.frame = frame;
        go();
        }
        public void go(){
        this.setBounds(0,0,1600,1000);
        this.setResizable(false);
        this.setTitle("電流急急棒");
     //   stick.setBounds(0,20,50,50);

        stick.setIcon(img1);
        this.add(stick);

        stick.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    stick.setLocation(e.getXOnScreen() -50,e.getYOnScreen()-500 );
                }
            });

        stick.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                stick.setLocation(e.getXOnScreen() -50 ,e.getYOnScreen() - 500);
            }
        });
        }
    }

