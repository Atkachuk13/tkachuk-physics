package tkachuk.physics;

public class Force
{
    private double degrees;
    private double magnitude;


    public Force scale(double t)
    {
        double deg = degrees;
        double mag = magnitude * t;

        return new Force(deg, mag);
    }


    public Force(double degrees, double magnitude)
    {
        this.degrees = degrees;
        this.magnitude = magnitude;
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
        double dd = Math.toRadians(degrees);
        double mm = Math.toRadians(magnitude);
        double dd2 = Math.toRadians(force.degrees);
        double mm2 = Math.toRadians(force.magnitude);

        //degree 1
        double xVal1 = Math.toDegrees(Math.cos(dd) * mm);
        double yVal1 = Math.toDegrees(Math.sin(dd) * mm);

        //degree 2
        double xVal2 = Math.toDegrees(Math.cos(dd2) * mm2);
        double yVal2 = Math.toDegrees(Math.sin(dd2) * mm2);

        //combining xs and ys
        double xEs = xVal1 + xVal2;
        double yEs = yVal1 + yVal2;

        //finding the degree
        double num = (xEs * xEs) + (yEs * yEs);
        double mag = Math.sqrt(num);

        //finding magnitude
        double result = Math.atan(yEs / xEs);
        double deg = Math.toDegrees(result);

        return new Force(deg, mag);
    }
}
