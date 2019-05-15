import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BorderMain extends JFrame{
	private JTextField textField;
	private JTextField txtid;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public BorderMain() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uAE00\uC4F0\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BorderWrite bw = new BorderWrite();
			}
		});
		btnNewButton.setBounds(23, 385, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uAE00\uBCF4\uAE30");
		btnNewButton_1.setBounds(153, 385, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC885\uB8CC");
		btnNewButton_2.setBounds(276, 385, 97, 23);
		getContentPane().add(btnNewButton_2);
		
		JTextArea list = new JTextArea();
		list.setBounds(23, 34, 354, 341);
		getContentPane().add(list);
		list.setEditable(false);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\uC81C\uBAA9");
		textField.setBounds(23, 11, 87, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		txtid = new JTextField();
		txtid.setText("\uC0AC\uC6A9\uC790ID");
		txtid.setHorizontalAlignment(SwingConstants.CENTER);
		txtid.setEditable(false);
		txtid.setColumns(10);
		txtid.setBounds(112, 11, 87, 22);
		getContentPane().add(txtid);
		
		textField_2 = new JTextField();
		textField_2.setText("\uC791\uC131\uC2DC\uAC04");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(202, 11, 87, 22);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("\uC870\uD68C\uC218");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(290, 11, 87, 22);
		getContentPane().add(textField_3);
		
		setSize(420, 510);
		setVisible(true);
	}
}
