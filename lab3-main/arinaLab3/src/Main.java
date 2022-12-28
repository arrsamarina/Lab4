import actors.*;
import enums.EmotionalCondition;

public class Main {

    public static void main(String[] args) throws PersonHasNotNameException {
        try {
        Queen queen = new Queen("Королева");
        Duchess duchess = new Duchess("Герцогиня");
        Alice alice = new Alice("Алиса");
        Carp carp = new Carp("Карась");
        Doorman doorman = new Doorman("Швейцар");
        HouseDwellers houseDwellers = new HouseDwellers("Обитатели дома");
        Location.Invitation invitation = new Location.Invitation();
            invitation.send(queen, duchess, new Location("вечерний крокет"));
            doorman.bow(carp);
            carp.bow(doorman);
            alice.emotion(EmotionalCondition.LAUGH);
            alice.move(new Location(" лес"));
            alice.emotion(EmotionalCondition.FINISHEDLAUGHING);
            alice.comeback();
            alice.bow(doorman);
            alice.watch(new Location("куст"));
            carp.move(new Location(" непонятно куда"));
            doorman.move(new Location(" на земле"));
            doorman.watch(new Location("небо"));
            doorman.emotion(EmotionalCondition.EMPTYHEAD);
            alice.nearHouse();
            alice.knock();
            alice.emotion(EmotionalCondition.SHYLY);
            doorman.converseToPerson(alice);
            HouseDwellers.Hospitality hospitality = houseDwellers.new Hospitality();
            hospitality.guestsWaiting();
            doorman.emotion(EmotionalCondition.MEANINGLESS); } catch (PersonHasNotNameException e) {
            System.out.println(e.getMessage());
        }



    }
}
