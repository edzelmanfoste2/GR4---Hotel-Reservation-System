package HotelReservation;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ReservedRooms extends JFrame {

    JTextField T1, T2, T3, T4, T6;
    JComboBox T5;

    ReservedRooms() {
        JPanel layout = new JPanel();
        layout.setBounds(0, 0, 900, 600);
        layout.setBackground(new Color(242,242,242));
        layout.setLayout(null);
        add(layout);

        JPanel headerLine = new JPanel();
        headerLine.setBounds(0, 0, 900, 10);
        headerLine.setBackground(new Color(23, 33, 35));
        layout.add(headerLine);

        JLabel reservedRoomsLabel = new JLabel("RESERVE ROOMS");
        reservedRoomsLabel.setBounds(350, 20, 200, 32);
        reservedRoomsLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
        reservedRoomsLabel.setForeground(Color.BLACK);
        layout.add(reservedRoomsLabel);

        JLabel guestNameLabel = new JLabel("Full name:");
        guestNameLabel.setBounds(64, 60, 155, 22);
        guestNameLabel.setFont(new Font("Serif", Font.BOLD, 16));
        guestNameLabel.setForeground(Color.BLACK);
        layout.add(guestNameLabel);

        T1 = new JTextField();
        T1.setBounds(200, 60, 156, 20);
        T1.setFont(new Font("Arial", Font.PLAIN, 12));
        T1.setForeground(Color.BLACK);
        T1.setBackground(new Color(255, 255, 255));
        layout.add(T1);

        JLabel roomNumLabel = new JLabel("Email:");
        roomNumLabel.setBounds(64, 100, 155, 22);
        roomNumLabel.setFont(new Font("Serif", Font.BOLD, 16));
        roomNumLabel.setForeground(Color.BLACK);
        layout.add(roomNumLabel);

        T2 = new JTextField();
        T2.setBounds(200, 100, 156, 20);
        T2.setFont(new Font("Arial", Font.PLAIN, 12));
        T2.setForeground(Color.BLACK);
        T2.setBackground(new Color(255, 255, 255));
        layout.add(T2);

        JLabel checkInLabel = new JLabel("Phone Number: ");
        checkInLabel.setBounds(64, 140, 160, 22);
        checkInLabel.setFont(new Font("Serif", Font.BOLD, 16));
        checkInLabel.setForeground(Color.BLACK);
        layout.add(checkInLabel);

        T3 = new JTextField();
        T3.setBounds(200, 140, 156, 20);
        T3.setFont(new Font("Arial", Font.PLAIN, 12));
        T3.setForeground(Color.BLACK);
        T3.setBackground(new Color(255, 255, 255));
        layout.add(T3);

        JLabel checkOutLabel = new JLabel("Address:");
        checkOutLabel.setBounds(64, 180, 190, 22);
        checkOutLabel.setFont(new Font("Serif", Font.BOLD, 16));
        checkOutLabel.setForeground(Color.BLACK);
        layout.add(checkOutLabel);

        T4 = new JTextField();
        T4.setBounds(200, 180, 400, 20);
        T4.setFont(new Font("Arial", Font.PLAIN, 14));
        T4.setForeground(Color.BLACK);
        T4.setBackground(new Color(255, 255, 255));
        layout.add(T4);
        
        JLabel welcomeLabel = new JLabel("Let us know what you need!");
        welcomeLabel.setBounds(64, 220, 250, 22);
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 20));
        welcomeLabel.setForeground(Color.BLACK);
        layout.add(welcomeLabel);

        JLabel preferenceLabel = new JLabel("Do you have a smoking preference? ");
        preferenceLabel.setBounds(64, 270, 300, 22);
        preferenceLabel.setFont(new Font("Serif", Font.BOLD, 16));
        preferenceLabel.setForeground(Color.BLACK);
        layout.add(preferenceLabel);

        Checkbox c1 = new Checkbox("Non-smoking");
        c1.setBounds(64, 280, 100, 60);
        c1.setFont(new Font("Arial", Font.PLAIN, 12));
        layout.add(c1);

        Checkbox c2 = new Checkbox("Smoking");
        c2.setBounds(64, 330, 100, 30);
        c2.setFont(new Font("Arial", Font.PLAIN, 12));
        layout.add(c2);

        JLabel bedprefLabel = new JLabel("What bed configuration do you prefer? ");
        bedprefLabel.setBounds(64, 360, 300, 22);
        bedprefLabel.setFont(new Font("Serif", Font.BOLD, 16));
        bedprefLabel.setForeground(Color.BLACK);
        layout.add(bedprefLabel);

        Checkbox c3 = new Checkbox("I'd like a large bed");
        c3.setBounds(64, 380, 100, 60);
        c3.setFont(new Font("Arial", Font.PLAIN, 12));
        layout.add(c3);

        Checkbox c4 = new Checkbox("I'd like a twin beds");
        c4.setBounds(64, 430, 100, 30);
        c4.setFont(new Font("Arial", Font.PLAIN, 12));
        layout.add(c4);

        JLabel AddReqLabel = new JLabel("Additional Request:");
        AddReqLabel.setBounds(64, 470, 300, 22);
        AddReqLabel.setFont(new Font("Serif", Font.BOLD, 16));
        AddReqLabel.setForeground(Color.BLACK);
        layout.add(AddReqLabel);

        T6 = new JTextField();
        T6.setBounds(64, 500, 800, 50);
        T6.setFont(new Font("Arial", Font.PLAIN, 12));
        T6.setForeground(Color.BLACK);
        T6.setBackground(new Color(255, 255, 255));
        layout.add(T6);

        JButton LoginButton = new JButton("View Room");
        LoginButton.setBounds(375, 560, 150, 30);
        LoginButton.setForeground(Color.WHITE);
        LoginButton.setBackground(Color.BLACK);
        layout.add(LoginButton);

        ImageIcon imageIcon = new ImageIcon("V.png");
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(670, 10, 200, 200);
        layout.add(label);
               
        setSize(900, 700);
        setTitle("Reserved Room");
        setLayout(null);
        setVisible(true);
        setResizable(false);
           setLocationRelativeTo(null); 
        setLocation(20, 200);
    }
  public static void main(String[] args) {
      
               EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                ReservedRooms roomwan = new ReservedRooms();
                
            }
    
               });
                       }
     
    }

