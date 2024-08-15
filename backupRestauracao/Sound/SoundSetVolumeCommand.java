package backupRestauracao.Sound;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class SoundSetVolumeCommand implements ICommand {
    private Sound sound;
    private int volume;

    public SoundSetVolumeCommand(Sound sound, int volume) {
        this.sound = sound;
        this.volume = volume;
    }

    @Override
    public void execute() {
        sound.setVolume(this.volume);
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("SoundSetVolumeCommand-" + this.volume + " executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
