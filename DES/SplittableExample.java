// SplittableExample.java
import java.util.*;

public class SplittableExample {

    public static void main(String[] args)
    {
        SplittableRandom rng = new SplittableRandom();
        SplittableRandom anotherRng = rng.split();
        // Get numbers from the first stream
        System.out.println(rng.nextDouble());
        System.out.println(rng.nextDouble());
        // Get numbers from the second stream
        System.out.println(anotherRng.nextDouble());
        System.out.println(anotherRng.nextDouble());
    }

}
