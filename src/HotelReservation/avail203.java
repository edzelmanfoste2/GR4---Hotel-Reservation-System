package HotelReservation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class avail203 extends JFrame implements ActionListener{
    private JButton back, checkin, viewroom, next;

    public avail203() {   
      
      JLabel roomheader2 = new JLabel("ROOM 203 - PRESIDENTIAL SUTIE");
      add(roomheader2);
      roomheader2.setFont(new Font("Serif", Font.PLAIN, 30));
      roomheader2.setBounds(10, 2, 500, 50);
      
      //FOR 203 PANELS
      
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
      prices2.setText("SAVE 50% TODAY!");
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
      
     
      
      
      // For 3 AND MORE PAX PANEL
      JLabel bed= new JLabel();
      bed.setText("1 king bed with premium bedding");
      bed.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(bed);
      bed.setBounds(10,60, 500, 90);
      
      JLabel roomsize = new JLabel();
      roomsize.setText("Walk-in Closet");
      roomsize.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(roomsize);
      roomsize.setBounds(10, 90, 500, 90);
      
      JLabel info = new JLabel();
      info.setText("Private balcony with ocean view");
      info.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(info);
      info.setBounds(10,120, 500, 90);
      
      JLabel view = new JLabel();
      view.setText("En-suite bathroom with Jacuzzi tub and rain shower");
      view.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(view);
      view.setBounds(10,180, 500, 90);
      
       JLabel bth = new JLabel();
      bth.setText("Separate living and dining area ");
      bth.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(bth);
      bth.setBounds(10,150, 500, 90);
          
      //BENEFITS PANEL
       JLabel price = new JLabel();
      price.setText("Your price includes:");
      price.setFont(new Font("broadway", Font.PLAIN, 20));
      add(price);
      price.setBounds(370,60, 500, 90);
      
       JLabel price2 = new JLabel();
      price2.setText("In-room safe");
      price2.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(price2);
      price2.setBounds(370, 90, 500, 90);
      
      JLabel wifi = new JLabel();
      wifi.setText("Free Wi-Fi");
      wifi.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(wifi);
      wifi.setBounds(370,120, 500, 90);
      
       JLabel options = new JLabel();
      options.setText("75-inch flat screen TV with streaming services");
      options.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(options);
      options.setBounds(370,150, 500, 90);
      
         JLabel bf = new JLabel();
      bf.setText("Air conditioning and heating");
      bf.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(bf);
      bf.setBounds(370,180, 500, 90);
      
       JLabel rewards = new JLabel();
      rewards.setText("Nespresso coffee maker and tea set");
      rewards.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(rewards);
      rewards.setBounds(370,210, 500, 90);
      
      JLabel rewards2 = new JLabel();
      rewards2.setText("Daily housekeeping and turndown service");
      rewards2.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(rewards2);
      rewards2.setBounds(370,240, 500, 90);
      
      JLabel water = new JLabel();
      water.setText("Complimentary bottled water and welcome champagne");
      water.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(water);
      water.setBounds(370,270, 500, 90);
      
      //PRICE PER NIGHT PANEL
       JLabel prc = new JLabel();
      prc.setText(" ̶₱̶ ̶4̶0̶,̶0̶0̶0̶");
      prc.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(prc);
      prc.setBounds(730, 90, 500, 90);
        
       JLabel prc3 = new JLabel();
      prc3.setText("₱ 20,000 per night");
      prc3.setFont(new Font("Times Bold", Font.PLAIN, 25));
      add(prc3);
      prc3.setBounds(700,130, 500, 90);
      
      
      checkin = new JButton("Check-in");
      checkin.setFont(new Font("Serif", Font.PLAIN, 20));
              add(checkin);
              checkin.setBounds(1090, 120, 150, 50);     
                checkin.setBackground(new Color(23, 33, 35));
                checkin.setForeground(Color.WHITE);
              
             viewroom = new JButton("View Room");
                  viewroom.setFont(new Font("Serif", Font.PLAIN, 20));
              add(viewroom);
              viewroom.setBounds(1090, 200, 150, 50);
              viewroom.setBackground(new Color(23, 33, 35));
              viewroom.setForeground(Color.WHITE);
              
              back = new JButton();
        back.setText("Back");
        back.setBounds(1000, 600, 100, 40);
        back.setFont(new Font("Sitka Small", Font.BOLD, 15));
        back.setForeground(Color.WHITE);
        back.setOpaque(true);
        back.setBackground(new Color(0x2F3645));
        add(back);

        next = new JButton();
        next.setText("Next");
        next.setBounds(1300, 600, 100, 40);
        next.setFont(new Font("Sitka Small", Font.BOLD, 15));
        next.setForeground(Color.WHITE);
        next.setOpaque(true);
        next.setBackground(new Color(0x2F3645));
        add(next);

              
              viewroom.addActionListener(this);
        checkin.addActionListener(this);
        back.addActionListener(this);
        next.addActionListener(this);
              
              
              //BORDER PANEL
              
              JPanel border = new JPanel();
      border.setBackground(new Color(23, 33, 35));
      border.setBounds(0,520,1300,60);
      add(border);
      
        //Image
        ImageIcon imageIcon = new ImageIcon("Pictures/room203.jpg");
        Image image = imageIcon.getImage().getScaledInstance(1300, 800, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0, 0, 1300, 800);
        add(label);
              
              
      setTitle("Available Rooms");
      setSize(1300,600);
      setLayout(null);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      getContentPane().setBackground(new Color(255, 255,255));
      navyblue.add(pax);
      navyblue2.add(benefits);
      navyblue3.add(prices);
      red.add(prices2);
      navyblue4.add(booking);
        border.add(back);
              border.add(next);


     
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == checkin) {
            
            ReservedRooms reserve = new ReservedRooms();
           dispose();
            
        } else if (e.getSource() == viewroom)  {
            
             room203 reserve = new room203();
            dispose();
        }
         else if (e.getSource() == back)  {
            
             avail202 reserve = new avail202();
            dispose();
        }
        else if (e.getSource() == next)  {
            
             avail204 reserve = new avail204();
            dispose();
        }
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {

        new avail203();

    }
}