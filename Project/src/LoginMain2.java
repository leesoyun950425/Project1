import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Event;

import javax.swing.JTextField;

public class LoginMain2 extends JPanel{
private MainTest win;
static String inputId;
static JLabel l1;
static JButton logoutbt;

public LoginMain2() {
	inputId = LoginMain.sessionId;
}

public LoginMain2(MainTest win) {
	setBackground(new Color(0, 0, 0));
	this.win = win;
	
	setLayout(null);
	
	l1 = new JLabel();
	l1.setForeground(new Color(255, 255, 255));
	l1.setFont(new Font("¡¾¨ù¢¬©÷", Font.BOLD, 20));
	l1.setBounds(84, 63, 198, 24);
	add(l1);
	l1.setText(inputId);
	
	JLabel lblNewLabel = new JLabel("´ÔÀÇ ÆäÀÌÁö ÀÔ´Ï´Ù.");
	lblNewLabel.setForeground(new Color(255, 255, 255));
	lblNewLabel.setFont(new Font("¡¾¨ù¢¬©÷", Font.BOLD, 20));
	lblNewLabel.setBounds(84, 91, 323, 33);
	add(lblNewLabel);
	
	JButton btnNewButton = new JButton("¼öÁ¤ÇÏ±â");
	btnNewButton.setBackground(new Color(255, 255, 255));
	btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 22));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			inputId = LoginMain.sessionId;
			LoginUpdate u = new LoginUpdate();
			u.idLb.setText(inputId);
		}
	});
	btnNewButton.setBounds(42, 139, 148, 34);
	add(btnNewButton);
	
	logoutbt = new JButton("·Î±×¾Æ¿ô");
	logoutbt.setBackground(new Color(255, 255, 255));
	logoutbt.setFont(new Font("±¼¸²", Font.BOLD, 22));
	logoutbt.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			win.change("LoginMain");
		}
	});
	logoutbt.setBounds(142, 208, 129, 34);
	add(logoutbt);
	
	JButton button = new JButton("Å»ÅðÇÏ±â");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			LoginDelete d = new LoginDelete();
			d.idLBel.setText(inputId);
		}
	});
	button.setFont(new Font("±¼¸²", Font.BOLD, 22));
	button.setBackground(Color.WHITE);
	button.setBounds(226, 143, 148, 34);
	add(button);
	
	setVisible(true);
}
}