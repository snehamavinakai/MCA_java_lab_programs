import java.awt.*;
import java.awt.event.*;

public class Lab11 extends Frame implements ActionListener

{
    TextField nameField, ageField, contactField, fatherNameField, incomeField;
    Label nameLabel,ageLabel,contactLabel,fatherNameLabel,incomeLabel,resultLabel1,resultLabel2,resultLabel3,resultLabel4,resultLabel5;
    Button submitButton, clearButton;
    
    public Lab11()
    {
        nameField = new TextField(50);
        ageField = new TextField(20);
        contactField = new TextField(20);
        fatherNameField = new TextField(20);
        incomeField = new TextField(20);
        nameLabel = new Label("Name ");
        ageLabel = new Label("Age ");
        contactLabel = new Label("Contact ");
        fatherNameLabel = new Label("Father Name ");
        incomeLabel = new Label("Annual Income ");
        resultLabel1 = new Label();
        resultLabel2 = new Label();
        resultLabel3 = new Label();
        resultLabel4 = new Label();
        resultLabel5 = new Label();

        submitButton = new Button("Submit");
        clearButton = new Button("Clear");
        addFrameItems();
        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
    }
    private void addFrameItems()
    {
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(contactLabel);
        add(contactField);
        add(fatherNameLabel);
        add(fatherNameField);
        add(incomeLabel);
        add(incomeField);
        add(submitButton);
        add(clearButton);
        add(resultLabel1);
        add(resultLabel2);
        add(resultLabel3);
        add(resultLabel4);
        add(resultLabel5);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == submitButton)
        {
            validateAndSetLabelText(nameField,resultLabel1,nameLabel,"alphabets");
            validateAndSetLabelText(ageField,resultLabel2,ageLabel,"numbers");
            validateAndSetLabelText(contactField,resultLabel3,contactLabel,"numbers");
            validateAndSetLabelText(fatherNameField,resultLabel4,fatherNameLabel,"alphabets");
            validateAndSetLabelText(incomeField,resultLabel5,incomeLabel,"numbers");
        }

        else if(e.getSource()==clearButton)
        {
            clearFieldAndResultLablels();
        }
    }
    private void validateAndSetLabelText(TextField field,Label resultLabel,Label fieldLabel,String validationType)
    {
        String userInput = field.getText();
        if(userInput.isEmpty())
        {
            resultLabel.setText("Insert"+fieldLabel.getText());
        }
        else
        {
            String validationPattern = (validationType.equals("alphabets"))?"^[a-zA-Z]*$":"^[0-9]";
            if(userInput.matches(validationPattern))
            {
                resultLabel.setText(userInput);
            }
        
             else
           {
            resultLabel.setText(fieldLabel.getText()+"should contain only "+validationType+" .");
           }

    }
}

private void clearFieldAndResultLablels()
{
    nameField.setText(null);
    ageField.setText(null);
    contactField.setText(null);
    fatherNameField.setText(null);
    incomeField.setText(null);
    resultLabel1.setText(null);
    resultLabel2.setText(null);
    resultLabel3.setText(null);
    resultLabel4.setText(null);
    resultLabel5.setText(null);
} 
public static void main( String[] args)
{
    Lab11 f = new Lab11();
    f.setTitle("Student Registration ");
    f.setSize(600,400);
    f.setLayout(new GridLayout(13,5));
    f.setVisible(true);
}
}