package Selling;

import java.util.Date;

public class ImportedToyItems extends ToyItems {
	
private String Country;
    
	public ImportedToyItems() {
		// TODO Auto-generated constructor stub
	}

   

    public ImportedToyItems(int ToyID, String TyName,String TyCategory, String TyAgeGroup, int TyQuantity,String Country) {
        super(ToyID, TyName,TyCategory, TyAgeGroup, TyQuantity);

        this.Country=Country;
        }
    
       




	public void setCountry(String Country) {
        this.Country = Country;

    }

    public String getCountry() {
        return Country;
    }


	

}
