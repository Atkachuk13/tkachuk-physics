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

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public Location move(Force f)
    {
        double radians = Math.toRadians(f.getDegrees());

        double num1 = f.getMagnitude() * Math.cos(radians);
        double num2 = f.getMagnitude() * Math.sin(radians);

        double newX = x + num1;
        double newY = y + num2;

        return new Location(newX, newY);
    }

    @Override
    public String toString()
    {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
