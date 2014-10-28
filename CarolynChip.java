public class CarolynChip extends SimpleChips 
  
{
  public String toString()
    
  {
    return "CarolynChip";
  }
 
  int closestFib = 1;
  int lastFib = 1;
    
  private int closestFibonacci(int pieces) 
    {
      // it works by as a and b are two consecutive numbers
      int a = 1; // the first number
      int b = 1; // the second number
      while ( b <= pieces) {
        b += a; // b is the new second number
        a = b - a; // a is the new first number (what b was)
      }
      closestFib = a;
      lastFib = b;
      return a; // returns the closest Fibonacci number less than and including the number of pieces
    }
    
  
  public int play (int pile, int lastMove)
  {
    int diff = pile - closestFibonacci(pile);
    if (lastMove == 0) return (pile/3 - 1 );
    if(pile <= 2*lastMove) return pile;
    if(diff <= pile / 2 && diff <= 2 * lastMove)      //if difference between closestFibonacci(pile) number  and pile is less than half the pile and difference is less than or equal to 2xlastmove , take chips to give oppnent fibanacci number
    { 
      lastMove = diff;
    }
    if(closestFib == lastFib) return 2;
    else
    {
      return 1;
    }
  }
}

  