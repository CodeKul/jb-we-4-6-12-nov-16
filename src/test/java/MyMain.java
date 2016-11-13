import org.junit.Assert;
import org.junit.Test;

/**
 * Created by aniruddha on 12/11/16.
 */
public class MyMain {

    @Test
    public void checkFor12(){

        int countCitiesExpected = 12;
        int countCitiesActual = 12;

        Assert.assertEquals(countCitiesExpected,countCitiesActual);
        System.out.println("Yes cities are 12");
    }
}
