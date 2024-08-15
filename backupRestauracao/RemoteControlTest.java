package backupRestauracao;

import backupRestauracao.CeilingFan.CeilingFan;
import backupRestauracao.CeilingFan.CeilingFanHighCommand;
import backupRestauracao.GarageDoor.GarageDoor;
import backupRestauracao.GarageDoor.GarageDoorUpCommand;
import backupRestauracao.Hottub.Hottub;
import backupRestauracao.Hottub.HottubJetsOnCommand;
import backupRestauracao.Light.Light;
import backupRestauracao.Light.LightOnCommand;
import backupRestauracao.SecurityControl.SecurityControl;
import backupRestauracao.SecurityControl.SecurityControlArmCommand;
import backupRestauracao.Sound.Sound;
import backupRestauracao.Sound.SoundSetCdCommand;
import backupRestauracao.Sound.SoundSetVolumeCommand;
import backupRestauracao.TV.TV;
import backupRestauracao.TV.TVOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        
        // Criando dispositivos
        Light livingRoomLight = new Light();
        TV tv = new TV();
        CeilingFan ceilingFan = new CeilingFan();
        GarageDoor garageDoor = new GarageDoor();
        Hottub hottub = new Hottub();
        Sound sound = new Sound();
        SecurityControl securityControl = new SecurityControl();

        // Criando comandos
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        SecurityControlArmCommand securityControlArm = new SecurityControlArmCommand(securityControl);
        
        // Criando Macro
        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        TVOnCommand tvOn = new TVOnCommand(tv);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        HottubJetsOnCommand hottubJetsOn = new HottubJetsOnCommand(hottub);
        SoundSetCdCommand soundOnWithCd = new SoundSetCdCommand(sound);
        SoundSetVolumeCommand soundSetVolume80 = new SoundSetVolumeCommand(sound, 80);

        MacroCommand macroCommand = new MacroCommand(new ICommand[] {lightOn, tvOn, ceilingFanHigh, hottubJetsOn, soundOnWithCd, soundSetVolume80});

        // Executando comandos e macro
        System.out.println("Executing commands...\n");
        remote.setCommand(garageDoorUp);
        remote.pressButton();
        remote.setCommand(securityControlArm);
        remote.pressButton();
        remote.setCommand(macroCommand);
        remote.pressButton();


        // Simulando recuperação após falha
        System.out.println("\nRecovering after failure...\n");
        remote.load();
    }
}
