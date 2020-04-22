import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    ArrayList<Integer> numList = new ArrayList<Integer>();

    //gets a number input from the user
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int num = userInput.nextInt();

    int counter = 1;
    while(num != 0){
      Scanner userInputs = new Scanner(System.in);
      System.out.print(counter + ") Enter a Number: " );
      int numInput = userInputs.nextInt();
      //System.out.print("\n");
      numList.add(numInput);
      counter ++;
      num --;
    }
    
    //use mappings
    //NOT DONE YET
  }
}
