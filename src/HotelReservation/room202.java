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

public class room202 extends JFrame implements ActionListener{

    private JPanel layout;
    private JLabel hdr,price,inclusions,includetails,Amenities,amendetails,Facilities,Facilitiesdetails;
    private JButton checkin,back;

    room202() {
            
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
        

        hdr = new JLabel("ROOM 202 - PREMIER EXECUTIVE SUITE");
        hdr.setBounds(20, 40, 900, 40);
        hdr.setFont(new Font("Sitka Small", Font.BOLD, 30));
        hdr.setForeground(new Color(0xE5D0CC));
        layout.add(hdr);
        
//Price

        price = new JLabel();
      price.setText(" P12,000 per night");
      price.setBounds(80, 80, 180, 40);
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
        inclusions.setBounds(30, 100, 900, 120);
        inclusions.setFont(new Font("Sitka Small", Font.BOLD, 20));
        inclusions.setForeground(new Color(0x444554));
        layout.add(inclusions);
        
         includetails = new JLabel("<html>- 1 king bed with luxury linens<br>" +
"  - En-suite bathroom with Jacuzzi tub <br>"
                 + "and rain shower<br>" +
"  - Separate living room with dining table<br>"
                 + "and chairs<br>" +
"  - Kitchenette with microwave, refrigerator<br>" +
"  - Private balcony with city view</html>");
        includetails.setBounds(20, 170, 900, 150);
        includetails.setFont(new Font("Segoe UI Semilight  ", Font.PLAIN, 16));
        includetails.setForeground(Color.BLACK);
        layout.add(includetails);

//AMENITIES 
        Amenities = new JLabel("Amenities");
        Amenities.setBounds(390, 280, 900, 150);
        Amenities.setFont(new Font("Sitka Small", Font.BOLD, 20));
        Amenities.setForeground(new Color(0x444554));
        layout.add(Amenities);
        
      amendetails = new JLabel("<html>   - Free Wi-Fi<br>" +
"  - 65-inch flat-screen TV \n<br>" +
"  - Fully stocked minibar<br>" +
"  - Coffee maker and tea set<br>" +
"  - Air conditioning and heating<br>" +
"  - In-room safe<br>" +
"  - Complimentary fruit basket</html>");
        amendetails.setBounds(390, 360, 900, 150);
        amendetails.setFont(new Font("Segoe UI Semilight  ", Font.PLAIN, 16));
        amendetails.setForeground(Color.BLACK);
        layout.add(amendetails);
 
//Facilities
        Facilities = new JLabel("Facilities");
        Facilities.setBounds(30, 470, 900, 150);
        Facilities.setFont(new Font("Sitka Small", Font.BOLD, 20));
        Facilities.setForeground(new Color(0x444554));
        layout.add(Facilities);
        
         Facilitiesdetails = new JLabel("<html>  - Free breakfast buffet at the restaurant<br>"+
"  - Complimentary airport shuttle<br>" +       
"  - Access to fitness center and swimming pool<br>" +
"  - Priority check-in and check-out</html>");
        Facilitiesdetails.setBounds(15, 520, 900, 150);
        Facilitiesdetails.setFont(new Font("Segoe UI Semilight  ", Font.PLAIN, 16));
        Facilitiesdetails.setForeground(Color.BLACK);
        layout.add(Facilitiesdetails);

          ImageIcon LogoIcon = new ImageIcon("Pictures/202.png");
        JLabel Logoicon = new JLabel(LogoIcon);
        Logoicon.setBounds(0,0,700,700);
        layout.add(Logoicon);
        
        
        setSize(700, 700);
        setTitle("Room 202 - Premire Executive Room");
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
            
            avail202 reserve = new avail202();
            dispose();
            
        }

    }

    public static void main(String[] args) {
      
               EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                room202 roomwan = new room202();
                
            }
    
               });
                       }
    }