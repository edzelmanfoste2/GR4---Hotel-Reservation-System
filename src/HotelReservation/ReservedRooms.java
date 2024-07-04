package HotelReservation;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.sql.*;

public class ReservedRooms extends JFrame implements ActionListener {

    JTextField txtFullName, txtEmail, txtPnumber, txtAddress, txtAdditional, txtRoom;
    JComboBox T5;
    //JButton btnViewRoom, btnSubmit;
    JButton btnViewRoom = new JButton("View Room");
    JButton btnSubmit = new JButton("Submit");
    //Checkbox ckbNonSmokin, cbkSmoking, cbkLargeBed, cbkTwinBed;

    ReservedRooms() {
        JPanel layout = new JPanel();
        layout.setBounds(0, 0, 900, 600);
        layout.setBackground(new Color(242, 242, 242));
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

        txtFullName = new JTextField();
        txtFullName.setBounds(200, 60, 156, 20);
        txtFullName.setFont(new Font("Arial", Font.PLAIN, 12));
        txtFullName.setForeground(Color.BLACK);
        txtFullName.setBackground(new Color(255, 255, 255));
        layout.add(txtFullName);

        JLabel roomNumber = new JLabel("Room Number:");
        roomNumber.setBounds(380, 60, 155, 22);
        roomNumber.setFont(new Font("Serif", Font.BOLD, 16));
        roomNumber.setForeground(Color.BLACK);
        layout.add(roomNumber);

        txtRoom = new JTextField();
        txtRoom.setBounds(500, 60, 156, 20);
        txtRoom.setFont(new Font("Arial", Font.PLAIN, 12));
        txtRoom.setForeground(Color.BLACK);
        txtRoom.setBackground(new Color(255, 255, 255));
        layout.add(txtRoom);

        JLabel roomNumLabel = new JLabel("Email:");
        roomNumLabel.setBounds(64, 100, 155, 22);
        roomNumLabel.setFont(new Font("Serif", Font.BOLD, 16));
        roomNumLabel.setForeground(Color.BLACK);
        layout.add(roomNumLabel);

        txtEmail = new JTextField();
        txtEmail.setBounds(200, 100, 156, 20);
        txtEmail.setFont(new Font("Arial", Font.PLAIN, 12));
        txtEmail.setForeground(Color.BLACK);
        txtEmail.setBackground(new Color(255, 255, 255));
        layout.add(txtEmail);

        JLabel checkInLabel = new JLabel("Phone Number: ");
        checkInLabel.setBounds(64, 140, 160, 22);
        checkInLabel.setFont(new Font("Serif", Font.BOLD, 16));
        checkInLabel.setForeground(Color.BLACK);
        layout.add(checkInLabel);

        txtPnumber = new JTextField();
        txtPnumber.setBounds(200, 140, 156, 20);
        txtPnumber.setFont(new Font("Arial", Font.PLAIN, 12));
        txtPnumber.setForeground(Color.BLACK);
        txtPnumber.setBackground(new Color(255, 255, 255));
        layout.add(txtPnumber);

        JLabel checkOutLabel = new JLabel("Address:");
        checkOutLabel.setBounds(64, 180, 190, 22);
        checkOutLabel.setFont(new Font("Serif", Font.BOLD, 16));
        checkOutLabel.setForeground(Color.BLACK);
        layout.add(checkOutLabel);

        txtAddress = new JTextField();
        txtAddress.setBounds(200, 180, 400, 20);
        txtAddress.setFont(new Font("Arial", Font.PLAIN, 14));
        txtAddress.setForeground(Color.BLACK);
        txtAddress.setBackground(new Color(255, 255, 255));
        layout.add(txtAddress);

        JLabel welcomeLabel = new JLabel("Let us know what you need!");
        welcomeLabel.setBounds(64, 220, 250, 22);
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 20));
        welcomeLabel.setForeground(Color.BLACK);
        layout.add(welcomeLabel);

        JLabel AddReqLabel = new JLabel("Additional Request:");
        AddReqLabel.setBounds(64, 470, 300, 22);
        AddReqLabel.setFont(new Font("Serif", Font.BOLD, 16));
        AddReqLabel.setForeground(Color.BLACK);
        layout.add(AddReqLabel);

        txtAdditional = new JTextField();
        txtAdditional.setBounds(64, 500, 800, 50);
        txtAdditional.setFont(new Font("Arial", Font.PLAIN, 12));
        txtAdditional.setForeground(Color.BLACK);
        txtAdditional.setBackground(new Color(255, 255, 255));
        layout.add(txtAdditional);

        //JButton btnViewRoom = new JButton("View Room");
        btnViewRoom.setBounds(275, 560, 150, 30);
        btnViewRoom.setForeground(Color.WHITE);
        btnViewRoom.setBackground(Color.BLACK);
        layout.add(btnViewRoom);

        //JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(485, 560, 150, 30);
        btnSubmit.setForeground(Color.WHITE);
        btnSubmit.setBackground(Color.BLACK);
        layout.add(btnSubmit);

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

        btnViewRoom.addActionListener(this);
        btnSubmit.addActionListener(this);
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        String roomAvailability = null;
        if (e.getSource() == btnViewRoom) {
            dispose();
            //ViewRoomC vr = new ViewRoomC();

        } else if (e.getSource() == btnSubmit) {
            dispose();
            try {
                //Connection to the local database
                Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem", "root", "adminsql");
                System.out.println("Connected to the database");

                //Checking of the status of the room availability
                PreparedStatement checking = connect.prepareStatement("SELECT Availability from tbl_checkinform where RoomNumber = ?");
                checking.setString(1, txtRoom.getText());
                ResultSet resultSet = checking.executeQuery();

                try {
                    if (resultSet.next()) {
                        roomAvailability = resultSet.getString("Availability");
                        System.out.println("Room found, availability: " + roomAvailability);
                    } else {
                        System.out.println("Room not found");
                    }
                    
                    if ("0".equals(roomAvailability)) {
                        //Statement or insertion of data in the check-in form table
                        PreparedStatement preparedStatement = connect.prepareStatement("insert into tbl_checkinform (FName, RoomNumber, Email, PhoneNumber, Address) values(?, ?, ?, ?, ?)");
                        preparedStatement.setString(1, txtFullName.getText());
                        preparedStatement.setString(2, txtRoom.getText());
                        preparedStatement.setString(3, txtEmail.getText());
                        preparedStatement.setString(4, txtPnumber.getText());
                        preparedStatement.setString(5, txtAddress.getText());
                        preparedStatement.executeUpdate();

                        System.out.println("Data inserted successfully");
                        JOptionPane.showMessageDialog(null, "Successfully Submitted");

                        //Statement for updating the availability of the specific room
                        PreparedStatement updateAvailability = connect.prepareStatement("update tbl_checkinform set Availability = 1 where RoomNumber = ?");
                        updateAvailability.setString(1, txtRoom.getText());
                        updateAvailability.executeUpdate();
                    } else if ("1".equals(roomAvailability)) {
                        JOptionPane.showMessageDialog(null, "Room: " + txtRoom.getText() + " is already booked. Check through other of our rooms!");
                   } else {
                        JOptionPane.showMessageDialog(null, "Room: " + txtRoom.getText() + " cannot be found.");                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
//                System.out.println("Data inserted successfully");
//                JOptionPane.showMessageDialog(null, "Successfully Submitted");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error, couldn't connect");
            }
        }
    }
}
