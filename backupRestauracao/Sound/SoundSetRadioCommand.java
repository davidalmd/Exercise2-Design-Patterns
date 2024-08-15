package backupRestauracao.Sound;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class SoundSetRadioCommand implements ICommand {
    private Sound sound;

    public SoundSetRadioCommand(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void execute() {
        sound.setRadio();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("SoundSetRadioCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
