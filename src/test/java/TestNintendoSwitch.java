import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestNintendoSwitch {

//  Arrange
    NintendoSwitch nintendoSwitch;

    @BeforeEach
    public void setUp() {
        nintendoSwitch = new NintendoSwitch();
    }

    @Test
    public void testRightColorSetter() {
        nintendoSwitch.setRightJoyConColor("blue");
        String expected = "blue";
        String actual = nintendoSwitch.getRightJoyConColor();

        assertEquals(expected, actual);
    }

    @Test
    public void testModel() {
        nintendoSwitch.setModel("Nintendo Switch Original");
        String expected1 = "Nintendo Switch Lite";
        String expected2 = "Nintendo Switch Original";
        String expected3 = "Nintendo Switch Revision";
        String actual = nintendoSwitch.getModel();

        assertTrue(actual.equals(expected1) || actual.equals(expected2) || actual.equals(expected3));
    }

    @Test
    public void testIfRightAndLeftJoyConsColorMatches() {
        nintendoSwitch.setRightJoyConColor("red");
        nintendoSwitch.setLeftJoyConColor("red");
        boolean expected = nintendoSwitch.getRightJoyConColor().equals(nintendoSwitch.getLeftJoyConColor());
        boolean actual = nintendoSwitch.getLeftJoyConColor().equals(nintendoSwitch.getRightJoyConColor());

        assertEquals(expected, actual);
    }

    @Test
    public void testContainsSD() {
        nintendoSwitch.setContainsSD(true);

        assertTrue(nintendoSwitch.getContainsSD());
    }

    @Test
    public void testSetGamesDownloaded() {
        nintendoSwitch.gamesDownloaded.add("Mario Odyssey");
        nintendoSwitch.gamesDownloaded.add("Zelda Breath of the Wild");
        nintendoSwitch.setGamesDownloaded(nintendoSwitch.getGamesDownloaded());
        System.out.println(nintendoSwitch.getGamesDownloaded());
        String actual = nintendoSwitch.getGamesDownloaded().toString();
        String expected = ("[Mario Odyssey, Zelda Breath of the Wild]");

        assertEquals(actual, expected);


    }


}
