package hit.day05;

public class OperatorsDemo {
	public static void main(String[] args) {
		int i=10;
		
		//++i - Pre increment
		//i++ - Post increment
		
		//post increment
		System.out.println(i);//10
		System.out.println(i++);//10 - first the value is printed then increased
		System.out.println(i);//11
		
		//pre increment
		int n=20;
		System.out.println(n);//20
		System.out.println(++n);//21 - first the value is increased then assigned
		System.out.println(n);//21
		
		//pre and post increment w.r.to assignment
		
		//pre increment assignment
		int x=100;
		int z=++x;//first the value is increased and then assigned
		System.out.println(z);//101
		
		//post increment assignment
		int m=200;
		int nn=m++;//first the value is assigned and then increased...
		System.out.println(nn);//200
		
	}
}