package tkachuk.physics;

public class Main
{

    public static void main(String[] args)
    {

        Force force = new Force(new Angle(60), 90);
        Location location = new Location(0,0);

        for (int i = 0; i < 10; i++)
        {
            force = force.add(Force.GRAVITY);
        //    location = location.apply(force);
            System.out.println(location);
        }
    }
}
