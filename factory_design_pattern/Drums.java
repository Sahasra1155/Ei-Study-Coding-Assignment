package factory_design_pattern;

public class Drums implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing Drums: Boom boom...");
    }
}
