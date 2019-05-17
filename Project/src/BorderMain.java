import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BorderMain extends JFrame{
	static JTable table;
	
	static DefaultTableModel model;
	
	int nRow,nColumn;
	String cRow,cColumn;
	Object cValue;

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
		
		JButton btnNewButton_1 = new JButton("글보기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BorderSelect bs = new BorderSelect();
			}
		});
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
		
		model = new DefaultTableModel(sub,0);
		BorderDAO dao = new BorderDAO();
		ArrayList list = dao.selectAll();
		
		for (int i = 0; i < list.size(); i++) {
			BorderDTO dto = (BorderDTO)list.get(i);
			model.addRow(new Object[] {dto.getTitle(),dto.getUid(),dto.getTdate(),dto.getCount()});
			
		}
		
		table = new JTable(model);
		table.setBorder(new LineBorder(Color.RED));
		table.setBounds(23, 360, 349, -338);
		
		
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				table = (JTable)e.getComponent();
				model = (DefaultTableModel)table.getModel();
				
				nRow = table.getSelectedRow();
				nColumn = table.getSelectedColumn();
				
				cRow = table.getColumnName(nColumn);
				cValue = model.getValueAt(nRow, nColumn);
				
				String str = "선택한 셀 : "+ cRow + "열"+nColumn+"번째 행, 값 :"+cValue;
				System.out.println(str);
			}
		});
		getContentPane().add(scroll);
		setSize(420, 510);
		setVisible(true);
	}
}