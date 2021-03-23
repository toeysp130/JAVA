import javax.swing.*;
import java.awt.*;
public class ex9_6 extends JFrame {
    public ex9_6(){
        super("TestArc");
        setSize(400,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        super.paint(g);//callsuperclass'spaintmethod
        showArc(g);
    }
    public void showArc(Graphics g){
        //startat0andsweep360degrees
        g.setColor(Color.MAGENTA);
        g.drawRect(15,35,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(15,35,80,80,0,360);
        //startat0andsweep110degrees
        g.setColor(Color.MAGENTA);
        g.drawRect(100,35,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(100,35,80,80,0,110);
        //startat0andsweep-270degrees
        g.setColor(Color.MAGENTA);
        g.drawRect(185,35,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(185,35,80,80,0,-270);
        //startat0andsweep360degrees
        g.setColor(Color.YELLOW);
        g.fillArc(15,120,80,40,0,360);
        //startat270andsweep-90degrees
        g.setColor(Color.CYAN);
        g.fillArc(100,120,80,40,270,-90);
        //startat0andsweep-270degrees
        g.setColor(Color.ORANGE);
        g.fillArc(185,120,80,40,0,-270);
    }
    public static void main(String args[]){
        new ex9_6();
    }
}
