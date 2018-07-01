package PowtorzenieWiadomosci2.Test;

import PowtorzenieWiadomosci2.Zadanie1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassZadanie1 {

    Zadanie1 pesel;

    @Before
    public final void before() {
        pesel = new Zadanie1("85093009978");
    }

    @Test
    public void whenPutMyPeselReturnsThirtyDay() {
        assertEquals(30, pesel.getDaysFromPesel());
    }

    @Test
    public void whenPutMyPeselReturnsZeroNineMonth() {
        assertEquals(9, pesel.getMonthFromPesel());
    }

    @Test
    public void whenPutMyPeselReturnsEightyFiveYear() {
        assertEquals(85, pesel.getYearFromPesel());
    }

    @Test
    public void whenPutMyPeselModuloIsOne() {
        assertEquals(1, pesel.modulo());
    }


}
