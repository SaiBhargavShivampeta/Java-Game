package test.game;

import game.controller.GameController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameControllerTest {

    @Test
    public void testSingletonInstance() {
        GameController controller1 = GameController.getInstance();
        GameController controller2 = GameController.getInstance();

        assertNotNull(controller1);  // Verify controller is not null
        assertNotNull(controller2);  // Verify second instance is not null
        assert(controller1 == controller2);  // Ensure both instances are the same
    }
}
