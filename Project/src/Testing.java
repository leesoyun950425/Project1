//import java.awt.*;
//
//import javax.swing.*;
//
//class Testing {
//	public void buildGUI() {
//		JFrame f = new JFrame();
//		f.setSize(600,600);
//		JPanel p = new JPanel();	
//		p.add(createPanel());
//		f.getContentPane().add(p);
//		
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.pack();
//		f.setLocationRelativeTo(null);
//		f.setVisible(true);
//	}
//	
//	private JPanel createPanel() {
//		JPanel p2 = new JPanel();
//		JButton b1 = new JButton("b1");
//		JButton b2 = new JButton("b2");
//		JButton b3 = new JButton("b3");
//		p2.add(b1);
//		p2.add(b2);
//		p2.add(b3);
//		JButton b4 = new JButton("b4");
//		JButton b5 = new JButton("b5");
//		JButton b6 = new JButton("b6");
//		p2.add(b4);
//		p2.add(b5);
//		p2.add(b6);
//		final JScrollPane scroll = new JScrollPane(p2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//		scroll.setPreferredSize(new Dimension(600,100));
//		JPanel p = new JPanel();
//		p.setLayout(new BorderLayout());
//		p.add(scroll,BorderLayout.CENTER);
//		p.setPreferredSize(new Dimension(200,100));
//		p.setVisible(true);
//		
//		return p;
//	}
//	public static void main(String[] args) {
//		new Testing().buildGUI();
//	}
//}
