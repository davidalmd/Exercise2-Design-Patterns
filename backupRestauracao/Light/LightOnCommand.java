package backupRestauracao.Light;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class LightOnCommand implements ICommand {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("LightOnCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
