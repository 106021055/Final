package go;

import javax.swing.*;


class Sprite extends JLabel{

    private int xStart, xEnd, yStart, yEnd;        //    x軸起點, x軸終點, y軸起點, y軸終點

    private int xStartLimit, xEndLimit, yStartLimit, yEndLimit;     //    x 軸起點限制, x 軸終點限制, y 軸起點限制, y 軸終點限制

    //    用到Sprite時 用setPosition
    public void setPosition(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        setRange(x, y);
    }

    //    有動到Sprite時 用changePosition
    public void changePosition(int x, int y){
        setLocation(x, y);
        setRange(x, y);
    }

    //    設定x軸起點, x軸終點, y軸起點, y軸終點
    public void setRange(int x, int y){
        xStart = x + xStartLimit;
        xEnd = x + getWidth() - xEndLimit;
        yStart = y + yStartLimit;
        yEnd = y + getHeight() - yEndLimit;
    }

    //    自訂範圍  讓無形的邊框縮減
    public void customRange(int x1, int x2, int y1, int y2){
        if (x1 + x2 > getWidth() || y1 + y2 > getHeight()){

//            限制範圍大於 Sprite 的寬度或長度
            throw new Error("超出範圍了");
        }
        xStartLimit = x1;
        xEndLimit = x2;
        yStartLimit = y1;
        yEndLimit = y2;
    }

    //    是否重疊 *******
    public boolean overlapCheck(Sprite sprite) {
//        true 表示重疊 false 表示沒重疊
        if ((this.xStart > sprite.xStart && this.xStart < sprite.xEnd || this.xEnd > sprite.xStart && this.xEnd < sprite.xEnd) &&
                (this.yStart > sprite.yStart && this.yStart < sprite.yEnd || this.yEnd > sprite.yStart && this.yEnd < sprite.yEnd)) {
            return true;
        }
        return false;
    }

    //    顯示這個 Sprite 的四個點
    public String showRange() {
        return "XRange(" + xStart + "," + xEnd + "), YRange(" + yStart + "," + yEnd + ")";
    }
}