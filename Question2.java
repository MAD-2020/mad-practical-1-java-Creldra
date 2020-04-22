import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    //gets the height in meters
    Scanner heightInput = new Scanner(System.in);
    System.out.print("Enter Height in m: ");
    double height = heightInput.nextDouble();
    
    //gets the weight in kg
    Scanner weightInput = new Scanner(System.in);
    System.out.print("Enter Weight in kg: ");
    double weight = weightInput.nextDouble();
    
    //calculates the bmi and show the user
    double bmi = weight/(height*height);
    System.out.println("Your BMI is " + bmi);
  }
}
