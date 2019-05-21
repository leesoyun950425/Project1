import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BorderUpdate extends JFrame{
	private JTextField titleText;
	int numUp;
	
	public BorderUpdate() {
		setSize(363,457);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC81C\uBAA9");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(39, 29, 57, 15);
		getContentPane().add(lblNewLabel);
		
		titleText = new JTextField();
		titleText.setBounds(131, 26, 116, 21);
		getContentPane().add(titleText);
		titleText.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uB0B4\uC6A9");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(131, 54, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		JTextArea contentText = new JTextArea();
		contentText.setBounds(25, 89, 294, 221);
		getContentPane().add(contentText);
		
		
		JButton btnNewButton = new JButton("수정완료");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BorderDAO dao = new BorderDAO();
				BorderDTO dto = new BorderDTO();
				
				String title = titleText.getText();
				String content = contentText.getText();
				numUp = BorderMain.num;
				
				dto.setTitle(title);
				dto.setContent(content);
				dto.setNum(numUp);
				
				dao.update(dto);
				dispose();
			}
		});
		btnNewButton.setBounds(113, 363, 97, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("\uC544\uC774\uB514 : ");
		lblNewLabel_2.setBounds(68, 323, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		String uid = LoginMain2.inputId;
		JLabel uidLb = new JLabel();
		uidLb.setBounds(137, 323, 110, 15);
		getContentPane().add(uidLb);
		uidLb.setText(uid);
		
		setVisible(true);
	}
}