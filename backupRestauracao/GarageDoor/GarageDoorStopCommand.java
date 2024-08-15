package backupRestauracao.GarageDoor;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class GarageDoorStopCommand implements ICommand {
    private GarageDoor garageDoor;

    public GarageDoorStopCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("GarageDoorStopCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
