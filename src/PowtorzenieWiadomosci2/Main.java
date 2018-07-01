package PowtorzenieWiadomosci2;

import PowtorzenieWiadomosci2.Zadanie3.NewsBroadcaster;
import PowtorzenieWiadomosci2.Zadanie3.Subscriber;
import PowtorzenieWiadomosci2.Zadanie3.SubscriberInterface;

public class Main {

    public static void main(String[] args) {
        System.out.println("&&&&&&&&&& ZADANIE 1 &&&&&&&&&&&&&&&&&&");
        Zadanie1 zadanie1 = new Zadanie1("850930123456");
        System.out.println("Modulo result: " + zadanie1.modulo());
        System.out.println();

        System.out.println("************* ZADANIE 3 ****************");
        NewsBroadcaster newsBroadcaster = new NewsBroadcaster();

        Subscriber subscriber1 = new Subscriber("Sub1", newsBroadcaster);
        Subscriber subscriber2 = new Subscriber("Sub2", newsBroadcaster);

        newsBroadcaster.notification("Programing is fun");
        newsBroadcaster.notification("You are the best");
    }


}
