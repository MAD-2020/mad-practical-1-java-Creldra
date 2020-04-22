import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    //gets an integer input from user
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int num = userInput.nextInt();
    
    //multiplies the value by itself and print the value out
    int output = num * num;
    System.out.println("The Result is " + output);
  }
}
