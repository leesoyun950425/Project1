import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableTest {
	public static void main(String[] args) {
		Dimension dim = new Dimension(400,150);
		
		JFrame f = new JFrame();
		f.setLocation(200,400);
		f.setPreferredSize(dim);
		
		String header[] = {"�л��̸�","����","����","����"};
		String contents[][]= {{"�ڿ���","90","87","98"},{"�迵��","100","99","100"}};
		
		JTable table = new JTable(contents,header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.pack();
		f.setVisible(true);
	}
}
