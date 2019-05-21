import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BorderDelete extends JFrame{
	public BorderDelete() {
		setSize(241, 179);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC0AD\uC81C\uD558\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(30, 32, 169, 41);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("³×");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(30, 90, 63, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC544\uB2C8\uC694.");
		btnNewButton_1.setBounds(105, 90, 97, 23);
		getContentPane().add(btnNewButton_1);
		setVisible(true);
		
	}
}
