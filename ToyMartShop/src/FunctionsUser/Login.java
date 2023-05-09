package FunctionsUser;

import java.awt.BorderLayout;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JOptionPane;
import Selling.SignIn;
import Details.loginDataB;





public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * 
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("UserID");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsername.setBounds(76, 45, 130, 37);
		contentPane.add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setBackground(new Color(255, 248, 220));
		txtUsername.setForeground(new Color(0, 0, 0));
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtUsername.setBounds(261, 52, 179, 27);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(76, 122, 83, 27);
		contentPane.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBackground(new Color(255, 250, 205));
		txtPassword.setForeground(new Color(50, 205, 50));
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtPassword.setBounds(261, 129, 179, 27);
		contentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(255, 255, 0));
		btnLogin.setForeground(new Color(255, 0, 255));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				loginDataB log= new loginDataB();
				
				String userID=txtUsername.getText();
				String Password=txtPassword.getText();
				
				SignIn sign= log.get(userID);
				
				if(sign!= null && (sign.getpass().equals(Password))) {
					
					Permission.userID=userID;
					ToyMartIn tmi=new ToyMartIn();
					tmi.setVisible(true);
					
				}else
					JOptionPane.showMessageDialog(contentPane,"Invalid userID or Password!.Please Try again");
				
			}
			
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnLogin.setBounds(96, 233, 110, 37);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(new Color(255, 255, 0));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setForeground(new Color(255, 0, 255));
		btnExit.setBounds(292, 233, 102, 37);
		contentPane.add(btnExit);
	}

}
