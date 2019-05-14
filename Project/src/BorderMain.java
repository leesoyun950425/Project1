
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;

public class BorderMain extends JFrame{
	private JTextField textField;
	public BorderMain() {
		setTitle("°Ô½ÃÆÇ");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<<<Á¦¸ñ>>>");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		lblNewLabel.setBounds(17, 41, 161, 28);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		textField.setBounds(195, 42, 342, 33);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("<<<<<³»¿ë>>>>>");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 22));
		lblNewLabel_1.setBounds(187, 98, 223, 31);
		getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(50, 144, 457, 206);
		getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(206, 452, 129, 29);
		getContentPane().add(btnNewButton);
		setSize(600,600);
		setVisible(true);
	}
}