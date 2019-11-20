package io.zipcoder.currencyconverterapplication;

public class CurrencyConverter {
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
        return amountOfBaseCurrency * (sourceCurrencyType.convert(targetCurrencyType));
    }
}
