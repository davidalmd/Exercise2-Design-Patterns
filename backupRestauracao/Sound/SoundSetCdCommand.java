package backupRestauracao.Sound;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class SoundSetCdCommand implements ICommand {
    private Sound sound;

    public SoundSetCdCommand(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void execute() {
        sound.setCd();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("SoundSetCdCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
