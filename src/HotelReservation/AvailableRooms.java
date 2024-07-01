/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelReservation;

import java.awt.Color;
import java.awt.Font;    
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class AvailableRooms extends JFrame implements ActionListener{

    JButton checkin = new JButton("Check-in");
    JButton viewroom = new JButton("View Room");
    JButton checkin2 = new JButton("Check-in");
    JButton viewroom2 = new JButton("View Room");
    
    public AvailableRooms() {   
      
      JLabel roomheader2 = new JLabel("ROOM 101 - DELUXE SUITE TWIN");
      add(roomheader2);
      roomheader2.setFont(new Font("Serif", Font.PLAIN, 30));
      roomheader2.setBounds(10, 2, 500, 50);
      
      //FOR 101 PANELS
      
      JPanel navyblue = new JPanel();
      navyblue.setBackground(new Color(23, 33, 35));
      navyblue.setBounds(10,50,300,40);
      add(navyblue);
      
       JLabel pax = new JLabel();
      pax.setText("For 3 and more pax");
      pax.setFont(new Font("Serif", Font.PLAIN, 20));
      pax.setForeground(Color.white);
      add(pax);
      
       JPanel navyblue2 = new JPanel();
      navyblue2.setBackground(new Color(23, 33, 35));
      navyblue2.setBounds(350,50,300,40);
      add(navyblue2);
      
        JLabel benefits = new JLabel();
      benefits.setText("Benefits");
      benefits.setFont(new Font("Serif", Font.PLAIN, 20));
      benefits.setForeground(Color.white);
      add(benefits);
      
      JPanel navyblue3 = new JPanel();
      navyblue3.setBackground(new Color(23, 33, 35));
      navyblue3.setBounds(690,50,300,40);
      add(navyblue3);
      
        JLabel prices = new JLabel();
      prices.setText("Price per night");
      prices.setFont(new Font("Serif", Font.PLAIN, 20));
      prices.setForeground(Color.white);
      add(prices);
      
         JPanel red = new JPanel();
      red.setBackground(new Color(255, 0, 0));
      red.setBounds(690,95,110,25);
      add(red);
      
        JLabel prices2 = new JLabel();
      prices2.setText("SAVE 44% TODAY!");
      prices2.setFont(new Font("Serif", Font.PLAIN, 12));
      prices2.setForeground(Color.white);
      add(prices2);
      
       JPanel navyblue4 = new JPanel();
      navyblue4.setBackground(new Color(23, 33, 35));
      navyblue4.setBounds(1030,50,250,40);
      add(navyblue4);
      
        JLabel booking = new JLabel();
      booking.setText("Most Booked");
      booking.setFont(new Font("Serif", Font.PLAIN, 20));
      booking.setForeground(Color.white);
      add(booking);
      
      
     //FOR ROOM 102 PANELS
     
       JPanel navyblue01 = new JPanel();
      navyblue01.setBackground(new Color(23, 33, 35));
      navyblue01.setBounds(10,368,300,40);
      add(navyblue01);
      
       JLabel pax2 = new JLabel();
      pax2.setText("For 3 and more pax");
      pax2.setFont(new Font("Serif", Font.PLAIN, 20));
      pax2.setForeground(Color.white);
      add(pax2);
      
       JPanel navyblue02 = new JPanel();
      navyblue02.setBackground(new Color(23, 33, 35));
      navyblue02.setBounds(350,368,300,40);
      add(navyblue02);
      
        JLabel benefits02 = new JLabel();
      benefits02.setText("Benefits");
      benefits02.setFont(new Font("Serif", Font.PLAIN, 20));
      benefits02.setForeground(Color.white);
      add(benefits02);
      
         JPanel navyblue03 = new JPanel();
      navyblue03.setBackground(new Color(23, 33, 35));
      navyblue03.setBounds(690,368,300,40);
      add(navyblue03);
      
        JLabel prices01 = new JLabel();
      prices01.setText("Price per night");
      prices01.setFont(new Font("Serif", Font.PLAIN, 20));
      prices01.setForeground(Color.white);
      add(prices01);
      
         JPanel red2 = new JPanel();
      red2.setBackground(new Color(255, 0, 0));
      red2.setBounds(690,413,110,25);
      add(red2);
      
        JLabel prices02 = new JLabel();
      prices02.setText("SAVE 46% TODAY!");
      prices02.setFont(new Font("Serif", Font.PLAIN, 12));
      prices02.setForeground(Color.white);
      add(prices02);
      
         JPanel navyblue04 = new JPanel();
      navyblue04.setBackground(new Color(23, 33, 35));
      navyblue04.setBounds(1030,368,250,40);
      add(navyblue04);
      
        JLabel booking2 = new JLabel();
      booking2.setText("Most Booked");
      booking2.setFont(new Font("Serif", Font.PLAIN, 20));
      booking2.setForeground(Color.white);
      add(booking2);
      
      
      // For 3 AND MORE PAX PANEL
      JLabel bed= new JLabel();
      bed.setText("2 Single beds");
      bed.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(bed);
      bed.setBounds(30,60, 500, 90);
      
      JLabel roomsize = new JLabel();
      roomsize.setText("Property Size: 45.6 ㎡/484 ft²");
      roomsize.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(roomsize);
      roomsize.setBounds(30, 90, 500, 90);
      
      JLabel info = new JLabel();
      info.setText("Non-smoking");
      info.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(info);
      info.setBounds(30,120, 500, 90);
      
      JLabel view = new JLabel();
      view.setText("Shower");
      view.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(view);
      view.setBounds(30,180, 500, 90);
      
       JLabel bth = new JLabel();
      bth.setText("City View ");
      bth.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(bth);
      bth.setBounds(30,150, 500, 90);
      
      //BENEFITS PANEL
       JLabel price = new JLabel();
      price.setText("Your price includes:");
      price.setFont(new Font("broadway", Font.PLAIN, 20));
      add(price);
      price.setBounds(370,60, 500, 90);
      
       JLabel price2 = new JLabel();
      price2.setText(" ✔ Extra low price! (non-refundable)");
      price2.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(price2);
      price2.setBounds(370, 90, 500, 90);
      
      JLabel wifi = new JLabel();
      wifi.setText(" ✔ Free Wi-Fi");
      wifi.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(wifi);
      wifi.setBounds(370,120, 500, 90);
      
       JLabel options = new JLabel();
      options.setText("Optional benefit:");
      options.setFont(new Font("broadway", Font.PLAIN, 20));
      add(options);
      options.setBounds(370,150, 500, 90);
      
         JLabel bf = new JLabel();
      bf.setText(" ✔ Breakfast at ₱5,160");
      bf.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(bf);
      bf.setBounds(370,180, 500, 90);
      
       JLabel rewards = new JLabel();
      rewards.setText("Other rewards & discounts");
      rewards.setFont(new Font("broadway", Font.PLAIN, 20));
      add(rewards);
      rewards.setBounds(370,210, 500, 90);
      
      JLabel rewards2 = new JLabel();
      rewards2.setText("Cash back & Rewards:₱20");
      rewards2.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(rewards2);
      rewards2.setBounds(370,240, 500, 90);
      
      //PRICE PER NIGHT PANEL
       JLabel prc = new JLabel();
      prc.setText(" ̶₱̶ ̶1̶2̶,̶7̶8̶1̶");
      prc.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(prc);
      prc.setBounds(730, 90, 500, 90);
      
       JLabel prc2 = new JLabel();
      prc2.setText("Subject to Cashback Terms");
      prc2.setFont(new Font("broadway", Font.PLAIN, 20));
      add(prc2);
      prc2.setBounds(690,130, 500, 90);
      
       JLabel prc3 = new JLabel();
      prc3.setText("₱7,154");
      prc3.setFont(new Font("Times Bold", Font.PLAIN, 25));
      add(prc3);
      prc3.setBounds(690,160, 500, 90);
      
      //FOR ROOM 102(FOR 3 AND MORE PAX) INFO
      
       JLabel roomtype = new JLabel();
      roomtype.setText("ROOM 102- PREMIER EXECUTIVE SUITE");
      roomtype.setFont(new Font("Serif", Font.PLAIN, 30));
      add(roomtype);
      roomtype.setBounds(10, 320, 600, 50);
      
        //FOR ROOM 102(FOR 3 AND MORE PAX) INFO
        
        JLabel roomdetails = new JLabel();
      roomdetails.setText("1 king bed");
      roomdetails.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(roomdetails);
      roomdetails.setBounds(30,378, 500, 90);
      
       JLabel roomdetails2 = new JLabel();
      roomdetails2.setText("Property size: 73㎡/786 ft²");
      roomdetails2.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(roomdetails2);
      roomdetails2.setBounds(30,408, 500, 90);
      
       JLabel city = new JLabel();
      city.setText("City View ");
      city.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(city);
      city.setBounds(30,438, 500, 90);
      
       JLabel smoke = new JLabel();
      smoke.setText("Non-smoking");
      smoke.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(smoke);
      smoke.setBounds(30,468, 500, 90);
      
       JLabel shower = new JLabel();
      shower.setText("Shower");
      shower.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(shower);
      shower.setBounds(30,498, 500, 90);
      
      //BENEFITS PANEL
      
        JLabel price01 = new JLabel();
      price01.setText("Your price includes:");
      price01.setFont(new Font("broadway", Font.PLAIN, 20));
      add(price01);
      price01.setBounds(370,378, 500, 90);
      
      JLabel price02 = new JLabel();
      price02.setText(" ✔ Cancellation Policy");
      price02.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(price02);
      price02.setBounds(370, 408, 500, 90);
      
      JLabel wifi2 = new JLabel();
      wifi2.setText(" ✔ Free Wi-Fi");
      wifi2.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(wifi2);
      wifi2.setBounds(370,438, 500, 90);
      
       JLabel options2 = new JLabel();
      options2.setText("Optional benefit:");
      options2.setFont(new Font("broadway", Font.PLAIN, 20));
      add(options2);
      options2.setBounds(370,468, 500, 90);
      
        JLabel bf2 = new JLabel();
      bf2.setText(" ✔ Breakfast at ₱5,160");
      bf2.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(bf2);
      bf2.setBounds(370,498, 500, 90);
      
      //PRICE PER NIGHT
      
      JLabel prc02 = new JLabel();
      prc02.setText(" ̶₱̶ ̶1̶5̶,̶4̶3̶0̶");
      prc02.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(prc02);
      prc02.setBounds(730, 408, 500, 90);
      
          JLabel prc4 = new JLabel();
      prc4.setText("₱8,404");
      prc4.setFont(new Font("Times Bold", Font.PLAIN, 25));
      add(prc4);
      prc4.setBounds(690,438, 500, 90);
      
      //JButton checkin = new JButton("Check-in");
      checkin.setFont(new Font("Serif", Font.PLAIN, 20));
              add(checkin);
              checkin.setBounds(1090, 120, 150, 50);     
                checkin.setBackground(new Color(23, 33, 35));
                checkin.setForeground(Color.WHITE);
              
      //JButton viewroom = new JButton("View Room");
                  viewroom.setFont(new Font("Serif", Font.PLAIN, 20));
              add(viewroom);
              viewroom.setBounds(1090, 200, 150, 50);
              viewroom.setBackground(new Color(23, 33, 35));
              viewroom.setForeground(Color.WHITE);
                
      //JButton checkin2 = new JButton("Check-in");
      checkin2.setFont(new Font("Serif", Font.PLAIN, 20));
              add(checkin2);
              checkin2.setBounds(1090, 438, 150, 50);     
                checkin2.setBackground(new Color(23, 33, 35));
                checkin2.setForeground(Color.WHITE);
              
      //JButton viewroom2 = new JButton("View Room");
                  viewroom2.setFont(new Font("Serif", Font.PLAIN, 20));
              add(viewroom2);
              viewroom2.setBounds(1090, 518, 150, 50);
              viewroom2.setBackground(new Color(23, 33, 35));
              viewroom2.setForeground(Color.WHITE);
              
              //BORDER PANEL
              
              JPanel border = new JPanel();
      border.setBackground(new Color(23, 33, 35));
      border.setBounds(0,630,1300,40);
      add(border);
              
      setTitle("Available Rooms");
      setSize(1300,700);
      setLayout(null);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      getContentPane().setBackground(new Color(255, 255,255));
      navyblue.add(pax);
      navyblue2.add(benefits);
      navyblue3.add(prices);
      red.add(prices2);
      navyblue4.add(booking);
      navyblue01.add(pax2);
      navyblue02.add(benefits02);
      navyblue03.add(prices01);
      red2.add(prices02);
      navyblue04.add(booking2);

     checkin.addActionListener(this);
     viewroom.addActionListener(this);
     checkin2.addActionListener(this);
     viewroom2.addActionListener(this);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if (e.getSource() == checkin) 
        {
         dispose();
         ReservedRooms rs = new ReservedRooms();
         rs.setVisible(true);   
        } 
        else if (e.getSource() == viewroom) 
        {
            dispose();
            ViewRoomC vr = new ViewRoomC();
            
        } 
        else if (e.getSource() == checkin2) 
        {
         dispose();
         ReservedRooms rs = new ReservedRooms();
         rs.setVisible(true);   
        } 
        else if (e.getSource() == viewroom2) 
        {
            dispose();
            ViewRoomC vr = new ViewRoomC();
            
        }
    }
}