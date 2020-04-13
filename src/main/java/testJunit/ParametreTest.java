package testJunit;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParametreTest {
    private Hesapla hesapla=new Hesapla();

    @Test
    public void testmetrekareHesap() throws Exception{
        assertEquals(10, hesapla.metrekareHesapla(10,2));
    }
}
