package backupRestauracao.TV;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class TVOffCommand implements ICommand {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("TVOffCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
