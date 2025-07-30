package converter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            if (parts.length != 4) {
                System.err.println("Ошибка: неверный формат ввода.");
                continue;
            }
            try {
                double value = Double.parseDouble(parts[1]);
                String category = parts[0];
                String fromUnitStr = parts[2].toUpperCase();
                String toUnitStr = parts[3].toUpperCase();

                BaseConverter converter = null;
                if ("length".equals(category)) {
                    converter = new LengthConverter();
                    LengthUnit fromUnit = LengthUnit.valueOf(fromUnitStr);
                    LengthUnit toUnit = LengthUnit.valueOf(toUnitStr);
                    System.out.printf("%.2f %s = %.2f %s%n", value, fromUnit, converter.convert(value, fromUnit, toUnit), toUnit);
                } else if ("temperature".equals(category)) {
                    converter = new TemperatureConverter();
                    TemperatureUnit fromUnit = TemperatureUnit.valueOf(fromUnitStr);
                    TemperatureUnit toUnit = TemperatureUnit.valueOf(toUnitStr);
                    System.out.printf("%.2f %s = %.2f %s%n", value, fromUnit, converter.convert(value, fromUnit, toUnit), toUnit);
                } else if ("weight".equals(category)) {
                    converter = new WeightConverter();
                    WeightUnit fromUnit = WeightUnit.valueOf(fromUnitStr);
                    WeightUnit toUnit = WeightUnit.valueOf(toUnitStr);
                    System.out.printf("%.2f %s = %.2f %s%n", value, fromUnit, converter.convert(value, fromUnit, toUnit), toUnit);
                } else {
                    System.err.println("Ошибка: неизвестная категория '" + category + "'");
                }
            } catch (ConversionException | IllegalArgumentException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
