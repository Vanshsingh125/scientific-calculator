import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FinalScientificCalculator extends JFrame implements ActionListener {
    private JTextField inputField1, inputField2, outputField;
    private JButton addButton, subButton, mulButton, divButton, clearButton, exitButton;
    private JButton percentButton, sinButton, cosButton, ncrButton, factorialButton, acosButton, secButton, cotButton, nprButton;
    private JButton sqrtButton, squareButton, cubeButton, powerButton, inverseButton;
    private JButton eButton, expButton, logButton, lnButton, absButton;
    private JButton piButton, nPiButton, power2Button, power10Button;
    private JPanel panel;

    private double result = 0;
    private String errorMessage = "Please enter value";

    public FinalScientificCalculator() {
        setTitle("Scientific Calculator");
        setSize(600, 750);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.GRAY);

        JLabel titleLabel = new JLabel("Scientific Calculator", JLabel.CENTER);
        titleLabel.setBounds(50, 10, 500, 40);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.BLACK);
        add(titleLabel);

        
        JLabel firstLabel = new JLabel("1st:");
        firstLabel.setBounds(20, 70, 50, 30);
        firstLabel.setFont(new Font("Arial", Font.BOLD, 14));
        firstLabel.setForeground(Color.BLACK);
        add(firstLabel);

        inputField1 = new JTextField();
        inputField1.setBounds(60, 70, 200, 50);
        add(inputField1);

        
        JLabel secondLabel = new JLabel("2nd:");
        secondLabel.setBounds(20, 140, 50, 30);
        secondLabel.setFont(new Font("Arial", Font.BOLD, 14));
        secondLabel.setForeground(Color.BLACK);
        add(secondLabel);

        inputField2 = new JTextField();
        inputField2.setBounds(60, 140, 200, 50);
        add(inputField2);

        
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(300, 40, 200, 30);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultLabel.setForeground(Color.BLACK);
        add(resultLabel);

        outputField = new JTextField();
        outputField.setBounds(300, 70, 200, 50);
        outputField.setEditable(false);
        add(outputField);

       
        addButton = createButton("+");
        subButton = createButton("-");
        mulButton = createButton("*");
        divButton = createButton("/");
        clearButton = createButton("Clear");
        exitButton = createButton("Exit");
        percentButton = createButton("%");
        sinButton = createButton("sin");
        cosButton = createButton("cos");
        ncrButton = createButton("nCr");
        factorialButton = createButton("n!");
        acosButton = createButton("cos^-1");
        secButton = createButton("sec");
        cotButton = createButton("cot");
        nprButton = createButton("nPr");
        sqrtButton = createButton("√");
        squareButton = createButton("x^2");
        cubeButton = createButton("x^3");
        powerButton = createButton("x^y");
        inverseButton = createButton("x^-1");
        eButton = createButton("e");
        expButton = createButton("e^x");
        logButton = createButton("log");
        lnButton = createButton("ln");
        absButton = createButton("|x|");
        piButton = createButton("π");
        nPiButton = createButton("nπ");
        power2Button = createButton("2^x");
        power10Button = createButton("10^x");

       
        panel = new JPanel();
        panel.setBounds(50, 210, 500, 450);
        panel.setLayout(new GridLayout(6, 5, 10, 10));

        addButtonsToPanel();

        add(panel);
        setVisible(true);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        return button;
    }

    private void addButtonsToPanel() {
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(clearButton);
        panel.add(percentButton);
        panel.add(sinButton);
        panel.add(cosButton);
        panel.add(ncrButton);
        panel.add(exitButton);
        panel.add(factorialButton);
        panel.add(acosButton);
        panel.add(secButton);
        panel.add(cotButton);
        panel.add(nprButton);
        panel.add(sqrtButton);
        panel.add(squareButton);
        panel.add(cubeButton);
        panel.add(powerButton);
        panel.add(inverseButton);
        panel.add(eButton);
        panel.add(expButton);
        panel.add(logButton);
        panel.add(lnButton);
        panel.add(absButton);
        panel.add(piButton);
        panel.add(nPiButton);
        panel.add(power2Button);
        panel.add(power10Button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == clearButton) {
                inputField1.setText("");
                inputField2.setText("");
                outputField.setText("");
                return;
            }

            if (e.getSource() == exitButton) {
                System.exit(0);
            }

            double num1 = getInput(inputField1);
            double num2 = inputField2.getText().isEmpty() ? 0 : getInput(inputField2);

            if (e.getSource() == addButton) result = num1 + num2;
            else if (e.getSource() == subButton) result = num1 - num2;
            else if (e.getSource() == mulButton) result = num1 * num2;
            else if (e.getSource() == divButton) result = num1 / num2;
            else if (e.getSource() == sinButton) result = Math.sin(Math.toRadians(num1));
            else if (e.getSource() == cosButton) result = Math.cos(Math.toRadians(num1));
            else if (e.getSource() == acosButton) result = Math.toDegrees(Math.acos(num1));
            else if (e.getSource() == sqrtButton) result = Math.sqrt(num1);
            else if (e.getSource() == squareButton) result = Math.pow(num1, 2);
            else if (e.getSource() == cubeButton) result = Math.pow(num1, 3);
            else if (e.getSource() == powerButton) result = Math.pow(num1, num2);
            else if (e.getSource() == inverseButton) result = 1 / num1;
            else if (e.getSource() == eButton) result = Math.E;
            else if (e.getSource() == expButton) result = Math.exp(num1);
            else if (e.getSource() == logButton) result = Math.log10(num1);
            else if (e.getSource() == lnButton) result = Math.log(num1);
            else if (e.getSource() == absButton) result = Math.abs(num1);
            else if (e.getSource() == piButton) result = Math.PI;
            else if (e.getSource() == nPiButton) result = num1 * Math.PI;
            else if (e.getSource() == power2Button) result = Math.pow(2, num1);
            else if (e.getSource() == power10Button) result = Math.pow(10, num1);
            else if (e.getSource() == factorialButton) result = factorial((int) num1);
            else if (e.getSource() == percentButton) result = num1 / 100;
            else if (e.getSource() == ncrButton) result = combination((int) num1, (int) num2);
            else if (e.getSource() == nprButton) result = permutation((int) num1, (int) num2);

            outputField.setText(String.valueOf(result));
        } catch (Exception ex) {
            outputField.setText(errorMessage);
        }
    }

    private double getInput(JTextField field) {
        return Double.parseDouble(field.getText());
    }

    private int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    private int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    private int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        new FinalScientificCalculator();
    }
}
