
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jpanelSelect extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	
	String realpname;
	String realprice;
	String realimage;

	public jpanelSelect() {
		getContentPane().setFont(new Font("±¼¸²", Font.BOLD, 15));
		
		realpname = jpanelMenu.pname1;
		realprice = jpanelMenu.price1;
		realimage = jpanelMenu.image1;
		
		String[] pic = new String[5];
		pic[0] = realimage;
		pic[1] = realimage;
		pic[2] = realimage;
		pic[3] = realimage;
		pic[4] = realimage;
		ImageIcon icon = new ImageIcon(pic[0]);
		
		setSize(536, 563);
		
		getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("\uAC80\uC0C9\uACB0\uACFC");
		lb1.setFont(new Font("±¼¸²", Font.BOLD, 30));
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setBounds(0, 10, 520, 64);
		getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("");
		lb2.setBounds(12, 102, 150, 75);
		lb2.setIcon(icon);
		getContentPane().add(lb2);
		
		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(259, 102, 226, 37);
		textField.setText(realpname);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(259, 149, 226, 37);
		textField_1.setText(realprice);
		getContentPane().add(textField_1);
		textField_1.setEditable(false);
		
		JLabel lblNewLabel = new JLabel("\uC81C\uD488\uC774\uB984");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel.setBounds(172, 102, 75, 37);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\uC81C\uD488\uAC00\uACA9");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("±¼¸²", Font.BOLD, 15));
		label.setBounds(172, 149, 75, 37);
		getContentPane().add(label);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 25));
		btnNewButton.setBounds(198, 333, 91, 37);
		getContentPane().add(btnNewButton);
		
		
		
		setVisible(true);
		
	}
}
