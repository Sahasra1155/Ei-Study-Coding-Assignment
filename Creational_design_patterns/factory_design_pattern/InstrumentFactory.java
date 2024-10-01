package factory_design_pattern;

public class InstrumentFactory {
    // Factory method to create the appropriate Instrument based on the type
    public static Instrument getInstrument(String instrumentType) {
        if (instrumentType == null) {
            return null;
        }
        if (instrumentType.equalsIgnoreCase("GUITAR")) {
            return new Guitar();
        } else if (instrumentType.equalsIgnoreCase("PIANO")) {
            return new Piano();
        } else if (instrumentType.equalsIgnoreCase("DRUMS")) {
            return new Drums();
        }
        return null;
    }
}
