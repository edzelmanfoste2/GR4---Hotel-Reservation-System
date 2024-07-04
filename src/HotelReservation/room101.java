package HotelReservation;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class room101 extends JFrame implements ActionListener{

   private JPanel layout;
    private JLabel hdr,price,inclusions,includetails,Amenities,amendetails,Facilities,Facilitiesdetails;
    private JButton checkin,back;

    room101() {
       
       
        layout = new JPanel();
        layout.setBounds(0,0,700,700);
        layout.setBackground(Color.WHITE);
        layout.setLayout(null);
        add(layout);
       

//BackButton
        back = new JButton();
        back.setText("Back"); 
        back.setBounds(550, 600, 100, 40);
        back.setFont(new Font("Sitka Small", Font.BOLD, 15));
        back.setForeground(Color.WHITE);
        back.setOpaque(true);
        back.setBackground(new Color(0x2F3645));
        layout.add(back);
        back.addActionListener(this);
        
        hdr = new JLabel("ROOM 101 - FAMILY ROOM");
        hdr.setBounds(100, 40, 900, 40);
        hdr.setFont(new Font("Sitka Small", Font.BOLD, 35));
        hdr.setForeground(new Color(0xE5D0CC));
        layout.add(hdr);
        
//Price

        price = new JLabel();
      price.setText(" P7,500 per night");
      price.setBounds(80, 80, 170, 40);
      price.setFont(new Font("Sitka Small", Font.PLAIN, 18));
      price.setForeground(Color.WHITE);
      price.setOpaque(true); 
      price.setBackground(new Color(0x444554));
      layout.add(price);

//CheckIn Button

       checkin = new JButton();
        checkin.setText("Click here to Check in!"); 
        checkin.setBounds(400,80,220,40);
        checkin.setFont(new Font("Sitka Small", Font.BOLD, 15));
        checkin.setForeground(Color.WHITE);
        checkin.setOpaque(true);
        checkin.setBackground(new Color(0x444554));
        layout.add(checkin);
checkin.addActionListener(this);
//INCLUSIONS
        inclusions = new JLabel("Inclusions");
        inclusions.setBounds(30, 110, 900, 120);
        inclusions.setFont(new Font("Sitka Small", Font.BOLD, 20));
        inclusions.setForeground(new Color(0x444554));
        layout.add(inclusions);
        
         includetails = new JLabel("<html>- 2 queen beds with hypoallergenic pillows<br>" +
"  - En-suite bathroom with bathtub and shower<br>" +
"  - Seating area with sofa and armchairs<br>" +
"  - Kid-friendly amenities such as crib and toys <br> (upon request)</html>");
        includetails.setBounds(20, 180, 900, 120);
        includetails.setFont(new Font("Segoe UI Semilight  ", Font.PLAIN, 16));
        includetails.setForeground(Color.BLACK);
        layout.add(includetails);

//AMENITIES 
       Amenities = new JLabel("Amenities");
        Amenities.setBounds(390, 280, 900, 150);
        Amenities.setFont(new Font("Sitka Small", Font.BOLD, 20));
        Amenities.setForeground(new Color(0x444554));
        layout.add(Amenities);
        
          amendetails = new JLabel("<html>- Free Wi-Fi<br>" +
"  - 50-inch flat-screen TV<br>" +
"  - Minibar with family-framendetailsiendly <br> snacks and drinks<br>" +
"  - Coffee maker and tea set<br>" +
"  - Air conditioning and heating<br>" +
"  - In-room safe<br>" +
"  - Complimentary bottled water<br>" +
"  - Daily housekeeping</html>");
        amendetails.setBounds(390, 360, 900, 150);
        amendetails.setFont(new Font("Segoe UI Semilight  ", Font.PLAIN, 16));
        amendetails.setForeground(Color.BLACK);
        layout.add(amendetails);
 
//Facilities
 Facilities = new JLabel("Facilities");
        Facilities.setBounds(30, 480, 900, 150);
        Facilities.setFont(new Font("Sitka Small", Font.BOLD, 20));
        Facilities.setForeground(new Color(0x444554));
        layout.add(Facilities);
        
          Facilitiesdetails = new JLabel("<html>- Kids' play area with supervised activities<br>" +
"  - Free breakfast buffet at the restaurant<br>" +
"  - Access to swimming pool and family lounge</html>");
        Facilitiesdetails.setBounds(20, 520, 900, 150);
        Facilitiesdetails.setFont(new Font("Segoe UI Semilight  ", Font.PLAIN, 16));
        Facilitiesdetails.setForeground(Color.BLACK);
        layout.add(Facilitiesdetails);

        

        ImageIcon LogoIcon = new ImageIcon("Pictures/101.png");
        JLabel Logoicon = new JLabel(LogoIcon);
        Logoicon.setBounds(0,0,700,700);
        layout.add(Logoicon);
        
        
        
        setSize(700, 700);
        setTitle("Room 101 - Family Room");
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }

    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == checkin) {
            
            ReservedRooms reserve = new ReservedRooms();
           dispose();
            
        } else if (e.getSource() == back) {
            
            avail101 reserve = new avail101();
            dispose();
            
        }

    }

    public static void main(String[] args) {
      
               EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                room101 roomwan = new room101();
                
            }
    
               });
                       }
    }