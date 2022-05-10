import javax.swing.*;

public class AddButtons {
    public AddButtons(JFrame frame,JTextArea txt,JTextArea outPut,JButton bt0,JButton bt1,JButton bt2,JButton bt3,JButton bt4,JButton bt5,
                            JButton bt6,JButton bt7,JButton bt8,JButton bt9,JButton divideBt,
                            JButton multiplyBt,JButton addBt,JButton subtractBt,JButton powerOfBt,
                            JButton rootBt,JButton clearBt,JButton parenthesis_leftBt,JButton parenthesis_rightBt,
                            JButton backSpaceBt,JButton decimalBt,JButton equalBt){

        frame.add(txt);
        frame.add(outPut);
        frame.add(clearBt);
        frame.add(equalBt);
        frame.add(bt0);
        frame.add(bt1);
        frame.add(bt2);
        frame.add(bt3);
        frame.add(bt4);
        frame.add(bt5);
        frame.add(bt6);
        frame.add(bt7);
        frame.add(bt8);
        frame.add(bt9);
        frame.add(divideBt);
        frame.add(multiplyBt);
        frame.add(addBt);
        frame.add(subtractBt);
        frame.add(powerOfBt);
        frame.add(rootBt);
        frame.add(parenthesis_leftBt);
        frame.add(parenthesis_rightBt);
        frame.add(backSpaceBt);
        frame.add(decimalBt);
    }
}
