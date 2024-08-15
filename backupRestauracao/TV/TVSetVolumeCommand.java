package backupRestauracao.TV;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class TVSetVolumeCommand implements ICommand {
    private TV tv;
    private int volume;

    public TVSetVolumeCommand(TV tv, int volume) {
        this.tv = tv;
        this.volume = volume;
    }

    @Override
    public void execute() {
        tv.setVolume(this.volume);
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("TVSetVolumeCommand-" + this.volume + " executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
