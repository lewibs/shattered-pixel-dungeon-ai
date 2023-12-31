package com.shatteredpixel.shatteredpixeldungeon.actors;

import com.shatteredpixel.shatteredpixeldungeon.Dungeon;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Agent {

    private static long lastActionTime = 0;
    private static final long DELAY = 100; // Delay in milliseconds (1 second)

    public static void doAction() {
        long currentTime = System.currentTimeMillis();

        if (currentTime - lastActionTime > DELAY) {
            System.out.println(Dungeon.hero);

            try {
                Robot robot = new Robot();
                robot.keyPress(KeyEvent.VK_RIGHT); // Simulate pressing the right arrow key
                robot.keyRelease(KeyEvent.VK_RIGHT); // Release the right arrow key
                lastActionTime = currentTime; // Update last action time
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
    }
}
