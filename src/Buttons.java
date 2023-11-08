import javax.swing.*;
import java.awt.*;

public class Buttons {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {

        //Create and set up the window.
        JFrame frame = new JFrame("BorderLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        //Use the content pane's default BorderLayout. No need for
        //setLayout(new BorderLayout());
        //Display the window.
        frame.setSize(450, 600);
        frame.pack();
        frame.setVisible(true);
    }

    private static void addComponentsToPane(Container pane) {
            GridLayout border = new GridLayout(1,4,10,0);
            pane.setBackground(Color.BLUE);
            pane.setLayout(border);
            pane.setBounds(30,20,325,325);


            JLabel label1 = new JLabel("Hello");
            label1.setPreferredSize(new Dimension(425, 400));
            label1.setVerticalAlignment(JLabel.CENTER);
            label1.setHorizontalAlignment(JLabel.CENTER);
            label1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
            pane.add(label1, BorderLayout.CENTER);

            FlowLayout buttonLayout = new FlowLayout();

            JButton button1 = new JButton();
//            button1.setPreferredSize(new Dimension(450/4, 100));
            pane.add(button1);

            JButton button2 = new JButton();
//            button2.setPreferredSize(new Dimension(450/4, 100));
            pane.add(button2);
        }
}
