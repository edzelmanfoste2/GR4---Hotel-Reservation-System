/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelReservation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author CASTOR
 */
public class CancelReservation extends JFrame implements ActionListener{
    
    Connection connect = null;
    PreparedStatement pst = null;
    
    private JFrame frame = new JFrame("Cancel Reservation");
    
       JButton submitButton = new JButton();
       JButton btnReturn = new JButton();
       private JTextField fnameText = new JTextField();
       private JTextField lnameText = new JTextField();
       private JTextField reservationText = new JTextField();
       private JTextField reasonText = new JTextField();
    
    CancelReservation() {
       
       JLabel label = new JLabel();
       JLabel address = new JLabel();
       JLabel logo = new JLabel();
       JLabel cancel = new JLabel();
       
       JPanel pnlHeader = new JPanel();
       JPanel pnlBody = new JPanel();
       JPanel pnlFooter = new JPanel();
       JPanel pnlLeftBorder = new JPanel();
       JPanel pnlRightBorder = new JPanel();
       
       JLabel fnameLabel = new JLabel();
       JLabel lnameLabel = new JLabel();
       JLabel reservationLabel = new JLabel();
       JLabel reasonLabel = new JLabel();
       
       ImageIcon hotelLogo = new ImageIcon("C:\\Users\\CASTOR\\Documents\\NetBeansProjects\\HotelReservationSystem\\src\\javaapplication1\\Pictures\\V.png");
       logo.setIcon(hotelLogo);
       logo.setBounds(85, 40, 50, 50);

// Hotel Reservation Header
       label.setText("Vix Hotel");
       label.setHorizontalTextPosition(JLabel.RIGHT);
       label.setVerticalTextPosition(JLabel.TOP);
       label.setBounds(150, 20, 400, 75);
       label.setFont(new Font("Palace Script MT",Font.BOLD,50));
       label.setForeground(Color.WHITE);

//Address of the Hotel
       address.setText("Street Ocampo, Southbreeze, Philippines");
       address.setBounds(150, 45, 400, 75);
       address.setForeground(Color.WHITE);
       address.setFont(new Font("Perpetua", Font.BOLD, 12));
       
//Hotel Reservation Cancellation Form
       cancel.setText("Cancel Reservation Form");
       cancel.setBounds(350, 0, 300, 100);
       cancel.setFocusable(false);
       cancel.setFont(new Font("TW Cent MT", Font.BOLD, 20));
       
//The Cancellation form informations needed
       fnameLabel.setText("First Name");
       fnameLabel.setBounds(150, 80, 200, 35);
       fnameText.setBounds(150, 120, 300, 35);
       
       lnameLabel.setText("Last Name"); //The Cancellation form informations needed
       lnameLabel.setBounds(500, 80, 200, 35);
       lnameText.setBounds(500, 120, 300, 35);
       
       reservationLabel.setText("Reservation Number");
       reservationLabel.setBounds(150, 165, 200, 35);
       reservationText.setBounds(150, 200, 650, 35);
       
       reasonLabel.setText("Reason for Cancelation");
       reasonLabel.setBounds(150, 250, 200, 35);
       reasonText.setBounds(150, 290, 650, 50);
       
//Button for submitting
       //JButton submitButton = new JButton();
       submitButton.setBounds(420, 400, 100, 30);
       submitButton.setText("Submit");
       submitButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
       submitButton.setBackground(Color.GREEN);
       
//Button for returning to the Landing Page
       //JButton btnReturn = new JButton();
       btnReturn.setBounds(520, 400, 100, 30);
       btnReturn.setText("Back");
       btnReturn.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
       btnReturn.setBackground(Color.GREEN);
        

//The panel body for the header
       pnlHeader.setLayout(null);
       pnlHeader.setBackground(new Color(23, 33, 35));
       pnlHeader.setPreferredSize(new Dimension(100, 120));
        
        //The body of the reservation system
       pnlBody.setLayout(null);
       pnlBody.setPreferredSize(new Dimension(200, 100));
       pnlBody.setBackground(new Color(255, 255, 255));
        
        //The footer of the reservation system
       pnlFooter.setPreferredSize(new Dimension(300, 50));
       pnlFooter.setBackground(new Color(23, 33, 33));
        
        //Borders of the each side
       pnlLeftBorder.setLayout(null);
       pnlLeftBorder.setPreferredSize(new Dimension(50, 50));
       pnlLeftBorder.setBackground(new Color(255, 255, 255));
        
       pnlRightBorder.setLayout(null);
       pnlRightBorder.setPreferredSize(new Dimension(50, 50));
       pnlRightBorder.setBackground(new Color(255, 255, 255));
       
       pnlHeader.add(label);
       pnlHeader.add(logo);
       pnlHeader.add(address);
       
       pnlBody.add(cancel);
       pnlBody.add(fnameLabel);
       pnlBody.add(lnameLabel);
       pnlBody.add(fnameText);
       pnlBody.add(lnameText);
       pnlBody.add(reservationLabel);
       pnlBody.add(reservationText);
       pnlBody.add(reasonLabel);
       pnlBody.add(reasonText);
       pnlBody.add(submitButton);
       pnlBody.add(btnReturn);
       
       frame.setSize(1050, 700);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(new BorderLayout());
       frame.getContentPane().setBackground(new Color(0xFFFFFF));
       frame.add(pnlHeader, BorderLayout.NORTH);
       frame.add(pnlBody, BorderLayout.CENTER);
       frame.add(pnlFooter, BorderLayout.SOUTH);
       frame.add(pnlLeftBorder, BorderLayout. WEST);
       frame.add(pnlRightBorder, BorderLayout.EAST);
       frame.setVisible(true);
       
       submitButton.addActionListener(this);
       btnReturn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cancelform", "root", "adminsql");
            System.out.println("Connected to the database");
            
            PreparedStatement preparedStatement = connect.prepareStatement("insert into tbl_cancellation values(?, ?, ?, ?)");
                    
                    preparedStatement.setString(1, fnameText.getText());
                    preparedStatement.setString(2, lnameText.getText());
                    preparedStatement.setString(3, reservationText.getText());
                    preparedStatement.setString(4, reasonText.getText());
                    preparedStatement.executeUpdate();
                    
           System.out.println("Data inserted successfully");
           JOptionPane.showMessageDialog(null, "Cancel Form Successfully Submitted");
            
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    } else if (e.getSource() == btnReturn) {
            frame.dispose();
            LandingPage lp = new LandingPage();
        }             
        }
    }
    
