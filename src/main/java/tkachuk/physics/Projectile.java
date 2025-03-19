package tkachuk.physics;

public class Projectile
{
   private Location location;
   private Force force;
   private int radius;

   public Location getLocation()
   {
      return location;
   }

   public Force getForce()
   {
      return force;
   }

   public int getRadius()
   {
      return radius;
   }

   public Projectile(Location location, Force force, int radius)
   {
      this.location = location;
      this.force = force;
      this.radius = radius;
   }

   public void add(Force f)
   {
      Force force1 = force.add(f);
   }

   public void move(double time)
   {
      Force scaled = force.scale(time);
      location = location.move(scaled);
   }

}
