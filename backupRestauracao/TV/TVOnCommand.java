package backupRestauracao.TV;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class TVOnCommand implements ICommand{
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
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
