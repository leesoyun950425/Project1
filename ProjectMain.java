import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProjectMain extends JFrame{
	public ProjectMain() {
		
		setTitle("ºÓ«Œ∏Ù");
		setSize(500,500);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainTest win2 = new MainTest();
				
				win2.login1 = new LoginMain(win2);
				win2.login2 = new LoginMain2(win2);
				win2.setTitle("∑Œ±◊¿Œ√¢");
				win2.getContentPane().add(win2.login1);
				win2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				win2.setSize(400, 700);
				win2.setVisible(true);
			}
		});
		btnNewButton.setBounds(90, 104, 267, 61);
		getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uBA54\uB274");
		button.setBounds(90, 231, 267, 61);
		getContentPane().add(button);
	
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ProjectMain m = new ProjectMain();
	}
}
