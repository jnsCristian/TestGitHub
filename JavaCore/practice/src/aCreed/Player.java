package aCreed;

import java.util.ArrayList;
import java.util.*;

public class Player {

	public static void main(String[] args) {
		Assasin assasin = null;
		try {
			assasin = new Assasin("Altair",22,"white");
		} catch (ImpossibleAgeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//System.out.println(assasin);
		assasin.hideOnSeat();
		try {
			assasin.setAge(-1);
		} catch (ImpossibleAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace("a");
			//System.out.println(e.getMessage());
		}
		List<List<Integer>> table=new ArrayList<List<Integer>>();
		Map<String,Integer> ana=new HashMap<String,Integer>();
	}

}
