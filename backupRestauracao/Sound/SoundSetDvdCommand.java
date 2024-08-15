package backupRestauracao.Sound;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class SoundSetDvdCommand implements ICommand {
    private Sound sound;

    public SoundSetDvdCommand(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void execute() {
        sound.setDvd();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("SoundSetDvdCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
