import javax.swing.JFrame;

public class MainTest extends JFrame{
	public MainTest() {
	}

	static MainTest win2;

	public LoginMain login1 = null;
	public LoginMain2 login2 = null;

	 public void change2(String panelName) {
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
		MainTest win2 = new MainTest();
		
		win2.login1 = new LoginMain(win2);
		win2.login2 = new LoginMain2(win2);
		win2.setTitle("로그인창");
		win2.getContentPane().add(win2.login1);
		win2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win2.setSize(400, 700);
		win2.setVisible(true);
	 }
}
