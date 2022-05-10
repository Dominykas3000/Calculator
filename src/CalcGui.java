import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcGui {

    public JFrame frame = new JFrame("Scientific calculator");
    public JTextArea txt = new JTextArea(); //input screen
    public JTextArea outPut = new JTextArea(); // screen which shows the answer
    public ImageIcon calc = new ImageIcon("calc.png");
    //------------number buttons---------------
    public JButton bt0 = new JButton("0");
    public JButton bt1 = new JButton("1");
    public JButton bt2 = new JButton("2");
    public JButton bt3 = new JButton("3");
    public JButton bt4 = new JButton("4");
    public JButton bt5 = new JButton("5");
    public JButton bt6 = new JButton("6");
    public JButton bt7 = new JButton("7");
    public JButton bt8 = new JButton("8");
    public JButton bt9 = new JButton("9");

    //------------operator buttons-----------------------------
    public JButton divideBt = new JButton("/");
    public JButton multiplyBt = new JButton("*");
    public JButton addBt = new JButton("+");
    public JButton subtractBt = new JButton("-");
    public JButton powerOfBt = new JButton("^");
    public JButton rootBt = new JButton("sqrt");
    public JButton clearBt = new JButton("Clear");
    public JButton parenthesis_leftBt = new JButton("(");
    public JButton parenthesis_rightBt = new JButton(")");
    public JButton backSpaceBt = new JButton("←");
    public JButton decimalBt = new JButton(".");
    public JButton equalBt = new JButton("=");

    public CalcGui(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(425,430);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setIconImage(calc.getImage());

        Color cBlue = new Color(86, 92, 108, 255);
        Color cGray = new Color(173, 173, 173);
        Color cPurple = new Color(162, 126, 243, 255);

        frame.getContentPane().setBackground(cBlue);
        txt.setSize(395,70);
        txt.setLocation(5,5);
        outPut.setSize(395,70);
        outPut.setLocation(5,5);
        outPut.setBackground(cGray);
        txt.setBackground(cGray);
        txt.setFont(new Font("Arial",Font.BOLD,20));
        outPut.setFont(new Font("Arial",Font.BOLD,20));


        equalBt.setSize(100,50);
        equalBt.setLocation(205,335);
        equalBt.setBackground(cPurple);
        equalBt.setFont(new Font("Arial", Font.BOLD, 18));
        equalBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x = Evaluation.eval(txt.getText());
                    if(x == (1.0/0.0) || x ==-(1.0/0.0)|| x == (0.0/0.0)){
                        outPut.setText("division by 0 is not allowed");
                    }else {
                        outPut.setText(Double.toString(x));
                    }
                }catch (Exception e1){
                    outPut.setText("Invalid input, please try again!");
                    txt.append("\n"+e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
        new CreateButtons(bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,divideBt,multiplyBt,addBt,
                subtractBt,powerOfBt,rootBt,clearBt,parenthesis_leftBt,parenthesis_rightBt,
                backSpaceBt,decimalBt);

        new ActionListeners(txt,outPut,bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,divideBt,multiplyBt,addBt,
                subtractBt,powerOfBt,rootBt,clearBt,parenthesis_leftBt,parenthesis_rightBt,
                backSpaceBt,decimalBt);
        new AddButtons(frame,txt,outPut,bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,divideBt,multiplyBt,addBt,
                subtractBt,powerOfBt,rootBt,clearBt,parenthesis_leftBt,parenthesis_rightBt,
                backSpaceBt,decimalBt,equalBt);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new CalcGui();
    }
}
