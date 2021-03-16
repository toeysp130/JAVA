import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class ex8_1 {
    public static void main(String [] args) {
        JFrame window;
        window = new JFrame("Create object JFrame in Method main");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setVisible(true);

        JOptionPane.showMessageDialog(window, "message");
    }
}
