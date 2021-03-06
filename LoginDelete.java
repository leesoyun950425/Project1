import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LoginDelete extends JFrame{
	static String inputDId;
	static JLabel idLBel;
	private MainTest win2;
	
	public LoginDelete(MainTest win2) {
		setTitle("\uD0C8\uD1F4\uCC3D");
		getContentPane().setBackground(new Color(255, 228, 225));
		this.win2 = win2;
		getContentPane().setLayout(null);
		setSize(430, 284);
		
		JLabel lblNewLabel = new JLabel("���� Ż���Ͻðڽ��ϱ�?");
		lblNewLabel.setForeground(new Color(219, 112, 147));
		lblNewLabel.setFont(new Font("���� ����", Font.BOLD, 25));
		lblNewLabel.setBounds(60, 65, 319, 33);
		getContentPane().add(lblNewLabel);
		
		idLBel = new JLabel();
		idLBel.setForeground(new Color(178, 34, 34));
		idLBel.setFont(new Font("���� ����", Font.BOLD, 20));
		idLBel.setBounds(60, 29, 82, 21);
		getContentPane().add(idLBel);
		
		inputDId = LoginMain2.inputId;
		
		JButton btnNewButton = new JButton("��,�����ҰԿ�.");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(219, 112, 147));
		btnNewButton.setFont(new Font("���� ����", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MembershipDAO dao = new MembershipDAO();
				MembershipDTO dto = new MembershipDTO();
				
				String id = inputDId;
				dto = dao.selectId(id);
				
				if(id.equals(dto.getId())) {
					dto.setId(id);
					dao.delete(dto);
				}
				win2.change2("LoginMain");
				dispose();
			}
		});
		btnNewButton.setBounds(36, 144, 153, 29);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("�ƴϿ�.");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(219, 112, 147));
		btnNewButton_1.setFont(new Font("���� ����", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(232, 144, 129, 29);
		getContentPane().add(btnNewButton_1);
		
		JLabel label = new JLabel("��,");
		label.setForeground(new Color(219, 112, 147));
		label.setFont(new Font("���� ����", Font.BOLD, 20));
		label.setBounds(168, 31, 82, 21);
		getContentPane().add(label);
		
		setVisible(true);
	}
}