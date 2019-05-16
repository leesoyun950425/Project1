import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;

public class MemberMy extends JFrame{
	
	public MemberMy(){
		
		setTitle("����������");
		getContentPane().setLayout(null);
		
		JTextArea memberlist = new JTextArea();
		memberlist.setFont(new Font("���� ���", Font.BOLD, 20));
		memberlist.setBounds(12, 20, 238, 225);
		getContentPane().add(memberlist);
		
		String id = LoginMain2.inputId;
		
		MembershipDAO dao = new MembershipDAO();
		MembershipDTO dto = dao.select(id);
		
		String Uid = dto.getId();
		String name = dto.getName();
		String tel =dto.getTel();
		String addr = dto.getAddr();
		
		memberlist.append("���̵� : " +Uid+"\n");
		memberlist.append("----------------------------"+"\n");
		memberlist.append("�̸� : " +name+"\n");
		memberlist.append("----------------------------"+"\n");
		memberlist.append("��ȭ��ȣ : " +tel+"\n");
		memberlist.append("----------------------------"+"\n");
		memberlist.append("�ּ� : "+ addr+"\n");
		memberlist.append("----------------------------"+"\n");
		
		
		memberlist.setEditable(false);
		setSize(275, 297);
		
		
		setVisible(true);
		
	}
}
