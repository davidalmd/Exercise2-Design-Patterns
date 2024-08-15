package backupRestauracao.GarageDoor;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class GarageDoorDownCommand implements ICommand {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("GarageDoorDownCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
