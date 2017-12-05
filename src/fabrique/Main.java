package fabrique;

import java.util.Random;

public class Main {

    private static Random rand = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int randomScore = rand.nextInt(20) + 1;
            System.out.println("Random = " + randomScore + " so " + ((randomScore < 10) ? new JdbcKit() : new SrKit()).makeKit().who());
        }
    }
}
