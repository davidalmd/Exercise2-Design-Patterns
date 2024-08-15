package backupRestauracao;

public class MacroCommand implements ICommand {
    private ICommand[] commands;

    public MacroCommand(ICommand[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (ICommand command : commands) {
            command.execute();
        }
    }

    @Override
    public void store(String fileName) {
        for (ICommand command : commands) {
            command.store(fileName);
        }
    }
    
}
