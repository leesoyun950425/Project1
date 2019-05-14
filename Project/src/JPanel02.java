import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanel02 extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanelTest win;
	
	public JPanel02(JPanelTest win) {
		setLayout(null);
		this.win = win;
		JLabel l1 = new JLabel("아이디");
		l1.setBounds(31, 40, 67, 15);
		add(l1);
		
		textField = new JTextField();
		textField.setBounds(123, 40, 116, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel l2 = new JLabel("비밀번호");
		l2.setBounds(31, 84, 67, 15);
		add(l2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(123, 84, 116, 21);
		add(passwordField);
		
		JButton btn = new JButton("버튼");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("panel01");
			}
		});
		btn.setSize(70,20);
		btn.setLocation(10, 10);
		add(btn);
		
	}
}
