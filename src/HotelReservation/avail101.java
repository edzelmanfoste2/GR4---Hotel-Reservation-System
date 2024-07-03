package HotelReservation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class avail101 extends JFrame implements ActionListener {
    
    private JButton back,booknow,viewroom,next;
    public avail101() {
   
          
      JLabel header = new JLabel("ROOM 101 - FAMILY ROOM");
      add(header);
      header.setFont(new Font("Serif", Font.PLAIN, 30));
      header.setBounds(15, 2, 500, 50);
      
      JPanel color = new JPanel();
      color.setBackground(new Color(23, 33, 35));
      color.setBounds(10,50,300,40);
      add(color);
      
       JLabel Inclusions = new JLabel();
      Inclusions.setText("Inclusions");
      Inclusions.setFont(new Font("Serif", Font.PLAIN, 20));
      Inclusions.setForeground(Color.white);
      add(Inclusions);
      
       JPanel color2 = new JPanel();
      color2.setBackground(new Color(23, 33, 35));
      color2.setBounds(350,50,300,40);
      add(color2);
      
        JLabel Amenities = new JLabel();
      Amenities.setText("Amenities");
      Amenities.setFont(new Font("Serif", Font.PLAIN, 20));
      Amenities.setForeground(Color.white);
      add(Amenities);
      
      JPanel color3 = new JPanel();
      color3.setBackground(new Color(23, 33, 35));
      color3.setBounds(690,50,300,40);
      add(color3);
      
        JLabel pricesprnight = new JLabel();
      pricesprnight.setText("Price per night");
      pricesprnight.setFont(new Font("Serif", Font.PLAIN, 20));
      pricesprnight.setForeground(Color.white);
      add(pricesprnight);
      
         
      
       JPanel color4 = new JPanel();
      color4.setBackground(new Color(23, 33, 35));
      color4.setBounds(1030,50,250,40);
      add(color4);
      
        JLabel booked = new JLabel();
      booked.setText("Most Booked");
      booked.setFont(new Font("Serif", Font.PLAIN, 20));
      booked.setForeground(Color.white);
      add(booked);
      
      JLabel bed= new JLabel();
      bed.setText("2 queen beds with hypoallergenic pillows");
      bed.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(bed);
      bed.setBounds(20,60, 500, 90);
      
      JLabel roomsize = new JLabel();
      roomsize.setText("En-suite bathroom with bathtub and shower");
      roomsize.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(roomsize);
      roomsize.setBounds(20, 90, 500, 90);
      
      JLabel cv = new JLabel();
      cv.setText("Seating area with sofa and armchairs");
      cv.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(cv);
      cv.setBounds(20,120, 500, 90);
      
      JLabel sh = new JLabel();
      sh.setText("Kid-friendly amenitiessuch as crib and toys (upon request)");
      sh.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(sh);
      sh.setBounds(20,180, 400, 90);
      
       JLabel kc = new JLabel();
      kc.setText("Kitchenette ");
      kc.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(kc);
      kc.setBounds(20,150, 500, 90);
      
      JLabel wifi = new JLabel();
      wifi.setText(" ✔ Free Wi-Fi");
      wifi.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(wifi);
      wifi.setBounds(410,60, 500, 90);
      
      JLabel tv = new JLabel();
      tv.setText(" ✔ 50-inch flat-screen TV with kids' channels");
      tv.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(tv);
      tv.setBounds(410,90, 500, 90);
      
       JLabel bar = new JLabel();
      bar.setText(" ✔ Minibar with family-friendly snacks and drinks");
      bar.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(bar);
      bar.setBounds(410, 120, 500, 90);
      
      JLabel coffee = new JLabel();
      coffee.setText(" ✔ Coffee maker and tea set");
      coffee.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(coffee);
      coffee.setBounds(410,150, 500, 90);
      
      JLabel aircon = new JLabel();
      aircon.setText(" ✔ Air conditioning and heating");
      aircon.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(aircon);
      aircon.setBounds(410,180, 500, 90);
      
      JLabel room = new JLabel();
      room.setText(" ✔ In-room safe");
      room.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(room);
      room.setBounds(410,210, 500, 90);
      
      JLabel water = new JLabel();
      water.setText(" ✔ Complimentary bottled water");
      water.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(water);
      water.setBounds(410,240, 500, 90);
      
      JLabel D = new JLabel();
      D.setText(" ✔ Daily housekeeping");
      D.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(D);
      D.setBounds(410,270, 500, 90);
      
      
      
       JLabel option = new JLabel();
      option.setText("Facilities:");
      option.setFont(new Font("broadway", Font.PLAIN, 20));
      add(option);
      option.setBounds(410,300, 500, 90);
      
         JLabel k = new JLabel();
      k.setText(" ✔ Kids' play area with supervised activities");
      k.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(k);
      k.setBounds(410,330, 500, 90);
      
      JLabel f = new JLabel();
      f.setText(" ✔ Free breakfast buffet at the restaurant");
      f.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(f);
      f.setBounds(410,360, 500, 90);
      
      JLabel a = new JLabel();
      a.setText(" ✔ Access to swimming pool and family lounge");
      a.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(a);
      a.setBounds(410,390, 500, 90);
         
       JLabel prc3 = new JLabel();
      prc3.setText("₱7,500");
      prc3.setFont(new Font("Times Bold", Font.PLAIN, 25));
      add(prc3);
      prc3.setBounds(800,90, 500, 90);
//BUTTONS     
       booknow = new JButton("Book Now!");
      booknow.setFont(new Font("Serif", Font.PLAIN, 20));
              
              booknow.setBounds(1090, 120, 150, 50);     
                booknow.setBackground(new Color(23, 33, 35));
                booknow.setForeground(Color.WHITE);
              add(booknow);  

              viewroom = new JButton("View Room");
                  viewroom.setFont(new Font("Serif", Font.PLAIN, 20));            
              viewroom.setBounds(1090, 200, 150, 50);
              viewroom.setBackground(new Color(23, 33, 35));
              viewroom.setForeground(Color.WHITE);
            add(viewroom);
              
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
          
         booknow.addActionListener(this);
         back.addActionListener(this);
         viewroom.addActionListener(this);
                  next.addActionListener(this);
        
                     JPanel border = new JPanel();
      border.setBackground(new Color(23, 33, 35));
      border.setBounds(0,520,1300,40);
      add(border);
    

              //Image
                 ImageIcon imageIcon = new ImageIcon("Pictures/room101.jpg");
        Image image = imageIcon.getImage().getScaledInstance(1300, 600, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(-5, 0, 1300, 600);
        add(label);
        
              
      setTitle("Available Rooms");
      setSize(1300,600);
      setLayout(null);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      getContentPane().setBackground(new Color(255, 255,255));
      color.add(Inclusions);
      color2.add(Amenities);
      color3.add(pricesprnight);
      color4.add(booked);  
       border.add(back);
              border.add(next);

     
    }

public static void main(String[] args) {
      
               new avail101();
    
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == booknow) {
            
            ReservedRooms reserve = new ReservedRooms();
           reserve.dispose();
            
        } else if (e.getSource() == viewroom)  {
            
             room101 reserve = new room101();
            dispose();
        }
         else if (e.getSource() == back)  {
            
             LandingPage reserve = new LandingPage();
            dispose();
        }
         else if (e.getSource() == next)  {
            
             avail102 reserve = new avail102();
            dispose();
        }
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    
}
