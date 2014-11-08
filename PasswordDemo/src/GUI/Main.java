package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JPasswordField pwdPwdfld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOk.setBounds(308, 68, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(308, 102, 89, 23);
		contentPane.add(btnHelp);
		
		pwdPwdfld = new JPasswordField();
		pwdPwdfld.setText("pwdFld");
		pwdPwdfld.setBounds(79, 102, 209, 23);
		pwdPwdfld.setActionCommand(OK);
		pwdPwdfld.addActionListener(this);
		contentPane.add(pwdPwdfld);
		
		JLabel lblEnterPassword = new JLabel("Enter Password:");
		lblEnterPassword.setBounds(79, 72, 106, 14);
		contentPane.add(lblEnterPassword);
	}
	
	public void actionPerformed(ActionEvent e) {
	    String cmd = e.getActionCommand();

	    if (OK.equals(cmd)) { //Process the password.
	        char[] input = passwordField.getPassword();
	        if (isPasswordCorrect(input)) {
	            JOptionPane.showMessageDialog(controllingFrame,
	                "Success! You typed the right password.");
	        } else {
	            JOptionPane.showMessageDialog(controllingFrame,
	                "Invalid password. Try again.",
	                "Error Message",
	                JOptionPane.ERROR_MESSAGE);
	        }

	        //Zero out the possible password, for security.
	        Arrays.fill(input, '0');

	        passwordField.selectAll();
	        resetFocus();
	    } else ...//handle the Help button...
	}
}


