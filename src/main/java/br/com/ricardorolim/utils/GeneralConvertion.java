package br.com.ricardorolim.utils;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class GeneralConvertion {

    public static double convertStringToDouble(String text) throws ParseException {

        NumberFormat numberFormated = NumberFormat.getNumberInstance(new Locale("pt", "BR"));

        Number number = numberFormated.parse(text);

        double valor = number.doubleValue();

        return valor;
    }
}
