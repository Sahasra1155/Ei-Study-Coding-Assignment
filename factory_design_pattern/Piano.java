package factory_design_pattern;

public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("Playing Piano: Plink plonk...");
    }
}
