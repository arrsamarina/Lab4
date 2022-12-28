package actors;

public class Location {
    private String place;
    public Location(String place) {
      this.place = place;
    }
    public String getPlace() {
        return place;
    }

    public Location setPlace(String place) {
        this.place = place;
        return this;
    }
    public static class Invitation {
        public void send(Person p1, Person p2, Location location) {
            System.out.println(p1.getName() + " приглашает " + p2.getName() + location);}

        public void accept(Person p1, Person p2, Location location) {
            System.out.println(p1.getName() + " принимает приглашает от  " + p2.getName() + location);}

    }

    @Override
    public String toString(){
        return "\nлокация: " + getPlace() + "\n";
    }

}
