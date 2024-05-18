package HotelReservation;
import java.awt.Color;
import java.awt.Font;    
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class AvailableRoom extends JFrame{

    public AvailableRoom() {
   
        
      JLabel header = new JLabel("ROOM 103 - STANDARD SINGLE");
      add(header);
      header.setFont(new Font("Serif", Font.PLAIN, 30));
      header.setBounds(10, 2, 500, 50);
      
      //FOR 103 PANELS
      
      JPanel color = new JPanel();
      color.setBackground(new Color(23, 33, 35));
      color.setBounds(10,50,300,40);
      add(color);
      
       JLabel pax = new JLabel();
      pax.setText("For 1-2 pax only");
      pax.setFont(new Font("Serif", Font.PLAIN, 20));
      pax.setForeground(Color.white);
      add(pax);
      
       JPanel color2 = new JPanel();
      color2.setBackground(new Color(23, 33, 35));
      color2.setBounds(350,50,300,40);
      add(color2);
      
        JLabel benefits = new JLabel();
      benefits.setText("Benefits");
      benefits.setFont(new Font("Serif", Font.PLAIN, 20));
      benefits.setForeground(Color.white);
      add(benefits);
      
      JPanel color3 = new JPanel();
      color3.setBackground(new Color(23, 33, 35));
      color3.setBounds(690,50,300,40);
      add(color3);
      
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
      prices2.setText("SAVE 67% TODAY!");
      prices2.setFont(new Font("Serif", Font.PLAIN, 12));
      prices2.setForeground(Color.white);
      add(prices2);
      
       JPanel color4 = new JPanel();
      color4.setBackground(new Color(23, 33, 35));
      color4.setBounds(1030,50,250,40);
      add(color4);
      
        JLabel booked = new JLabel();
      booked.setText("Most Booked");
      booked.setFont(new Font("Serif", Font.PLAIN, 20));
      booked.setForeground(Color.white);
      add(booked);
      
      
     //FOR ROOM 103 PANELS
     
       JPanel color01 = new JPanel();
      color01.setBackground(new Color(23, 33, 35));
      color01.setBounds(10,368,300,40);
      add(color01);
      
       JLabel pax2 = new JLabel();
      pax2.setText("For 1-2 pax only");
      pax2.setFont(new Font("Serif", Font.PLAIN, 20));
      pax2.setForeground(Color.white);
      add(pax2);
      
       JPanel color02 = new JPanel();
      color02.setBackground(new Color(23, 33, 35));
      color02.setBounds(350,368,300,40);
      add(color02);
      
        JLabel benefits02 = new JLabel();
      benefits02.setText("Benefits");
      benefits02.setFont(new Font("Serif", Font.PLAIN, 20));
      benefits02.setForeground(Color.white);
      add(benefits02);
      
         JPanel color03 = new JPanel();
      color03.setBackground(new Color(23, 33, 35));
      color03.setBounds(690,368,300,40);
      add(color03);
      
        JLabel prices01 = new JLabel();
      prices01.setText("Price per night");
      prices01.setFont(new Font("Serif", Font.PLAIN, 20));
      prices01.setForeground(Color.white);
      add(prices01);
      
         JPanel color04 = new JPanel();
      color04.setBackground(new Color(23, 33, 35));
      color04.setBounds(1030,368,250,40);
      add(color04);
      
        JLabel booked2 = new JLabel();
      booked2.setText("Most Booked");
      booked2.setFont(new Font("Serif", Font.PLAIN, 20));
      booked2.setForeground(Color.white);
      add(booked2);
      
      
      // For 1-2 PAX ONLY
      JLabel bed= new JLabel();
      bed.setText("1 queen bed");
      bed.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(bed);
      bed.setBounds(30,60, 500, 90);
      
      JLabel roomsize = new JLabel();
      roomsize.setText("Property Size: 21 ㎡/226 ft²");
      roomsize.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(roomsize);
      roomsize.setBounds(30, 90, 500, 90);
      
      JLabel cv = new JLabel();
      cv.setText("City view");
      cv.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(cv);
      cv.setBounds(30,120, 500, 90);
      
      JLabel sh = new JLabel();
      sh.setText("Shower");
      sh.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(sh);
      sh.setBounds(30,180, 500, 90);
      
       JLabel kc = new JLabel();
      kc.setText("Kitchenette ");
      kc.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(kc);
      kc.setBounds(30,150, 500, 90);
      
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
      
       JLabel option = new JLabel();
      option.setText("Optional benefit:");
      option.setFont(new Font("broadway", Font.PLAIN, 20));
      add(option);
      option.setBounds(370,150, 500, 90);
      
         JLabel b = new JLabel();
      b.setText(" ✔ Breakfast at ₱1,200");
      b.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(b);
      b.setBounds(370,180, 500, 90);
          
      //PRICE PER NIGHT PANEL
       JLabel prc = new JLabel();
      prc.setText(" ̶₱̶6̶,̶1̶0̶4̶");
      prc.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(prc);
      prc.setBounds(900, 80, 500, 90);
      
       JLabel prc3 = new JLabel();
      prc3.setText("₱1,999");
      prc3.setFont(new Font("Times Bold", Font.PLAIN, 25));
      add(prc3);
      prc3.setBounds(900,110, 500, 90);
      
      //FOR ROOM 104(FOR 1-2 PAX ONLY)
      
       JLabel header2 = new JLabel();
      header2.setText("ROOM 104- STANDARD TRIPLE ROOM");
      header2.setFont(new Font("Serif", Font.PLAIN, 30));
      add(header2);
      header2.setBounds(10, 320, 600, 50);
      
        //FOR ROOM 104(FOR 1-2 PAX ONLY) INFO
        
        JLabel roomdetails = new JLabel();
      roomdetails.setText("1 single bed and  1 queen bed or 1 single bed and 1 double bed ");
      roomdetails.setFont(new Font("Waverly", Font.PLAIN, 11));
      add(roomdetails);
      roomdetails.setBounds(30,378, 500, 90);
      
       JLabel roomdetails2 = new JLabel();
      roomdetails2.setText("Property size: 21㎡/226 ft²");
      roomdetails2.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(roomdetails2);
      roomdetails2.setBounds(30,408, 500, 90);
      
       JLabel city = new JLabel();
      city.setText("Outdoor View ");
      city.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(city);
      city.setBounds(30,438, 500, 90);
      
       JLabel s = new JLabel();
      s.setText("Shower");
      s.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(s);
      s.setBounds(30,468, 500, 90);
      
       JLabel kitchen = new JLabel();
      kitchen.setText("Kitchenette");
      kitchen.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(kitchen);
      kitchen.setBounds(30,498, 500, 90);
      
      //BENEFITS PANEL
      
        JLabel price01 = new JLabel();
      price01.setText("Your price includes:");
      price01.setFont(new Font("broadway", Font.PLAIN, 20));
      add(price01);
      price01.setBounds(370,378, 500, 90);
      
      JLabel price02 = new JLabel();
      price02.setText(" ✔ Free cancellation before May 22,2024");
      price02.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(price02);
      price02.setBounds(370, 408, 500, 90);
      
      JLabel price4 = new JLabel();
      price4.setText(" ✔ Pay nothing until May 20,2024");
      price4.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(price4);
      price4.setBounds(370, 428, 500, 90);
      
      JLabel wifi2 = new JLabel();
      wifi2.setText(" ✔ Free Wi-Fi");
      wifi2.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(wifi2);
      wifi2.setBounds(370,448, 500, 90);
      
       JLabel options2 = new JLabel();
      options2.setText("Optional benefit:");
      options2.setFont(new Font("broadway", Font.PLAIN, 20));
      add(options2);
      options2.setBounds(370,468, 500, 90);
      
        JLabel b2 = new JLabel();
      b2.setText(" ✔ Breakfast at ₱1,200");
      b2.setFont(new Font("Waverly", Font.PLAIN, 15));
      add(b2);
      b2.setBounds(370,498, 500, 90);
      
      //PRICE PER NIGHT
        JLabel prc4 = new JLabel();
      prc4.setText("₱2,709");
      prc4.setFont(new Font("Times Bold", Font.PLAIN, 25));
      add(prc4);
      prc4.setBounds(900,400, 400, 90);
      
      JButton checkin = new JButton("Book Now!");
      checkin.setFont(new Font("Serif", Font.PLAIN, 20));
              add(checkin);
              checkin.setBounds(1090, 120, 150, 50);     
                checkin.setBackground(new Color(23, 33, 35));
                checkin.setForeground(Color.WHITE);
              
              JButton viewroom = new JButton("View Room");
                  viewroom.setFont(new Font("Serif", Font.PLAIN, 20));
              add(viewroom);
              viewroom.setBounds(1090, 200, 150, 50);
              viewroom.setBackground(new Color(23, 33, 35));
              viewroom.setForeground(Color.WHITE);
              
              JButton checkin2 = new JButton("Book Now!");
      checkin2.setFont(new Font("Serif", Font.PLAIN, 20));
              add(checkin2);
              checkin2.setBounds(1090, 438, 150, 50);     
                checkin2.setBackground(new Color(23, 33, 35));
                checkin2.setForeground(Color.WHITE);
              
                 JButton viewroom2 = new JButton("View Room");
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
      color.add(pax);
      color2.add(benefits);
      color3.add(prices);
      red.add(prices2);
      color4.add(booked);
      color01.add(pax2);
      color02.add(benefits02);
      color03.add(prices01);
      color04.add(booked2);
   
     
    }

public static void main(String[] args) {
      
               new AvailableRoom();
    
     }
     
    
}
   
