package hit.day04;

public class VariableDemo {
	public static void main(String[] args) {
		//about variables
		
		/*
		 * what are the different types of variables
		 * what is valid identifier concept
		 * Type promotion and type casting
		 *
		 */
		
		//how to initialize and how to declare..
		//one variable can only hold one value....  (to hold more than one value, we will learn Arrays)
		int i=100; //32 bit
		short s=100;//16 bit
		byte b=100;
		long l=100;
		
		char c='a';
		
		float f=1.2f;// giving f is compulsory when u want to store a decimal value in a float variable
		//because by default all decimal numbers consume 64 bit.  To make that occupy only 32 bit, you have give the letter f as suffix.
		
		double d=1.23;// double data type allocated 64 bit memory.
		
		boolean boo=true;
		
		String str="hello world";
		
		//valid identifier concept
		
		/*
		 * 8 bites - 1 byte
		 * 1024 bytes - 1 kilo byte
		 * 1024 kilo bytes - 1 mega byte
		 * 1024 mega bytes - 1 gega byte
		 * 1024 gege bytes - 1 terra byte
		 *
		 */
		
		//VALID IDENTIFIERS
		/*
		 * YOU Cannot start a identifier or name with a spcial character other than $ and _
		 * You cannot start a identifier or name with number
		 * inbetween your name, u can have numbers or _ or $.
		 *
		 */
		int $i=1000;
		System.out.println($i);
		int _i=100;
		System.out.println(_i);
		int i_2=100;
		System.out.println(i_2);
		
		//TYPE PROMOTION AND TYPE CASTING
		byte x=10;
		byte y=20;
		//byte z=x*y;//the result of a arithmetic operation will be a int
		int z=x*y;
		
		int intbyte=x;//automatic type promotion
		
		int intchar=169;
		char cval=(char)intchar;
		System.out.println(cval);
		
		double val=234.566;
		System.out.println((int)val);
		
		
		double val2=234.15;
		System.out.println((int)val2);
	}

}
