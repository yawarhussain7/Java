import java.util.Scanner;

class test_55{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		char letter;
		System.out.println("Enter the any ALphabat : ");
		letter = input.next().charAt(0);

		if(letter == 'a' || letter == 'e'|| letter == 'i'||letter == 'o'|| letter == 'u'|| letter == 'A'|| letter == 'E'|| letter == 'I'|| letter =='O'||letter == 'U')
		{
		System.out.println(letter +" is Vowel");
		}
		else{
			System.out.println(letter + " is Consonant");
		}
	}
}