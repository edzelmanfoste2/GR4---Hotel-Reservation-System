package HotelReservation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class avail104 extends JFrame implements ActionListener {
        private JButton back,booknow,viewroom,next;

    public avail104() {
   
       
        JLabel header = new JLabel("ROOM 104 - TWIN ROOM");
      add(header);
      header.setFont(new Font("Serif", Font.PLAIN, 30));
      header.setBounds(10, 2, 500, 50);
             header.setForeground(Color.WHITE); 
             
      //FOR 103 PANELS
      
      JPanel color = new JPanel();
      color.setBackground(new Color(23, 33, 35));
      color.setBounds(10,50,300,40);
      add(color);
             color.setForeground(Color.WHITE); 
             
       JLabel pax = new JLabel();
      pax.setText("For 1-2 pax only");
      pax.setFont(new Font("Serif", Font.PLAIN, 20));
      pax.setForeground(Color.white);
      add(pax);
             pax.setForeground(Color.WHITE); 
             
       JPanel color2 = new JPanel();
      color2.setBackground(new Color(23, 33, 35));
      color2.setBounds(350,50,300,40);
      add(color2);
             color2.setForeground(Color.WHITE); 
             
        JLabel benefits = new JLabel();
      benefits.setText("Benefits");
      benefits.setFont(new Font("Serif", Font.PLAIN, 20));
      benefits.setForeground(Color.white);
      add(benefits);
             benefits.setForeground(Color.WHITE); 
             
      JPanel color3 = new JPanel();
      color3.setBackground(new Color(23, 33, 35));
      color3.setBounds(690,50,300,40);
      add(color3);
             color3.setForeground(Color.WHITE); 
             
        JLabel prices = new JLabel();
      prices.setText("Price per night");
      prices.setFont(new Font("Serif", Font.PLAIN, 20));
      prices.setForeground(Color.white);
      add(prices);
             prices.setForeground(Color.WHITE); 
             
         JPanel red = new JPanel();
      red.setBackground(new Color(255, 0, 0));
      red.setBounds(690,95,110,25);
      add(red);
             red.setForeground(Color.WHITE); 
             
        JLabel prices2 = new JLabel();
      prices2.setText("SAVE 67% TODAY!");
      prices2.setFont(new Font("Serif", Font.PLAIN, 12));
      prices2.setForeground(Color.white);
      add(prices2);
             prices2.setForeground(Color.WHITE); 
             
       JPanel color4 = new JPanel();
      color4.setBackground(new Color(23, 33, 35));
      color4.setBounds(1030,50,250,40);
      add(color4);
             color4.setForeground(Color.WHITE); 
             
        JLabel booked = new JLabel();
      booked.setText("Most Booked");
      booked.setFont(new Font("Serif", Font.PLAIN, 20));
      booked.setForeground(Color.white);
      add(booked);
            booked.setForeground(Color.WHITE); 
            
      // For 1-2 PAX ONLY
      JLabel bed= new JLabel();
      bed.setText("1 queen bed");
      bed.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(bed);
      bed.setBounds(30,60, 500, 90);
             bed.setForeground(Color.WHITE); 
             
      JLabel roomsize = new JLabel();
      roomsize.setText("Property Size: 21 ㎡/226 ft²");
      roomsize.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(roomsize);
      roomsize.setBounds(30, 90, 500, 90);
             roomsize.setForeground(Color.WHITE); 
             
      JLabel cv = new JLabel();
      cv.setText("City view");
      cv.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(cv);
      cv.setBounds(30,120, 500, 90);
              cv.setForeground(Color.WHITE); 
              
      JLabel sh = new JLabel();
      sh.setText("Shower");
      sh.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(sh);
      sh.setBounds(30,180, 500, 90);
             sh.setForeground(Color.WHITE); 
      
       JLabel kc = new JLabel();
      kc.setText("Kitchenette ");
      kc.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(kc);
      kc.setBounds(30,150, 500, 90);
             kc.setForeground(Color.WHITE); 
      
      //BENEFITS PANEL
       JLabel price = new JLabel();
      price.setText("Your price includes:");
      price.setFont(new Font("broadway", Font.PLAIN, 20));
      add(price);
      price.setBounds(370,60, 500, 90);
             price.setForeground(Color.WHITE); 
      
       JLabel price2 = new JLabel();
      price2.setText(" ✔ Extra low price! (non-refundable)");
      price2.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(price2);
      price2.setBounds(370, 90, 500, 90);
             price2.setForeground(Color.WHITE); 
      
      JLabel wifi = new JLabel();
      wifi.setText(" ✔ Free Wi-Fi");
      wifi.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(wifi);
      wifi.setBounds(370,120, 500, 90);
             wifi.setForeground(Color.WHITE); 
      
       JLabel option = new JLabel();
      option.setText("Optional benefit:");
      option.setFont(new Font("broadway", Font.PLAIN, 20));
      add(option);
      option.setBounds(370,150, 500, 90);
       option.setForeground(Color.WHITE);     
       
         JLabel b = new JLabel();
      b.setText(" ✔ Breakfast at ₱1,200");
      b.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(b);
      b.setBounds(370,180, 500, 90);
      b.setForeground(Color.WHITE);    
          
      //PRICE PER NIGHT PANEL
       JLabel prc = new JLabel();
      prc.setText(" ̶₱̶6̶,̶1̶0̶4̶");
      prc.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(prc);
      prc.setBounds(800, 80, 500, 90);
      prc.setForeground(Color.WHITE);    
      
       JLabel prc3 = new JLabel();
      prc3.setText("₱5,000");
      prc3.setFont(new Font("Times Bold", Font.PLAIN, 25));
      add(prc3);
      prc3.setBounds(800,110, 500, 90);
      prc3.setForeground(Color.WHITE);
      
      
      
     booknow = new JButton("Book Now!");
      booknow.setFont(new Font("Serif", Font.PLAIN, 20));
              add(booknow);
              booknow.setBounds(1090, 120, 150, 50);     
                booknow.setBackground(new Color(23, 33, 35));
                booknow.setForeground(Color.WHITE);
              
              viewroom = new JButton("View Room");
                  viewroom.setFont(new Font("Serif", Font.PLAIN, 20));
              add(viewroom);
              viewroom.setBounds(1090, 200, 150, 50);
              viewroom.setBackground(new Color(23, 33, 35));
              viewroom.setForeground(Color.WHITE);
              
      //back and next button
      
              
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
               booknow.addActionListener(this);
               back.addActionListener(this);
               next.addActionListener(this);
          //BORDER PANEL
              
              JPanel border = new JPanel();
      border.setBackground(new Color(23, 33, 35));
      border.setBounds(0,630,1300,40);
      add(border);
              
      
              //Image
                 ImageIcon imageIcon = new ImageIcon("Pictures/room104.jpg");
        Image image = imageIcon.getImage().getScaledInstance(1300, 600, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(-5, 0, 1300, 600);
        add(label);
        
      setTitle("Available Rooms");
      setSize(1300,700);
      setLayout(null);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      getContentPane().setBackground(new Color(255, 255,255));
      color.add(pax);
      color2.add(benefits);
      color3.add(prices);
      red.add(prices2);
      color4.add(booked);
         border.add(back);
              border.add(next);
    }
      
      

public static void main(String[] args) {
      
               new avail104();
    
     }

   @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == booknow) {
            
            ReservedRooms reserve = new ReservedRooms();
           dispose();
            
        } else if (e.getSource() == viewroom)  {
            
             room104 reserve = new room104();
            dispose();
        }
         else if (e.getSource() == back)  {
            
             avail103 reserve = new avail103();
            dispose();
        }
        else if (e.getSource() == next)  {
            
             avail105 reserve = new avail105();
            dispose();
        }
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}