import java.awt.*;
import java.awt.event.*;

class CustomButton extends Frame implements ActionListener{
    Label lblHeading;
    Button btnOk,btnCancel,btnExit;
    CustomButton(){
      setLayout(new FlowLayout());
      lblHeading= new Label("Click any Button to view data");
      lblHeading.setSize(150, 150);
      lblHeading.setForeground(Color.red);
      btnOk = new Button("Ok");
      btnOk.addActionListener(this);
      btnCancel = new Button("Cancel");
      btnCancel.addActionListener(this);
      btnExit = new Button("X Exit");
      btnExit.addActionListener(this);
      add(lblHeading);
      add(btnOk);
      add(btnCancel);
      add(btnExit);

      
    }  
    public void actionPerformed(ActionEvent e){
        System.out.println("wokrs");
        if(e.getSource() == btnOk){
            lblHeading.setText("ok button pressed");
        }
        if(e.getSource() == btnCancel){
            lblHeading.setText("Cancel button pressed");
        }
        if(e.getSource() == btnExit){
            System.exit(0);
        } 
    }
}
class MyButton{
    public static void main(String[] args) {
        CustomButton frame= new CustomButton();
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}