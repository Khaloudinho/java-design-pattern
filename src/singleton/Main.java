package singleton;

public class Main {

    public static void main(String[] args) {

        TheVeryHighScore tvhs = TheVeryHighScore.getInstance();
        TheVeryHighScore tvhs2 = TheVeryHighScore.getInstance();

        tvhs.setScore(5);

        System.out.println(tvhs2.getScore());
    }
}
