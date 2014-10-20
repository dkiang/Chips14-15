/**
 * basic class template for a chips game player
 * 
 * @author Kai
 */
public class DougChips extends SimpleChips{
  
  /**
   * class toString(returns a string when class is called as a string)
   * 
   * @return name of this class
   */
  public String toString(){
    return "DougChips";
  }
  
  /**
   * returns a random move for chips game.
   * 
   * Will take all of the chips in the pile if possible
   * 
   * @returns valid number of chips to take from pile
   */
  // Doug's code goes here.
  public int play(int pile, int lastmove){
    if (lastmove == 0) return (int)(Math.random()*(pile-1))+1;
    if(pile <= 2*lastmove) return pile;
    return (int)(Math.random()*(2*lastmove))+1;
  }
}
    