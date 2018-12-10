package go;

import javax.swing.*;

class Sprite extends JLabel {
//    四個點

    public int xStart, xEnd, yStart, yEnd;

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        xStart = x;
        xEnd = x + width;
        yStart = y;
        yEnd = y + height;
    }

    //    是否重疊
    public boolean overlapCheck(Sprite sprite){
//        true 表示重疊 false 表示沒重疊
        if ((this.xStart > sprite.xStart && this.xStart < sprite.xEnd || this.xEnd > sprite.xStart && this.xEnd < sprite.xEnd) &&
                (this.yStart > sprite.yStart && this.yStart < sprite.yEnd || this.yEnd > sprite.yStart && this.yEnd < sprite.yEnd)){
            return true;
        }
        return false;
    }
}