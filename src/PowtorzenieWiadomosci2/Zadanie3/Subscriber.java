package PowtorzenieWiadomosci2.Zadanie3;

public class Subscriber implements SubscriberInterface{
    String subscriberName = " ";
    NewsBroadcaster newsBroadcaster = new NewsBroadcaster();

    public Subscriber(String subscriberName, NewsBroadcaster newsBroadcaster) {
        this.subscriberName = subscriberName;
        this.newsBroadcaster = newsBroadcaster;
        this.newsBroadcaster.subscribe(this);
    }

    @Override
    public void update(String text) {
        System.out.println(subscriberName + ": Otrzymujesz nastepne wydanie: " + text);
    }
}
