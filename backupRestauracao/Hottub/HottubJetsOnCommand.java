package backupRestauracao.Hottub;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class HottubJetsOnCommand implements ICommand {
    private Hottub hottub;

    public HottubJetsOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOn();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("HottubJetsOnCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
