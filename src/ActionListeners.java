import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListeners {

    public  ActionListeners(JTextArea txt,JTextArea outPut,JButton bt0,JButton bt1,JButton bt2,JButton bt3,JButton bt4,JButton bt5,
                                JButton bt6,JButton bt7,JButton bt8,JButton bt9,JButton divideBt,
                                JButton multiplyBt,JButton addBt,JButton subtractBt,JButton powerOfBt,
                                JButton rootBt,JButton clearBt,JButton parenthesis_leftBt,JButton parenthesis_rightBt,
                                JButton backSpaceBt,JButton decimalBt){



        bt9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               txt.append("9");
            }
        });
        bt8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("8");
            }
        });
        bt7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("7");
            }
        });
        bt6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("6");
            }
        });
        bt5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("5");
            }
        });
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("4");
            }
        });
        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("3");
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("2");
            }
        });
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("1");
            }
        });
        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("0");
            }
        });

        divideBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("/");
            }
        });
        multiplyBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("*");
            }
        });
        addBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("+");
            }
        });
        subtractBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("-");
            }
        });
        powerOfBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("^");
            }
        });
        rootBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("sqrt(");
            }
        });
        clearBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("");
            }
        });
        parenthesis_leftBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append("(");
            }
        });
        parenthesis_rightBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               txt.append(")");
            }
        });
        backSpaceBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txt.getText().length() != 0) {
                    String text = txt.getText().substring(0,txt.getText().length()-1);
                    txt.setText(text);
                }
                else {
                    outPut.setText("There is nothing to remove!");

                }
            }
        });
        decimalBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.append(".");
            }
        });
    }
}
