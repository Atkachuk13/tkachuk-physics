package tkachuk.physics;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhysicsFrame extends JFrame
{
    private final JLabel angleLabel = new JLabel("Angle Label");
    private final JSlider angleSlider = new JSlider(0, 180, 50);
    private final JTextField magnitudeField = new JTextField("Magnitude");
    private final JTextField timeField = new JTextField("Time");
    private ProjectileGraph graph = new ProjectileGraph();
    private final PhysicsController controller;

    public PhysicsFrame()
    {
        setTitle("Moving Projectile");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel resultLabel = new JLabel("(x,y)");

        controller = new PhysicsController(angleSlider, magnitudeField, timeField, resultLabel, graph);

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(3,1));
        westPanel.add(angleSlider);
        westPanel.add(magnitudeField);
        westPanel.add(timeField);
        add(westPanel, BorderLayout.WEST);

        add(graph, BorderLayout.CENTER);

        angleSlider.addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                //calculate projectile location
                controller.calculate();
                ;
            }
        });

        magnitudeField.getDocument().addDocumentListener(new DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e)
            {
                controller.calculate();
            }

            @Override
            public void removeUpdate(DocumentEvent e)
            {
                controller.calculate();
            }

            @Override
            public void changedUpdate(DocumentEvent e)
            {
                controller.calculate();
            }
        });

        timeField.getDocument().addDocumentListener(new DocumentListener()
        {
            @Override
            public void insertUpdate(DocumentEvent e)
            {
                controller.calculate();
            }

            @Override
            public void removeUpdate(DocumentEvent e)
            {
                controller.calculate();
            }

            @Override
            public void changedUpdate(DocumentEvent e)
            {
                controller.calculate();
            }
        });

    }

    public static void main(String[] args)
    {
        PhysicsFrame frame = new PhysicsFrame();
        frame.setVisible(true);
    }
}
