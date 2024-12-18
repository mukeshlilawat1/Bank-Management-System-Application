package Bank.Management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField textField;
    JPasswordField passwordField;

    JButton button1, button2, button3;

    Login() {
        super("Bank Management System");


        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image image2 = image.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel img = new JLabel(image3);
        img.setBounds(350, 10, 100, 100);
        add(img);


        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iimage);

        //WELCOME MASSAGE
        label1 = new JLabel("WELCOME TO ATM");

        label1.setForeground(Color.white);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);

        label2 = new JLabel("Card No : ");
        label2.setFont(new Font("Serif", Font.BOLD, 28));
        label2.setForeground(Color.white);
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        textField = new JTextField(15);
        textField.setBounds(325, 190, 230, 30);
        textField.setFont(new Font("Serif", Font.BOLD, 14));
        add(textField);

        label3 = new JLabel("PIN No : ");
        label3.setFont(new Font("Serif", Font.BOLD, 28));
        label3.setForeground(Color.white);
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(325, 250, 230, 30);
        passwordField.setFont(new Font("Serif", Font.BOLD, 14));
        add(passwordField);

        button1 = new JButton("Sign In");
        button1.setFont(new Font("Serif", Font.BOLD, 14));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(300, 300, 100, 30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Serif", Font.BOLD, 14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(430, 300, 100, 30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Serif", Font.BOLD, 14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.setBounds(300, 350, 230, 30);
        button3.addActionListener(this);
        add(button3);

        //image for background
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        add(iiimage);


        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == button1) {

            } else if(e.getSource() == button2) {
                 textField.setText("");
                 passwordField.setText(" ");
            } else if (e.getSource() == button3){

            }


        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
