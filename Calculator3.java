import javax.swing.*;
import java.awt.event.*;

class Calculator extends WindowAdapter implements ActionListener {
    public JFrame mainframe;
    public JButton b1, b2, b3, b4, b5;  // Declare b5 for Clear button
    public JTextField t1, t2;
    public JLabel lobj;
    Integer no1, no2;

    public Calculator(int width, int height, String Title) {
        mainframe = new JFrame(Title);
        mainframe.setSize(width, height);
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        b3 = new JButton("Mult");
        b4 = new JButton("Div");
        b5 = new JButton("Clear");

        t1 = new JTextField();
        t2 = new JTextField();
        lobj = new JLabel();

        b1.setBounds(10, 280, 80, 40);
        b2.setBounds(100, 280, 80, 40);
        b3.setBounds(190, 280, 80, 40);
        b4.setBounds(290, 280, 80, 40);
        b5.setBounds(380, 280, 80, 40);

        t1.setBounds(70, 100, 100, 40);
        t2.setBounds(220, 100, 100, 40);
        lobj.setBounds(150, 25, 200, 100);

        mainframe.add(b1);
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(b4);
        mainframe.add(b5);

        mainframe.add(t1);
        mainframe.add(t2);
        mainframe.add(lobj);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        mainframe.setLayout(null);
        mainframe.setVisible(true);
    }

    public void actionPerformed(ActionEvent obj) {
        try {
            no1 = Integer.parseInt(t1.getText());
            no2 = Integer.parseInt(t2.getText());

            if (obj.getSource() == b1) {
                lobj.setText("Addition is : " + (no1 + no2));
            } else if (obj.getSource() == b2) {
                lobj.setText("Subtraction is : " + (no1 - no2));
            } else if (obj.getSource() == b3) {
                lobj.setText("Multiplication is : " + (no1 * no2));
            } else if (obj.getSource() == b4) {
                lobj.setText("Division is : " + (no1 / no2));
            } else if (obj.getSource() == b5) {
                t1.setText("");
                t2.setText("");
                lobj.setText("");
            }
        } catch (Exception eobj) {
            lobj.setText("Error: Invalid input");
        }
    }
}

class Calculator3 {
    public static void main(String arg[]) {
        SwingUtilities.invokeLater(() -> {
            Calculator cobj = new Calculator(500, 400, "Marvellous Calculator");
        });
    }
}
