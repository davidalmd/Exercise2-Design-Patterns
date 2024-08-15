package backupRestauracao.Sound;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class SoundOffCommand implements ICommand {
    private Sound sound;

    public SoundOffCommand(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void execute() {
        sound.off();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("SoundOffCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
