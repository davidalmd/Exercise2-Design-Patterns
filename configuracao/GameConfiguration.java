import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GameConfiguration {
    private static GameConfiguration singletonGameConfig = null;

    private int appId;
    private String userName;
    private String language;
    private int offline;
    private int autoDLC;
    private String buildId;
    private String dlcName;
    private int updateDB;
    private String signature;
    private String windowInfo;
    private String lvWindowInfo;
    private String applicationPath;
    private String workingDirectory;
    private int waitForExit;
    private int noOperation;

    public int getAppId() { return appId; }
    public String getUserName() { return userName; }
    public String getLanguage() { return language; }
    public int getOffline() { return offline; }
    public int getAutoDLC() { return autoDLC; }
    public String getBuildId() { return buildId; }
    public String getDlcName() { return dlcName; }
    public int getUpdateDB() { return updateDB; }
    public String getSignature() { return signature; }
    public String getWindowInfo() { return windowInfo; }
    public String getLvWindowInfo() { return lvWindowInfo; }
    public String getApplicationPath() { return applicationPath; }
    public String getWorkingDirectory() { return workingDirectory; }
    public int getWaitForExit() { return waitForExit; }
    public int getNoOperation() { return noOperation; }

    private void setAppId(int appId) { this.appId = appId; }
    private void setUserName(String userName) { this.userName = userName; }
    private void setLanguage(String language) { this.language = language; }
    private void setOffline(int offline) { this.offline = offline; }
    private void setAutoDLC(int autoDLC) { this.autoDLC = autoDLC; }
    private void setBuildId(String buildId) { this.buildId = buildId; }
    private void setDlcName(String dlcName) { this.dlcName = dlcName; }
    private void setUpdateDB(int updateDB) { this.updateDB = updateDB; }
    private void setSignature(String signature) { this.signature = signature; }
    private void setWindowInfo(String windowInfo) { this.windowInfo = windowInfo; }
    private void setLvWindowInfo(String lvWindowInfo) { this.lvWindowInfo = lvWindowInfo; }
    private void setApplicationPath(String applicationPath) { this.applicationPath = applicationPath; }
    private void setWorkingDirectory(String workingDirectory) { this.workingDirectory = workingDirectory; }
    private void setWaitForExit(int waitForExit) { this.waitForExit = waitForExit; }
    private void setNoOperation(int noOperation) { this.noOperation = noOperation; }

    private GameConfiguration() {
        loadConfigFile();
    }

    private void loadConfigFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("configuracao/config.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("=", 2);
                if (parts.length >= 2) {
                    String key = parts[0];
                    String value = parts[1];

                    switch (key) {
                        case "AppId":
                            setAppId(Integer.parseInt(value));
                            break;
                        case "UserName":
                            setUserName(value);
                            break;
                        case "Language":
                            setLanguage(value);
                            break;
                        case "Offline":
                            setOffline(Integer.parseInt(value));
                            break;
                        case "AutoDLC":
                            setAutoDLC(Integer.parseInt(value));
                            break;
                        case "BuildId":
                            setBuildId(value);
                            break;
                        case "DLCName":
                            setDlcName(value);
                            break;
                        case "UpdateDB":
                            setUpdateDB(Integer.parseInt(value));
                            break;
                        case "Signature":
                            setSignature(value);
                            break;
                        case "WindowInfo":
                            setWindowInfo(value);
                            break;
                        case "LVWindowInfo":
                            setLvWindowInfo(value);
                            break;
                        case "ApplicationPath":
                            setApplicationPath(value);
                            break;
                        case "WorkingDirectory":
                            setWorkingDirectory(value);
                            break;
                        case "WaitForExit":
                            setWaitForExit(Integer.parseInt(value));
                            break;
                        case "NoOperation":
                            setNoOperation(Integer.parseInt(value));
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GameConfiguration getInstance() {
        if (singletonGameConfig == null) {
            singletonGameConfig = new GameConfiguration();
        }
        return singletonGameConfig;
    }

    public void printAll() {
        System.out.println("AppId=" + appId);
        System.out.println("UserName=" + userName);
        System.out.println("Language=" + language);
        System.out.println("Offline=" + offline);
        System.out.println("AutoDLC=" + autoDLC);
        System.out.println("BuildId=" + buildId);
        System.out.println("DLCName=" + dlcName);
        System.out.println("UpdateDB=" + updateDB);
        System.out.println("Signature=" + signature);
        System.out.println("WindowInfo=" + windowInfo);
        System.out.println("LVWindowInfo=" + lvWindowInfo);
        System.out.println("ApplicationPath=" + applicationPath);
        System.out.println("WorkingDirectory=" + workingDirectory);
        System.out.println("WaitForExit=" + waitForExit);
        System.out.println("NoOperation=" + noOperation + "\n\n");
    }
}
