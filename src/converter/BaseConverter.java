package converter;

interface BaseConverter<T> {
    double convert(double value, T fromUnit, T toUnit) throws ConversionException;
}

enum LengthUnit {
    METER(1), KILOMETER(1000), MILE(1609.34);
    private final double factor;

    LengthUnit(double factor) {
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }
}

enum TemperatureUnit {
    CELSIUS(0), FAHRENHEIT(32), KELVIN(273.15);
    private final double offset;

    TemperatureUnit(double offset) {
        this.offset = offset;
    }

    public double getOffset() {
        return offset;
    }
}

enum WeightUnit {
    KILOGRAM(1), POUND(0.453592), OUNCE(0.0283495);
    private final double factor;

    WeightUnit(double factor) {
        this.factor = factor;
    }

    public double getFactor() {
        return factor;
    }
}
