
public class InteagerExample {

	public static void main(String[] args) {
		int max = 0b011111111_11111111_11111111;
		int min = 0b100000000_00000000_00000000;
		
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		
		max = max + 1;
		System.out.println("max=" + max);
	
	}

}
