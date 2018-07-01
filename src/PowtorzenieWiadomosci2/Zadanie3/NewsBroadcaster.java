package PowtorzenieWiadomosci2.Zadanie3;

import java.util.ArrayList;

public class NewsBroadcaster implements NewsBroadcasterInterface {
    ArrayList<SubscriberInterface> subscribersList = new ArrayList<>();

    @Override
    public void subscribe(SubscriberInterface observer) {
        subscribersList.add(observer);
    }

    @Override
    public void removeSub(SubscriberInterface observer) {
        subscribersList.remove(observer);
    }

    @Override
    public void notification(String text) {
        for (SubscriberInterface observer : subscribersList) {
            observer.update(text);
        }

    }
}
