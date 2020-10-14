/**
 *Counts the amount of ones in a number
 * @author Tolga Nurtekin
 */
public class Main {
    //create a method that counts the amount of ones in a number
    public static int countsOnes(int number){
       //create a variable that counts the digits
       int count = 0;
      //create a loop that finds the digits
      while(number != 0){
        //create digit variable for remainder
        int digit = number % 10;
        //divide the number by 10 to move onto next digit
        number /= 10;
        //if the digit is 1 in the number then add 1 to count
        if(digit == 1){
        count++;
        }
      }
      return count;
        }
      
    

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a variable for the total amount of ones
    int total = countsOnes(3571111);
    //tell user the amount of ones they have in their number
    System.out.println(total);
  } 
}

