package HotelReservation;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LandingPage implements ActionListener{
    
    private JFrame frame = new JFrame("Landing Page");
    private JButton viewButton= new JButton();
    private JButton cancelButton = new JButton();
    
    LandingPage() {
//Information for the Combobox
        String[] checkIn = {"Check-In Date", "Date", "Date"};
        String[] checkOut = {"Check-out Date", "Date", "Date"};
        String[] occupants = {"1 Adult", "2 Adults", "3 Adults", "4+ Adults"};
        String[] occupantsChild = {"1 Child", "2 Children", "3 Children", "4+ Children"};
        
        
        JLabel label = new JLabel();
        JLabel introduce = new JLabel();
        JLabel description = new JLabel();
        JLabel address = new JLabel();
        
        JLabel logo = new JLabel();
        
        //JButton viewButton= new JButton();
        //JButton cancelButton = new JButton();
        JButton searchButton = new JButton();
        
        JPanel pnlHeader = new JPanel();
        JPanel pnlBody = new JPanel();
        JPanel pnlFooter = new JPanel();
        JPanel pnlLeftBorder = new JPanel();
        JPanel pnlRightBorder = new JPanel();
        
//Comboboxes preference of users
        JComboBox occupancyChild =  new JComboBox(occupantsChild); //Combobox for the number of children
        JComboBox occupancy = new JComboBox(occupants);// Combobox for the number of adult occupants
        JComboBox checkIN = new JComboBox(checkIn);//The check-in date
        JComboBox checkOUT = new JComboBox(checkOut);//The check-out date
       
        checkIN.setBounds(90, 325, 150, 35);
        checkOUT.setBounds(250, 325, 150, 35);
        occupancyChild.setBounds(500, 325, 100, 35);
        occupancy.setBounds(625, 325, 100, 35);
        
        //Button for searching the preferrence of users 
        searchButton.setText("Search");
        searchButton.setBounds(750, 325, 150, 35);
        searchButton.setFocusable(false);
        searchButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
        searchButton.setBackground(Color.ORANGE);
        searchButton.setForeground(Color.BLACK);
        
        ImageIcon hotelLogo = new ImageIcon("C:\\Users\\CASTOR\\Documents\\NetBeansProjects\\HotelReservationSystem\\src\\javaapplication1\\Pictures\\V.png");
        logo.setIcon(hotelLogo);
        logo.setBounds(85, 40, 50, 50);
        
        address.setText("Street Ocampo, Southbreeze, Philippines");
        address.setBounds(150, 45, 400, 75);
        address.setForeground(Color.WHITE);
        address.setFont(new Font("Perpetua", Font.BOLD, 12));
        
        //Button for directing to the cancellation of reservation
        cancelButton.setText("Cancel Reservation");
        cancelButton.setBounds(480, 210, 190, 35);
        cancelButton.setFocusable(false);
        cancelButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
        cancelButton.setBackground(new Color(0x444554));
        cancelButton.setForeground(Color.WHITE);
        
        //Button for viewing the available rooms
        viewButton.setText("Available Rooms");
        viewButton.setBounds(255, 210, 190, 35);
        viewButton.setFocusable(false);
        viewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
        viewButton.setBackground(new Color(0x444554));
        viewButton.setForeground(Color.white);
    
        //label.setText("Hotel Reservation System");
        label.setText("Vix Hotel");
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setBounds(150, 20, 400, 75);
        label.setFont(new Font("Palace Script MT",Font.BOLD,50));
        label.setForeground(Color.WHITE);
        //lable.setIcon(feature);
        
        //Label for the introductory statement for the hotel 
        introduce.setText("Comfort at your Hands");
        introduce.setHorizontalTextPosition(JLabel.CENTER);
        introduce.setVerticalTextPosition(JLabel.CENTER);
        introduce.setBounds(270, 90, 800, 75);
        introduce.setFont(new Font("Pristina", Font.BOLD, 50));
        
        //Label for the hotel reservation description
        description.setText("Where comfort meets innovation. Relax and recharge in our thoughtfully designed rooms.");
        description.setHorizontalTextPosition(JLabel.CENTER);
        description.setVerticalTextPosition(JLabel.CENTER);
        description.setBounds(225, 120, 1050, 105);
        description.setFocusable(false);
        
        //picture.setIcon(feature);
        //picture.setBounds(0, 100, 800, 550);
        
        //Panel for the header
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
        
//Frame of Landing Page
        frame.setSize(1050, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(0xFFFFFF));
        
//adding on the panels and frames
        pnlHeader.add(label);
        pnlHeader.add(logo);
        pnlHeader.add(address);
        
        //panel for the body
        pnlBody.add(introduce);
        pnlBody.add(description);
        pnlBody.add(viewButton);
        pnlBody.add(cancelButton);
        
        pnlBody.add(occupancyChild);
        pnlBody.add(occupancy);
        pnlBody.add(checkIN);
        pnlBody.add(checkOUT);
        
        pnlBody.add(searchButton);
   
        frame.add(pnlHeader, BorderLayout.NORTH);
        frame.add(pnlBody, BorderLayout.CENTER);
        frame.add(pnlFooter, BorderLayout.SOUTH);
        frame.add(pnlLeftBorder, BorderLayout. WEST);
        frame.add(pnlRightBorder, BorderLayout.EAST);
        frame.setVisible(true);
        
        cancelButton.addActionListener(this);
        viewButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == viewButton) {
            
            avail101 AV1 = new avail101();
            frame.dispose();
            
        } else if (e.getSource() == cancelButton) {
            
            CancelReservation reserveCancel = new CancelReservation();
            frame.dispose();
        }
    }
}
