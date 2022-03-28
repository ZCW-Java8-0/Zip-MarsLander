import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class OnBoardComputerTest  {

    @Test
    public void calcMaxVelocityTest(){

        //Given
        int altitude = 5000;
        int velocity = 1000;
        int acceleration = 100;
        OnBoardComputer jerry = new OnBoardComputer();


        //When
        DescentEvent stat = new DescentEvent(10, velocity, 12000, altitude, 0);
        int actual = jerry.calculateMaxVel(stat.Altitude);
        int expected = 1000;

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void nextAlt(){

        //Given
        int altitude = 5000;
        int velocity = 1000;
        int acceleration = 100;
        int burn = 200;
        OnBoardComputer jerry = new OnBoardComputer();


        //When
        DescentEvent stat = new DescentEvent(10, velocity, 12000, altitude, 0);
        int actual = jerry.nextAltWithVelocity(stat.getAltitude(), stat.getVelocity(), burn);
        int expected = 4100;

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void nextVelocity(){

        //Given
        int altitude = 5000;
        int velocity = 1000;
        int acceleration = 100;
        int burn = 200;
        OnBoardComputer jerry = new OnBoardComputer();


        //When
        DescentEvent stat = new DescentEvent(10, velocity, 12000, altitude, 0);
        int actual = jerry.nextVelocityWithBurn(stat.getVelocity(), burn);
        int expected = 900;

        //Then
        Assert.assertEquals(expected,actual);

    }

}