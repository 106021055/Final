package go;

import javax.swing.*;

public class Finalgo extends JFrame{
    public static void main(String[] args) {
//        new Finalgo().setVisible(true);
    }
    private Final frame;
    public Finalgo(Final frame){
        this.frame = frame;
        go();
        }
        public void go(){
        this.setBounds(0,0,1600,1000);
        this.setResizable(false);
        this.setTitle("電流急急棒");

        }
    }

