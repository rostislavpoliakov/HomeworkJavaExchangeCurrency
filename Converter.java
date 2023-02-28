package CurrencyConvertEurtoUsd;

public class Converter {
    public static void main(String[] args) {
        double eurValue = 1000;
        convertEurToUsdVoid(eurValue);
    }
    public static void convertEurToUsdVoid(double eur) {
        double result = eur * 1.06;
        System.out.println(eur + " Euro is " + result + " in USD");
    }

    public static double convertEurToUsd(double eur) {
        return eur * 1.06;
    }

}
