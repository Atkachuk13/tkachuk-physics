package tkachuk.physics;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.mockito.Mockito.*;

public class PhysicsControllerTest
{

    @Test
    public void calculate()
    {
        // given
        JSlider angleSlider = mock();
        doReturn(45).when(angleSlider).getValue();
        JTextField magnitudeFieled = mock();
        doReturn("80").when(magnitudeFieled).getText();
        JTextField timeFieled = mock();
        doReturn("10").when(timeFieled).getText();
        JLabel locationLabel = mock();
        ProjectileGraph graph = mock();
        PhysicsController controller = new PhysicsController(
                angleSlider, magnitudeFieled, timeFieled, locationLabel, graph
        );

        // when
        // if calll metghod on mock it be no affect
        // if call getter on mock, it will return whatever the defolt value is object is null,
        // booleam is false, string is null
        controller.calculate();

        // then
        // make sure our code sets the text of the label
        verify(locationLabel).setText("565.69, 565.69");

        //hw
        // controller for sudoku and put controller in code and make sur it works
        // new branch controller

    }
}
