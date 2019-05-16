
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;

public class BorderWrite extends JFrame{
	
	private JTextField titleText;
	
	String inputBId;
	
	public BorderWrite() {
		setTitle("°Ô½ÃÆÇ");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<<<Á¦¸ñ>>>");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		lblNewLabel.setBounds(17, 41, 161, 28);
		getContentPane().add(lblNewLabel);
		
		titleText = new JTextField();
		titleText.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		titleText.setBounds(195, 42, 342, 33);
		getContentPane().add(titleText);
		titleText.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("<<<<<³»¿ë>>>>>");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 22));
		lblNewLabel_1.setBounds(187, 98, 223, 31);
		getContentPane().add(lblNewLabel_1);
		
		JTextArea contentText = new JTextArea();
		contentText.setBounds(50, 144, 457, 206);
		getContentPane().add(contentText);
		
		inputBId = LoginMain2.inputId;
		
		JLabel IdLb = new JLabel();
		IdLb.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 22));
		IdLb.setBounds(249, 366, 106, 42);
		getContentPane().add(IdLb);
		IdLb.setText(inputBId);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		
		String today = year+"-"+month+"-"+day;
		
		JButton btnNewButton = new JButton("ÀÔ·Â");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BorderDAO dao = new BorderDAO();
				BorderDTO dto = new BorderDTO();
				
				String title = titleText.getText();
				String content = contentText.getText();
				String uid = inputBId;
				String tdate = today;
				int count = 0;
				
				dto.setTitle(title);
				dto.setContent(content);
				dto.setUid(uid);
				dto.setTdate(tdate);
				dto.setCount(count);
				dao.insert(dto);
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 22));
		btnNewButton.setBounds(206, 452, 129, 29);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("\uC544\uC774\uB514 :");
		lblNewLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 23));
		lblNewLabel_2.setBounds(108, 370, 129, 33);
		getContentPane().add(lblNewLabel_2);
		
		setSize(576,567);
		setVisible(true);
	}
}