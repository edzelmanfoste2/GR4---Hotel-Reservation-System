package HotelReservation;
        
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class avail201 extends JFrame implements ActionListener{
    private JButton back, checkin, viewroom, next;
    
    public avail201() {   
      
      JLabel roomheader2 = new JLabel("ROOM 201 - DELUXE SUITE TWIN");
      add(roomheader2);
      roomheader2.setFont(new Font("Serif", Font.PLAIN, 30));
      roomheader2.setBounds(10, 2, 500, 50);
      
      //FOR 201 PANELS
      
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
      
      
     
      
      // For 3 AND MORE PAX PANEL
      JLabel bed= new JLabel();
      bed.setText("2 Single beds");
      bed.setFont(new Font("Waverly", Font.BOLD, 15));
      add(bed);
      bed.setBounds(10,60, 500, 90);
      
      JLabel roomsize = new JLabel();
      roomsize.setText("Property Size: 45.6 ㎡/484 ft²");
      roomsize.setFont(new Font("Waverly", Font.BOLD, 15));
      add(roomsize);
      roomsize.setBounds(10, 90, 500, 90);
      
      JLabel info = new JLabel();
      info.setText("Non-smoking");
      info.setFont(new Font("Waverly", Font.BOLD, 15));
      add(info);
      info.setBounds(10,120, 500, 90);
      
      JLabel view = new JLabel();
      view.setText("En-suite bathroom with bathub and shower");
      view.setFont(new Font("Waverly", Font.BOLD, 15));
      add(view);
      view.setBounds(10,180, 500, 90);
      
       JLabel bth = new JLabel();
      bth.setText("City View ");
      bth.setFont(new Font("Waverly", Font.BOLD, 15));
      add(bth);
      bth.setBounds(10,150, 500, 90);
      
       JLabel clst = new JLabel();
      clst.setText("Walk-in Closet");
      clst.setFont(new Font("Waverly", Font.BOLD, 15));
      add(clst);
      clst.setBounds(10,210, 500, 90);
      
       JLabel sofabalcony = new JLabel();
      sofabalcony.setText("Living area with sofa and coffee table");
      sofabalcony.setFont(new Font("Waverly", Font.BOLD, 15));
      add(sofabalcony);
      sofabalcony.setBounds(10,240, 500, 90);
      
      //BENEFITS PANEL
       JLabel price = new JLabel();
      price.setText("Your price includes:");
      price.setFont(new Font("broadway", Font.BOLD, 20));
      add(price);
      price.setBounds(370,60, 500, 90);
      
       JLabel price2 = new JLabel();
      price2.setText(" ✔ Extra low price! (non-refundable)");
      price2.setFont(new Font("Waverly", Font.BOLD, 15));
      add(price2);
      price2.setBounds(370, 90, 500, 90);
      
      JLabel wifi = new JLabel();
      wifi.setText(" ✔ Free Wi-Fi");
      wifi.setFont(new Font("Waverly", Font.BOLD, 15));
      add(wifi);
      wifi.setBounds(370,120, 500, 90);
      
       JLabel options = new JLabel();
      options.setText("Optional benefit:");
      options.setFont(new Font("broadway", Font.BOLD, 20));
      add(options);
      options.setBounds(370,150, 500, 90);
      
         JLabel bf = new JLabel();
      bf.setText(" ✔ Breakfast at ₱5,160");
      bf.setFont(new Font("Waverly", Font.BOLD, 15));
      add(bf);
      bf.setBounds(370,180, 500, 90);
      
       JLabel rewards = new JLabel();
      rewards.setText("Other rewards & discounts");
      rewards.setFont(new Font("broadway", Font.BOLD, 20));
      add(rewards);
      rewards.setBounds(370,210, 500, 90);
      
      JLabel rewards2 = new JLabel();
      rewards2.setText("Cash back & Rewards:₱20");
      rewards2.setFont(new Font("Waverly", Font.BOLD, 15));
      add(rewards2);
      rewards2.setBounds(370,240, 500, 90);
      
      //PRICE PER NIGHT PANEL
       JLabel prc = new JLabel();
      prc.setText(" ̶₱̶ ̶1̶2̶,̶7̶8̶1̶");
      prc.setFont(new Font("Waverly", Font.BOLD, 15));
      add(prc);
      prc.setBounds(730, 90, 500, 90);
      
       JLabel prc2 = new JLabel();
      prc2.setText("Subject to Cashback Terms");
      prc2.setFont(new Font("broadway", Font.BOLD, 20));
      add(prc2);
      prc2.setBounds(690,130, 500, 90);
      
       JLabel prc3 = new JLabel();
      prc3.setText("₱ 10,000 per night");
      prc3.setFont(new Font("Times Bold", Font.BOLD, 25));
      add(prc3);
      prc3.setBounds(690,160, 500, 90);
      
      
     checkin = new JButton("Check-in");
      checkin.setFont(new Font("Serif", Font.BOLD, 20));
              add(checkin);
              checkin.setBounds(1090, 120, 150, 50);     
                checkin.setBackground(new Color(23, 33, 35));
                checkin.setForeground(Color.WHITE);
              
              viewroom = new JButton("View Room");
                  viewroom.setFont(new Font("Serif", Font.BOLD, 20));
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
        checkin.addActionListener(this);
        back.addActionListener(this);
        next.addActionListener(this);
              
              
                 //BORDER PANEL
              
              JPanel border = new JPanel();
      border.setBackground(new Color(23, 33, 35));
      border.setBounds(0,520,1300,60);
      add(border);
      
              //Image
                 ImageIcon imageIcon = new ImageIcon("Pictures/room201.jpg");
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
            
             room201 reserve = new room201();
            dispose();
        }
         else if (e.getSource() == back)  {
            
             avail105 reserve = new avail105();
            dispose();
        }
        else if (e.getSource() == next)  {
            
             avail202 reserve = new avail202();
            dispose();
        }
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
      
               new avail201();
    
     }
}