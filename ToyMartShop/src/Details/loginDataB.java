package Details;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import Selling.SignIn;
import Selling.ToyItems;

public class loginDataB {
	private File fileobjc;

	public loginDataB() {

		fileobjc=new  File("C:/ToyMart/User.txt");
	}

	
	public boolean add(SignIn S) {
	
		try {
			FileWriter fw=new FileWriter(fileobjc,true);
			String line=S.getuserD()+"\t"+S.getpass()+"\n";
		
			fw.write(line);
			fw.close();
		return true;
	}catch(FileNotFoundException e) {
		System.out.println(e.getMessage());
		return false;
	}catch(IOException e) {
		System.out.println(e.getMessage());
		return false;
	}
		
	}
	
	
	
	public SignIn get(String userD)
	{
	
		ArrayList <SignIn> SignList=getAll();
		for(SignIn S:SignList) {
			if(S.getuserD().equals(userD))
				return S;
		}
		return null;
	}
	
	 
		public 	ArrayList<SignIn> getAll(){
		ArrayList<SignIn> SignList= new ArrayList<SignIn>();
		
		
		try {
			
			Scanner scan=new Scanner(fileobjc);
			while(scan.hasNextLine()) {
			String line=scan.nextLine();
			String[]arr=line.split("\t");
			String userD=arr[0];
			String pass=arr[1];
			
			
			SignIn S= new SignIn(userD, pass);
			SignList.add(S);
			
		}
			
		scan.close();
		return SignList;
		
		
	
	}catch(FileNotFoundException e)
		{
		System.out.println(e.getMessage());
		return null;
	}catch(Exception e ) {
			System.out.println(e.getMessage());
		return null;
		}
		
		
	}
	
}





