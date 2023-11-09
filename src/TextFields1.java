import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFields1 {
    public static void main(String[] args) {
        new TextFields1();
    }

    JFrame frame = new JFrame();
    JTextField tF = new JTextField();

    public TextFields1() {
        frame.setSize(new Dimension(300,200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        frame.setVisible(true);

        setTextFrame();
    }

    public void setTextFrame() {
        tF.setBounds(50,50,250,40);

        tF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(tF.getText());
            }
        });

        frame.add(tF);
    }
}
