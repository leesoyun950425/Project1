import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BorderSelect extends JFrame{
	static JLabel conLb;
	int inputNum;
	String userid;
	
	public BorderSelect() {
		
		inputNum = BorderMain.num;
		userid = LoginMain2.inputId;

		BorderDAO dao = new BorderDAO();
		BorderDTO dto1 = dao.selectNum(inputNum);
		
		String title1 = dto1.getTitle();
		String content1 = dto1.getContent();
		String uid1 = dto1.getUid();
		
		setSize(363,457);
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC81C\uBAA9");
		lblNewLabel.setBounds(50, 31, 57, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel titleLb = new JLabel();
		titleLb.setBounds(167, 31, 57, 15);
		getContentPane().add(titleLb);
		titleLb.setText(title1);
		
		
		JLabel lblNewLabel_2 = new JLabel("\uB0B4\uC6A9");
		lblNewLabel_2.setBounds(128, 56, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		conLb = new JLabel();
		conLb.setBounds(22, 81, 296, 210);
		getContentPane().add(conLb);
		conLb.setText(content1);
		
		JLabel lblNewLabel_4 = new JLabel("\uC544\uC774\uB514 :");
		lblNewLabel_4.setBounds(76, 319, 57, 15);
		getContentPane().add(lblNewLabel_4);
		
		JLabel idLb = new JLabel();
		idLb.setBounds(167, 319, 57, 15);
		getContentPane().add(idLb);
		idLb.setText(uid1);
		
		JButton btnNewButton = new JButton("수정");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!uid1.equals(userid)) {
					JOptionPane.showMessageDialog(null, "본인이 작성한 게시물만 수정가능합니다!!");
				}else {
					BorderUpdate bu = new BorderUpdate();
					dispose();
				}
			}
		});
		btnNewButton.setBounds(50, 364, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("삭제");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BorderDelete bd = new BorderDelete();
			}
		});
		btnNewButton_1.setBounds(186, 364, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderSelect name = new BorderSelect();
	}
}