import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JToolBar;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class MembershipMain extends JFrame{
	private JTextField idText;
	private JTextField nameText;
	private JTextField telText;
	private JTextField addrText;
	private JPasswordField pwText;
	private JPasswordField pwTextTest;
	public MembershipMain() {
		
		setBackground(new Color(255, 255, 224));
		setSize(400, 368);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("¾ÆÀÌµð");
		lblNewLabel_1.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		lblNewLabel_1.setBounds(12, 46, 100, 15);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ºñ¹Ð¹øÈ£");
		lblNewLabel_2.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		lblNewLabel_2.setBounds(12, 82, 100, 15);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ºñ¹Ð¹øÈ£ È®ÀÎ");
		lblNewLabel_3.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		lblNewLabel_3.setBounds(12, 117, 100, 15);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ÀÌ¸§");
		lblNewLabel_4.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		lblNewLabel_4.setBounds(12, 151, 100, 15);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ÀüÈ­¹øÈ£");
		lblNewLabel_5.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		lblNewLabel_5.setBounds(12, 189, 100, 15);
		getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ÁÖ¼Ò");
		lblNewLabel_6.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		lblNewLabel_6.setBounds(12, 231, 100, 15);
		getContentPane().add(lblNewLabel_6);
		
		idText = new JTextField();
		idText.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		idText.setBounds(124, 40, 139, 21);
		getContentPane().add(idText);
		idText.setColumns(10);

		nameText = new JTextField();
		nameText.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		nameText.setBounds(124, 145, 139, 21);
		getContentPane().add(nameText);
		nameText.setColumns(10);
		
		telText = new JTextField();
		telText.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		telText.setBounds(124, 183, 139, 21);
		getContentPane().add(telText);
		telText.setColumns(10);
		
		addrText = new JTextField();
		addrText.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		addrText.setBounds(124, 225, 253, 21);
		getContentPane().add(addrText);
		addrText.setColumns(10);
		
		JButton b2 = new JButton("È¸¿ø°¡ÀÔ ¿Ï·á");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MembershipDAO dao = new MembershipDAO();
				MembershipDTO dto = new MembershipDTO();
				
				String id = idText.getText();
				String pws = new String(pwText.getPassword());
				String pws2 = new String(pwTextTest.getPassword());
				String name = nameText.getText();
				String tel = telText.getText();
				String addr = addrText.getText();
				
				dto.setId(id);
				dto.setPw(pws);
				dto.setName(name);
				dto.setTel(tel);
				dto.setAddr(addr);
				
				dto = dao.selectId(id);
				String selid = dto.getId();
				
				if(!pws.equals(pws2)) {
					JOptionPane.showMessageDialog(null,"ºñ¹Ð¹øÈ£°¡ ÀÏÄ¡ÇÏÁö ¾Ê½À´Ï´Ù!!");
					
				}else if(id.equals(selid)){
					JOptionPane.showMessageDialog(null,"¾ÆÀÌµð Áßº¹Ã¼Å© ÇØÁÖ¼¼¿ä!!");
				}else {
					dao.insert(dto);
					dispose();
				}
			}
			
		});
		b2.setForeground(new Color(255, 105, 180));
		b2.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		b2.setBounds(124, 280, 119, 23);
		getContentPane().add(b2);
		
		JButton b1 = new JButton("Áßº¹È®ÀÎ");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputId = idText.getText();
				MembershipDAO dao = new MembershipDAO();
				MembershipDTO dto = dao.selectId(inputId);
				String id = dto.getId();
				
				if(inputId.equals(id)) {
					JOptionPane.showMessageDialog(null, "Áßº¹µÆ½À´Ï´Ù.´Ù½ÃÀÔ·ÂÇÏ¼¼¿ä");
				}else {
					JOptionPane.showMessageDialog(null, "¼º°ø");
				}
				
				}
		});
		b1.setForeground(new Color(255, 105, 180));
		b1.setFont(new Font("³ª´®°íµñ", Font.BOLD, 14));
		b1.setBounds(288, 43, 100, 23);
		getContentPane().add(b1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setForeground(Color.BLACK);
		toolBar.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 17));
		toolBar.setToolTipText("È¸¿ø°¡ÀÔ");
		toolBar.setBackground(new Color(100, 149, 237));
		toolBar.setBounds(0, 0, 400, 21);
		getContentPane().add(toolBar);
		
		pwText = new JPasswordField();
		pwText.setBounds(124, 79, 139, 21);
		getContentPane().add(pwText);
		
		pwTextTest = new JPasswordField();
		pwTextTest.setBounds(124, 114, 139, 21);
		getContentPane().add(pwTextTest);
	
		setVisible(true);
	}
}