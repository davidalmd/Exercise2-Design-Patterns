package backupRestauracao.Sound;

public class Sound {
    public void on() {
        System.out.println("Sound system is on");
    }

    public void off() {
        System.out.println("Sound system is off");
    }

    public void setCd() {
        System.out.println("Sound system is set to CD mode");
    }

    public void setDvd() {
        System.out.println("Sound system is set to DVD mode");
    }

    public void setRadio() {
        System.out.println("Sound system is set to Radio mode");
    }

    public void setVolume(int volume) {
        System.out.println("Sound system volume is set to " + volume);
    }
}
