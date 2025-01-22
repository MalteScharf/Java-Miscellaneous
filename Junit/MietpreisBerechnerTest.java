package Junit;

public class MietpreisBerechnerTest extends junit.framework.TestCase{
    MietpreisBerechner m;

    public void setUp() {
        m = new MietpreisBerechner();
    }

    public void testA() {
        assertEquals("Mietpreis von 6000 erwartet und " + m.berechneMietpreis(1,10) +" erhalten.", 6000, m.berechneMietpreis(1,10));
    }

    public void testB() {
        assertEquals( "Mietpreis von 800 erwartet und " + m.berechneMietpreis(2,0) +" erhalten.",8000, m.berechneMietpreis(2,0));
    }
    public void testC() {
        assertEquals( "Mietpreis von 12000 erwartet und " + m.berechneMietpreis(4,200) +" erhalten.",12000, m.berechneMietpreis(4,200));
    }
    public void testD() {
        assertEquals( "Mietpreis von 20750 erwartet und " + m.berechneMietpreis(8,250) +" erhalten.",20750, m.berechneMietpreis(8,250));
    }
    public void testE() {
        assertEquals( "Mietpreis von 26000 erwartet und " + m.berechneMietpreis(11,199) +" erhalten.",26000, m.berechneMietpreis(11,199));
    }

    public void testF() {
        assertEquals( "Mietpreis von 30000 erwartet und " + m.berechneMietpreis(13,150) +" erhalten.",30000, m.berechneMietpreis(13,150));
    }
    public void testG() {
        assertEquals( "Mietpreis von 31800 erwartet und " + m.berechneMietpreis(14,150) +" erhalten.",31800, m.berechneMietpreis(14,150));
    }
    public void testH() {
        assertEquals( "Mietpreis von 33000 erwartet und " + m.berechneMietpreis(20,250) +" erhalten.",33000, m.berechneMietpreis(20,250));
    }

}
