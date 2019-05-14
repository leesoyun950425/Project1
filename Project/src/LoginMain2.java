import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class LoginMain2 extends JPanel{
	private MainTest win;
	public LoginMain login;
	String inputId;
	private JTextField t1;
	public LoginMain log;
	
//	public LoginMain2() {
//		System.out.println(LoginMain.inputId);
//	}
	
	
	public LoginMain2() {
		inputId = LoginMain.sessionId;
		System.out.println(inputId);
	}
	
	/**
	 * @wbp.parser.constructor
	 */
	public LoginMain2(MainTest win) {
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		this.win = win;
		
		setLayout(null);
		
		String session = log.sessionId;
		
		JLabel l1 = new JLabel();
		l1.setForeground(Color.black);
		l1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		l1.setBounds(84, 63, 244, 24);
		add(l1);
		l1.setText(session);
		
		
		JLabel lblNewLabel = new JLabel("´Ô È¯¿µÇÕ´Ï´Ù.");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lblNewLabel.setBounds(84, 91, 281, 33);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("¼öÁ¤");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(68, 144, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("·Î±×¾Æ¿ô");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("LoginMain");
			}
		});
		btnNewButton_1.setBounds(188, 144, 97, 23);
		add(btnNewButton_1);
		
		t1 = new JTextField();
		t1.setBounds(84, 32, 116, 21);
		add(t1);
		t1.setColumns(10);
		
		t1.setText(session);
	}
}
