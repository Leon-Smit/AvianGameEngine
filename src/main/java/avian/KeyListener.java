package avian;

import static org.lwjgl.glfw.GLFW.GLFW_PRESS;
import static org.lwjgl.glfw.GLFW.GLFW_RELEASE;

public class KeyListener {
    private static KeyListener instance = null;
    private boolean keyPressed[] = new boolean[350];

    private KeyListener() {

    }

    public static KeyListener get() {
        if (instance == null) {
            instance = new KeyListener();
        }

        return instance;
    }

    public static void keyCallback(long window, int key, int scancode, int action, int mods) {
        if (key >= get().keyPressed.length) {
            throw new IllegalArgumentException("Key " + key + " is not supported");
        }

        if (action == GLFW_PRESS) {
            get().keyPressed[key] = true;
        } else if (action == GLFW_RELEASE) {
            get().keyPressed[key] = false;
        }
    }

    public static boolean isKeyPressed(int key) {
        return get().keyPressed[key];
    }

    public static void endFrame() {

    }
}
