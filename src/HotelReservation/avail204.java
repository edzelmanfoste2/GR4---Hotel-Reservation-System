package HotelReservation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class avail204 extends JFrame implements ActionListener{
    private JButton back, checkin, viewroom, next;
    
    public avail204(){
          JPanel navyblue01 = new JPanel();
      navyblue01.setBackground(new Color(23, 33, 35));
      navyblue01.setBounds(10,50,300,40);
      add(navyblue01);
      
       JLabel pax2 = new JLabel();
      pax2.setText("For 3 and more pax");
      pax2.setFont(new Font("Serif", Font.PLAIN, 20));
      pax2.setForeground(Color.white);
      add(pax2);
      
       JPanel navyblue02 = new JPanel();
      navyblue02.setBackground(new Color(23, 33, 35));
      navyblue02.setBounds(350,50,300,40);
      add(navyblue02);
      
        JLabel benefits02 = new JLabel();
      benefits02.setText("Benefits");
      benefits02.setFont(new Font("Serif", Font.PLAIN, 20));
      benefits02.setForeground(Color.white);
      add(benefits02);
      
         JPanel navyblue03 = new JPanel();
      navyblue03.setBackground(new Color(23, 33, 35));
      navyblue03.setBounds(690,50,300,40);
      add(navyblue03);
      
        JLabel prices01 = new JLabel();
      prices01.setText("Price per night");
      prices01.setFont(new Font("Serif", Font.PLAIN, 20));
      prices01.setForeground(Color.white);
      add(prices01);
      
      
      
         JPanel navyblue04 = new JPanel();
      navyblue04.setBackground(new Color(23, 33, 35));
      navyblue04.setBounds(1030,50,250,40);
      add(navyblue04);
      
        JLabel booking2 = new JLabel();
      booking2.setText("Most Booked");
      booking2.setFont(new Font("Serif", Font.PLAIN, 20));
      booking2.setForeground(Color.white);
      add(booking2);
        
         JLabel roomtype = new JLabel();
      roomtype.setText("ROOM 204 - SUPERIOR ROOM");
      roomtype.setFont(new Font("Serif", Font.BOLD, 30));
      add(roomtype);
      roomtype.setBounds(10, 2, 700, 50);
      roomtype.setForeground(Color.black);

      
        //FOR ROOM 204(FOR 3 AND MORE PAX) INFO
        
        JLabel roomdetails = new JLabel();
      roomdetails.setText("1 Queen bed with luxury lines");
      roomdetails.setFont(new Font("Waverly", Font.BOLD, 15));
      add(roomdetails);
      roomdetails.setBounds(10,60, 500, 90);
      roomdetails.setForeground(Color.black);
    
      
       JLabel roomdetails2 = new JLabel();
      roomdetails2.setText("En-suite bathroom with Jacuzzi tub");
      roomdetails2.setFont(new Font("Waverly", Font.BOLD, 15));
      add(roomdetails2);
      roomdetails2.setBounds(10,90, 500, 90);
    roomdetails2.setForeground(Color.black);
    
    
       JLabel roomdetails3 = new JLabel();
      roomdetails3.setText("and rain shower");
      roomdetails3.setFont(new Font("Waverly", Font.BOLD, 15));
      add(roomdetails3);
      roomdetails3.setBounds(10,120, 500, 90);
    roomdetails3.setForeground(Color.black);
      
      
       JLabel city = new JLabel();
      city.setText("Work desk with chair");
      city.setFont(new Font("Waverly", Font.BOLD, 15));
      add(city);
      city.setBounds(10,150, 500, 90);
        city.setForeground(Color.black);
      
       JLabel smoke = new JLabel();
      smoke.setText("Balcony with garden view");
      smoke.setFont(new Font("Waverly", Font.BOLD, 15));
      add(smoke);
      smoke.setBounds(10,180, 500, 90);
            smoke.setForeground(Color.black);
    
      //BENEFITS PANEL
      
        JLabel price01 = new JLabel();
      price01.setText("Your price includes:");
      price01.setFont(new Font("broadway", Font.PLAIN, 20));
      add(price01);
      price01.setBounds(400,60, 500, 90);
              price01.setForeground(Color.black);
      
      JLabel price02 = new JLabel();
      price02.setText("Complimentary bottled water");
      price02.setFont(new Font("Waverly", Font.BOLD, 15));
      add(price02);
      price02.setBounds(400,90, 500, 90);
       price02.setForeground(Color.black);
      
      JLabel wifi2 = new JLabel();
      wifi2.setText("Free Wi-Fi and In-room safe");
      wifi2.setFont(new Font("Waverly", Font.BOLD, 15));
      add(wifi2);
      wifi2.setBounds(400,120, 500, 90);
           wifi2.setForeground(Color.black);
      
      JLabel mbar = new JLabel();
      mbar.setText("Mini bar with refreshments");
      mbar.setFont(new Font("Waverly", Font.BOLD, 15));
      add(mbar);
      mbar.setBounds(400,150, 500, 90);
              mbar.setForeground(Color.black);
      
      JLabel tv = new JLabel();
      tv.setText("50 inch flat screen TV with satelite channels");
      tv.setFont(new Font("Waverly", Font.BOLD, 15));
      add(tv);
      tv.setBounds(400,180, 500, 90);
          tv.setForeground(Color.black);
      
      
       JLabel options2 = new JLabel();
      options2.setText("Conffee maker and tea set");
      options2.setFont(new Font("Waverly", Font.BOLD, 15));
      add(options2);
      options2.setBounds(400,210, 500, 90);
            options2.setForeground(Color.black);
      
        JLabel bf2 = new JLabel();
      bf2.setText("Air conditioning and heating");
      bf2.setFont(new Font("Waverly", Font.BOLD, 15));
      add(bf2);
      bf2.setBounds(400,240, 500, 90);
          bf2.setForeground(Color.black);
      
      JLabel water2 = new JLabel();
      water2.setText("Daily housekeeping");
      water2.setFont(new Font("Waverly", Font.BOLD, 15));
      add(water2);
      water2.setBounds(400,270,500, 90);
            water2.setForeground(Color.black);
      
      
      //PRICE PER NIGHT   
         JLabel prc4 = new JLabel();
      prc4.setText("₱ 6,000 per night");
      prc4.setFont(new Font("Times Bold", Font.PLAIN, 25));
      add(prc4);
      prc4.setBounds(730, 80, 500, 90);
            prc4.setForeground(Color.black);
      
      checkin = new JButton("Check-in");
      checkin.setFont(new Font("Serif", Font.BOLD, 20));
              add(checkin);
              checkin.setBounds(1090, 120, 150, 50);     
                checkin.setBackground(new Color(23, 33, 35));
                checkin.setForeground(Color.white);
             
              
              viewroom = new JButton("View Room");
                  viewroom.setFont(new Font("Serif", Font.BOLD, 20));
              add(viewroom);
              viewroom.setBounds(1090, 200, 150, 50);
              viewroom.setBackground(new Color(23, 33, 35));
              viewroom.setForeground(Color.white);
              
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
         
              
                 JPanel border = new JPanel();
      border.setBackground(new Color(23, 33, 35));
      border.setBounds(0,520,1300,60);
      add(border);
      
       //Image
        ImageIcon imageIcon = new ImageIcon("Pictures/room204.jpg");
        Image image = imageIcon.getImage().getScaledInstance(1300, 600, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0, 0, 1300, 600);
        add(label);
              
               setTitle("Available Rooms");
      setSize(1300,600);
      setLayout(null);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      getContentPane().setBackground(new Color(255, 255,255));
      navyblue01.add(pax2);
      navyblue02.add(benefits02);
      navyblue03.add(prices01);
      navyblue04.add(booking2);
        border.add(back);
       border.add(next);
     
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == checkin) {
            
            ReservedRooms reserve = new ReservedRooms();
           dispose();
            
        } else if (e.getSource() == viewroom)  {
            
             room204 reserve = new room204();
            dispose();
        }
         else if (e.getSource() == back)  {
            
             avail203 reserve = new avail203();
            dispose();
        }
        else if (e.getSource() == next)  {
            
             avail205 reserve = new avail205();
            dispose();
        }
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args) {

        new avail204();

    }
}