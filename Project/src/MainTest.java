import javax.swing.JFrame;

public class MainTest extends JFrame{
	
	
	
	public MainTest() {
	}
	
	public LoginMain login1 = null;
	public LoginMain2 login2 = null;
	 
	 public void change(String panelName) {
			if(panelName.equals("LoginMain")) {
				getContentPane().removeAll();
				getContentPane().add(login1);
				revalidate();
				repaint();
			}else {
				getContentPane().removeAll();
				getContentPane().add(login2);
				revalidate();
				repaint();
			}
		}
	public static void main(String[] args) {
		MainTest win = new MainTest();
		
		win.login1 = new LoginMain(win);
		win.login2 = new LoginMain2(win);
		
		win.getContentPane().add(win.login1);
		win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win.setSize(500, 700);
		win.setVisible(true);
	}
}
