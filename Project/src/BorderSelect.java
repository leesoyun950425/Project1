import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class BorderSelect extends JFrame{
	static JLabel Conlb;
	
	public BorderSelect() {
		
		setSize(363,457);
		
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC81C\uBAA9");
		lblNewLabel.setBounds(50, 31, 57, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel Textlb = new JLabel("New label");
		Textlb.setBounds(167, 31, 57, 15);
		getContentPane().add(Textlb);
		
		JLabel lblNewLabel_2 = new JLabel("\uB0B4\uC6A9");
		lblNewLabel_2.setBounds(128, 56, 57, 15);
		getContentPane().add(lblNewLabel_2);
		
		Conlb = new JLabel("New label");
		Conlb.setBounds(22, 81, 296, 210);
		getContentPane().add(Conlb);
		
		JLabel lblNewLabel_4 = new JLabel("\uC544\uC774\uB514 :");
		lblNewLabel_4.setBounds(76, 319, 57, 15);
		getContentPane().add(lblNewLabel_4);
		
		JLabel Idlb = new JLabel("New label");
		Idlb.setBounds(167, 319, 57, 15);
		getContentPane().add(Idlb);
		
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
