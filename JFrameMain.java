
import java.awt.FlowLayout;
import java.awt.TextField;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.BorderLayout;

public class JFrameMain extends JFrame{
	public JFrameMain() {
		
	}
	
	public jpanelMenu Jpanel01 = null;
	public jpanelOrder Jpanel02 = null;
	
	public void change(String panelName) {
	
		if(panelName.equals("jpanelMenu")) {
			getContentPane().removeAll();
			getContentPane().add(Jpanel01);
			revalidate();
			repaint();
		}else {
			getContentPane().removeAll();
			getContentPane().add(Jpanel02);
			repaint();
			revalidate();
		}
		
		getContentPane().setLayout(null);
	
	}
	
//	public static void main(String[] args) {
//		
//		JFrameMain win = new JFrameMain();
//		
//		win.getContentPane().setLayout(null);
//		
//		win.setTitle("main frame");
//		win.Jpanel01 = new jpanelMenu(win);
//		win.Jpanel02 = new jpanelOrder(win);
//		
//		
//		win.getContentPane().add(win.Jpanel01);
//		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		win.setSize(950, 900);
//		win.setVisible(true);
//	}
}	
