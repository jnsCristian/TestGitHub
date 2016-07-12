package aCreed;

public class Assasin extends AssasinsCreed{
	private String name;
	private int age;
	private String robeColor;

	public Assasin(){
		name=null;
		age=0;
		robeColor="white";
	}
	public Assasin(String name,int age,String robeColor)throws ImpossibleAgeException{
		if(age<0||age>110)
			throw new ImpossibleAgeException();
		this.name=name;
		this.age=age;
		this.robeColor=robeColor;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age) throws ImpossibleAgeException{
		if(age<0||age>110)
			throw new ImpossibleAgeException();
		this.age=age;
		
	}
	public void setRobeColor(String color){
		this.robeColor=color;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getRobeColor(){
		return robeColor;
	}
	@Override
	public void assasinate(){
		System.out.println("Another dead man");
	}
	public void assasinate(String[] args){
		int n=args.length;
		if(n==0)
			System.out.println("Another dead man");
		else if(n==1)
			System.out.println("He killed "+args[0]+" people at once");
		else
			System.out.println("He killed "+args[0]+" people at once while "+args[1]);
	}

	
	
	
}
