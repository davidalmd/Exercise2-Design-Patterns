package backupRestauracao.Hottub;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class HottubJetsOffCommand implements ICommand {
    private Hottub hottub;

    public HottubJetsOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOff();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("HottubJetsOffCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
