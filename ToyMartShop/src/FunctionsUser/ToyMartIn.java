package FunctionsUser;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;





public class ToyMartIn extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToyMartIn frame = new ToyMartIn();
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
	public ToyMartIn() {
		setTitle("Toy Mart Shop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setBounds(100, 100, 626, 411);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File Diectory");
		mnFile.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnFile.setForeground(new Color(0, 0, 205));
		menuBar.add(mnFile);
		
		JMenuItem mntmToy = new JMenuItem("Toy");
		mntmToy.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mntmToy.setForeground(new Color(138, 43, 226));
		mntmToy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
		mntmToy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Handling ty= new Handling();
				ty.setVisible(true);
			}
		});
		mnFile.add(mntmToy);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setForeground(new Color(128, 0, 128));
		mntmExit.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnHelp = new JMenu("Help");
		mnHelp.setForeground(new Color(0, 0, 255));
		mnHelp.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuBar.add(mnHelp);
		
		
		
		JMenu mnSignIn = new JMenu("Sign In");
		mnSignIn.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnSignIn.setForeground(new Color(0, 0, 255));
		menuBar.add(mnSignIn);
		
		JMenuItem mntmlogout = new JMenuItem("Log out");
		mntmlogout.setForeground(new Color(0, 100, 0));
		mntmlogout.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mntmlogout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.ALT_DOWN_MASK));
		mntmlogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login log=new Login();
				log.setVisible(true);
				setVisible(false);
				
				
			}
		});
		
		JMenuItem mntmNuser = new JMenuItem("New User");
		mntmNuser.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mntmNuser.setForeground(new Color(0, 100, 0));
		mntmNuser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NewUser nu=new NewUser();
				nu.setVisible(true);
			}
			
			
		});
		mntmNuser.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		mnSignIn.add(mntmNuser);
		mnSignIn.add(mntmlogout);
		
		
		
		if(!Permission.userID.equals("ManagerH")) {
			   mntmNuser.setEnabled(false);
			}
		
		
		
		JMenuBar mnLogin = new JMenuBar();
		menuBar.add(mnLogin);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeBanner = new JLabel("Hello User!!");
		lblWelcomeBanner.setForeground(new Color(240, 248, 255));
		lblWelcomeBanner.setFont(new Font("Schneidler Blk BT", Font.BOLD | Font.ITALIC, 36));
		lblWelcomeBanner.setBounds(200, 43, 257, 144);
		contentPane.add(lblWelcomeBanner);
		
		JLabel lblwelc2 = new JLabel("Welcome to ToyMart-Worldwide Handling System");
		lblwelc2.setForeground(new Color(0, 255, 255));
		lblwelc2.setBackground(new Color(255, 255, 0));
		lblwelc2.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 24));
		lblwelc2.setBounds(25, 130, 577, 99);
		contentPane.add(lblwelc2);
	}
	private class SwingAction extends AbstractAction {
		
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
		
	
	
}
	
}
