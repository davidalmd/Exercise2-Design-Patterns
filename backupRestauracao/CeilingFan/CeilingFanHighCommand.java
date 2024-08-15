package backupRestauracao.CeilingFan;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class CeilingFanHighCommand implements ICommand {
    private CeilingFan ceilingFan;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("CeilingFanHighCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
