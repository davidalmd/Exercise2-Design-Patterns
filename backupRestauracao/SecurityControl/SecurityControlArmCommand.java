package backupRestauracao.SecurityControl;

import backupRestauracao.ICommand;
import java.io.FileWriter;
import java.io.IOException;

public class SecurityControlArmCommand implements ICommand {
    private SecurityControl securityControl;

    public SecurityControlArmCommand(SecurityControl securityControl) {
        this.securityControl = securityControl;
    }

    @Override
    public void execute() {
        securityControl.arm();
    }

    @Override
    public void store(String fileName) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("SecurityControlArmCommand executed\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}
