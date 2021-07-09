package hit.day06;

public class LoopingConstruct {
	public static void main(String[] args) {
		for(int i=10;i>0;--i) {//for(declaration;condition;increment/decrement)
			System.out.println(i);
		}
		for(int i=0;i<10;++i) {
			System.out.println(i);
		}
		
		for(int i=10,j=0;   i>0&&j<10;   i--,j++) {
			System.out.println(i+":"+j);
		}
	}
}