import java.awt.*;
public class Balloon {
    private int diameter=10;
    private int x=50,y=50;
    public void display(Graphics g){
        g.drawOval(x,y,diameter,diameter);
    }
    public void left(){
        x=x-10;
    }
    public void right(){
        x=x+10;
    }
    public void up(){
        y=y-10;
    }
    public void down(){
        y=y+10;
    }
    public void grow(){
        diameter = diameter+100;
    }
    public void shrink(){
        diameter = diameter-100;
    }
}
