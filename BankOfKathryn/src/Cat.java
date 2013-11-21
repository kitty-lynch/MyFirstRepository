
public class Cat implements Animal{

	@Override
	public Boolean hungry() {

		return false;
	}

	@Override
	public void speak() {
		
		System.out.println("meow");
		
	}

}
