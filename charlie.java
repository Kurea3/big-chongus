package test1;

class keyboard{
	void formFactor(int formFactor) {
		System.out.println("Keyboard form factor: " + formFactor + "% keyboard");
	}
	void color(String color) {
		System.out.println("Keyboard color: " + color);
	}
	void kbIsMechanical(boolean kbIsMechanical) {
		System.out.println("Mechanical keyboard: " + kbIsMechanical);
	}
	void Switches(String switches) {
		System.out.println("Mechanical switches: " + switches + " switches");
	}
}
class kB1 extends keyboard{
	keyboard kb = new keyboard();
	void kb1() {
		System.out.println("keyboard 1:");
		kb.formFactor(100);
		kb.color("white");
		kb.kbIsMechanical(true);
		kb.Switches("Gateron blue");
	}
}
class kB2 extends keyboard{
	keyboard kb = new keyboard();
	void kb2() {
		System.out.println("keyboard 2:");
		kb.formFactor(60);
		kb.color("black");
		kb.kbIsMechanical(false);
	}
}
class kB3 extends keyboard{
	keyboard kb = new keyboard();
	void kb3() {
		System.out.println("keyboard 3:");
		kb.formFactor(75);
		kb.color("blue and yellow");
		kb.kbIsMechanical(true);
		kb.Switches("Akko Pink");
	}
}
public class charlie {
	String cheese;
	int n;
	charlie(String ham, int y){
		cheese = ham;
		n = y;
	}
	public static void main(String[] args) {
		kB1 keyBoard1 = new kB1();
		kB2 keyBoard2 = new kB2();
		kB3 keyBoard3 = new kB3();
		charlie c = new charlie("egg", 4);
		
		System.out.println(c.cheese);
		System.out.println(c.n);
		keyBoard1.kb1();
		keyBoard2.kb2();
		keyBoard3.kb3();
	}
}
