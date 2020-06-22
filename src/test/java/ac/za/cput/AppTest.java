package ac.za.cput;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    private Animal animal = new Animal("milou","dog");
    private Animal cat = new Animal("bobi","cat");
    App app = new App();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void readList() {
        List<Animal> ani = new ArrayList<>();
        ani.add(animal);
        ani.add(cat);

        Assert.assertTrue(app.readList(ani));
        System.out.println(app.getAnimal("milou"));

    }
}
