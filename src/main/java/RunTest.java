import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class RunTest {
    private String modelOne = "";
    private String modelTwo = "";

    @Before
    public void signUp(){
        modelOne = "PRIVET";
        modelTwo = "privet";
    }

    @Test
    public void testOne(){
        Assert.assertEquals(modelOne.toLowerCase(), modelTwo.toLowerCase());
    }

    @Test
    public void testFail(){
        Assert.assertEquals(modelOne, modelTwo);
    }

    @After
    public void closeTest(){
        System.out.println("Тест пройден");
    }

}

