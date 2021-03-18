import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ex7_3 implements ActionListener {
    JLabel numberLabel;
    JTextField numberField;
    JButton[] btn = new JButton[10] ;
    JButton btn_mod , btn_ce , btn_c , btn_backspace , btn_1x , btn_x2 , btn_root , btn_div , btn_mul , btn_nag , btn_pls , btn_pl_na ,btn_dot , btn_sum;
    JFrame window;
    public ex7_3() {
        // obtain content pane and set its layout to FlowLayout
        window = new JFrame("Programm Show Text");
        Container container = window.getContentPane();
        container.setLayout( new FlowLayout() );
        // create numberLabel and attach it to content pane
        numberLabel = new JLabel( "Show Number : " );
        container.add( numberLabel );
        numberField = new JTextField( 20 );
        //numberField.setEditable( false );
        container.add( numberField );
        btn_mod = new JButton("%");
        btn_mod.setPreferredSize(new Dimension(60, 50));
        btn_mod.addActionListener( this);
        container.add(btn_mod);

        btn_ce = new JButton("CE");
        btn_ce.addActionListener( this);
        btn_ce.setPreferredSize(new Dimension(60, 50));
        container.add(btn_ce);

        btn_c = new JButton("C");
        btn_c.addActionListener( this);
        btn_c.setPreferredSize(new Dimension(60, 50));
        container.add(btn_c);

        btn_backspace = new JButton("<-");
        btn_backspace.addActionListener( this);
        btn_backspace.setPreferredSize(new Dimension(60, 50));
        container.add(btn_backspace);

    
        btn_1x = new JButton("1/x");
        btn_1x.setPreferredSize(new Dimension(60, 50));
        btn_1x.addActionListener( this);
        container.add(btn_1x);
        
        btn_x2 = new JButton("x2");
        btn_x2.setPreferredSize(new Dimension(60, 50));
        btn_x2.addActionListener( this);
        container.add(btn_x2);

        btn_root = new JButton("2root|X");
        btn_root.setPreferredSize(new Dimension(60, 50));
        btn_root.addActionListener( this);
        container.add(btn_root);

        btn_div = new JButton("/");
        btn_div.setPreferredSize(new Dimension(60, 50));
        btn_div.addActionListener( this);
        container.add(btn_div);


        //for นี้สร้างเลข 7-9
        for(int i = 7 ; i <= 9 ;i++){
            String name =String.valueOf(i); 
            btn[i] = new JButton(name);
            btn[i].addActionListener( this);
            btn[i].setPreferredSize(new Dimension(60, 50));
            container.add( btn[i] );
        }
        //จบ for สร้างเลข
        btn_mul = new JButton("X");
        btn_mul.setPreferredSize(new Dimension(60, 50));
        btn_mul.addActionListener( this);
        container.add(btn_mul);

        //for นี้สร้างเลข 4-6
        for(int i = 4 ; i <= 6 ;i++){
            String name =String.valueOf(i); 
            btn[i] = new JButton(name);
            btn[i].addActionListener( this);
            btn[i].setPreferredSize(new Dimension(60, 50));
            container.add( btn[i] );
        }
        //จบ for สร้างเลข
        btn_nag = new JButton("-");
        btn_nag.setPreferredSize(new Dimension(60, 50));
        btn_nag.addActionListener( this);
        container.add(btn_nag);
        
        //for นี้สร้างเลข 1-3
        for(int i = 1 ; i <= 3 ;i++){
            String name =String.valueOf(i); 
            btn[i] = new JButton(name);
            btn[i].addActionListener( this);
            btn[i].setPreferredSize(new Dimension(60, 50));
            container.add( btn[i] );
        }
        //จบ for สร้างเลข

        btn_pls = new JButton("+");
        btn_pls.setPreferredSize(new Dimension(60, 50));
        btn_pls.addActionListener( this);
        container.add(btn_pls);

        btn_pl_na = new JButton("+/-");
        btn_pl_na.setPreferredSize(new Dimension(60, 50));
        btn_pl_na.addActionListener( this);
        container.add(btn_pl_na);

        btn[0] = new JButton("0");
        btn[0].setPreferredSize(new Dimension(60, 50));
        btn[0].addActionListener( this);
        container.add(btn[0]);

        btn_dot = new JButton(" . ");
        btn_dot.setPreferredSize(new Dimension(60, 50));
        btn_dot.addActionListener( this);
        container.add(btn_dot);

        btn_sum = new JButton(" = ");
        btn_sum.setPreferredSize(new Dimension(60, 50));
        btn_sum.addActionListener( this);
        container.add(btn_sum);
        
        window.setSize( 300,450);
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