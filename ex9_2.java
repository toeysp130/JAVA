import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ex9_2 extends Student implements ActionListener  {
    JFrame window;
    Container c;
    JPanel panelForm,panelCommand,panelResult;
    JLabel labelId,labelName,labelSurname;
    JTextField idField,nameField,surnameField;
    JButton btnSave,btnClear;
    JTextArea textArea;
    JScrollPane scroll;
    Font myFont = new Font("Consolas",Font.BOLD,18);
    public ex9_2(){
        window = new JFrame("ProgramStudentInfo");
        c = window.getContentPane();
        c.setLayout(new FlowLayout());
        createPanelForm();
        createPanelCommand();
        createPanelResult();
        window.setSize(400,350);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    public void createPanelForm(){
        panelForm= new JPanel();
        panelForm.setPreferredSize(new Dimension(350,100));
        panelForm.setLayout(new FlowLayout());
        labelId=new JLabel("EnteryourId:");
        labelId.setFont(myFont);
        panelForm.add(labelId);
        idField=new JTextField(10);
        idField.setFont(myFont);
        panelForm.add(idField);
        labelName=new JLabel("EnteryourName:");
        labelName.setFont(myFont);
        panelForm.add(labelName);
        nameField=new JTextField(10);
        nameField.setFont(myFont);
        panelForm.add(nameField);
        labelSurname=new JLabel("EnteryourSurname:");
        labelSurname.setFont(myFont);
        panelForm.add(labelSurname);
        surnameField=new JTextField(10);
        surnameField.setFont(myFont);
        panelForm.add(surnameField);
        window.add(panelForm);
    }
    public void createPanelCommand(){
        panelCommand = new JPanel();
        panelCommand.setPreferredSize(new Dimension(300,40));
        panelCommand.setLayout(new FlowLayout());
        btnSave = new JButton("Save");
        btnSave.setFont(myFont);
        btnSave.addActionListener(this);
        panelCommand.add(btnSave);
        btnClear=new JButton("Clear");
        btnClear.setFont(myFont);
        btnClear.addActionListener(this);
        panelCommand.add(btnClear);
        window.add(panelCommand);
    }
    public void createPanelResult(){
        panelResult= new JPanel();
        panelResult.setPreferredSize(new Dimension(350,150));
        panelResult.setLayout(new FlowLayout());
        textArea=new JTextArea(6,30);
        textArea.setFont(myFont);
        textArea.setEditable(false);
        scroll=new JScrollPane(textArea);
        panelResult.add(scroll);
        window.add(panelResult);
    }
    
    public static void main(String[]args){
        new ex9_2();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == btnSave){
            setStdId(idField.getText());
            setStdName(nameField.getText());
            setStdSurName(surnameField.getText());
            textArea.setText(toString());
        }
        else if(e.getSource() == btnClear){
            idField.setText("");
            nameField.setText("");
            surnameField.setText("");
            textArea.setText("");
        }
        
    }
}
