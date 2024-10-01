package factory_design_pattern;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing Guitar: Strum strum...");
    }
}
