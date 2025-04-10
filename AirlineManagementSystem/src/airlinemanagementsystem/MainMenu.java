package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Airline Management System");
        setLayout(null);
        setSize(400, 300);
        setLocation(400, 200);

        JButton btnBoardingPass = new JButton("Open Boarding Pass");
        btnBoardingPass.setBounds(100, 100, 200, 30);
        add(btnBoardingPass);

        btnBoardingPass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BoardingPass(); // ✅ This opens the BoardingPass window
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}
