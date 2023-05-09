package Selling;

import java.util.Date;

public class SrilankanToys extends ToyItems {
	
	


	    private String Province;
	   
        public SrilankanToys() {
			// TODO Auto-generated constructor stub
		}
	   

	    public SrilankanToys(int ToyID, String TyName,String TyCategory, String TyAgeGroup, int TyQuantity,String Province) {
	        super(ToyID, TyName, TyCategory,TyAgeGroup, TyQuantity);
	       
	        this.Province=Province;
	       
	    }

	   


		public void setProvince(String Province) {
	        Province = Province;
	    }

	    public String getProvince() {
	        return Province;
	    }



	
	
	

}
