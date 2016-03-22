import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class main extends JPanel implements ActionListener{

	JButton enterBTN, quitBTN;
	JTextField jtxt;
	JLabel userID;

	public main(){
		super(new BorderLayout());
		jtxt = new JTextField();
		jtxt.setBounds(5, 5, 5, 5);
		jtxt.setEditable(true);
		enterBTN = new JButton("Enter");
		enterBTN.addActionListener(this);
		quitBTN = new JButton("Quit");
		quitBTN.addActionListener(this);

		JPanel btnPanel = new JPanel();
		btnPanel.add(enterBTN);
		btnPanel.add(quitBTN);

		userID = new JLabel("Enter your ID: ");
		add(btnPanel, BorderLayout.PAGE_END);
		add(userID, BorderLayout.PAGE_START);
		add(jtxt, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource() == quitBTN){
			System.exit(0);
		}else{
			System.out.print("Create a new window");
		}
	}


	private static void createAndShowGUI() {
		// Make sure we have nice window decorations.
		JFrame.setDefaultLookAndFeelDecorated(true);

		// Create and set up the window.
		JFrame frame = new JFrame("Hi!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create and set up the content pane.
		JComponent newContentPane = new main();

		// Content panes must be opaque
		newContentPane.setOpaque(true); 
		frame.setContentPane(newContentPane);

		// Display the window.
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
