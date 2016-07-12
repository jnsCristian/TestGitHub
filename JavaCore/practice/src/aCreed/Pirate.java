package aCreed;

public class Pirate extends AssasinsCreedBlackFlag{
	
	private String name;
	private int age;
	private int numberOfGuns;
	
	
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age)throws ImpossibleAgeException{
		if(age<0||age>110)
			throw new ImpossibleAgeException();
		this.age=age;
	}
	public void setGuns(int guns){
		numberOfGuns=guns;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getNumberOfGuns(){
		return numberOfGuns;
	}
	public void sail() {
		System.out.println("I'm shipping up to Boston.");
	}

}
