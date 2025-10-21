# Avian Game Engine

This project is a game engine written in Java using [Lightweight Java Game Library](https://www.lwjgl.org/). It's based on the course [Code a 2D Game Engine using Java](https://www.youtube.com/watch?v=025QFeZfeyM).

## Project Structure

The following 

### Window

Is responsible for interaction with the operating system. It creates a [GLFW](https://www.glfw.org/) window that creates the actual application window.

### Listeners
There are two Listener classes: `KeyListener` and `MouseListener`. These classes provide lambda methods to handle events from the `GLFW Window`. Based on the events they provide data to the rest of the application, for example the mouse position or whether a specific key is pressed.

### Scenes
Scenes contain the game or engine logic. They do not interact with the operating sytem. 
