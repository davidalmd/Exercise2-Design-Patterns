package backupRestauracao.Hottub;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class HottubSetTemperatureCommand implements ICommand {
    private Hottub hottub;
    private int temperature;

    public HottubSetTemperatureCommand(Hottub hottub, int temperature) {
        this.hottub = hottub;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        hottub.setTemperature(this.temperature);
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("HottubSetTemperatureCommand-" + this.temperature + " executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
