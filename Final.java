package go;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Final extends JFrame {
    public static void main(String[] args) {
        new Final().setVisible(true);
    }
    private JButton jbtnstart = new JButton("");
    private JButton jbtnexit = new JButton("");
    private JButton jbtnpause = new JButton("turn off");
//    private ImageIcon img = new ImageIcon("light.png");
//    private ImageIcon imageIcon[] = new ImageIcon[]{new ImageIcon("0.png"), new ImageIcon("1.png")};
    private ImageIcon img1 = new ImageIcon("light.png");
    private ImageIcon img2 = new ImageIcon("start.png");
    private ImageIcon img3 = new ImageIcon("exit.png");
    private JLabel jlb = new JLabel();
    private Timer bgTimer;
    private int bg = 1;
    private Container container;

//    private JLabel jlb1 = new JLabel("電流");
//    private JLabel jlb2 = new JLabel("急急棒");

    public Final(){
        holy();
    }
    public void holy(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1000);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("電流急急棒");

        container = this.getContentPane();

        jlb.setBounds(300,10,1200,800);
        jbtnstart.setBounds(320,700,200,200);
        jbtnexit.setBounds(960,700,200,200);
        jbtnpause.setBounds(1400,10,150,50);

        jbtnstart.setFont(new Font(null,Font.BOLD,70));
        jbtnexit.setFont(new Font(null,Font.BOLD,70));
        jbtnpause.setFont(new Font(null,Font.BOLD,30));

        jbtnstart.setContentAreaFilled(false);
        jbtnstart.setBorderPainted(false);
        jbtnstart.setForeground(Color.RED);
        jbtnexit.setContentAreaFilled(false);
        jbtnexit.setBorderPainted(false);
        jbtnexit.setForeground(Color.RED);





        jlb.setIcon(img1);
        jbtnstart.setIcon(img2);
        jbtnexit.setIcon(img3);
        this.add(jlb);
        this.add(jbtnstart);
        this.add(jbtnexit);
        this.add(jbtnpause);



        bgTimer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bg == 1){
//                    jlb.setIcon(imageIcon[0]);
                    container.setBackground(Color.gray);
                    bg = 2;
                }else if (bg == 2){
//                    jlb.setIcon(imageIcon[1]);
                    container.setBackground(Color.BLACK);
                    bg = 1;
                }
            }
        });
        bgTimer.start(); //在timer以下

//        jlb.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//                System.out.println("Hello World");
//            }
//        });

        jbtnstart.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Finalgo go = new Finalgo(Final.this);
                go.setVisible(true);
                Final.this.setVisible(false);
            }
        });

        jbtnexit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jbtnpause.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmpbtn = (JButton) e.getSource();
                if (tmpbtn.getText().equals("turn on")) {
                    bgTimer.start();
                    tmpbtn.setText("turn off");
                } else {
                    bgTimer.stop();
                    tmpbtn.setText("turn on");
                }
            }
        });

    }
}