import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class lab13 extends JFrame{
private JLabel nameLabel,ageLabel,phoneNumberLabel,addressLabel,salaryLabel;
private JTextField nameField,ageField,phoneNumberField,addressField,salaryField;
private JButton displayButton;
public lab13(){
setTitle("Employee Details");
setSize(400,300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(null);
nameLabel=new JLabel("Name");
nameLabel.setBounds(20,20,80,25);
add(nameLabel);
ageLabel=new JLabel("Age");
ageLabel.setBounds(20,50,80,25);
add(ageLabel);
phoneNumberLabel=new JLabel("Phone Number");
phoneNumberLabel.setBounds(20,80,120,25);
add(phoneNumberLabel);
addressLabel=new JLabel("Address Label");
addressLabel.setBounds(20,110,80,25);
add(addressLabel);
salaryLabel=new JLabel("Salary Label");
salaryLabel.setBounds(20,140,80,25);
add(salaryLabel);
nameField=new JTextField();
nameField.setBounds(150,20,200,25);
add(nameField);
ageField=new JTextField();
ageField.setBounds(150,50,200,25);
add(ageField);
phoneNumberField=new JTextField();
phoneNumberField.setBounds(150,80,200,25);
add(phoneNumberField);
addressField=new JTextField();
addressField.setBounds(150,110,200,25);
add(addressField);
salaryField=new JTextField();
salaryField.setBounds(150,140,200,25);
add(salaryField);
displayButton=new JButton("Display details");
displayButton.setBounds(150,180,150,25);
add(displayButton);
displayButton.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){
displayDetails();
}
});
}
private void displayDetails(){
String name=nameField.getText();
int age=Integer.parseInt(ageField.getText());
String phoneNumber=phoneNumberField.getText();
String address=addressField.getText();
float salary=Float.parseFloat(salaryField.getText());
String details="Employee Details : \n"+"Name:"+name+"\n"+"Age: "+age+"\n"+"Phone Number"+phoneNumber+"\n"+"Salary:"+salary;
JOptionPane.showMessageDialog(this,details,"Employee details",JOptionPane.INFORMATION_MESSAGE);
}
public static void main(String[] args){
SwingUtilities.invokeLater(new Runnable(){
@Override
public void run(){
new lab13().setVisible(true);
}
});
}
}