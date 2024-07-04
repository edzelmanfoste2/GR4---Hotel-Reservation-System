package HotelReservation;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class avail105 extends JFrame implements ActionListener {

    private JButton back, booknow, viewroom, next;

    public avail105() {

        JLabel header = new JLabel("ROOM 105 - SINGLE ROOM");
        add(header);
        header.setFont(new Font("Serif", Font.PLAIN, 30));
        header.setBounds(10, 2, 500, 50);
        header.setForeground(Color.WHITE);

        JPanel color = new JPanel();
        color.setBackground(new Color(23, 33, 35));
        color.setBounds(10, 50, 300, 40);
        add(color);

        JLabel Inclusions = new JLabel();
        Inclusions.setText("Inclusions");
        Inclusions.setFont(new Font("Serif", Font.PLAIN, 20));
        Inclusions.setForeground(Color.white);
        add(Inclusions);

        JPanel color2 = new JPanel();
        color2.setBackground(new Color(23, 33, 35));
        color2.setBounds(350, 50, 300, 40);
        add(color2);

        JLabel Amenities = new JLabel();
        Amenities.setText("Amenities");
        Amenities.setFont(new Font("Serif", Font.PLAIN, 20));
        Amenities.setForeground(Color.white);
        add(Amenities);

        JPanel color3 = new JPanel();
        color3.setBackground(new Color(23, 33, 35));
        color3.setBounds(690, 50, 300, 40);
        add(color3);

        JLabel prices = new JLabel();
        prices.setText("Price per night");
        prices.setFont(new Font("Serif", Font.PLAIN, 20));
        prices.setForeground(Color.white);
        add(prices);

        JPanel color4 = new JPanel();
        color4.setBackground(new Color(23, 33, 35));
        color4.setBounds(1030, 50, 250, 40);
        add(color4);
        color4.setForeground(Color.WHITE);

        JLabel booked = new JLabel();
        booked.setText("Most Booked");
        booked.setFont(new Font("Serif", Font.PLAIN, 20));
        booked.setForeground(Color.white);
        add(booked);
        booked.setForeground(Color.WHITE);

        JLabel bed = new JLabel();
        bed.setText("1 single bed with comfortable bedding");
        bed.setFont(new Font("Waverly", Font.PLAIN, 15));
        add(bed);
        bed.setBounds(20, 60, 500, 90);
        bed.setForeground(Color.WHITE);

        JLabel bathroom = new JLabel();
        bathroom.setText("En-suite bathroom with shower");
        bathroom.setFont(new Font("Waverly", Font.PLAIN, 15));
        add(bathroom);
        bathroom.setBounds(20, 90, 500, 90);
        bathroom.setForeground(Color.WHITE);

        JLabel work = new JLabel();
        work.setText("Work desk with chair");
        work.setFont(new Font("Waverly", Font.PLAIN, 15));
        add(work);
        work.setBounds(20, 120, 500, 90);
        work.setForeground(Color.WHITE);

        JLabel wifi = new JLabel();
        wifi.setText(" ✔ Free Wi-Fi");
        wifi.setFont(new Font("Waverly", Font.PLAIN, 15));
        add(wifi);
        wifi.setBounds(400, 60, 500, 90);
        wifi.setForeground(Color.WHITE);

        JLabel tv = new JLabel();
        tv.setText(" ✔ 32-inch flat-screen TV with cable channels");
        tv.setFont(new Font("Waverly", Font.PLAIN, 15));
        add(tv);
        tv.setBounds(400, 90, 500, 90);
        tv.setForeground(Color.WHITE);

        JLabel bar2 = new JLabel();
        bar2.setText(" ✔ Minibar with refreshments");
        bar2.setFont(new Font("Waverly", Font.PLAIN, 15));
        add(bar2);
        bar2.setBounds(400, 120, 500, 90);
        bar2.setForeground(Color.WHITE);

        JLabel coffee = new JLabel();
        coffee.setText(" ✔ Coffee maker and tea set");
        coffee.setFont(new Font("Waverly", Font.PLAIN, 15));
        add(coffee);
        coffee.setBounds(400, 150, 500, 90);
        coffee.setForeground(Color.WHITE);

        JLabel aircon = new JLabel();
        aircon.setText(" ✔ Air conditioning and heating");
        aircon.setFont(new Font("Waverly", Font.PLAIN, 15));
        add(aircon);
        aircon.setBounds(400, 180, 500, 90);
        aircon.setForeground(Color.WHITE);

        JLabel room = new JLabel();
        room.setText(" ✔ In-room safe");
        room.setFont(new Font("Waverly", Font.PLAIN, 15));
        add(room);
        room.setBounds(400, 210, 500, 90);
        room.setForeground(Color.WHITE);

        JLabel water = new JLabel();
        water.setText(" ✔ Complimentary bottled water");
        water.setFont(new Font("Waverly", Font.PLAIN, 15));
        add(water);
        water.setBounds(400, 240, 500, 90);
        water.setForeground(Color.WHITE);

        JLabel D = new JLabel();
        D.setText(" ✔ Daily housekeeping");
        D.setFont(new Font("Waverly", Font.PLAIN, 15));
        add(D);
        D.setBounds(400, 270, 500, 90);
        D.setForeground(Color.WHITE);

        JLabel option = new JLabel();
        option.setText("Facilities:");
        option.setFont(new Font("broadway", Font.PLAIN, 20));
        add(option);
        option.setBounds(400, 300, 500, 90);
        option.setForeground(Color.WHITE);

        JLabel k = new JLabel();
        k.setText(" ✔ Free breakfast buffet at the restaurant");
        k.setFont(new Font("Waverly", Font.PLAIN, 15));
        add(k);
        k.setBounds(400, 330, 500, 90);
        k.setForeground(Color.WHITE);

        JLabel a = new JLabel();
        a.setText(" ✔ Access to fitness center and swimming pool");
        a.setFont(new Font("Waverly", Font.PLAIN, 15));
        add(a);
        a.setBounds(400, 360, 500, 90);
        a.setForeground(Color.WHITE);

        JLabel prc3 = new JLabel();
        prc3.setText("₱3,500");
        prc3.setFont(new Font("Times Bold", Font.PLAIN, 25));
        add(prc3);
        prc3.setBounds(780, 90, 500, 90);
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
        border.setBounds(0, 520, 1300, 60);
        add(border);

        //Image
        ImageIcon imageIcon = new ImageIcon("Pictures/room105.jpg");
        Image image = imageIcon.getImage().getScaledInstance(1300, 600, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0, -40, 1300, 600);
        add(label);

        setTitle("Available Rooms");
        setSize(1300, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255, 255, 255));
        color.add(Inclusions);
        color2.add(Amenities);
        color3.add(prices);
        color4.add(booked);
         border.add(back);
              border.add(next);

    }

    public static void main(String[] args) {

        new avail105();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == booknow) {
            
            ReservedRooms reserve = new ReservedRooms();
           dispose();
            
        } else if (e.getSource() == viewroom)  {
            
             room105 reserve = new room105();
            dispose();
        }
         else if (e.getSource() == back)  {
            
             avail104 reserve = new avail104();
            dispose();
        }
        else if (e.getSource() == next)  {
            
             avail201 reserve = new avail201();
            dispose();
        }
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}