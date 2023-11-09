import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFields2 implements ActionListener {
    public static void main(String[] args) {
        new TextFields2();
    }

    JFrame frame = new JFrame();
    JTextField tF = new JTextField();
    JButton button = new JButton("Enter");

    public TextFields2() {
        frame.setSize(new Dimension(300,200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        frame.setVisible(true);

        setTextFrame();

        button.setSize(new Dimension(40, 40));
        button.addActionListener(this);
        frame.add(button);

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
