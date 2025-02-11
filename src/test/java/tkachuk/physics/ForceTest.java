package tkachuk.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForceTest
{
    @Test
    public void add()
    {
        //given:
        // set variable
        Force f1 = new Force(32, 10);
        Force f2 = new Force(105, 10);
        //when:
        //run what is being tested
        Force f3 = f1.add(f2);
        //then:
        //check the result
        assertEquals(68.5, f3.getDegrees(), 0.1);
        assertEquals(16.08, f3.getMagnitude(), 0.1);
    }


    @Test
    public void scale()
    {
        Force f = new Force(30, 15);

        Force difForce = f.scale(0.391);

        assertEquals(30, difForce.getDegrees(), 0.1);
        assertEquals(5.865, difForce.getMagnitude(), 0.1);
    }

}