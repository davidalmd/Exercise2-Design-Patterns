package backupRestauracao.TV;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class TVSetInputChannelCommand implements ICommand {
    private TV tv;
    private int channel;

    public TVSetInputChannelCommand(TV tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute() {
        tv.setInputChannel(this.channel);
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("TVSetInputChannelCommand-" + this.channel + " executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
