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
private MainTest win2;
static String inputId;
static JLabel l1;
static JButton logoutbt;

public LoginMain2() {
	inputId = LoginMain.sessionId;
}


public LoginMain2(MainTest win2) {
	setBackground(new Color(219, 112, 147));
	this.win2 = win2;
	
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
	btnNewButton.setForeground(new Color(178, 34, 34));
	btnNewButton.setBackground(new Color(255, 255, 255));
	btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			inputId = LoginMain.sessionId;
			LoginUpdate u = new LoginUpdate();
			u.idLb.setText(inputId);
		}
	});
	btnNewButton.setBounds(30, 139, 110, 34);
	add(btnNewButton);
	
	logoutbt = new JButton("·Î±×¾Æ¿ô");
	logoutbt.setForeground(new Color(178, 34, 34));
	logoutbt.setBackground(new Color(255, 255, 255));
	logoutbt.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
	logoutbt.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			win2.change2("LoginMain");
			LoginMain2.l1.setText("");
			LoginMain.idText.setText("");
			LoginMain.pwText.setText("");
		}
	});
	logoutbt.setBounds(98, 207, 129, 34);
	add(logoutbt);
	
	JButton button = new JButton("Å»ÅðÇÏ±â");
	button.setForeground(new Color(178, 34, 34));
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			LoginDelete d = new LoginDelete(win2);
			d.idLBel.setText(inputId);
		}
	});
	button.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 18));
	button.setBackground(new Color(255, 255, 255));
	button.setBounds(187, 139, 116, 34);
	add(button);
	
	JButton btnNewButton_1 = new JButton("°Ô½ÃÆÇ");
	btnNewButton_1.setForeground(new Color(178, 34, 34));
	btnNewButton_1.setBackground(new Color(255, 255, 255));
	btnNewButton_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			BorderMain bm = new BorderMain();
		}
	});
	btnNewButton_1.setBounds(114, 274, 97, 23);
	add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("¸¶ÀÌÆäÀÌÁö");
	btnNewButton_2.setForeground(new Color(178, 34, 34));
	btnNewButton_2.setBackground(new Color(255, 255, 255));
	btnNewButton_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			MemberMy my = new MemberMy();
		}
	});
	btnNewButton_2.setBounds(98, 319, 129, 23);
	add(btnNewButton_2);
	
	setVisible(true);
}
}