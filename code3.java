
class Tutor{
	String designate ="Tutor";
	String acaName="NewAcademy";
	void performs() {
		System.out.println("Tutoring");
	}
}

public class code3 extends Tutor{
	String sub="Science";
	public static void main(String[] args) {
		code3 obj=new code3();
		System.out.println(obj.acaName);
		System.out.println(obj.designate);
		System.out.println(obj.sub);
		
	}

}
