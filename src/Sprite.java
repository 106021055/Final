import javax.swing.*;


class Sprite extends JLabel{

    private int xStart, xEnd, yStart, yEnd;        // 關卡邊界的   x軸起點, x軸終點, y軸起點, y軸終點
    private int xStartLimit, xEndLimit, yStartLimit, yEndLimit;     // 急急棒圈圈的限制範圍  x 軸起點限制, x 軸終點限制, y 軸起點限制, y 軸終點限制

    //    用到Sprite時 用setPosition
    public void setPosition(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        setRange(x, y);
    }

    //    急急棒移動時 用到Sprite 用changePosition 因為有移動 所以有改變
    public void changePosition(int x, int y){
        setLocation(x, y);
        setRange(x, y);
    }

    //  急急棒移動後   新的x軸起點, x軸終點, y軸起點, y軸終點
    public void setRange(int x, int y){
        xStart = x + xStartLimit;
        xEnd = x + getWidth() - xEndLimit;  //取得寬度
        yStart = y + yStartLimit;
        yEnd = y + getHeight() - yEndLimit;  //取得高度
    }

    //    自訂範圍  讓無形的邊框縮減   縮小至只需要判定的範圍
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
//        true 表示重疊 false 表示沒重疊  &&=兩者都須滿足  ||=其中一個滿足就好
        if ((this.xStart > sprite.xStart && this.xStart < sprite.xEnd || this.xEnd > sprite.xStart && this.xEnd < sprite.xEnd) &&
                (this.yStart > sprite.yStart && this.yStart < sprite.yEnd || this.yEnd > sprite.yStart && this.yEnd < sprite.yEnd)) {
            return true;  //代表重疊
        }
        return false;
    }


}
