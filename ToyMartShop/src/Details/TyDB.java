package Details;

import Selling.ImportedToyItems;
import Selling.SrilankanToys;
import Selling.ToyItems;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;

import java.io.*;

public class TyDB implements TyData{
	
	private File fileObjc;

	public TyDB() {
		// TODO Auto-generated constructor stub
		
		fileObjc=new  File("C:/ToyMart/ToyShop.txt");
	}
	
	@Override
	public boolean add(ToyItems tl) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw=new FileWriter(fileObjc,true);
			String line=tl.getToyID()+"\t"+tl.getTyName()+"\t"+tl.getTyCategory()+"\t"+tl.getTyAgeGroup()
			+"\t"+tl.getTyQuantity()+"\t";
			if(tl instanceof SrilankanToys){
			SrilankanToys SL=(SrilankanToys)tl;
			line=line+"\t"+SL.getProvince()+"\n";
		}else {
			ImportedToyItems im=(ImportedToyItems)tl;
			line=line+"\t"+im.getCountry()+"\n";}
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
	
	@Override
	public boolean delete(int ToyID) {
		// TODO Auto-generated method stub
		
		ArrayList<ToyItems> toyList=getAll();
		for(ToyItems t:toyList) {
			if(t.getToyID()==ToyID) {
				toyList.remove(t);
				break;
			}
		}
		try {
		FileWriter fw=new FileWriter(fileObjc);
		fw.write("");
		fw.close();
		
		for(ToyItems t:toyList) {
			add(t);
		}
		return true;
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return false;
		}
	}
	
		
	
		
		
		
	
	

	@Override
	public ToyItems get(int ToyID) {
		// TODO Auto-generated method stub
		ArrayList<ToyItems>toyList=getAll();
		for(ToyItems TI:toyList) {
			if(TI.getToyID()==ToyID) {
				return TI;
			}
		}
		return null;
	}
	
	@Override
	public ArrayList<ToyItems> getAll() {
		// TODO Auto-generated method stub
		
		ArrayList<ToyItems>toyList=new ArrayList<ToyItems>();
		ToyItems TI=null;
		
		try {
			
			Scanner scan=new Scanner(fileObjc);
			while(scan.hasNextLine()) {
			String line=scan.nextLine();
			String[]arr=line.split("\t");
			int ToyID=Integer.valueOf(arr[0]);
			String TyName=arr[1];
			String TyCategory=arr[2];
			String TyAgeGroup=arr[3];
			String Country_Province=arr[4];
			if(Country_Province.length()==5) {
				TI=new SrilankanToys(ToyID, TyName, TyCategory, TyAgeGroup,ToyID, Country_Province);
				
			}else
			{
				TI=new ImportedToyItems(ToyID, TyName, TyCategory, TyAgeGroup, ToyID, Country_Province);
			}
			toyList.add(TI);
			
		}
		return toyList;
	
	}catch(FileNotFoundException e)
		{
		System.out.println(e.getMessage());
		return null;
	}catch(Exception e ) {
			System.out.println(e.getMessage());
		return null;
		}
	}
	@Override
	public boolean update(ToyItems J) {
		// TODO Auto-generated method stub
		ArrayList<ToyItems> toyList=getAll();
		for(ToyItems TI:toyList) {
			if(TI.getToyID()==J.getToyID()) {
			  toyList.remove(TI);
			  toyList.add(J);
			  break;
			}
		}
		try {
			FileWriter fw=new FileWriter(fileObjc);
			fw.write("");
			fw.close();
			
			for(ToyItems k: toyList) {
				add(k);
			}
			return true;
			}catch(IOException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				return false;
			}	
	}
}
