package HotelReservation;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ReservedRooms extends JFrame {
    JTextField T1, T2, T3, T4;
    JComboBox T5;
  

    ReservedRooms() {
        JPanel layout = new JPanel();
        layout.setBounds(0, 0, 900, 600);
        layout.setBackground(Color.WHITE);
        layout.setLayout(null);
        add(layout);

        JPanel headerLine = new JPanel();
        headerLine.setBounds(0, 0, 900, 10);
        headerLine.setBackground(new Color(23, 33, 35));
        layout.add(headerLine);

        JLabel reservedRoomsLabel = new JLabel("Reserved Rooms");
        reservedRoomsLabel.setBounds(350, 20, 200, 32);
        reservedRoomsLabel.setFont(new Font("Pristina", Font.BOLD, 32));
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

        JLabel checkInLabel = new JLabel("Re-enter email: ");
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

        JLabel checkOutLabel = new JLabel("Phone number:");
        checkOutLabel.setBounds(64, 180, 160, 22);
        checkOutLabel.setFont(new Font("Serif", Font.BOLD, 16));
        checkOutLabel.setForeground(Color.BLACK);
        layout.add(checkOutLabel);
        
        T4 = new JTextField();
        T4.setBounds(200, 180, 156, 20);
        T4.setFont(new Font("Calibri", Font.PLAIN, 14));
        T4.setForeground(Color.BLACK);
        T4.setBackground(new Color(255, 255, 255));
        layout.add(T4);

        JLabel confirmLabel = new JLabel("Region:");
        confirmLabel.setBounds(400, 180, 160, 22);
        confirmLabel.setFont(new Font("Serif", Font.BOLD, 16));
        confirmLabel.setForeground(Color.BLACK);
        layout.add(confirmLabel);
       
        T5 = new JComboBox(new String []{"REGION 1 - ILOCOS", "REGION 2 - CAR", "REGION 3 - CENTRAL LUZON", "REGION 4-A /CALABARZON","REGION 4-B / MIMIROPA", "REGION 5 - BICOL","REGION 6 - WESTERN VISAYAS ", "REGION 7 - CENTRAL VISAYAS", "REGION 8 - EASTERN VISAYAS", "REGION 9 - ZAMBOANGA PENINSULA", "REGION 10 - NORTHERN MINDANAO", "REGION 11 - DAVAO REGION", "REGION 12 - SOCCSKSARGEN", "REGION 13 - CARAGA", "REGION 14 - BARMM"});
        T5.setBounds(460, 180, 200, 20);
        T5.setFont(new Font("Arial", Font.PLAIN, 12));
        T5.setForeground(Color.BLACK);
        T5.setBackground(new Color(255, 255, 255));
        layout.add(T5);
      

        setSize(900, 600);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setLocation(20, 200);
    }
   
    }

