import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class BorderSelect extends JFrame{
	static JLabel conLb;
	
	Object value;
	public BorderSelect() {
		
		value = BorderMain.cValue;
		

		BorderDAO dao = new BorderDAO();
		BorderDTO dto1 = dao.select(value);
		
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
		
		JButton btnNewButton = new JButton("\uC218\uC815");
		btnNewButton.setBounds(50, 364, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.setBounds(186, 364, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		BorderSelect name = new BorderSelect();
	}
}
