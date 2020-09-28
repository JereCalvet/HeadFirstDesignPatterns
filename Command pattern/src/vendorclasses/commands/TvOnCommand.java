package vendorclasses.commands;

import vendorclasses.Tv;

public class TvOnCommand implements Command {
    private final Tv tv;

    public TvOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
