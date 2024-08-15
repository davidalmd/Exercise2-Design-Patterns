package backupRestauracao.Sound;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class SoundOnCommand implements ICommand {
    private Sound sound;

    public SoundOnCommand(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void execute() {
        sound.on();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("SoundOnCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
