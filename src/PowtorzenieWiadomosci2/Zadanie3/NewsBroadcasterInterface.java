package PowtorzenieWiadomosci2.Zadanie3;

public interface NewsBroadcasterInterface {
    void subscribe(SubscriberInterface observer);
    void removeSub(SubscriberInterface observer);
    void notification(String text);
}
