package FunctionsUser;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import Details.loginDataB;
import Selling.SignIn;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class NewUser extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsern;
	private JTextField txtnPass;
	private JTextField txtCPass;
	private loginDataB D;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUser frame = new NewUser();
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
	public NewUser() {
		setResizable(false);
		setTitle("New User");
		setLocationRelativeTo(this);
		setBounds(100, 100, 674, 383);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 224, 208));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		D=new loginDataB();
		
		JLabel lblNUser = new JLabel("Username");
		lblNUser.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNUser.setBounds(44, 22, 111, 27);
		contentPane.add(lblNUser);
		
		JLabel lblNPassword = new JLabel("New Password");
		lblNPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNPassword.setBounds(44, 82, 139, 27);
		contentPane.add(lblNPassword);
		
		JLabel lblCPassword = new JLabel("Confirm Password");
		lblCPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCPassword.setBounds(44, 135, 163, 27);
		contentPane.add(lblCPassword);
		
		txtUsern = new JTextField();
		txtUsern.setBounds(239, 27, 182, 27);
		contentPane.add(txtUsern);
		txtUsern.setColumns(10);
		
		txtnPass = new JTextField();
		txtnPass.setColumns(10);
		txtnPass.setBounds(239, 87, 182, 27);
		contentPane.add(txtnPass);
		
		txtCPass = new JTextField();
		txtCPass.setColumns(10);
		txtCPass.setBounds(239, 140, 182, 27);
		contentPane.add(txtCPass);
		
		JButton btnCreateUser = new JButton("Create User");
		btnCreateUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userID=txtUsern.getText();
				String password=txtCPass.getText();
				String cPass=txtCPass.getText();
				
				if(password.equals(cPass)) {
					SignIn S=new SignIn(userID, cPass);
					boolean result=D.add(S);
					if(result) {
						JOptionPane.showMessageDialog(contentPane, "New user is added");
					}else {
						JOptionPane.showMessageDialog(contentPane, "New user is not added");
					}
				
				}
			}
		});
		btnCreateUser.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCreateUser.setBounds(110, 234, 153, 46);
		contentPane.add(btnCreateUser);
		
		JButton btnNExit = new JButton("Exit");
		btnNExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNExit.setBounds(327, 234, 153, 46);
		contentPane.add(btnNExit);
		
	}
}
