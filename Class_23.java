// topic: Increment operator 

class Class_23{

	public static void main(String args[])
	{
		int number = 2;
		System.out.println("Before "+ number);
		System.out.println("PreIncrement : "+ (++number));
		System.out.println("Before "+ number);
		System.out.println("PostIncrement : "+(number++));
		System.out.println("Before "+ number);
		System.out.println("PreDecrement : "+(--number));
		System.out.println("Before "+ number);
		System.out.println("PostDecrement : "+(number--));
		System.out.println("Before "+ number);
	}
}