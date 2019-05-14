
	import javax.swing.JFrame;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import java.awt.BorderLayout;
	import java.awt.FlowLayout;
	import java.awt.event.ActionListener;
	import java.util.Date;
	import java.awt.event.ActionEvent;
	import java.awt.Color;
	import javax.swing.JPanel;
	import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
	import javax.swing.JTextField;

public class ClothesMain extends JFrame{
	public ClothesMain() {
		ClothesMain f = new ClothesMain();
		   
	      ImageIcon icon = new ImageIcon("1.png");
	      ImageIcon micon = new ImageIcon("1.jpg");
	      
	      String[] pic = {"1.jpg", "2.jpg", "3.jpg"};
	      
	      
	      getContentPane().setLayout(null);
	      
	      JButton b1 = new JButton("");
	      b1.setBackground(Color.YELLOW);
	      b1.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	         }
	      });
	      b1.setBounds(0, 0, 1295, 63);
	      getContentPane().add(b1);
	      b1.setIcon(icon);
	      
	     
	      
	      login1 = new LoginMain(f);
	      login2 = new LoginMain2(f);
	      getContentPane().add(f.login1);
	      
	      
	      JPanel p2 = new JPanel();
	      p2.setLayout(null);
	      
	      p2.setBounds(273, 66, 708, 645);
	      f.getContentPane().add(p2);
	      
	      JButton mb1 = new JButton("\uC0C1\uC758");
	      mb1.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            
	         }
	      });
	      mb1.setBackground(Color.CYAN);
	      mb1.setFont(new Font("±º∏≤", Font.BOLD, 30));
	      mb1.setBounds(0, 0, 165, 48);
	      p2.add(mb1);
	      
	      JButton mb2 = new JButton("\uD558\uC758");
	      mb2.setBackground(Color.CYAN);
	      mb2.setFont(new Font("±º∏≤", Font.BOLD, 30));
	      mb2.setBounds(177, 0, 165, 48);
	      p2.add(mb2);
	      
	      JButton mb3 = new JButton("\uC544\uC6B0\uD130");
	      mb3.setBackground(Color.CYAN);
	      mb3.setFont(new Font("±º∏≤", Font.BOLD, 30));
	      mb3.setBounds(354, 0, 165, 48);
	      p2.add(mb3);
	      
	      JButton mb4 = new JButton("\uC2E0\uBC1C");
	      mb4.setBackground(Color.CYAN);
	      mb4.setFont(new Font("±º∏≤", Font.BOLD, 30));
	      mb4.setBounds(531, 0, 165, 48);
	      p2.add(mb4);
	      
	      JButton mb5 = new JButton(""); //∏ﬁ¿Œ»≠∏ÈªÁ¡¯
	      mb5.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	               int count = 1;
	               ImageIcon icon1 = new ImageIcon(pic[witch]);
	               mb5.setIcon(icon1);
	               witch = witch + count;
	               count++;
	         }
	      });
	      mb5.setBounds(10, 58, 696, 244);
	      p2.add(mb5);
	      mb5.setIcon(micon);
	      
	      
	}
	public LoginMain login1 = null;
	public LoginMain2 login2 = null;
	 
	   private static JTextField idText;
	   private static JTextField pwText;
	   
	   static int witch = 1;
	   
//	      
//	 public void change(String panelName) {
//			if(panelName.equals("LoginMain")) {
//				getContentPane().removeAll();
//				getContentPane().add(login1);
//				revalidate();
//				repaint();
//			}else {
//				getContentPane().removeAll();
//				getContentPane().add(login2);
//				revalidate();
//				repaint();
//			}
//		}
		      
	
	  public static void main(String[] args) {
	      
		  ClothesMain f = new ClothesMain();
	      

	      f.setSize(1300, 750);
	      
	      f.setVisible(true);
	   }

}