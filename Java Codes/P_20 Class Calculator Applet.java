import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApplet extends Applet implements ActionListener {
    private TextField num1Field, num2Field, resultField;
    private Button addButton, subtractButton, multiplyButton, divideButton;

    public void init() {
        Label num1Label = new Label("Enter number 1:");
        Label num2Label = new Label("Enter number 2:");

        num1Field = new TextField(10);
        num2Field = new TextField(10);
        resultField = new TextField(10);
        resultField.setEditable(false);

        addButton = new Button("Add");
        subtractButton = new Button("Subtract");
        multiplyButton = new Button("Multiply");
        divideButton = new Button("Divide");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(resultField);
    }

    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(num1Field.getText());
        int num2 = Integer.parseInt(num2Field.getText());

        if (e.getSource() == addButton) {
            int result = num1 + num2;
            resultField.setText("Result: " + result);
        } else if (e.getSource() == subtractButton) {
            int result = num1 - num2;
            resultField.setText("Result: " + result);
        } else if (e.getSource() == multiplyButton) {
            int result = num1 * num2;
            resultField.setText("Result: " + result);
        } else if (e.getSource() == divideButton) {
            if (num2 != 0) {
                double result = (double) num1 / num2;
                resultField.setText("Result: " + result);
            } else {
                resultField.setText("Cannot divide by zero.");
            }
        }
    }
}
