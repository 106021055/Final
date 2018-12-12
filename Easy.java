import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Easy extends JFrame {
    private JMenuBar jmb = new JMenuBar();
    private JMenu jmusystem = new JMenu("System");
    private JMenu jmuabout = new JMenu("About");
    private JMenuItem jmiback = new JMenuItem("Back");
    private JMenuItem jmiexit = new JMenuItem("Exit");
    private JMenuItem jmiabout = new JMenuItem("關於作者");
    private Final frame;
    private Sprite stick = new Sprite();
    private Sprite wall1 = new Sprite();
    private Sprite wall2 = new Sprite();
    private Sprite wall3 = new Sprite();
    private Sprite wall4 = new Sprite();
    private Sprite wall5 = new Sprite();
    private Sprite wall6 = new Sprite();
    private Sprite wall7 = new Sprite();
    private Sprite wall8 = new Sprite();
    private Sprite wall9 = new Sprite();
    private Sprite wall10 = new Sprite();
    private Sprite finish = new Sprite();
    private JLabel jlb1 = new JLabel();
    private JLabel jlb2 = new JLabel();
    private JLabel jlb3 = new JLabel();
    private JLabel jlb4 = new JLabel();
    private JLabel jlb5 = new JLabel();
    private ImageIcon img1 = new ImageIcon("stick.PNG");
    private ImageIcon flash1 = new ImageIcon("電1.PNG");
    private ImageIcon flash2 = new ImageIcon("電2.PNG");
    private ImageIcon flash3 = new ImageIcon("電1.PNG");
    private ImageIcon flash4 = new ImageIcon("電1.PNG");
    private ImageIcon flash5 = new ImageIcon("電1.PNG");
    private Container cp;
    private Finalgo frameeasy;
    private Timer bgTimer;
    private int bg = 1;


    public Easy(Finalgo frameeasy){
        this.frameeasy = frameeasy;
        init();
    }

    public void init(){
        this.setLayout(null);
//        this.setJMenuBar(jmb);
        jmb.add(jmusystem);
        jmb.add(jmuabout);
        jmusystem.add(jmiback);
        jmusystem.add(jmiexit);
        jmuabout.add(jmiabout);
        cp =this.getContentPane();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1000);
        this.setResizable(false);
        this.setTitle("電流急急棒");
        this.add(jlb1); this.add(jlb2); this.add(jlb3); this.add(jlb4); this.add(jlb5);
        jlb1.setIcon(flash1); jlb1.setIcon(flash2); jlb1.setIcon(flash3); jlb1.setIcon(flash4); jlb1.setIcon(flash5);

        jlb1.setBounds(10,10,100,100);
        jlb2.setBounds(1300,30,100,100);
        jlb3.setBounds(50,800,100,100);
        jlb4.setBounds(1000,700,100,100);
        jlb5.setBounds(1200,600,100,100);

        stick.setBounds(0, 510, 30, 30);
        stick.setBackground(Color.BLACK);
        stick.setOpaque(true);
//        stick.setIcon(img1);

        wall1.setBounds(0, 480, 300, 15);
        wall1.setBackground(Color.BLACK);
        wall1.setOpaque(true);

        wall2.setBounds(0, 550, 380, 15);
        wall2.setBackground(Color.BLACK);
        wall2.setOpaque(true);

        wall3.setBounds(285, 100, 15, 380);
        wall3.setBackground(Color.BLACK);
        wall3.setOpaque(true);

        wall4.setBounds(365, 250, 15, 300);
        wall4.setBackground(Color.BLACK);
        wall4.setOpaque(true);

        wall5.setBounds(285, 100, 700, 15);
        wall5.setBackground(Color.BLACK);
        wall5.setOpaque(true);

        wall6.setBounds(365, 250, 500, 15);
        wall6.setBackground(Color.BLACK);
        wall6.setOpaque(true);

        wall7.setBounds(985, 100, 15, 700);
        wall7.setBackground(Color.BLACK);
        wall7.setOpaque(true);

        wall8.setBounds(865, 250, 15, 640);
        wall8.setBackground(Color.BLACK);
        wall8.setOpaque(true);

        wall9.setBounds(985, 800, 700, 15);
        wall9.setBackground(Color.BLACK);
        wall9.setOpaque(true);

        wall10.setBounds(865, 890, 800, 15);
        wall10.setBackground(Color.BLACK);
        wall10.setOpaque(true);

        finish.setBounds(1550,800,40,100);
        finish.setBackground(Color.RED);
        finish.setOpaque(true);

        this.add(stick);
        this.add(wall1);
        this.add(wall2);
        this.add(wall3);
        this.add(wall4);
        this.add(wall5);
        this.add(wall6);
        this.add(wall7);
        this.add(wall8);
        this.add(wall9);
        this.add(wall10);
        this.add(finish);

        bgTimer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bg == 1){
                    cp.setBackground(Color.gray);
                    bg = 2;
                }else if (bg == 2){
                    cp.setBackground(Color.white);
                    bg = 1;
                }
            }
        });
        bgTimer.start(); //在timer以下

        stick.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                stick.setLocation(e.getXOnScreen() - 15,e.getYOnScreen() - 35);
            }
        });

        stick.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
//                System.out.println("x1: " + stick.xStart);
//                System.out.println("x2: " + stick.xEnd);
//                System.out.println("y1: " + stick.yStart);
//                System.out.println("y2: " + stick.yEnd);
                stick.setLocation(e.getXOnScreen() - 15,e.getYOnScreen() - 35);
                if (stick.overlapCheck(wall1) || stick.overlapCheck(wall2)|| stick.overlapCheck(wall3) || stick.overlapCheck(wall4) || stick.overlapCheck(wall5)|| stick.overlapCheck(wall6) || stick.overlapCheck(wall7) || stick.overlapCheck(wall8) || stick.overlapCheck(wall9) || stick.overlapCheck(wall10)) {
                    JOptionPane.showMessageDialog(Easy.this, "豬喔碰到了啦");
                    stick.setBounds(0, 510, 30, 30);
                }else if (stick.overlapCheck(finish)){
                    JOptionPane.showMessageDialog(Easy.this, "恭喜過關唷");
                    System.exit(0);
                }
            }
        });


        jmiabout.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"子堯&健伊製作");
            }
        });

    }
}