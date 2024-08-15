package backupRestauracao.SecurityControl;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class SecurityControlDisarmCommand implements ICommand {
    private SecurityControl securityControl;

    public SecurityControlDisarmCommand(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }

    @Override
    public void execute() {
        securityControl.disarm();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("SecurityControlDisarmCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}
