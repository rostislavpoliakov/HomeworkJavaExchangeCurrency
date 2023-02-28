package CurrencyConvertEurtoUsd;

public class Proverka {
    public static void main(String[] args) {
        Converter converter = new Converter();

        double eurValue = 1000;

        Converter.convertEurToUsdVoid(eurValue);
        System.out.println(eurValue + " Euro is " + Converter.convertEurToUsd(eurValue) + " in USD");
    }
}
