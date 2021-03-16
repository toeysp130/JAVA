import javax.swing.JFrame;
public class ex8_2 {
    JFrame window;
    public ex8_2(){
        window = new JFrame("Create object JFrame in Method main");
        window.setLocation(200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setVisible(true);

    }
    public static void main(String [] args) {
        new ex8_2();
    }
}
