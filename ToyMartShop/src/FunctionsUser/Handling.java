package FunctionsUser;

import java.awt.BorderLayout;




import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import Selling.*;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JEditorPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import Details.TyDB;
import java.awt.Font;
import java.awt.SystemColor;




public class Handling extends JFrame {

	private JPanel contentPane;
	private JTextField txtToyID;
	private JTextField txtTyName;
	private JTextField txtTyAgeGroup;
	private JTextField txtTyQuantity;
	private JLabel lblProvince;
	private ToyItems TI;
	private ButtonGroup BG;
	private JComboBox cmbProvince;
	private JComboBox cmbCountry;
	private JComboBox Province;
	private TyDB D;
	private JTable tblToyItems;
	private DefaultTableModel tblmodel;
	private JTextField txtTyCategory;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Handling frame = new Handling();
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
	public Handling() {
		setTitle("Toy Detail Operations");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setBounds(100, 100, 615, 658);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 206, 209));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		D=new TyDB();
		
		JLabel lblToyID = new JLabel("Toy ID");
		lblToyID.setForeground(new Color(0, 0, 128));
		lblToyID.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblToyID.setBounds(10, 72, 104, 24);
		lblToyID.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblToyID);
		
		txtToyID = new JTextField();
		txtToyID.setBackground(SystemColor.window);
		txtToyID.setForeground(new Color(128, 0, 128));
		txtToyID.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtToyID.setBounds(124, 72, 172, 25);
		contentPane.add(txtToyID);
		txtToyID.setColumns(10);
		
		JLabel lblTyName = new JLabel("Toy Name");
		lblTyName.setForeground(new Color(0, 0, 128));
		lblTyName.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTyName.setVerticalAlignment(SwingConstants.TOP);
		lblTyName.setBounds(10, 128, 104, 24);
		contentPane.add(lblTyName);
		
		JLabel lblTyCategory = new JLabel("Category");
		lblTyCategory.setForeground(new Color(0, 0, 128));
		lblTyCategory.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTyCategory.setVerticalAlignment(SwingConstants.TOP);
		lblTyCategory.setBounds(10, 176, 104, 24);
		contentPane.add(lblTyCategory);
		
		JLabel lblTyAgeGroup = new JLabel("Age Group");
		lblTyAgeGroup.setForeground(new Color(0, 0, 128));
		lblTyAgeGroup.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTyAgeGroup.setVerticalAlignment(SwingConstants.TOP);
		lblTyAgeGroup.setBounds(10, 273, 104, 24);
		contentPane.add(lblTyAgeGroup);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setForeground(new Color(25, 25, 112));
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuantity.setVerticalAlignment(SwingConstants.TOP);
		lblQuantity.setBounds(10, 229, 104, 24);
		contentPane.add(lblQuantity);
		
		txtTyName = new JTextField();
		txtTyName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTyName.setForeground(new Color(128, 0, 128));
		txtTyName.setColumns(10);
		txtTyName.setBounds(124, 127, 172, 27);
		contentPane.add(txtTyName);
		
		txtTyAgeGroup = new JTextField();
		txtTyAgeGroup.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtTyAgeGroup.setForeground(new Color(128, 0, 128));
		txtTyAgeGroup.setColumns(10);
		txtTyAgeGroup.setBounds(124, 272, 172, 27);
		contentPane.add(txtTyAgeGroup);
		
		txtTyQuantity = new JTextField();
		txtTyQuantity.setForeground(new Color(128, 0, 128));
		txtTyQuantity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTyQuantity.setColumns(10);
		txtTyQuantity.setBounds(124, 228, 172, 25);
		contentPane.add(txtTyQuantity);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setForeground(new Color(0, 0, 128));
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCountry.setVerticalAlignment(SwingConstants.TOP);
		lblCountry.setBounds(10, 340, 104, 24);
		contentPane.add(lblCountry);
		
		lblProvince = new JLabel("Province");
		lblProvince.setForeground(new Color(0, 0, 128));
		lblProvince.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblProvince.setVerticalAlignment(SwingConstants.TOP);
		lblProvince.setBounds(10, 377, 104, 24);
		contentPane.add(lblProvince);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdd.setBackground(new Color(100, 149, 237));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(validateUI()) {
						 int ToyID = Integer.valueOf(txtToyID.getText( ).toString());
						 String TyName=txtTyName.getText().toString();
						 String TyCategory=txtTyCategory.getText().toString();
						 String TyAgeGroup=txtTyAgeGroup.getText().toString();
						 int TyQuantity=Integer.valueOf(txtTyQuantity.getText().toString());
						 if(cmbProvince.isEnabled()) {
							 String Province=cmbProvince.getSelectedItem().toString();
							 TI=new SrilankanToys(ToyID, TyName,TyCategory, TyAgeGroup, TyQuantity, Province);
							 
						 }else
							 
						 {
							 String Country=cmbCountry.getSelectedItem().toString();
							 TI=new ImportedToyItems(ToyID, TyName,  TyCategory,TyAgeGroup, TyQuantity, Country);
									 ;}
						
					}
				
					
					 boolean output=D.add(TI);
					 if(output) {
						 JOptionPane.showMessageDialog(contentPane, "Toy Details are successfuly added");
					 }else
					 {
						 JOptionPane.showMessageDialog(contentPane, "Data Adding is Incomplete");
					 }
						
				
				
			}
		});
		btnAdd.setBounds(487, 18, 104, 36);
		contentPane.add(btnAdd);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.setBackground(new Color(100, 149, 237));
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<ToyItems> ToyList=D.getAll();
				tblmodel.setRowCount(0);
				
				for(ToyItems TI:ToyList)
				{	 System.out.println("Start");
					 int ToyID=TI.getToyID();
					 String TyName=TI.getTyName();
					 String TyAgeGroup=TI.getTyAgeGroup();
					 String TyCategory=TI.getTyCategory();
					 String Province=" ";
					 String Country=" ";
					 
					 
						
						if (TI instanceof SrilankanToys) {
							SrilankanToys SrilankanTI =(SrilankanToys) TI;
							Province=SrilankanTI.getProvince();
						}
						
						else
							
						{
							ImportedToyItems ImportedTI=(ImportedToyItems)TI;
							Country=ImportedTI.getCountry();
				}
						tblmodel.addRow(new Object[] {ToyID,TyName,TyCategory,TyAgeGroup,Country,Province});
				}
			
					
					
			}
		});
		btnDisplay.setBounds(487, 78, 104, 36);
		contentPane.add(btnDisplay);
		
		
		BG=new ButtonGroup();
		
		JRadioButton rdbtnImported = new JRadioButton("Imported");
		rdbtnImported.setBackground(new Color(0, 255, 127));
		rdbtnImported.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnImported.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbCountry.setEnabled(true);
				cmbProvince.setEnabled(false);
			}
		});
		rdbtnImported.setBounds(134, 306, 111, 23);
		contentPane.add(rdbtnImported);
		
		JRadioButton rdbtnSrilankan = new JRadioButton("Srilankan");
		rdbtnSrilankan.setBackground(new Color(0, 255, 127));
		rdbtnSrilankan.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnSrilankan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbCountry.setEnabled(false);
				cmbProvince.setEnabled(true);
			}
			
		
			
		});
		rdbtnSrilankan.setBounds(267, 306, 111, 23);
		contentPane.add(rdbtnSrilankan);
		
		
		BG.add(rdbtnSrilankan);
		BG.add(rdbtnImported);
		
		cmbProvince = new JComboBox();
		cmbProvince.setForeground(new Color(128, 0, 128));
		cmbProvince.setFont(new Font("Tahoma", Font.BOLD, 16));
		cmbProvince.setModel(new DefaultComboBoxModel(new String[] {"\tCentrel", "\tWestern", "\tNorth Western", "\tEstern", "\tSothern", "\tNothern", "\tNorth Centrel", "\tSabaraguwa", "\tUva"}));
		cmbProvince.setBounds(124, 377, 154, 24);
		contentPane.add(cmbProvince);
		
		
		
		cmbCountry = new JComboBox();
		cmbCountry.setForeground(new Color(128, 0, 128));
		cmbCountry.setFont(new Font("Tahoma", Font.BOLD, 16));
		cmbCountry.setModel(new DefaultComboBoxModel(new String[] {"   Afghanistan", "   Albania", "   Algeria", "    Andorra", "    Angola", "    Antigua and Barbuda", "    Argentina", "    Armenia", "    Australia", "    Austria", "    Austrian Empire*", "    Azerbaijan", "", "    Baden", "    Bahamas, The", "    Bahrain", "    Bangladesh", "    Barbados", "    Bavaria*", "    Belarus", "    Belgium", "    Belize", "    Benin (Dahomey)", "    Bolivia", "    Bosnia and Herzegovina", "    Botswana", "    Brazil", "    Brunei", "    Brunswick and L\u00FCneburg", "    Bulgaria", "    Burkina Faso ", "    Burma", "    Burundi", "    Cabo Verde", "    Cambodia", "    Cameroon", "    Canada", "    Cayman Islands, The", "    Central African Republic", "    Central American Federation*", "    Chad", "    Chile", "    China", "    Colombia", "    Comoros", "    Congo Free State, The", "    Costa Rica", "    Cote d\u2019Ivoire (Ivory Coast)", "    Croatia", "    Cuba", "    Cyprus", "    Czechia", "    Czechoslovakia", "    Democratic Republic of the Congo", "    Denmark", "    Djibouti", "    Dominica", "    Dominican Republic", "    Duchy of Parma", "    Ecuador", "    Egypt", "    El Salvador", "    Equatorial Guinea", "    Eritrea", "    Estonia", "    Eswatini", "    Ethiopia", "    Fiji", "    Finland", "    France", "    Gabon", "    Gambia, The", "    Georgia", "    Germany", "    Ghana", "    Grand Duchy of Tuscany, The*", "    Greece", "    Grenada", "    Guatemala", "    Guinea", "    Guinea-Bissau", "    Guyana", "    Haiti", "    Hanover", "    Hanseatic Republics", "    Hawaii", "    Hesse", "    Holy See", "    Honduras", "    Hungary", "    Iceland", "    India", "    Indonesia", "    Iran", "    Iraq", "    Ireland", "    Israel", "    Italy", "    Jamaica", "    Japan", "    Jordan", "    Kazakhstan", "    Kenya", "    Kingdom of Serbia/Yugoslavia*", "    Kiribati", "    Korea", "    Kosovo", "    Kuwait", "    Kyrgyzstan", "    Laos", "    Latvia", "    Lebanon", "    Lesotho", "    Lew Chew ", "    Liberia", "    Libya", "    Liechtenstein", "    Lithuania", "    Luxembourg", "    Madagascar", "    Malawi", "    Malaysia", "    Maldives", "    Mali", "    Malta", "    Marshall Islands", "    Mauritania", "    Mauritius", "    Mecklenburg-Schwerin*", "    Mecklenburg-Strelitz*", "    Mexico", "    Micronesia", "    Moldova", "    Monaco", "    Mongolia", "    Montenegro", "    Morocco", "    Mozambique", "    Namibia", "    Nassau", "    Nauru", "    Nepal", "    Netherlands", "    Nicaragua", "    Niger", "    Nigeria", "    North Macedonia", "    Norway", "    Pakistan", "    Palau", "    Panama", "    Papal States*", "    Papua New Guinea", "    Paraguay", "    Peru", "    Philippines", "    Piedmont-Sardinia*", "    Poland", "    Portugal", "    Qatar", "    Republic of Korea (South Korea)", "    Republic of the Congo", "    Romania", "    Russia", "    Rwanda", "    Saint Kitts and Nevis", "    Saint Lucia", "    Saint Vincent and the Grenadines", "    Samoa", "    San Marino", "    Sao Tome and Principe", "    Saudi Arabia", "    Schaumburg-Lippe*", "    Senegal", "    Serbia", "    Seychelles", "    Sierra Leone", "    Singapore", "    Slovakia", "    Slovenia", "    Solomon Islands, The", "    Somalia", "    South Africa", "    South Sudan", "    Spain", "    Sri Lanka", "    Sudan", "    Suriname", "    Sweden", "    Switzerland", "    Syria", "    Tajikistan", "    Uganda", "    Ukraine", "    Union of Soviet Socialist Republics*", "    United Arab Emirates", "    United Kingdom", "    Uruguay", "    Uzbekistan", "    Vanuatu", "    Venezuela", "    Vietnam", "    Yemen", "    Zambia", "    Zimbabwe", "", "", "", "\t", "", "", "", "", "", "", "", "", "\t", "", "", "", ""}));
		cmbCountry.setBounds(124, 339, 154, 25);
		contentPane.add(cmbCountry);
		
		JScrollPane scrollPane=new JScrollPane();
		scrollPane.setBounds(105, 417, 401, 200);
		contentPane.add(scrollPane);	
		
		tblmodel= new DefaultTableModel();
		tblmodel.addColumn("Toy_ID");
		tblmodel.addColumn("Toy_Name");
		tblmodel.addColumn("Category");
		tblmodel.addColumn("AgeGroup");
		tblmodel.addColumn("Country");
		tblmodel.addColumn("Province");
		
		tblToyItems = new JTable();
		tblToyItems.setFont(new Font("Tahoma", Font.BOLD, 12));
		tblToyItems.setForeground(new Color(72, 61, 139));
		tblToyItems.setBackground(new Color(224, 255, 255));
		tblToyItems.setModel(tblmodel);
		tblToyItems.setBounds(50, 605, 401, 200);
		scrollPane.setViewportView(tblToyItems);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSearch.setBackground(new Color(100, 149, 237));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ToyID=Integer.valueOf(JOptionPane.showInputDialog("Enter Toy ID"));
				ToyItems TI=D.get(ToyID);
				if(TI!=null){
					txtToyID.setText(String.valueOf(TI.getToyID()));
					txtTyName.setText(TI.getTyName());
					txtTyCategory.setText(TI.getTyCategory());
					txtTyAgeGroup.setText(TI.getTyCategory());
					if(TI instanceof SrilankanToys)
					{
						rdbtnSrilankan.setSelected(true);
						SrilankanToys S=(SrilankanToys)TI;
						cmbProvince.setSelectedItem(S.getProvince());
					}else
						
					{
						rdbtnImported.setSelected(true);
						ImportedToyItems I=(ImportedToyItems)TI;
						cmbCountry.setSelectedItem(I.getCountry());
						}
				
				
			}
		}});
		btnSearch.setBounds(487, 132, 104, 36);
		contentPane.add(btnSearch);
		
		JButton btndelete = new JButton("Delete");
		btndelete.setBackground(new Color(100, 149, 237));
		btndelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ToyID=Integer.valueOf(JOptionPane.showInputDialog("Enter Toy ID"));
				boolean deleted=D.delete(ToyID);
				if(deleted) {
					JOptionPane.showMessageDialog(contentPane, "Deleted");
				}else {
					JOptionPane.showMessageDialog(contentPane, "Not Deleted");
				}
			}
		});
		btndelete.setBounds(487, 191, 104, 36);
		contentPane.add(btndelete);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpdate.setForeground(new Color(0, 0, 0));
		btnUpdate.setBackground(new Color(100, 149, 237));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if(validateUI()) {
					 int ToyID = Integer.valueOf(txtToyID.getText( ).toString());
					 String TyName=txtTyName.getText().toString();
					 String TyCategory=txtTyCategory.getText().toString();
					 String TyAgeGroup=txtTyAgeGroup.getText().toString();
					 int TyQuantity=Integer.valueOf(txtTyQuantity.getText().toString());
					 if(cmbProvince.isEnabled()) {
						 String Province=cmbProvince.getSelectedItem().toString();
						 TI=new SrilankanToys(ToyID, TyName,TyCategory, TyAgeGroup, TyQuantity, Province);
						 
					 }else
						 
					 {
						 String Country=cmbCountry.getSelectedItem().toString();
						 TI=new ImportedToyItems(ToyID, TyName,  TyCategory,TyAgeGroup, TyQuantity, Country);
								 ;}
					
				}
			
				
				 boolean output=D.update(TI);
				 if(output) {
					 JOptionPane.showMessageDialog(contentPane, "Toy Details are successfully Updated");
				 }else
				 {
					 JOptionPane.showMessageDialog(contentPane, "Toy Details Updating Failed");
				 }
					
				
				
				
			}
		});
		btnUpdate.setBounds(487, 252, 104, 34);
		contentPane.add(btnUpdate);
		
		JLabel lblBanner = new JLabel("ToyMart -Best Toy Products");
		lblBanner.setForeground(new Color(0, 0, 205));
		lblBanner.setFont(new Font("Segoe Print", Font.BOLD, 19));
		lblBanner.setBounds(162, 23, 290, 24);
		contentPane.add(lblBanner);
		
		JLabel lblType = new JLabel("Type of Toy");
		lblType.setForeground(new Color(0, 0, 128));
		lblType.setBackground(new Color(138, 43, 226));
		lblType.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblType.setBounds(10, 305, 117, 37);
		contentPane.add(lblType);
		
		txtTyCategory = new JTextField();
		txtTyCategory.setForeground(new Color(128, 0, 128));
		txtTyCategory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTyCategory.setBounds(124, 176, 172, 24);
		contentPane.add(txtTyCategory);
		txtTyCategory.setColumns(10);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClose.setBackground(new Color(100, 149, 237));
		btnClose.setBounds(487, 308, 104, 36);
		contentPane.add(btnClose);
		
		
	}
	
	private boolean validateUI()
	{
		if(txtToyID.getText().equals(" ")){
			JOptionPane.showMessageDialog(txtToyID, "Toy ID must be not Blank");
			return false;
		}try {
			int ToyID=Integer.valueOf(txtToyID.getText().toString());
		
		}catch(Exception e) {
			JOptionPane.showMessageDialog(txtToyID, "must be numeric ");
		}
		if(txtTyName.getText().equals(" ")){
			JOptionPane.showMessageDialog(txtTyName, "Toy Name  must be not Blank");
			return false;}
		if(txtTyCategory.getText().equals(" ")){
			JOptionPane.showMessageDialog(txtTyCategory, "Category  must be not Blank");
			return false;}
		if(txtTyQuantity.getText().equals(" ")){
			JOptionPane.showMessageDialog(txtTyName, "Quality  must be not Blank");
			return false;}
		if(txtTyAgeGroup.getText().equals(" ")){
			JOptionPane.showMessageDialog(txtTyName, "AgeGroup must be not Blank");
			return false;}
		
	
		return true;
	
	
}	
}
