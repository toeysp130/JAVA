import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ex7_3 implements ActionListener {
    JLabel numberLabel;
    JTextField numberField;
    JButton[] btn = new JButton[10];
    JFrame window;
    public ex7_3() {
        // obtain content pane and set its layout to FlowLayout
        window = new JFrame("Programm Show Text");
        Container container = window.getContentPane();
        container.setLayout( new FlowLayout() );
        // create numberLabel and attach it to content pane
        numberLabel = new JLabel( "Show Number : " );
        container.add( numberLabel );
        numberField = new JTextField( 10 );
        //numberField.setEditable( false );
        container.add( numberField );
        for(int i = 0 ; i < 10 ;i++){
            String name =String.valueOf(i); 
            btn[i] = new JButton(name);
            btn[i].addActionListener( this);
            container.add( btn[i] );
        }
        
        
        window.setSize( 250,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
    public void actionPerformed( ActionEvent event )
    {
        String str = numberField.getText();
        for(int h = 0 ; h < 10 ; h++){
            if (event.getSource() == btn[h]) {
                str += h;
                numberField.setText( str );
            }
        }
        

        } // end method actionPerformed
    public static void main(String[] args) {
        ex7_3 gui = new ex7_3();
    }
}