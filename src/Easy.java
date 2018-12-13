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
    private JButton jbtnpause = new JButton("");
    private ImageIcon img4 = new ImageIcon("pause.png");
    private ImageIcon img5 = new ImageIcon("start2.png");
    private Sprite stick = new Sprite();
    private Sprite boom  = new Sprite();
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
    private ImageIcon img1 = new ImageIcon("stick.PNG");
    private ImageIcon img2 = new ImageIcon("boom.png");
    private Container cp;
    private Timer bgTimer;
    private int bg = 1;
    private Finalgo frameeasy;
    public Easy(Finalgo frameeasy){
        this.frameeasy = frameeasy;
        init();
    }

    public void init(){
        this.setLayout(null);
        jmb.add(jmusystem);
        jmb.add(jmuabout);
        jmusystem.add(jmiback);
        jmusystem.add(jmiexit);
        jmuabout.add(jmiabout);
        cp=this.getContentPane();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1000);
        this.setResizable(false);
        this.setTitle("電流急急棒");
        jbtnpause.setBounds(1500,10,80,80);
        jbtnpause.setFont(new Font(null,Font.BOLD,30));
        jbtnpause.setContentAreaFilled(false);
        jbtnpause.setBorderPainted(false);
        jbtnpause.setForeground(Color.RED);
        this.add(jbtnpause);
        jbtnpause.setIcon(img4);
        stick.setPosition(0, 500, 80, 48);
        stick.customRange(40, 14, 5, 16);    //****
        stick.setIcon(img1);

        boom.setPosition(0,500,80,48);
        stick.customRange(40,14,5,16);
        wall1.setPosition(0, 480, 300, 15);
        wall1.setBackground(Color.BLACK);
        wall1.setOpaque(true);

        wall2.setPosition(0, 550, 380, 15);
        wall2.setBackground(Color.BLACK);
        wall2.setOpaque(true);

        wall3.setPosition(285, 100, 15, 380);
        wall3.setBackground(Color.BLACK);
        wall3.setOpaque(true);

        wall4.setPosition(365, 250, 15, 300);
        wall4.setBackground(Color.BLACK);
        wall4.setOpaque(true);

        wall5.setPosition(285, 100, 700, 15);
        wall5.setBackground(Color.BLACK);
        wall5.setOpaque(true);

        wall6.setPosition(365, 250, 500, 15);
        wall6.setBackground(Color.BLACK);
        wall6.setOpaque(true);

        wall7.setPosition(985, 100, 15, 700);
        wall7.setBackground(Color.BLACK);
        wall7.setOpaque(true);

        wall8.setPosition(865, 250, 15, 640);
        wall8.setBackground(Color.BLACK);
        wall8.setOpaque(true);

        wall9.setPosition(985, 800, 700, 15);
        wall9.setBackground(Color.BLACK);
        wall9.setOpaque(true);

        wall10.setPosition(865, 890, 800, 15);
        wall10.setBackground(Color.BLACK);
        wall10.setOpaque(true);

        finish.setPosition(1550,800,40,100);
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
//                    jlb.setIcon(imageIcon[0]);
                    cp.setBackground(Color.gray);
                    bg = 2;
                }else if (bg == 2){
//                    jlb.setIcon(imageIcon[1]);
                    cp.setBackground(Color.white);
                    bg = 1;
                }
            }
        });
        bgTimer.start(); //在timer以下

        stick.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                stick.changePosition(stick.getX() + e.getX() - stick.getWidth()/2, stick.getY() + e.getY() - stick.getHeight()/2);

            }
        });
        jbtnpause.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmpbtn = (JButton) e.getSource();
                if (tmpbtn.getIcon().equals(img5)) {          //tmpbtn.getText().equals("turn on")
                    bgTimer.start();
                    tmpbtn.setIcon(img4);
                } else {
                    bgTimer.stop();
                    tmpbtn.setIcon(img5);
                }
            }
        });
        stick.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
//                System.out.println("x1: " + stick.xStart);
//                System.out.println("x2: " + stick.xEnd);
//                System.out.println("y1: " + stick.yStart);
//                System.out.println("y2: " + stick.yEnd);

                stick.changePosition(stick.getX() + e.getX() - stick.getWidth()/2, stick.getY() + e.getY() - stick.getHeight()/2);

                if (!e.isControlDown()) {           //外掛

                    if (stick.overlapCheck(wall1) || stick.overlapCheck(wall2) || stick.overlapCheck(wall3) || stick.overlapCheck(wall4) || stick.overlapCheck(wall5) || stick.overlapCheck(wall6) || stick.overlapCheck(wall7) || stick.overlapCheck(wall8) || stick.overlapCheck(wall9) || stick.overlapCheck(wall10)) {
                        stick.setIcon(img2);
                        JOptionPane.showMessageDialog(Easy.this, "豬喔碰到了啦");
                        stick.setIcon(img1);
                        stick.setPosition(0, 500, 80, 48);
                    } else if (stick.overlapCheck(finish)) {
                        JOptionPane.showMessageDialog(Easy.this, "過關唷");
                        Easy.this.setVisible(false);

                    }

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