import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hard extends JFrame {
    private JMenuBar jmb = new JMenuBar();
    private JMenu jmusystem = new JMenu("System");
    private JMenu jmuabout = new JMenu("About");
    private JButton jbtnpause = new JButton("");
    private JMenuItem jmiback = new JMenuItem("Back");
    private JMenuItem jmiexit = new JMenuItem("Exit");
    private JMenuItem jmiabout = new JMenuItem("關於作者");
    private Final frame;
    private JLabel stick = new JLabel();
    private ImageIcon img1 = new ImageIcon("stick.PNG");
    private Container cp;
    private Finalgo framehard;
    private ImageIcon img4 = new ImageIcon("pause.png");
    private ImageIcon img5 = new ImageIcon("start2.png");
    private Finalgo framenormal;
    private Timer bgTimer;
    private int bg = 1;
    public Hard(Finalgo framehard){
        this.framehard = framehard;
        init();
    }

    public void init(){
        this.setJMenuBar(jmb);
        jmb.add(jmusystem);
        jmb.add(jmuabout);
        jmusystem.add(jmiback);
        jmusystem.add(jmiexit);
        jmuabout.add(jmiabout);
        cp =this.getContentPane();
        jbtnpause.setBounds(1500,10,80,80);
        jbtnpause.setFont(new Font(null,Font.BOLD,30));
        jbtnpause.setContentAreaFilled(false);
        jbtnpause.setBorderPainted(false);
        jbtnpause.setForeground(Color.RED);
        this.add(jbtnpause);
        jbtnpause.setIcon(img4);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1000);
        this.setResizable(false);
        this.setTitle("電流急急棒");
        stick.setIcon(img1);
        this.add(stick);
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
                stick.setLocation(e.getXOnScreen() -50,e.getYOnScreen()-510 );
            }
        });

        stick.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                stick.setLocation(e.getXOnScreen() -50 ,e.getYOnScreen() - 510);
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