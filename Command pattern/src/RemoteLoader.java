import vendorclasses.*;
import vendorclasses.commands.*;

public class RemoteLoader {
    //client class

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        GarageDoor garageDoor = new GarageDoor();
        Light light = new Light();
        Tv tv = new Tv();

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        TvOnCommand tvOnCommand = new TvOnCommand(tv);
        TvOffCommand tvOffCommand = new TvOffCommand(tv);

        System.out.println("empty remote \n" + remoteControl);
        remoteControl.setCommands(0, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommands(1, lightOnCommand, lightOffCommand);
        remoteControl.setCommands(2, tvOnCommand, tvOffCommand);

        System.out.println("remote with commands \n" + remoteControl);
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        System.out.println("\npressing undo button \n");
        remoteControl.undoButtonWasPressed();

        System.out.println("\n---------------------------\n\nMacro with multiple commands: \n");

        Command[] partyOn = { garageDoorOpenCommand, lightOnCommand,tvOnCommand };
        Command[] partyOff = { garageDoorCloseCommand, lightOffCommand, tvOffCommand };
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        System.out.println("Macro on");
        partyOnMacro.execute();
        System.out.println();
        System.out.println("Macro off");
        partyOffMacro.execute();
        System.out.println();
        System.out.println("Macro undo");
        partyOffMacro.undo();
    }
}
