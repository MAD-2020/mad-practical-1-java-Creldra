import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 
import java.util.*; 

public class Question5
{
  public static void main(String[] args)
  {
    ArrayList<Integer> numList = new ArrayList<Integer>();

    //gets a number input from the user
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int num = userInput.nextInt();

    //get the user to intput an amount of number depending on the first input
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

    //the mapping function that helps mapping same value together and also able to get the frequencies of this value occuring
    Map<Integer, Integer> mapper = new HashMap<Integer, Integer>();
    for(Integer j : numList){
      Integer k = mapper.get(j);
      mapper.put(j, (k == null) ? 1 : k + 1);
    }

    //to only get the MOST occurence number (this code could only show 1 most occurence and not more than that, meaning if there is 2 numbers with the same frequencies, it will only show the lowest number)
    Integer checker = 0;
    Integer lastNum = 0;
    for(Map.Entry<Integer,Integer> val : mapper.entrySet()){
      if(val.getValue() > checker){
        checker = val.getValue();
        lastNum = val.getKey();
      }
    }

    System.out.println("The Most Occurence Number: " + lastNum);
  }
}
