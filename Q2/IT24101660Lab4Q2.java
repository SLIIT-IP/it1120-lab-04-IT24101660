import java.util.Scanner;
public class IT24101660Lab4Q2
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter exam marks (out of 100):");
		int number = input.nextInt();
		if (number >100)
		   {
			System.out.print("Invaild input for exam marks. Terminating program.");
		   }
		   
		System.out.print("Please enter lab sumbission  marks (out of 100):");
		double numberL = input.nextDouble();
		if (numberL >100)
		    {
			System.out.print("Invaild input for exam marks. Terminating program.");
			}
  
        System.out.print("Please enter the percentage given for the exam:");
		double numberPe = input.nextDouble();
		if (numberPe >50)
		  {
			System.out.print("The percentage must add up to 100. Terminating program.");
		  }
		  
		System.out.print("Please enter the percentage given for the lab sumbission:");
		int numberPl = input.nextInt();
		if (numberPl >50)
		    {
			System.out.print("The percentage must add up to 100. Terminating program.");
			}
			
		double finalMarks = (number + numberL) / 2;
		System.out.println (" Final Exam Mark is : "+ finalMarks);
		}
}
   
		
		
		
