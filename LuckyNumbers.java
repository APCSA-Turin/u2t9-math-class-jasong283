public class LuckyNumbers {
    /* No instance variables */
  
    /* "empty" constructor with no parameters */
    public LuckyNumbers() { }
  
    /* Generates a random number between min and max, inclusive,
       and returns that random number
     */
    public int randomIntegerBetween(int min, int max) {
       /* implement this method  */
       return (int) (Math.random() * (max - min + 1)) + min;
    }
  
    /* Generates and returns a String containing lucky numbers
  
       For this lucky number game, there are 5 balls randomly drawn,
       each between 1 and 65, and one "super ball" between 1 and 30.
       
       In this game, the same number CAN appear more than once.
  
       The returned String should have the 6 numbers listed (they do not
       need to be in ascending order): 5 "lucky numbers" between 1 and 65,
       and the last one, the "super ball," between 1 and 30.
       See samples below.
  
       This method should call your randomIntegerBetween method above multiple times
      */
    public String getLuckyNumbers() {
      /* implement this method  */
      int n1 = randomIntegerBetween(1, 65);
      int n2 = randomIntegerBetween(1, 65);
      int n3 = randomIntegerBetween(1, 65);
      int n4 = randomIntegerBetween(1, 65);
      int n5 = randomIntegerBetween(1, 65);
      int superBall = randomIntegerBetween(1, 30);
      return "Your lucky numbers are: " + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + "\n" + "The super ball is: " + superBall;
    }
  }
  