import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    //gets a number input from the user
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int num = userInput.nextInt();

    //nested FOR loop to create the right angle triangle
    for(int i=num;i>0;i--){
      for(int j=i;j>0;j--){
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
