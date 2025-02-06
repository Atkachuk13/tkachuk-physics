package tkachuk.physics;

public class Force
{
    private double degrees;
    private double magnitude;

    public Force(double deg, double mag)
    {
        this.degrees = deg;
        this.magnitude = mag;
    }

    public double getDegrees()
    {
        return degrees;
    }

    public void setDegrees(double degrees)
    {
        this.degrees = degrees;
    }

    public double getMagnitude()
    {
        return magnitude;
    }

    public void setMagnitude(double magnitude)
    {
        this.magnitude = magnitude;
    }

    public Force add(Force force)
    {
        //degree 1
        double xVal1 = Math.cos(degrees) * magnitude;
        double yVal1 = Math.sin(degrees) * magnitude;

        //degree 2
        double xVal2 = Math.cos(force.degrees) * force.magnitude;
        double yVal2 = (Math.sin(force.degrees) * force.magnitude) *-1;

        //combining xs and ys
        double xEs = xVal1 + xVal2;
        double yEs = yVal1 + yVal2;

        //finding the angle
        double num = (xEs * xEs) + (yEs * yEs);
        double deg = Math.sqrt(num);

        //finding magnitude
        double mag = Math.atan(yEs / xEs);
        double result = Math.toDegrees(mag);

        return new Force(deg, result);
    }
}
