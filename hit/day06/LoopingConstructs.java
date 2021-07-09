package hit.day06;

public class LoopingConstructs {
	public static void main(String[] args) {
		int i=10;
		
		System.out.println("before the loop starts..........................");
		while(i>0) {
			System.out.println(i);
			--i;
		}
		System.out.println("After the loop ends..............................");
		
		System.out.println("before the loop starts..........................");
		
		while(i<10) {
			
			System.out.println(i);
			++i;
		}
		System.out.println("After the loop ends..............................");
	}
}