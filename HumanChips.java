//Douglas Kiang
//Provides text input for a human Chips player.
//*edits by Kai

import java.util.Scanner;

public class HumanChips extends SimpleChips{
  
  public String toString(){
    return "Human";
  }
  
  public int play(int number, int previousmove){ // number represents number of stones left
    Scanner in = new Scanner(System.in);
    if(previousmove==0){                     
    System.out.println("There are " + number + " chips");
    }
    String lastmove = ""+2*previousmove;
    if(previousmove==0) lastmove = ""+(number-1);
    System.out.println("You can take between 1 and " + lastmove + " chips.");                     
    System.out.println("How many chips would you like to take? ");
    return in.nextInt();
    }
}
