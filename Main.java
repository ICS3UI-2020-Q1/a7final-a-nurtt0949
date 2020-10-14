/**
 *Counts the amount of ones in a number
 * @author Tolga Nurtekin
 */
public class Main {
     
    public static int countsOnes(int number){
       //create a variable that counts the digits
       int count = 0;
      //create a loop that finds the digits
      while(number != 0){
        //create digit variable for remainder
        int digit = number % 10;
        //divide the number by 10 to move onto next digit
        number /= 10;
        
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
    
    int total = countsOnes(357);
    System.out.println(total);
  } 
}

