package WEEK_1.Design_Patterns_And_Principles.Exercise9;

public class CommandPatternTest {
    public static void main(String[] args) {
        // Create a light
        Light light = new Light();

        // Create command objects
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Create a remote control
        RemoteControl remoteControl = new RemoteControl();

        // Set command to turn on the light and press the button
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        // Set command to turn off the light and press the button
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }
}

