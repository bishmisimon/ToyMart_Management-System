package Details;

import Selling.ToyItems;

import java.util.ArrayList;



public interface TyData {
	
	 boolean add(ToyItems tl);
	 boolean update(ToyItems tl);
	 boolean delete(int ToyID);
	 ToyItems get(int ToyID);
	 ArrayList<ToyItems>getAll();

}
