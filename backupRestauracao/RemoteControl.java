package backupRestauracao;

import backupRestauracao.GarageDoor.GarageDoor;
import backupRestauracao.GarageDoor.GarageDoorDownCommand;
import backupRestauracao.GarageDoor.GarageDoorStopCommand;
import backupRestauracao.GarageDoor.GarageDoorUpCommand;
import backupRestauracao.Hottub.Hottub;
import backupRestauracao.Hottub.HottubCirculateCommand;
import backupRestauracao.Hottub.HottubJetsOffCommand;
import backupRestauracao.Hottub.HottubJetsOnCommand;
import backupRestauracao.Hottub.HottubSetTemperatureCommand;
import backupRestauracao.Light.Light;
import backupRestauracao.Light.LightOffCommand;
import backupRestauracao.Light.LightOnCommand;
import backupRestauracao.SecurityControl.SecurityControl;
import backupRestauracao.SecurityControl.SecurityControlArmCommand;
import backupRestauracao.SecurityControl.SecurityControlDisarmCommand;
import backupRestauracao.Sound.Sound;
import backupRestauracao.Sound.SoundOffCommand;
import backupRestauracao.Sound.SoundOnCommand;
import backupRestauracao.Sound.SoundSetCdCommand;
import backupRestauracao.Sound.SoundSetDvdCommand;
import backupRestauracao.Sound.SoundSetRadioCommand;
import backupRestauracao.Sound.SoundSetVolumeCommand;
import backupRestauracao.TV.TV;
import backupRestauracao.TV.TVOffCommand;
import backupRestauracao.TV.TVOnCommand;
import backupRestauracao.TV.TVSetInputChannelCommand;
import backupRestauracao.TV.TVSetVolumeCommand;
import backupRestauracao.CeilingFan.CeilingFan;
import backupRestauracao.CeilingFan.CeilingFanGetSpeedCommand;
import backupRestauracao.CeilingFan.CeilingFanHighCommand;
import backupRestauracao.CeilingFan.CeilingFanLowCommand;
import backupRestauracao.CeilingFan.CeilingFanMediumCommand;
import backupRestauracao.CeilingFan.CeilingFanOffCommand;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RemoteControl {
    private ICommand slot;
    private String fileName = "command_history.txt";
    
    public void setCommand(ICommand command) {
        this.slot = command;
    }

    public void pressButton() {
        slot.execute();
        slot.store(fileName);
    }

    public void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                ICommand command = commandFactory(line);
                if (command != null) {
                    command.execute();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ICommand commandFactory(String line) {
        String[] lineParts = line.split(" ");

        CeilingFan ceilingFan = new CeilingFan();
        GarageDoor garageDoor = new GarageDoor();
        Hottub hottub = new Hottub();
        Light light = new Light();
        SecurityControl securityControl = new SecurityControl();
        Sound sound = new Sound();
        TV tv = new TV();
        
        String[] command = lineParts[0].split("-");

        switch (command[0]) {
            case "CeilingFanGetSpeedCommand":
                return new CeilingFanGetSpeedCommand(ceilingFan);
            case "CeilingFanHighCommand":
                return new CeilingFanHighCommand(ceilingFan);
            case "CeilingFanLowCommand":
                return new CeilingFanLowCommand(ceilingFan);
            case "CeilingFanMediumCommand":
                return new CeilingFanMediumCommand(ceilingFan);
            case "CeilingFanOffCommand":
                return new CeilingFanOffCommand(ceilingFan);
            case "GarageDoorDownCommand":
                return new GarageDoorDownCommand(garageDoor);
            case "GarageDoorStopCommand":
                return new GarageDoorStopCommand(garageDoor);
            case "GarageDoorUpCommand":
                return new GarageDoorUpCommand(garageDoor);
            case "HottubCirculateCommand":
                return new HottubCirculateCommand(hottub);
            case "HottubJetsOffCommand":
                return new HottubJetsOffCommand(hottub);
            case "HottubJetsOnCommand":
                return new HottubJetsOnCommand(hottub);
            case "HottubSetTemperatureCommand":
                return new HottubSetTemperatureCommand(hottub, Integer.parseInt(command[1]));
            case "LightOnCommand":
                return new LightOnCommand(light);
            case "LightOffCommand":
                return new LightOffCommand(light);
            case "SecurityControlArmCommand":
                return new SecurityControlArmCommand(securityControl);
            case "SecurityControlDisarmCommand":
                return new SecurityControlDisarmCommand(securityControl);
            case "SoundOffCommand":
                return new SoundOffCommand(sound);
            case "SoundOnCommand":
                return new SoundOnCommand(sound);
            case "SoundSetCdCommand":
                return new SoundSetCdCommand(sound);
            case "SoundSetDvdCommand":
                return new SoundSetDvdCommand(sound);
            case "SoundSetRadioCommand":
                return new SoundSetRadioCommand(sound);
            case "SoundSetVolumeCommand":
                return new SoundSetVolumeCommand(sound, Integer.parseInt(command[1]));
            case "TVOffCommand":
                return new TVOffCommand(tv);
            case "TVOnCommand":
                return new TVOnCommand(tv);
            case "TVSetInputChannelCommand":
                return new TVSetInputChannelCommand(tv, Integer.parseInt(command[1]));
            case "TVSetVolumeCommand":
                return new TVSetVolumeCommand(tv, Integer.parseInt(command[1]));
            default:
                return null;
        }
    }
}
