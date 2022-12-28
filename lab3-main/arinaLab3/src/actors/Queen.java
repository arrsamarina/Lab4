package actors;

public class Queen extends Person {
    public Queen (String name) throws PersonHasNotNameException {
        super(name);
    }

    @Override
    public void move(Location location) {
    }
}
