/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HotelReservation;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Administrator
 */
public class ViewRoom extends JFrame {
   public static void main(String[] args) {
        JFrame frame = new JFrame("ViewRoom");
       JLabel label = new JLabel();
       JLabel label2 = new JLabel();
              JLabel logo = new JLabel();
       JLabel features = new JLabel();
       JLabel features1 = new JLabel();
       JLabel features2 = new JLabel();
       JLabel features3 = new JLabel();
       
       JPanel pnlHeader = new JPanel();
       JPanel pnlBody = new JPanel();
       JPanel pnlFooter = new JPanel();
       JPanel pnlLeftBorder = new JPanel();
       JPanel pnlRightBorder = new JPanel();
       
       

       label.setText("ROOM 101");
       label.setHorizontalTextPosition(JLabel.CENTER);
       label.setVerticalTextPosition(JLabel.TOP);
       label.setBounds(150, 20, 500, 75);
       label.setFont(new Font("Segoe UI Black",Font.BOLD,50));
       label.setForeground(Color.BLACK);

       label2.setText("DELUXE SUITE TWIN");
       label2.setBounds(150, 60, 400, 75);
       label2.setForeground(Color.BLACK);
       label2.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
       
       features.setText("FEATURES");
       features.setBounds(150, 60, 400, 65);
       features.setForeground(Color.BLACK);
       features.setBackground(Color.BLUE);
       features.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
       
       features1.setText("1 king size bed");
       features1.setBounds(150, 80, 400, 75);
       features1.setForeground(Color.BLACK);
       features1.setBackground(Color.BLUE);
       features1.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
       
       features2.setText("Non-smoking area");
       features2.setBounds(150, 100, 400, 75);
       features2.setForeground(Color.BLACK);
       features2.setBackground(Color.BLUE);
       features2.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
       
       features3.setText("City View");
       features3.setBounds(150, 120, 400, 75);
       features3.setForeground(Color.BLACK);
       features3.setBackground(Color.BLUE);
       features3.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
       
       ImageIcon hotelLogo = new ImageIcon("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\HotelReservationOOP\\src\\main\\java\\images\\2room2.png");
       logo.setIcon(hotelLogo);
       logo.setBounds(85, 40, 50, 50);
       
       pnlBody.setLayout(null);
       pnlBody.setPreferredSize(new Dimension(200, 100));
       pnlBody.setBackground(new Color(255, 255, 255));
        
       pnlFooter.setPreferredSize(new Dimension(300, 50));
       pnlFooter.setBackground(new Color(23, 33, 33));
        
        //Borders of the each side
       pnlLeftBorder.setLayout(null);
       pnlLeftBorder.setPreferredSize(new Dimension(50, 50));
       pnlLeftBorder.setBackground(new Color(255, 255, 255));
        
       pnlRightBorder.setLayout(null);
       pnlRightBorder.setPreferredSize(new Dimension(50, 50));
       pnlRightBorder.setBackground(new Color(255, 255, 255));
       
       pnlHeader.add(label);
       pnlHeader.add(label2);
       
       pnlBody.add(features);
       pnlBody.add(features1);
       pnlBody.add(features2);
       pnlBody.add(features3);
       
       
       frame.setSize(1050, 700);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(new BorderLayout());
       frame.getContentPane().setBackground(new Color(0xFFFFFF));
       frame.add(pnlHeader, BorderLayout.NORTH);
       frame.add(pnlBody, BorderLayout.CENTER);
       frame.add(pnlFooter, BorderLayout.SOUTH);
       frame.add(pnlLeftBorder, BorderLayout. WEST);
       frame.add(pnlRightBorder, BorderLayout.EAST);
       frame.setVisible(true);
    }
    
        
}
