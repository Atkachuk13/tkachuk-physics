package tkachuk.physics;

import javax.swing.*;

public class PhysicsController
{

    private final JSlider angleSlider;
    private final JTextField magnitudeField;
    private final JTextField textField;
    private final JLabel locationField;
    private final ProjectileGraph graph;

    public PhysicsController(
            JSlider angleSlider,
            JTextField magnitudeFieled,
            JTextField textField,
            JLabel locationFieled,
            ProjectileGraph graph)
    {
        this.angleSlider = angleSlider;
        this.magnitudeField = magnitudeFieled;
        this.textField = textField;
        this.locationField = locationFieled;
        this.graph = graph;
    }

    public void calculate()
    {
        double angle = angleSlider.getValue();
        String magnitudeText = magnitudeField.getText();
        if (magnitudeText.isEmpty() || !magnitudeText.matches("\\d+"))
        {
            return;
        }
        double magnitude = Double.parseDouble(magnitudeText);
        Projectile p = new Projectile(
                new Location(0, 0),
                new Force(new Angle(angle), magnitude),
                1);

        String timeText = locationField.getText();
        if(timeText.isEmpty() || !timeText.matches("\\d+"))
        {
            return;
        }

        double time = Double.parseDouble(timeText);

        graph.setValue(angle, magnitude, time);

        for(int i = 0; i < time; i++)
        {
            p.move(1);
        }

        Location location = p.getLocation();
        String formatX = String.format("%.2f", location.getX());
        String formatY = String.format("%.2f", location.getY());
        locationField.setText("(" + formatX + ", " + formatY + ")");

    }

    // pass into controller all the component classes
    // field
    // textbox
}
