package PowtorzenieWiadomosci2.Test;

import PowtorzenieWiadomosci2.Zadanie3.NewsBroadcaster;
import PowtorzenieWiadomosci2.Zadanie3.Subscriber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassZadanie3 {

    NewsBroadcaster newsBroadcaster;
    Subscriber subscriber1;
    Subscriber subscriber2;


    @Before
    public void before(){
        newsBroadcaster = new NewsBroadcaster();
        subscriber1 = new Subscriber("Sub1", newsBroadcaster);
        subscriber2 = new Subscriber("Sub2", newsBroadcaster);
    }

    @Test
    public void whenTwoSubscribersListInNewsBroadcasterLengthIsTwo(){
        
    }

}
