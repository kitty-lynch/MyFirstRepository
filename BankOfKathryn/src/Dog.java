
public class Dog implements Animal{

	@Override
	public Boolean hungry() {
		
			return true;
	}

	@Override
	public void speak() {
		System.out.println("What does the dog say?");
		
	}
	
	public void wagTail() {
		System.out.println("I just wagged");
	}

}
