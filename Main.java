import java.util.Scanner;
/**
 * adds all of the numbers before the given number together
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // asks user for the number and records it 
    System.out.println("Please enter an integer to count down to");
    int count = 1;
    int total = 0;
    int goal = input.nextInt();
    while (count <= goal){
      total = total + count;
      count = count + 1;
    }
    // print the total
    System.out.println("The sum from 1 - " + goal + " is " + total);
  }
}
