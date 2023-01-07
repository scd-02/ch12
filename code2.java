
abstract class Animals{
	protected abstract String getSound();
	public void printInfo() {
		System.out.println(getSound());
	}
}

class Tiger extends Animals{
	protected String getSound() {
			return "roar";
	}
}
	
public class code2 {
	
	public static void main(String[] args) {
		Tiger t= new Tiger();		
		System.out.println(t.getSound());
		t.printInfo();
	}

}
