package singleton;

public class TheVeryHighScore {

    private static TheVeryHighScore instance = new TheVeryHighScore();
    private int score = 0;

    private TheVeryHighScore() {}

    public synchronized static TheVeryHighScore getInstance() {
        if (instance == null){
            instance = new TheVeryHighScore();
        }
        return instance;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
