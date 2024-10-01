package bridge_design_pattern;

public class Philips extends TV {
    Remote remoteType;

    Philips(Remote r) {
        super(r);
        this.remoteType = r;
    }

    public void on() {
        System.out.print("Philips TV ON: ");
        remoteType.on();
    }

    public void off() {
        System.out.print("Philips TV OFF: ");
        remoteType.off();
    }
}
