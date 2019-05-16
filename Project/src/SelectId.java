import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SelectId extends JFrame{
	private JTextField nameText;
	private JTextField telText;
	
	public SelectId() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984");
		lblNewLabel.setBounds(32, 54, 57, 15);
		getContentPane().add(lblNewLabel);
		
		nameText = new JTextField();
		nameText.setBounds(109, 51, 116, 21);
		getContentPane().add(nameText);
		nameText.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC804\uD654\uBC88\uD638");
		lblNewLabel_1.setBounds(32, 91, 57, 15);
		getContentPane().add(lblNewLabel_1);
		
		telText = new JTextField();
		telText.setBounds(109, 88, 116, 21);
		getContentPane().add(telText);
		telText.setColumns(10);
		
		JButton btnNewButton = new JButton("아이디찾기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String inputName = nameText.getText();
				String inputTel = telText.getText();
				
				MembershipDAO dao = new MembershipDAO();
				MembershipDTO dto = dao.selectIdName(inputName, inputTel);
				String id = dto.getId();
				
				if(id==null) {
					JOptionPane.showMessageDialog(null, "입력하신 정보는 없습니다");
				}else {
					JOptionPane.showMessageDialog(null, "찾은 아이디 : "+id);
					dispose();
					LoginMain.idText.setText(id);
				}
			}
		});
		btnNewButton.setBounds(53, 134, 122, 23);
		getContentPane().add(btnNewButton);
		setSize(253,250);
		setVisible(true);
	}
}
