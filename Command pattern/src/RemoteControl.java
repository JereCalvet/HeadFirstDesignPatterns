import vendorclasses.commands.Command;
import vendorclasses.commands.NoCommand;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command lastCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        fillRemoteControlWithNoCommands();
    }

    private void fillRemoteControlWithNoCommands() {
        NoCommand defaultEmptyValue = new NoCommand();
        lastCommand = defaultEmptyValue;

        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = defaultEmptyValue;
            offCommands[i] = defaultEmptyValue;
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        onCommands[slot].undo();
        lastCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        lastCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n----- Remote Control -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("  ").append(offCommands[i].getClass().getName()).append("\n");
        }

        return stringBuilder.toString();
    }
}
