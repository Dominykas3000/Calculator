import javax.swing.*;
import java.awt.*;

public class CreateButtons {
    public   CreateButtons(JButton bt0,JButton bt1,JButton bt2,JButton bt3,JButton bt4,JButton bt5,
                               JButton bt6,JButton bt7,JButton bt8,JButton bt9,JButton divideBt,
                               JButton multiplyBt,JButton addBt,JButton subtractBt,JButton powerOfBt,
                               JButton rootBt,JButton clearBt,JButton parenthesis_leftBt,JButton parenthesis_rightBt,
                               JButton backSpaceBt,JButton decimalBt){

        Color cRed = new Color(0xFD6363);
        Color cYellow = new Color(199, 199, 78);
        Color cPurple = new Color(162, 126, 243, 255);

        bt0.setSize(100, 50);
        bt0.setLocation(5,335);
        bt0.setBackground(cPurple);
        bt0.setFont(new Font("Arial", Font.BOLD, 18));

        bt1.setSize(100, 50);
        bt1.setLocation(5,285);
        bt1.setBackground(cPurple);
        bt1.setFont(new Font("Arial", Font.BOLD, 18));

        bt2.setSize(100, 50);
        bt2.setLocation(105,285);
        bt2.setBackground(cPurple);
        bt2.setFont(new Font("Arial", Font.BOLD, 18));

        bt3.setSize(100, 50);
        bt3.setLocation(205,285);
        bt3.setBackground(cPurple);
        bt3.setFont(new Font("Arial", Font.BOLD, 18));

        bt4.setSize(100, 50);
        bt4.setLocation(5,235);
        bt4.setBackground(cPurple);
        bt4.setFont(new Font("Arial", Font.BOLD, 18));

        bt5.setSize(100, 50);
        bt5.setLocation(105,235);
        bt5.setBackground(cPurple);
        bt5.setFont(new Font("Arial", Font.BOLD, 18));

        bt6.setSize(100, 50);
        bt6.setLocation(205,235);
        bt6.setBackground(cPurple);
        bt6.setFont(new Font("Arial", Font.BOLD, 18));

        bt7.setSize(100, 50);
        bt7.setLocation(5,185);
        bt7.setBackground(cPurple);
        bt7.setFont(new Font("Arial", Font.BOLD, 18));

        bt8.setSize(100, 50);
        bt8.setLocation(105,185);
        bt8.setBackground(cPurple);
        bt8.setFont(new Font("Arial", Font.BOLD, 18));

        bt9.setSize(100, 50);
        bt9.setLocation(205,185);
        bt9.setBackground(cPurple);
        bt9.setFont(new Font("Arial", Font.BOLD, 18));

        clearBt.setSize(100,50);
        clearBt.setLocation(205,85);
        clearBt.setBackground(cYellow);
        clearBt.setFont(new Font("Arial", Font.BOLD, 18));

        divideBt.setSize(100,50);
        divideBt.setLocation(305,185);
        divideBt.setBackground(cRed);
        decimalBt.setFont(new Font("Arial", Font.BOLD, 18));

        multiplyBt.setSize(100,50);
        multiplyBt.setLocation(305,235);
        multiplyBt.setBackground(cRed);
        multiplyBt.setFont(new Font("Arial", Font.BOLD, 18));

        addBt.setSize(100,50);
        addBt.setLocation(305,335);
        addBt.setBackground(cRed);
        addBt.setFont(new Font("Arial", Font.BOLD, 18));

        subtractBt.setSize(100,50);
        subtractBt.setLocation(305,285);
        subtractBt.setBackground(cRed);
        subtractBt.setFont(new Font("Arial", Font.BOLD, 18));

        powerOfBt.setSize(100,50);
        powerOfBt.setLocation(205,135);
        powerOfBt.setBackground(cRed);
        powerOfBt.setFont(new Font("Arial", Font.BOLD, 18));


        rootBt.setSize(100,50);
        rootBt.setLocation(305,135);
        rootBt.setBackground(cRed);
        rootBt.setFont(new Font("Arial", Font.BOLD, 18));

        parenthesis_leftBt.setSize(100,50);
        parenthesis_leftBt.setLocation(5,135);
        parenthesis_leftBt.setBackground(cRed);
        parenthesis_leftBt.setFont(new Font("Arial", Font.BOLD, 18));

        parenthesis_rightBt.setSize(100,50);
        parenthesis_rightBt.setLocation(105,135);
        parenthesis_rightBt.setBackground(cRed);
        parenthesis_rightBt.setFont(new Font("Arial", Font.BOLD, 18));

        backSpaceBt.setSize(100,50);
        backSpaceBt.setLocation(305,85);
        backSpaceBt.setBackground(cYellow);
        backSpaceBt.setFont(new Font("Arial", Font.BOLD, 18));

        decimalBt.setSize(100,50);
        decimalBt.setLocation(105,335);
        decimalBt.setBackground(cPurple);
        decimalBt.setFont(new Font("Arial", Font.BOLD, 18));

    }
}
