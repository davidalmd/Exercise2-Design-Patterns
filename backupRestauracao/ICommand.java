package backupRestauracao;

public interface ICommand {
    public void execute();
    public void store(String fileName);
}
