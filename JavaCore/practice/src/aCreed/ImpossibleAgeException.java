package aCreed;

import java.io.PrintStream;
import java.io.PrintWriter;

public class ImpossibleAgeException extends Exception{
	
	/*public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
		//System.out.println(string);
		
	}*/
	/*public ImpossibleAgeException(String s){
		System.out.println("custom.ImpossibleAgeException:"+s);
	}
	public ImpossibleAgeException(){
		System.out.println("custom.ImpossibleAgeException");
	}*/

	@Override
	public void printStackTrace(PrintStream s) {
		// TODO Auto-generated method stub
		super.printStackTrace(s);
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return "Age OOB";
	}

	
	public void printStackTrace(String a) {
		// TODO Auto-generated method stub
		super.printStackTrace();
		getMessage();
	}

	@Override
	public void printStackTrace(PrintWriter s) {
		// TODO Auto-generated method stub
		super.printStackTrace(s);
	}
}
