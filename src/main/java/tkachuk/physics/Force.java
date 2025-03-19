package tkachuk.physics;

public class Force
{

    public static final Force GRAVITY = new Force(0, -9.8);
    private double x;
    private double y;


    public Force(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public Force(Angle degrees, double magnitude)
    {
        x = Math.toDegrees(Math.cos(degrees.toRadians()) * magnitude);
        y = Math.toDegrees(Math.sin(degrees.toRadians()) * magnitude);
    }

    public double getDegrees()
    {
        return Math.toDegrees(Math.atan(y / x));
    }

    public double getMagnitude()
    {
        return Math.sqrt((x * x) + (y * y));
    }

    public Force scale(double t)
    {
        return new Force(getDegrees(), getMagnitude() * t);
    }

    public Force add(Force force)
    {

        //combining xs and ys
        x = getX() + force.getX();
        y = getY() + force.getY();

        return new Force(getDegrees(), getMagnitude());
    }
}
