import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;

public class BorderMain extends JFrame{
	private JTable table;
	
	public BorderMain() {
		Dimension dim = new Dimension(500,500);
		
		setLocation(100,200);
		setPreferredSize(dim);		
		
		JButton btnNewButton = new JButton("글쓰기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(LoginMain2.l1.getText()=="") {
					JOptionPane.showMessageDialog(null, "로그인 하고 작성해주세요!!");
				}else {
					BorderWrite bw = new BorderWrite();
				}
			}
		});
		btnNewButton.setBounds(23, 385, 97, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uAE00\uBCF4\uAE30");
		btnNewButton_1.setBounds(153, 385, 97, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC885\uB8CC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(276, 385, 97, 23);
		getContentPane().add(btnNewButton_2);
		
		
		String sub[] = {"제목","사용자ID","날짜","조회수"};
		String borcon[][]= {{"z","z","z","z"}};
		

		JTable table = new JTable(borcon,sub);
		table.setBorder(new LineBorder(Color.RED));
		table.setBounds(23, 360, 349, -338);
		JScrollPane scroll = new JScrollPane(table);
		getContentPane().add(scroll);
		setSize(420, 510);
		setVisible(true);
	}
}
