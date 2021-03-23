import javax.swing.*;
import java.awt.*;
public class ex9_4 extends JFrame {
    public ex9_4(){
        super("CallpaintMethodinOerrideMethod");
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("HelloWorld",50,100);
        g.drawString("Testcalgraphics",250,200);
    }public static void main(String args[]){
            new ex9_4();
        }
}
