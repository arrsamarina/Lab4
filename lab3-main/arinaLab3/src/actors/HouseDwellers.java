package actors;

public class HouseDwellers extends Person {
    public HouseDwellers (String name) throws PersonHasNotNameException {
        super(name);
    }
    @Override
    public void move(Location location) {
        System.out.println(getName() + " сильно шумят" + location);
    }

   public class Hospitality {

        public void guestsWaiting() {
            System.out.println(getName()+ " гостей не ждут, они шумят");
        }
    }
}
