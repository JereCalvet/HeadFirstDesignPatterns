package vendorclasses.commands;

import vendorclasses.Tv;

public class TvOffCommand implements Command {
    private final Tv tv;

    public TvOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
