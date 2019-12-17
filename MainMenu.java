import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;


public class MainMenu {

	private JFrame frame;
	private JTextField txtNameOfThe;
	private JTextField txtMainMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1250, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewGame = new JButton("NEW GAME");
		btnNewGame.setBackground(new Color(255, 0, 0));
		btnNewGame.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnNewGame.setBounds(1000, 150, 175, 50);
		frame.getContentPane().add(btnNewGame);
		
		JButton btnLoadGame = new JButton("LOAD GAME");
		btnLoadGame.setBackground(new Color(255, 0, 0));
		btnLoadGame.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnLoadGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLoadGame.setBounds(1000, 250, 175, 50);
		frame.getContentPane().add(btnLoadGame);
		
		JButton btnSettings = new JButton("SETTINGS");
		btnSettings.setForeground(Color.BLACK);
		btnSettings.setBackground(new Color(255, 0, 0));
		btnSettings.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSettings.setBounds(1000, 350, 175, 50);
		frame.getContentPane().add(btnSettings);
		
		JButton btnHallOfFame = new JButton("HALL OF FAME");
		btnHallOfFame.setBackground(new Color(255, 0, 0));
		btnHallOfFame.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		btnHallOfFame.setBounds(1000, 450, 175, 50);
		frame.getContentPane().add(btnHallOfFame);
		
		JButton btnExitGame = new JButton("EXIT GAME");
		btnExitGame.setBackground(new Color(255, 0, 0));
		btnExitGame.setForeground(new Color(0, 0, 0));
		btnExitGame.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		btnExitGame.setBounds(1000, 550, 175, 50);
		frame.getContentPane().add(btnExitGame);
		
		txtNameOfThe = new JTextField();
		txtNameOfThe.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		txtNameOfThe.setText("NAME OF THE GAME");
		txtNameOfThe.setBounds(391, 49, 225, 50);
		frame.getContentPane().add(txtNameOfThe);
		txtNameOfThe.setColumns(10);
		
		txtMainMenu = new JTextField();
		txtMainMenu.setText("MAIN MENU");
		txtMainMenu.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		txtMainMenu.setColumns(10);
		txtMainMenu.setBounds(443, 112, 138, 50);
		frame.getContentPane().add(txtMainMenu);
	}
}
