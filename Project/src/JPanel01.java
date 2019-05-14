import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanel01 extends JPanel{
	private JButton jButton1;
	private JTextArea jTextArea1;
	private JPanelTest win;
	
	public JPanel01(JPanelTest win) {
		this.win = win;
		setLayout(null);
		
		jButton1 = new JButton("¹öÆ°");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("panel02");
			}
		});
		jButton1.setSize(70,20);
		jButton1.setLocation(10, 10);
		add(jButton1);
		
		jTextArea1 = new JTextArea();
		
	}

}
