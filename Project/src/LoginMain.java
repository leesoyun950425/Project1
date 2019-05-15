import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LoginMain extends JPanel{
	private JButton jButton1;
	private MainTest win;
	public MembershipDTO dto;
	static String sessionId;
//
//	public LoginMain() {
//	}
	public LoginMain(MainTest win) {
		 this.win = win;
	      setBackground(Color.BLACK);
	
	      setBounds(0, 66, 263, 659);
	      setLayout(null);
	      
	      JLabel lb1 = new JLabel("\uC544\uC774\uB514");
	      lb1.setFont(new Font("굴림", Font.BOLD, 18));
	      lb1.setForeground(Color.WHITE);
	      lb1.setBounds(12, 79, 57, 15);
	      add(lb1);
	      
	      JLabel lb2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
	      lb2.setFont(new Font("굴림", Font.BOLD, 18));
	      lb2.setForeground(Color.WHITE);
	      lb2.setBounds(12, 130, 76, 21);
	      add(lb2);
	      
	      
	      JTextField idText = new JTextField();
	      idText.setBounds(112, 78, 139, 21);
	      add(idText);
	      idText.setColumns(10);
	      
	      JTextField pwText = new JTextField();
	      pwText.setBounds(112, 132, 139, 21);
	      add(pwText);
	      pwText.setColumns(10);
	      
	      JButton b2 = new JButton("\uB85C\uADF8\uC778");
	      b2.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		String inputId = idText.getText();
	      		String inputPw = pwText.getText();
	      		
	      		MembershipDAO dao = new MembershipDAO();
	      		MembershipDTO dto = dao.selectId(inputId);
	      		MembershipDTO dto1 = dao.selectPw(inputPw);
	      		
	      		String id = dto.getId();
	      		String pw = dto1.getPw();
	      		
	      		if(inputId.equals(id) && inputPw.equals(pw)) {
	      			win.change("LoginMain2");
	      			sessionId = inputId;
	      			LoginMain2 login2 = new LoginMain2();
	      			login2.l1.setText(sessionId);
	      		}else {
	      			JOptionPane.showMessageDialog(null, "아이디 혹은 비밀번호를 잘못입력하셨습니다.");
	      		}
	      	}
	      });

	      b2.setFont(new Font("굴림", Font.BOLD, 16));
	      b2.setBounds(12, 189, 97, 23);
	      add(b2);
	      
	      JButton b3 = new JButton("\uD68C\uC6D0\uAC00\uC785");
	      b3.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            MembershipMain m1 = new MembershipMain();
	         }
	      });
	      b3.setFont(new Font("굴림", Font.BOLD, 16));
	      b3.setBounds(133, 189, 118, 23);
	      add(b3);
	      
	      JButton btnNewButton_1 = new JButton("게시판");
	      btnNewButton_1.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		BorderMain bm = new BorderMain();
	      	}
	      });
	      btnNewButton_1.setBounds(78, 279, 97, 23);
	      add(btnNewButton_1);
	      
	      setVisible(true);
	}
	
	
}
