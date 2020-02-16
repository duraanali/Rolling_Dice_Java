import java.util.Random;

public class RollingDice {

    public static void main(String[] args) {
	// write your code here
        Random theRolledNumber = new Random();
        int rolled;
        rolled = theRolledNumber.nextInt(6) + 1;
        System.out.println("You just rolled: " + rolled);
    }
}
