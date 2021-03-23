import javax.swing.*;
import java.awt.*;
public class ex9_3 {
    JFrame window = new JFrame("TestGraphics");
    ex9_3(){
    window.setSize(400,300);
    window.setVisible(true);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    paint(window.getGraphics());
    }
    public void paint(Graphics g){
    g.drawString("HelloWorld",50,100);
    g.drawString("Testcalgraphics",250,200);
}
public static void main(String args[]){
        new ex9_3();
        
}
}

