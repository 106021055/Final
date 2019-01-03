import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hard extends JFrame {
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
    private JLabel jlb1 = new JLabel("感");
    private JLabel jlb2 = new JLabel("謝");
    private JLabel jlb3 = new JLabel("遊");
    private JLabel jlb4 = new JLabel("玩");
    private JLabel jlb5 = new JLabel("<3");
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
    private Sprite wall11 = new Sprite();
    private Sprite wall12 = new Sprite();
    private Sprite wall13 = new Sprite();
    private Sprite wall14 = new Sprite();
    private Sprite wall15 = new Sprite();
    private Sprite wall16 = new Sprite();
    private Sprite wall17 = new Sprite();
    private Sprite wall18 = new Sprite();
    private Sprite wall19 = new Sprite();
    private Sprite wall20 = new Sprite();
    private Sprite wall21 = new Sprite();
    private Sprite wall22 = new Sprite();
    private Sprite wall23 = new Sprite();
    private Sprite wall24 = new Sprite();
    private Sprite wall25 = new Sprite();
    private Sprite wall26 = new Sprite();
    private Sprite wall27 = new Sprite();
    private Sprite wall28 = new Sprite();
    private Sprite wall29 = new Sprite();
    private Sprite wall30 = new Sprite();
    private Sprite wall31 = new Sprite();
    private Sprite wall32 = new Sprite();
    private Sprite wall33 = new Sprite();
    private Sprite wall34 = new Sprite();
    private Sprite wall35 = new Sprite();
    private Sprite wall36 = new Sprite();
    private Sprite wall37 = new Sprite();
    private Sprite wall38 = new Sprite();
    private Sprite wall39 = new Sprite();
    private Sprite wall40 = new Sprite();
    private Sprite wall41 = new Sprite();
    private Sprite wall42 = new Sprite();
    private Sprite wall43 = new Sprite();
    private Sprite wall44 = new Sprite();
    private Sprite wall45 = new Sprite();
    private Sprite wall46 = new Sprite();
    private Sprite wall47 = new Sprite();
    private Sprite wall48 = new Sprite();
    private Sprite wall49 = new Sprite();
    private Sprite wall50 = new Sprite();
    private Sprite wall51 = new Sprite();
    private Sprite wall52 = new Sprite();
    private Sprite wall53 = new Sprite();
    private Sprite wall54 = new Sprite();
    private Sprite wall55 = new Sprite();
    private Sprite wall56 = new Sprite();
    private Sprite wall57 = new Sprite();
    private Sprite wall58 = new Sprite();
    private Sprite wall59 = new Sprite();
    private Sprite wall60 = new Sprite();
    private Sprite wall61 = new Sprite();
    private Sprite wall62 = new Sprite();
    private Sprite wall63 = new Sprite();
    private Sprite wall64 = new Sprite();
    private Sprite wall65 = new Sprite();
    private Sprite wall66 = new Sprite();
    private Sprite wall67 = new Sprite();
    private Sprite wall68 = new Sprite();
    private Sprite wall69 = new Sprite();
    private Sprite wall70 = new Sprite();
    private Sprite wall71 = new Sprite();
    private Sprite wall72 = new Sprite();
    private Sprite wall73 = new Sprite();
    private Sprite wall74 = new Sprite();
    private Sprite wall75 = new Sprite();
    private Sprite wall76 = new Sprite();
    private Sprite wall77 = new Sprite();
    private Sprite wall78 = new Sprite();
    private Sprite wall79 = new Sprite();
    private Sprite wall80 = new Sprite();
    private Sprite wall81 = new Sprite();
    private Sprite wall82 = new Sprite();
    private Sprite wall83 = new Sprite();
    private Sprite wall84 = new Sprite();
    private Sprite wall85 = new Sprite();
    private Sprite wall86 = new Sprite();
    private Sprite wall87 = new Sprite();
    private Sprite wall88 = new Sprite();
    private Sprite wall89 = new Sprite();
    private Sprite wall90 = new Sprite();
    private Sprite wall91 = new Sprite();
    private Sprite wall92 = new Sprite();
    private Sprite wall93 = new Sprite();
    private Sprite wall94 = new Sprite();
    private Sprite wall95 = new Sprite();
    private Sprite wall96 = new Sprite();
    private Sprite wall97 = new Sprite();
    private Sprite wall98 = new Sprite();
    private Sprite wall99 = new Sprite();
    private Sprite wall100 = new Sprite();
    private Sprite finish = new Sprite();
    private ImageIcon img1 = new ImageIcon("stick.PNG");
    private ImageIcon img2 = new ImageIcon("boom.png");
    private Container cp;
    private Timer bgTimer;
    private int bg = 1;
    private Finalgo frameeasy;
    public Hard(Finalgo frameeasy){
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
        stick.setPosition(0, 20, 80, 48);
        stick.customRange(42, 15, 6, 18);    //****
        stick.setIcon(img1);

        boom.setPosition(0,0,80,48);
        stick.customRange(40,14,5,16);
        wall1.setPosition(0, 0, 1420, 15);
        wall1.setBackground(Color.RED);
        wall1.setOpaque(true);

        wall2.setPosition(0, 65, 110, 15);
        wall2.setBackground(Color.ORANGE);
        wall2.setOpaque(true);

        wall3.setPosition(175, 5, 15, 185);
        wall3.setBackground(Color.YELLOW);
        wall3.setOpaque(true);

        wall4.setPosition(95, 65, 15, 75);
        wall4.setBackground(Color.GREEN);
        wall4.setOpaque(true);

        wall5.setPosition(0, 125, 110, 15);
        wall5.setBackground(Color.BLUE);
        wall5.setOpaque(true);

        wall6.setPosition(85, 175, 105, 15);
        wall6.setBackground(Color.CYAN);
        wall6.setOpaque(true);

        wall7.setPosition(0, 140, 15, 115);
        wall7.setBackground(Color.MAGENTA);
        wall7.setOpaque(true);

//        wall8.setPosition(0, 225, 230, 15);
//        wall8.setBackground(Color.BLACK);
//        wall8.setOpaque(true);

        wall9.setPosition(230, 50, 15, 205);
        wall9.setBackground(Color.RED);
        wall9.setOpaque(true);

        wall10.setPosition(230, 50, 100, 15);
        wall10.setBackground(Color.ORANGE);
        wall10.setOpaque(true);

        wall11.setPosition(330, 50, 15, 90);
        wall11.setBackground(Color.YELLOW);
        wall11.setOpaque(true);

        wall12.setPosition(335, 125, 140, 15);
        wall12.setBackground(Color.GREEN);
        wall12.setOpaque(true);

        wall13.setPosition(395, 0, 15, 90);
        wall13.setBackground(Color.BLUE);
        wall13.setOpaque(true);

        wall14.setPosition(460, 65, 15, 65);
        wall14.setBackground(Color.CYAN);
        wall14.setOpaque(true);

        wall15.setPosition(460, 65, 125, 15);
        wall15.setBackground(Color.MAGENTA);
        wall15.setOpaque(true);

        wall16.setPosition(570, 50, 15, 205);
        wall16.setBackground(Color.BLACK);
        wall16.setOpaque(true);

        wall17.setPosition(640, 15, 15, 175);
        wall17.setBackground(Color.RED);
        wall17.setOpaque(true);

        wall18.setPosition(645, 175, 60, 15);
        wall18.setBackground(Color.ORANGE);
        wall18.setOpaque(true);

//        wall19.setPosition(570, 225, 195, 15);
//        wall19.setBackground(Color.YELLOW);
//        wall19.setOpaque(true);

        wall20.setPosition(690, 15, 15, 175);
        wall20.setBackground(Color.GREEN);
        wall20.setOpaque(true);

        wall21.setPosition(750, 65, 15, 190);
        wall21.setBackground(Color.BLUE);
        wall21.setOpaque(true);

        wall22.setPosition(750, 65, 235, 15);
        wall22.setBackground(Color.CYAN);
        wall22.setOpaque(true);

        wall23.setPosition(970, 65, 15, 175);
        wall23.setBackground(Color.MAGENTA);
        wall23.setOpaque(true);

        wall24.setPosition(970, 225, 205, 15);
        wall24.setBackground(Color.RED);
        wall24.setOpaque(true);

        wall25.setPosition(1040, 65, 15, 125);
        wall25.setBackground(Color.ORANGE);
        wall25.setOpaque(true);

        wall26.setPosition(1040, 65, 75, 15);
        wall26.setBackground(Color.YELLOW);
        wall26.setOpaque(true);

        wall27.setPosition(1100, 65, 15, 125);
        wall27.setBackground(Color.GREEN);
        wall27.setOpaque(true);

        wall28.setPosition(1040, 175, 75, 15);
        wall28.setBackground(Color.BLUE);
        wall28.setOpaque(true);

        wall29.setPosition(1160, 65, 15, 175);
        wall29.setBackground(Color.CYAN);
        wall29.setOpaque(true);

        wall30.setPosition(1160, 65, 185, 15);
        wall30.setBackground(Color.MAGENTA);
        wall30.setOpaque(true);

        wall31.setPosition(1405, 15, 15, 325);
        wall31.setBackground(Color.RED);
        wall31.setOpaque(true);

        wall32.setPosition(1330, 65, 15, 205);
        wall32.setBackground(Color.ORANGE);
        wall32.setOpaque(true);

        wall33.setPosition(0, 255, 1330, 15);
        wall33.setBackground(Color.YELLOW);
        wall33.setOpaque(true);

        wall34.setPosition(1270, 325, 145, 15);
        wall34.setBackground(Color.GREEN);
        wall34.setOpaque(true);

        wall35.setPosition(1270, 325, 15, 135);
        wall35.setBackground(Color.BLUE);
        wall35.setOpaque(true);

        wall36.setPosition(1150, 445, 125, 15);
        wall36.setBackground(Color.CYAN);
        wall36.setOpaque(true);

        wall37.setPosition(1150, 445, 15, 135);
        wall37.setBackground(Color.MAGENTA);
        wall37.setOpaque(true);

        wall38.setPosition(960, 565, 205, 15);
        wall38.setBackground(Color.RED);
        wall38.setOpaque(true);

        wall39.setPosition(960, 445, 15, 135);
        wall39.setBackground(Color.ORANGE);
        wall39.setOpaque(true);

        wall40.setPosition(840, 445, 135, 15);
        wall40.setBackground(Color.YELLOW);
        wall40.setOpaque(true);

        wall41.setPosition(840, 325, 15, 135);
        wall41.setBackground(Color.GREEN);
        wall41.setOpaque(true);

        wall42.setPosition(720, 325, 135, 15);
        wall42.setBackground(Color.BLUE);
        wall42.setOpaque(true);

        wall43.setPosition(920, 255, 275, 145);
        wall43.setBackground(Color.CYAN);
        wall43.setOpaque(true);

        wall44.setPosition(1015, 395, 95, 105);
        wall44.setBackground(Color.MAGENTA);
        wall44.setOpaque(true);

        wall45.setPosition(720, 325, 15, 255);
        wall45.setBackground(Color.RED);
        wall45.setOpaque(true);

        wall46.setPosition(520, 565, 205, 15);
        wall46.setBackground(Color.ORANGE);
        wall46.setOpaque(true);

        wall47.setPosition(575, 285, 100, 240);
        wall47.setBackground(Color.YELLOW);
        wall47.setOpaque(true);

        wall48.setPosition(520, 445, 15, 135);
        wall48.setBackground(Color.GREEN);
        wall48.setOpaque(true);

        wall49.setPosition(400, 445, 135, 15);
        wall49.setBackground(Color.BLUE);
        wall49.setOpaque(true);

        wall50.setPosition(470, 285, 105, 125);
        wall50.setBackground(Color.CYAN);
        wall50.setOpaque(true);

        wall51.setPosition(400, 325, 15, 135);
        wall51.setBackground(Color.MAGENTA);
        wall51.setOpaque(true);

        wall52.setPosition(280, 325, 135, 15);
        wall52.setBackground(Color.RED);
        wall52.setOpaque(true);

        wall53.setPosition(0, 325, 205, 15);
        wall53.setBackground(Color.ORANGE);
        wall53.setOpaque(true);

        wall54.setPosition(190, 325, 15, 155);
        wall54.setBackground(Color.YELLOW);
        wall54.setOpaque(true);

        wall55.setPosition(0, 465, 205, 15);
        wall55.setBackground(Color.GREEN);
        wall55.setOpaque(true);

        wall56.setPosition(280, 325, 15, 235);
        wall56.setBackground(Color.BLUE);
        wall56.setOpaque(true);

        wall57.setPosition(60, 545, 225, 15);
        wall57.setBackground(Color.CYAN);
        wall57.setOpaque(true);

        wall58.setPosition(60, 545, 15, 325);
        wall58.setBackground(Color.MAGENTA);
        wall58.setOpaque(true);

        wall59.setPosition(60, 855, 135, 15);
        wall59.setBackground(Color.RED);
        wall59.setOpaque(true);

        wall60.setPosition(0, 925, 875, 15);
        wall60.setBackground(Color.ORANGE);
        wall60.setOpaque(true);

        wall61.setPosition(180, 735, 15, 135);
        wall61.setBackground(Color.YELLOW);
        wall61.setOpaque(true);

        wall62.setPosition(260, 805, 15, 135);
        wall62.setBackground(Color.GREEN);
        wall62.setOpaque(true);

        wall63.setPosition(260, 805, 135, 15);
        wall63.setBackground(Color.BLUE);
        wall63.setOpaque(true);

        wall64.setPosition(180, 735, 135, 15);
        wall64.setBackground(Color.CYAN);
        wall64.setOpaque(true);

        wall65.setPosition(300, 615, 15, 135);
        wall65.setBackground(Color.MAGENTA);
        wall65.setOpaque(true);

        wall66.setPosition(380, 685, 15, 135);
        wall66.setBackground(Color.RED);
        wall66.setOpaque(true);

        wall67.setPosition(300, 615, 1025, 15);
        wall67.setBackground(Color.ORANGE);
        wall67.setOpaque(true);

        wall68.setPosition(380, 685, 435, 15);
        wall68.setBackground(Color.YELLOW);
        wall68.setOpaque(true);

        wall69.setPosition(890, 615, 15, 155);
        wall69.setBackground(Color.GREEN);
        wall69.setOpaque(true);

        wall70.setPosition(470, 755, 435, 15);
        wall70.setBackground(Color.BLUE);
        wall70.setOpaque(true);

        wall71.setPosition(470, 755, 15, 125);
        wall71.setBackground(Color.CYAN);
        wall71.setOpaque(true);

        wall72.setPosition(470, 865, 305, 15);
        wall72.setBackground(Color.MAGENTA);
        wall72.setOpaque(true);

        wall73.setPosition(380, 885, 15, 55);
        wall73.setBackground(Color.BLUE);
        wall73.setOpaque(true);

        wall74.setPosition(760, 755, 15, 125);
        wall74.setBackground(Color.CYAN);
        wall74.setOpaque(true);

        wall75.setPosition(860, 855, 15, 85);
        wall75.setBackground(Color.MAGENTA);
        wall75.setOpaque(true);

        wall76.setPosition(860, 855, 135, 15);
        wall76.setBackground(Color.RED);
        wall76.setOpaque(true);

        wall77.setPosition(980, 685, 15, 185);
        wall77.setBackground(Color.ORANGE);
        wall77.setOpaque(true);

        wall78.setPosition(980, 685, 255, 15);
        wall78.setBackground(Color.YELLOW);
        wall78.setOpaque(true);

        wall79.setPosition(1220, 685, 15, 300);
        wall79.setBackground(Color.GREEN);
        wall79.setOpaque(true);

        wall80.setPosition(1310, 615, 15, 380);
        wall80.setBackground(Color.BLUE);
        wall80.setOpaque(true);

        wall81.setPosition(270, 160, 240, 80);
        wall81.setBackground(Color.cyan);
        wall81.setOpaque(true);

        wall82.setPosition(320, 480, 160, 100);
        wall82.setBackground(Color.green);
        wall82.setOpaque(true);

        wall83.setPosition(100, 585, 150, 130);
        wall83.setBackground(Color.orange);
        wall83.setOpaque(true);

        wall84.setPosition(1020, 730, 180, 250);
        wall84.setBackground(Color.orange);
        wall84.setOpaque(true);

        finish.setPosition(1230,950,80,40);
        finish.setBackground(Color.RED);
        finish.setOpaque(true);

        jlb1.setBounds(1400,350,150,150);
        jlb1.setFont(new Font(null,Font.BOLD,100));
        jlb2.setBounds(1400,500,150,150);
        jlb2.setFont(new Font(null,Font.BOLD,100));
        jlb3.setBounds(1400,650,150,150);
        jlb3.setFont(new Font(null,Font.BOLD,100));
        jlb4.setBounds(1400,800,150,150);
        jlb4.setFont(new Font(null,Font.BOLD,100));
        jlb5.setBounds(1450,200,150,150);
        jlb5.setFont(new Font(null,Font.BOLD,100));

        this.add(stick);

        this.add(jlb1);
        this.add(jlb2);
        this.add(jlb3);
        this.add(jlb4);
        this.add(jlb5);

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
        this.add(wall11);
        this.add(wall12);
        this.add(wall13);
        this.add(wall14);
        this.add(wall15);
        this.add(wall16);
        this.add(wall17);
        this.add(wall18);
        this.add(wall19);

        this.add(wall20);
        this.add(wall21);
        this.add(wall22);
        this.add(wall23);
        this.add(wall24);
        this.add(wall25);
        this.add(wall26);
        this.add(wall27);
        this.add(wall28);
        this.add(wall29);

        this.add(wall30);
        this.add(wall31);
        this.add(wall32);
        this.add(wall33);
        this.add(wall34);
        this.add(wall35);
        this.add(wall36);
        this.add(wall37);
        this.add(wall38);
        this.add(wall39);

        this.add(wall40);
        this.add(wall41);
        this.add(wall42);
        this.add(wall43);
        this.add(wall44);
        this.add(wall45);
        this.add(wall46);
        this.add(wall47);
        this.add(wall48);
        this.add(wall49);

        this.add(wall50);
        this.add(wall51);
        this.add(wall52);
        this.add(wall53);
        this.add(wall54);
        this.add(wall55);
        this.add(wall56);
        this.add(wall57);
        this.add(wall58);
        this.add(wall59);

        this.add(wall60);
        this.add(wall61);
        this.add(wall62);
        this.add(wall63);
        this.add(wall64);
        this.add(wall65);
        this.add(wall66);
        this.add(wall67);
        this.add(wall68);
        this.add(wall69);

        this.add(wall70);
        this.add(wall71);
        this.add(wall72);
        this.add(wall73);
        this.add(wall74);
        this.add(wall75);
        this.add(wall76);
        this.add(wall77);
        this.add(wall78);
        this.add(wall79);

        this.add(wall80);
        this.add(wall81);
        this.add(wall82);
        this.add(wall83);
        this.add(wall84);
        this.add(wall85);
        this.add(wall86);
        this.add(wall87);
        this.add(wall88);
        this.add(wall89);

        this.add(wall90);
        this.add(wall91);
        this.add(wall92);
        this.add(wall93);
        this.add(wall94);
        this.add(wall95);
        this.add(wall96);
        this.add(wall97);
        this.add(wall98);
        this.add(wall99);

        this.add(wall100);
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
                    cp.setBackground(Color.LIGHT_GRAY);
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

                    if (    stick.overlapCheck(wall1) || stick.overlapCheck(wall2) || stick.overlapCheck(wall3) || stick.overlapCheck(wall4) || stick.overlapCheck(wall5) || stick.overlapCheck(wall6) || stick.overlapCheck(wall7) || stick.overlapCheck(wall8) || stick.overlapCheck(wall9) ||
                            stick.overlapCheck(wall10)||stick.overlapCheck(wall11) ||stick.overlapCheck(wall12) ||stick.overlapCheck(wall13) ||stick.overlapCheck(wall14) ||stick.overlapCheck(wall15) ||stick.overlapCheck(wall16) ||stick.overlapCheck(wall17) ||stick.overlapCheck(wall18) ||stick.overlapCheck(wall19)||
                            stick.overlapCheck(wall20)||stick.overlapCheck(wall21) ||stick.overlapCheck(wall22) ||stick.overlapCheck(wall23) ||stick.overlapCheck(wall24) ||stick.overlapCheck(wall25) ||stick.overlapCheck(wall26) ||stick.overlapCheck(wall27) ||stick.overlapCheck(wall28) ||stick.overlapCheck(wall29)||
                            stick.overlapCheck(wall30)||stick.overlapCheck(wall31) ||stick.overlapCheck(wall32) ||stick.overlapCheck(wall33) ||stick.overlapCheck(wall34) ||stick.overlapCheck(wall35) ||stick.overlapCheck(wall36) ||stick.overlapCheck(wall37) ||stick.overlapCheck(wall38) ||stick.overlapCheck(wall39)||
                            stick.overlapCheck(wall40)||stick.overlapCheck(wall41) ||stick.overlapCheck(wall42) ||stick.overlapCheck(wall43) ||stick.overlapCheck(wall44) ||stick.overlapCheck(wall45) ||stick.overlapCheck(wall46) ||stick.overlapCheck(wall47) ||stick.overlapCheck(wall48) ||stick.overlapCheck(wall49)||
                            stick.overlapCheck(wall50)||stick.overlapCheck(wall51) ||stick.overlapCheck(wall52) ||stick.overlapCheck(wall53) ||stick.overlapCheck(wall54) ||stick.overlapCheck(wall55) ||stick.overlapCheck(wall56) ||stick.overlapCheck(wall57) ||stick.overlapCheck(wall58) ||stick.overlapCheck(wall59)||
                            stick.overlapCheck(wall60)||stick.overlapCheck(wall61) ||stick.overlapCheck(wall62) ||stick.overlapCheck(wall63) ||stick.overlapCheck(wall64) ||stick.overlapCheck(wall65) ||stick.overlapCheck(wall66) ||stick.overlapCheck(wall67) ||stick.overlapCheck(wall68) ||stick.overlapCheck(wall69)||
                            stick.overlapCheck(wall70)||stick.overlapCheck(wall71) ||stick.overlapCheck(wall72) ||stick.overlapCheck(wall73) ||stick.overlapCheck(wall74) ||stick.overlapCheck(wall75) ||stick.overlapCheck(wall76) ||stick.overlapCheck(wall77) ||stick.overlapCheck(wall78) ||stick.overlapCheck(wall79)||
                            stick.overlapCheck(wall80))
                    {
                        stick.setIcon(img2);
                        JOptionPane.showMessageDialog(Hard.this, "豬喔碰到了啦");
                        stick.setIcon(img1);
                        stick.setPosition(0, 20, 80, 48);
                    } else if (stick.overlapCheck(finish)) {
                        JOptionPane.showMessageDialog(Hard.this, "過關唷");
                        frameeasy.setVisible(true);
                        Hard.this.setVisible(false);

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