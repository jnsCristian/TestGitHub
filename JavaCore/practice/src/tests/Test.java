package tests;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="";
		String a = null;
		try{
		a=reverse(str);}
		catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		//System.out.println(a);
	}
	
	public static String reverse(String in)throws IllegalArgumentException{
		String reverseStr="";
		if(in.length()==0)
			throw new IllegalArgumentException();
		for(int i=in.length()-1;i>=0;i--)
			reverseStr=reverseStr+in.charAt(i);
		return reverseStr;
	}

}
