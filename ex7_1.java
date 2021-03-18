import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ex7_1 extends JFrame{
JLabel numberLabel, resultLabel , numberLabel2;
JTextField numberField,numberField2;
JTextArea resultArea;
JScrollPane scroll;
public ex7_1() {
    // title bar in window
    super("Program display value n");
    // obtain content pane and set its layout to FlowLayout
    Container container = getContentPane();
    container.setLayout( new FlowLayout() );
    // create numberLabel and attach it to content pane
    numberLabel = new JLabel("Enter integer and press Enter");
    container.add( numberLabel );
    // create numberField and attach it to content pane
    numberField = new JTextField( 10 );
    container.add( numberField );
    // register this applet as numberField’s ActionListener
    numberLabel2 = new JLabel("Enter integer umber of blank");
    container.add(numberLabel2);
    numberField2 = new JTextField(10);
    container.add(numberField2);




    numberField2.addActionListener(
    // create inner class
    new ActionListener() {
        public void actionPerformed( ActionEvent event )
        {
        int number, umber;
        String blank5 = "";

        number = Integer.parseInt( numberField.getText() );
        umber = Integer.parseInt( numberField2.getText() );
        for(int b = 0 ; b < umber ; b++){
            blank5 += " ";
        } 
        // clear value in TextArea
        resultArea.setText("");
        // add data in textarea
        for (int n = 1 ; n <= number ; n++) {
            resultArea.append( blank5 + Integer.toString(n));
        if (n % 5 == 0) resultArea.append("\n");
        }
        // clear value in numberField
        //numberField.setText(""); 
        } // end method actionPerformed
        }
    );
// create display
resultArea = new JTextArea( 10,20 );
resultArea.setEditable( false );
container.add( resultArea );
scroll = new JScrollPane(resultArea);   ///////////อาจารย์ให้เพิ่มส่วน scroll มาเพื่อช่วยในการแสดงผมข้อมูลทั้งหมด
container.add(scroll);  
}
public static void main(String[] args) {
    ex7_1 window = new ex7_1();
    window.setSize( 350,400);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    }
}