package backupRestauracao.CeilingFan;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class CeilingFanGetSpeedCommand implements ICommand {
    private CeilingFan ceilingFan;

    public CeilingFanGetSpeedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.getSpeed();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("CeilingFanGetSpeedCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
