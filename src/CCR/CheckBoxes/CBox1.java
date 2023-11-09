package CCR.CheckBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CBox1 implements ActionListener {
    public static void main(String[] args) {
        new CBox1();
    }

    JFrame frame = new JFrame();
    JTextField tF = new JTextField();
    JButton button = new JButton("Enter");
    JCheckBox checkBox = new JCheckBox();
    JCheckBox otherCheckBox = new JCheckBox();

    public CBox1() {
        frame.setSize(new Dimension(300,200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        frame.setFocusable(false);
        frame.setVisible(true);

        checkBox.setText("Blah!");
        checkBox.setFont(new Font("Courier New", Font.PLAIN, 35));
        checkBox.setBackground(Color.BLACK);
        checkBox.setForeground(Color.GREEN);
        checkBox.setFocusable(false);

        otherCheckBox.setText("Blah!");
        otherCheckBox.setFont(new Font("Courier New", Font.PLAIN, 35));
        otherCheckBox.setBackground(Color.BLACK);
        otherCheckBox.setForeground(Color.GREEN);
        otherCheckBox.setFocusable(false);

        frame.add(checkBox);
        frame.add(otherCheckBox);

        frame.pack();
    }

    public void setTextFrame() {
//        tF.setBounds(50,50,250,40);
        tF.setPreferredSize(new Dimension(250,40));
        tF.addActionListener(this);
        tF.setFont(new Font("Courier New", Font.PLAIN, 35));
        tF.setBackground(Color.BLACK);
        tF.setForeground(Color.GREEN);

        frame.add(tF);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (tF.getText().isBlank()) return;

        if (e.getSource() == button) {
            System.out.println("BUtton!");
        } else if (e.getSource() == tF) {
            System.out.println("enter!");
        }

        System.out.println(tF.getText());
        tF.setText("");
    }
}

