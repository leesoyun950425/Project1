import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SelectPw extends JFrame{
	private JTextField nameText;
	private JTextField idText;
	
	public SelectPw() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984");
		lblNewLabel.setBounds(32, 74, 57, 15);
		getContentPane().add(lblNewLabel);
		
		nameText = new JTextField();
		nameText.setBounds(109, 71, 116, 21);
		getContentPane().add(nameText);
		nameText.setColumns(10);
		
		JButton btnNewButton = new JButton("\uBE44\uBC00\uBC88\uD638 \uCC3E\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputId = idText.getText();
				String inputName = nameText.getText();
				
				MembershipDAO dao = new MembershipDAO();
				MembershipDTO dto = dao.selectPwName(inputId, inputName);
				String pw = dto.getPw();
				
				if(pw==null) {
					JOptionPane.showMessageDialog(null, "입력하신 정보는 없습니다");
				}else {
					JOptionPane.showMessageDialog(null, "찾은 비밀번호 : "+pw);
					dispose();
					LoginMain.pwText.setText(pw);
				}
			}
		});
		btnNewButton.setBounds(55, 137, 122, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("\uC544\uC774\uB514");
		lblNewLabel_2.setBounds(32, 42, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		idText = new JTextField();
		idText.setBounds(109, 39, 116, 21);
		getContentPane().add(idText);
		idText.setColumns(10);
		setSize(253,250);
		setVisible(true);
	}
}
