package go;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Finalgo extends JFrame{
    private Final frame;
    private JLabel jlb = new JLabel();
    private JButton jbtnpause = new JButton("");
    private JButton jbtneasy = new JButton("");
    private JButton jbtnnormal = new JButton("");
    private JButton jbtnhard = new JButton("");
    private JMenuBar jmb = new JMenuBar();
    private JMenu jmusystem = new JMenu("System");
    private JMenu jmuabout = new JMenu("About");
    private JMenuItem jmiback = new JMenuItem("Back");
    private JMenuItem jmiexit = new JMenuItem("Exit");
    private JMenuItem jmiabout = new JMenuItem("關於作者");
    private ImageIcon img1 = new ImageIcon("choose.png");
    private ImageIcon img2 = new ImageIcon("pause.png");
    private ImageIcon img3 = new ImageIcon("start2.png");
    private ImageIcon img4 = new ImageIcon("easy.png");
    private ImageIcon img5 = new ImageIcon("normal.png");
    private ImageIcon img6 = new ImageIcon("hard.png");
    private Container cp;
    private Timer bgTimer;
    private int bg = 1;


    public Finalgo(Final frame){
        this.frame = frame;
        go();
    }
    public void go() {
        cp = this.getContentPane();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 1600, 1000);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("電流急急棒");
        this.setJMenuBar(jmb);
        jmb.add(jmusystem);
        jmb.add(jmuabout);
        jmusystem.add(jmiback);
        jmusystem.add(jmiexit);
        jmuabout.add(jmiabout);
        jlb.setBounds(200, 10, 1200, 800);
        jbtnpause.setBounds(1500,10,80,80);
        jbtneasy.setBounds(100,800,300,150);
        jbtnnormal.setBounds(700,800,300,150);
        jbtnhard.setBounds(1250,800,300,150);

        jbtnpause.setFont(new Font(null,Font.BOLD,30));
        jbtneasy.setFont(new Font(null,Font.BOLD,72));
        jbtnnormal.setFont(new Font(null,Font.BOLD,72));
        jbtnhard.setFont(new Font(null,Font.BOLD,72));

        Image icon1 = img4.getImage();
        Image newimg1 = icon1.getScaledInstance(250, 150, Image.SCALE_SMOOTH);
        img4 = new ImageIcon(newimg1);
        Image icon2 = img5.getImage();
        Image newimg2 = icon2.getScaledInstance(250, 150, Image.SCALE_SMOOTH);
        img5 = new ImageIcon(newimg2);
        Image icon3 = img6.getImage();
        Image newimg3 = icon3.getScaledInstance(250, 150, Image.SCALE_SMOOTH);
        img6 = new ImageIcon(newimg3);
        jbtnpause.setContentAreaFilled(false);
        jbtnpause.setBorderPainted(false);
        jbtnpause.setForeground(Color.RED);
        jbtneasy.setContentAreaFilled(false);
        jbtneasy.setBorderPainted(false);
        jbtneasy.setForeground(Color.RED);
        jbtnnormal.setContentAreaFilled(false);
        jbtnnormal.setBorderPainted(false);
        jbtnnormal.setForeground(Color.RED);
        jbtnhard.setContentAreaFilled(false);
        jbtnhard.setBorderPainted(false);
        jbtnhard.setForeground(Color.RED);

        jlb.setIcon(img1);
        jbtnpause.setIcon(img2);
        jbtneasy.setIcon(img4);
        jbtnnormal.setIcon(img5);
        jbtnhard.setIcon(img6);

        this.add(jlb);
        this.add(jbtnpause);
        this.add(jbtneasy);
        this.add(jbtnnormal);
        this.add(jbtnhard);

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


        jbtnpause.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton tmpbtn = (JButton) e.getSource();
                if (tmpbtn.getIcon().equals(img3)) {          //tmpbtn.getText().equals("turn on")
                    bgTimer.start();
                    tmpbtn.setIcon(img2);
                } else {
                    bgTimer.stop();
                    tmpbtn.setIcon(img3);
                }
            }
        });
        jbtneasy.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Easy ea = new Easy(Finalgo.this);
                ea.setVisible(true);
                Finalgo.this.setVisible(false);
            }
        });
        jbtnnormal.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Normal no = new Normal(Finalgo.this);
                no.setVisible(true);
                Finalgo.this.setVisible(false);
            }
        });
        jbtnhard.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hard ha = new Hard(Finalgo.this);
                ha.setVisible(true);
                Finalgo.this.setVisible(false);
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