package go;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Easy extends JFrame {
    private JMenuBar jmb = new JMenuBar();
    private JMenu jmusystem = new JMenu("System");
    private JMenu jmuabout = new JMenu("About");
    private JMenuItem jmiback = new JMenuItem("Back");
    private JMenuItem jmiexit = new JMenuItem("Exit");
    private JMenuItem jmiabout = new JMenuItem("關於作者");
    private Final frame;
    private JLabel stick = new JLabel();
    private ImageIcon img1 = new ImageIcon("stick.PNG");
    private Container cp;
    private Finalgo frameeasy;


    public Easy(Finalgo frameeasy){
        this.frameeasy = frameeasy;
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
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(0,0,1600,1000);
        this.setResizable(false);
        this.setTitle("電流急急棒");
        stick.setIcon(img1);
        this.add(stick);

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
