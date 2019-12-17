import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;


public class Load {

	private JFrame frame;
	private JTextField txtLoadGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Load window = new Load();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Load() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 447, 767);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtLoadGame = new JTextField();
		txtLoadGame.setText("LOAD GAME");
		txtLoadGame.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		txtLoadGame.setColumns(10);
		txtLoadGame.setBounds(142, 59, 139, 50);
		frame.getContentPane().add(txtLoadGame);
		
		JButton button = new JButton("CANCEL");
		button.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		button.setBackground(Color.RED);
		button.setBounds(129, 593, 175, 50);
		frame.getContentPane().add(button);
		
		JButton btnLoadFour = new JButton("LOAD FOUR");
		btnLoadFour.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnLoadFour.setBackground(Color.RED);
		btnLoadFour.setBounds(129, 491, 175, 50);
		frame.getContentPane().add(btnLoadFour);
		
		JButton btnLoadThree = new JButton("LOAD THREE");
		btnLoadThree.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnLoadThree.setBackground(Color.RED);
		btnLoadThree.setBounds(129, 401, 175, 50);
		frame.getContentPane().add(btnLoadThree);
		
		JButton btnLoadTwo = new JButton("LOAD TWO");
		btnLoadTwo.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnLoadTwo.setBackground(Color.RED);
		btnLoadTwo.setBounds(129, 309, 175, 50);
		frame.getContentPane().add(btnLoadTwo);
		
		JButton btnLoadOne = new JButton("LOAD ONE");
		btnLoadOne.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnLoadOne.setBackground(Color.RED);
		btnLoadOne.setBounds(129, 220, 175, 50);
		frame.getContentPane().add(btnLoadOne);
	}

}
