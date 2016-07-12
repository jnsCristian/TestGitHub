package aCreed;

public abstract class AssasinsCreedBlackFlag implements AssasinsCreedSeries{
	public void killOne() {
		System.out.println("He's dead!");
	}

	public void run() {
		System.out.println("Runa Barry, run!");
	}

	public void hideOnSeat() {
		System.out.println("You can't C me :))");
	}

	public void assasinate() {
		System.out.println("Dead");
	}
	
	public abstract void sail();
}
