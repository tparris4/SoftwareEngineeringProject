import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Save {

	private JFrame frame;
	private JTextField txtSaveGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Save window = new Save();
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
	public Save() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 477, 765);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtSaveGame = new JTextField();
		txtSaveGame.setText("SAVE GAME");
		txtSaveGame.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		txtSaveGame.setColumns(10);
		txtSaveGame.setBounds(168, 50, 126, 50);
		frame.getContentPane().add(txtSaveGame);
		
		JButton btnSaveOne = new JButton("SAVE ONE");
		btnSaveOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSaveOne.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnSaveOne.setBackground(Color.RED);
		btnSaveOne.setBounds(147, 174, 175, 50);
		frame.getContentPane().add(btnSaveOne);
		
		JButton btnSaveTwo = new JButton("SAVE TWO");
		btnSaveTwo.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnSaveTwo.setBackground(Color.RED);
		btnSaveTwo.setBounds(147, 263, 175, 50);
		frame.getContentPane().add(btnSaveTwo);
		
		JButton btnSaveThree = new JButton("SAVE THREE");
		btnSaveThree.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnSaveThree.setBackground(Color.RED);
		btnSaveThree.setBounds(147, 355, 175, 50);
		frame.getContentPane().add(btnSaveThree);
		
		JButton btnSaveFour = new JButton("SAVE FOUR");
		btnSaveFour.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnSaveFour.setBackground(Color.RED);
		btnSaveFour.setBounds(147, 445, 175, 50);
		frame.getContentPane().add(btnSaveFour);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(147, 547, 175, 50);
		frame.getContentPane().add(btnCancel);
	}

}
