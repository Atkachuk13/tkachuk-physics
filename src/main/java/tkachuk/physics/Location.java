package tkachuk.physics;

public class Location
{
    private double x;
    private double y;


    public Location(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getX()
    {
        return x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getY()
    {
        return y;
    }

    public Location apply(Force f)
    {
        double radians = Math.toRadians(f.getDegrees());

        double num1 = f.getMagnitude() * Math.cos(radians);
        double num2 = f.getMagnitude() * Math.sin(radians);

        double newX = x + num1;
        double newY = y + num2;

        return new Location(newX, newY);
    }
}
