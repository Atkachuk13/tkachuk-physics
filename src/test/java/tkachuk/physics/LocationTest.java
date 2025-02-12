package tkachuk.physics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationTest
{
    @Test
    public void apply()
    {
        Force force = new Force(36.87, 5);
        Location l = new Location(7, 3);

        Location newLoc = l.apply(force);

        assertEquals(11, newLoc.getX(), 0.1);
        assertEquals(6, newLoc.getY(), 0.1);
    }
}
