package tests;

public class MyException extends Exception {
	public static void checkFood(String food)throws BadFoodException{
		if(food.equals("paste")||food.equals("ton"))
			throw new BadFoodException();
		else System.out.println("merge");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				MyException.checkFood("paste");
			} catch (BadFoodException e) {
				
				e.printStackTrace();
			}

	}

}
