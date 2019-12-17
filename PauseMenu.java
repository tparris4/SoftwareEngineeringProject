import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;


public class PauseMenu {

	private JFrame frame;
	private JTextField txtPauseMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PauseMenu window = new PauseMenu();
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
	public PauseMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 449, 757);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtPauseMenu = new JTextField();
		txtPauseMenu.setText("PAUSE MENU");
		txtPauseMenu.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		txtPauseMenu.setColumns(10);
		txtPauseMenu.setBounds(144, 47, 142, 50);
		frame.getContentPane().add(txtPauseMenu);
		
		JButton btnSaveGame = new JButton("SAVE GAME");
		btnSaveGame.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnSaveGame.setBackground(Color.RED);
		btnSaveGame.setBounds(134, 184, 175, 50);
		frame.getContentPane().add(btnSaveGame);
		
		JButton btnLoadGame = new JButton("LOAD GAME");
		btnLoadGame.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnLoadGame.setBackground(Color.RED);
		btnLoadGame.setBounds(134, 273, 175, 50);
		frame.getContentPane().add(btnLoadGame);
		
		JButton btnSettings = new JButton("SETTINGS");
		btnSettings.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnSettings.setBackground(Color.RED);
		btnSettings.setBounds(134, 365, 175, 50);
		frame.getContentPane().add(btnSettings);
		
		JButton btnContinue = new JButton("CONTINUE");
		btnContinue.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnContinue.setBackground(Color.RED);
		btnContinue.setBounds(134, 455, 175, 50);
		frame.getContentPane().add(btnContinue);
		
		JButton btnExitGame = new JButton("EXIT GAME");
		btnExitGame.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnExitGame.setBackground(Color.RED);
		btnExitGame.setBounds(134, 557, 175, 50);
		frame.getContentPane().add(btnExitGame);
	}

}
