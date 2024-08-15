package backupRestauracao.Light;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class LightOffCommand implements ICommand {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("LightOffCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
