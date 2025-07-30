package converter;

class LengthConverter implements BaseConverter<LengthUnit> {
    @Override
    public double convert(double value, LengthUnit fromUnit, LengthUnit toUnit) throws ConversionException {
        if (fromUnit == null || toUnit == null) {
            throw new ConversionException("Invalid units provided for length conversion.");
        }
        return value * fromUnit.getFactor() / toUnit.getFactor();
    }
}
