package fabrique;

public class JdbcKit implements PersistKit {

    @Override
    public HighScore makeKit() {
        return new HighScoreKit();
    }
}
