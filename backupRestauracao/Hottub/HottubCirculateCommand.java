package backupRestauracao.Hottub;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class HottubCirculateCommand implements ICommand {
    private Hottub hottub;

    public HottubCirculateCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.circulate();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("TVOnCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
