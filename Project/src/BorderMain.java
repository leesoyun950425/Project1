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
import java.sql.NClob;

public class BorderMain extends JFrame{
	static JTable table;
	
	static DefaultTableModel model;
	static int num ;
	static int su;
	static String title;
	
	int nRow,nColumn;
	String cRow,cColumn;
	Object cValue;

	public BorderMain() {
		Dimension dim = new Dimension(500,500);
		
		setLocation(100,200);
		setPreferredSize(dim);		
		
		String sub[] = {"번호","제목","사용자ID","날짜","조회수"};
		
		model = new DefaultTableModel(sub,0);
		BorderDAO dao = new BorderDAO();
		ArrayList list = dao.selectAll();
		
		for (int i = 0; i < list.size(); i++) {
			BorderDTO dto = (BorderDTO)list.get(i);
			model.addRow(new Object[] {dto.getNum(),dto.getTitle(),dto.getUid(),dto.getTdate(),dto.getCount()});
			
		}
		table = new JTable(model);
		table.setBorder(new LineBorder(Color.RED));
		table.setBounds(23, 360, 349, -338);
		
		JScrollPane scroll = new JScrollPane(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				table = (JTable)e.getComponent();
				model = (DefaultTableModel)table.getModel();
				
				nRow = table.getSelectedRow();
				nColumn = table.getSelectedColumn();
				
				cRow = table.getColumnName(nColumn);
				cValue = model.getValueAt(nRow, nColumn);
				num= (int) table.getValueAt(table.getSelectedRow(), 0);
 			}
		});
		
		JButton btnNewButton = new JButton("글쓰기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(LoginMain2.l1.getText()==""||LoginMain2.l1.getText()==null) {
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
				BorderDAO dao = new BorderDAO();
				BorderDTO dto = new BorderDTO();
				title= (String) table.getValueAt(table.getSelectedRow(), 1);
				su = (int) table.getValueAt(table.getSelectedRow(), 4);
				su++;
				dto.setCount(su);
				dto.setTitle(title);
				dao.updatecount(dto);
				
				dispose();
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
		
		
		getContentPane().add(scroll);
		setSize(420, 510);
		setVisible(true);
	}

}