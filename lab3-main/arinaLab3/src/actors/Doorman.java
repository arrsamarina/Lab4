package actors;


import interfaces.Conversationable;
import interfaces.Watchable;

public class Doorman extends Person implements Watchable {

    public Doorman(String name) throws PersonHasNotNameException {
        super(name);

    }
    public void converseToPerson(Person person){
        String reasonToStop =  " стучать бессмысленно";

        doormanToAlice.converse(person);
        
        
        class Reason {
               private String reason = " бессмысленно стучать";
            public Reason() {
                this.reason = reasonToStop;

            }
            public String getReason() {
                return reason;
            }

            public void setReason(String reason) {
                this.reason = reason;
            }
        }
        System.out.println(getName() + " пытается объяснить, что" + reasonToStop);
    }

    Conversationable doormanToAlice = new Conversationable() {
        @Override
        public void converse(Person person) {
            System.out.println(getName() + " начинает беседу с " + person.getName() );
        }
    };

    @Override
    public void move(Location location) {
        System.out.println(getName() + " сел " + location);
    }

    @Override
    public void bow(Person person) {
        System.out.println(getName() + " поклонился ");
    }

    @Override
    public void watch(Location location) {
        System.out.println(getName() + " смотрит " + location);
    }


}
