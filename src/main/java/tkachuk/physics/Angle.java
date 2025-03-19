package tkachuk.physics;

public class Angle
{
    private double value;

    /**
     *
     * @param value the angle in degrees
     */
    public Angle(double value)
    {
        this.value = value;

    }

    public double getValue()
    {
        return value;
    }

    public double toRadians()
    {
        return Math.toRadians(value);
    }

    public double toDegrees()
    {
        return value;
    }
}
