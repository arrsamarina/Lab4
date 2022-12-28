package actors;

public class Duchess extends Person{
    public Duchess (String name) throws PersonHasNotNameException {
        super(name);
    }

    @Override
    public void move(Location location) {
    }

}
