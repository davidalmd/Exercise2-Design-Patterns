package backupRestauracao.GarageDoor;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class GarageDoorUpCommand implements ICommand {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("GarageDoorUpCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
