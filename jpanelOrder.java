
import javax.swing.JPanel;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jpanelOrder extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	
	public int witch = 0;
	private JFrameMain win;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b7;
	static String name;
	static String price;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	
	public jpanelOrder(JFrameMain win) {
		this.win = win;
		setSize(546, 579);
		setLayout(null);
		
		String[] pic = {"c1.jpg","c2.jpg","c3.jpg","c4.jpg","c5.jpg"};
		
		JLabel lb1 = new JLabel("New label");
		ImageIcon icon1 = new ImageIcon(pic[witch]);
		lb1.setBounds(0, 17, 150, 75);
		add(lb1);
		lb1.setIcon(icon1);
		
		JLabel lb2 = new JLabel("New label");
		ImageIcon icon2 = new ImageIcon(pic[witch+1]);
		lb2.setBounds(0, 102, 150, 75);
		add(lb2);
		lb2.setIcon(icon2);
		
		JLabel lb3 = new JLabel("New label");
		ImageIcon icon3 = new ImageIcon(pic[witch+2]);
		lb3.setBounds(0, 187, 150, 75);
		add(lb3);
		lb3.setIcon(icon3);
		
		JLabel lb4 = new JLabel("New label");
		ImageIcon icon4 = new ImageIcon(pic[witch+3]);
		lb4.setBounds(0, 285, 150, 75);
		add(lb4);
		lb4.setIcon(icon4);
		
		JLabel lb5 = new JLabel("New label");
		ImageIcon icon5 = new ImageIcon(pic[witch+4]);
		lb5.setBounds(0, 384, 150, 75);
		add(lb5);
		lb5.setIcon(icon5);
		
		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.BOLD, 20));
		textField.setBounds(271, 17, 144, 29);
		menuDAO dao = new menuDAO();
		ArrayList list = dao.selectAll();
			menuDTO dto = (menuDTO)list.get(0);
			textField.setText(dto.getPname());
		add(textField);
		textField.setColumns(10);
		name = textField.getText();
		textField.setEditable(false);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(271, 63, 144, 29);
			textField_1.setText(dto.getPrice() + "¿ø");
		add(textField_1);
		price = textField_1.getText();
		textField_1.setEditable(false);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("±¼¸²", Font.BOLD, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(271, 102, 144, 29);
			menuDTO dto1 = (menuDTO)list.get(1);
			textField_2.setText(dto1.getPname());
		add(textField_2);
		textField_2.setEditable(false);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("±¼¸²", Font.BOLD, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(271, 148, 144, 29);
			textField_3.setText(dto1.getPrice() + "¿ø");
		add(textField_3);
		textField_3.setEditable(false);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("±¼¸²", Font.BOLD, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(271, 187, 144, 29);
			menuDTO dto2 = (menuDTO)list.get(2);
			textField_4.setText(dto2.getPname());
		add(textField_4);
		textField_4.setEditable(false);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("±¼¸²", Font.BOLD, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(271, 233, 144, 29);
			textField_5.setText(dto2.getPrice());
		add(textField_5);
		textField_5.setEditable(false);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("±¼¸²", Font.BOLD, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(271, 285, 144, 29);
			menuDTO dto3 = (menuDTO)list.get(3);
			textField_6.setText(dto3.getPname());
		add(textField_6);
		textField_6.setEditable(false);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("±¼¸²", Font.BOLD, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(271, 331, 144, 29);
			textField_7.setText(dto3.getPrice());
		add(textField_7);
		textField_7.setEditable(false);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("±¼¸²", Font.BOLD, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(271, 384, 144, 29);
			menuDTO dto4 = (menuDTO)list.get(4);
			textField_8.setText(dto4.getPname());
		add(textField_8);
		textField_8.setEditable(false);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("±¼¸²", Font.BOLD, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(271, 430, 144, 29);
			textField_9.setText(dto4.getPrice());
		add(textField_9);
		textField_9.setEditable(false);
		
		JButton b1 = new JButton("\uC120\uD0DD"); //¼±ÅÃ¹öÆ°
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jframePay pay = new jframePay(win);
			}
		});
		b1.setBackground(Color.CYAN);
		b1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		b1.setBounds(437, 34, 97, 42);
		add(b1);
		
		b2 = new JButton("\uC120\uD0DD");
		b2.setFont(new Font("±¼¸²", Font.BOLD, 20));
		b2.setBackground(Color.CYAN);
		b2.setBounds(437, 116, 97, 42);
		add(b2);
		
		b3 = new JButton("\uC120\uD0DD");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		b3.setFont(new Font("±¼¸²", Font.BOLD, 20));
		b3.setBackground(Color.CYAN);
		b3.setBounds(437, 202, 97, 42);
		add(b3);
		
		b4 = new JButton("\uC120\uD0DD");
		b4.setFont(new Font("±¼¸²", Font.BOLD, 20));
		b4.setBackground(Color.CYAN);
		b4.setBounds(437, 300, 97, 42);
		add(b4);
		
		b5 = new JButton("\uC120\uD0DD");
		b5.setFont(new Font("±¼¸²", Font.BOLD, 20));
		b5.setBackground(Color.CYAN);
		b5.setBounds(437, 398, 97, 42);
		add(b5);
		
		b7 = new JButton("\uB4A4\uB85C"); //µÚ·Î°¡±â ¹öÆ°
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("jpanelMenu");
			}
		});
		b7.setBackground(Color.GREEN);
		b7.setFont(new Font("±¼¸²", Font.BOLD, 20));
		b7.setBounds(201, 498, 123, 49);
		add(b7);
		
		lblNewLabel = new JLabel("\uC81C\uD488\uC774\uB984");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lblNewLabel.setBounds(162, 17, 97, 29);
		add(lblNewLabel);
		
		label = new JLabel("\uC81C\uD488\uAC00\uACA9");
		label.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label.setBounds(162, 63, 97, 29);
		add(label);
		
		label_1 = new JLabel("\uC81C\uD488\uC774\uB984");
		label_1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label_1.setBounds(162, 102, 97, 29);
		add(label_1);
		
		label_2 = new JLabel("\uC81C\uD488\uAC00\uACA9");
		label_2.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label_2.setBounds(162, 148, 97, 29);
		add(label_2);
		
		label_3 = new JLabel("\uC81C\uD488\uC774\uB984");
		label_3.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label_3.setBounds(162, 187, 97, 29);
		add(label_3);
		
		label_4 = new JLabel("\uC81C\uD488\uAC00\uACA9");
		label_4.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label_4.setBounds(162, 233, 97, 29);
		add(label_4);
		
		label_5 = new JLabel("\uC81C\uD488\uC774\uB984");
		label_5.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label_5.setBounds(162, 285, 97, 29);
		add(label_5);
		
		label_6 = new JLabel("\uC81C\uD488\uAC00\uACA9");
		label_6.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label_6.setBounds(162, 331, 97, 29);
		add(label_6);
		
		label_7 = new JLabel("\uC81C\uD488\uC774\uB984");
		label_7.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label_7.setBounds(162, 384, 97, 29);
		add(label_7);
		
		label_8 = new JLabel("\uC81C\uD488\uAC00\uACA9");
		label_8.setFont(new Font("±¼¸²", Font.BOLD, 20));
		label_8.setBounds(162, 430, 97, 29);
		add(label_8);
		
		setVisible(true);
		
	}
}
