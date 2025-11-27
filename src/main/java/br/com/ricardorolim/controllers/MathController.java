package br.com.ricardorolim.controllers;

import br.com.ricardorolim.utils.Calculator;
import br.com.ricardorolim.utils.GeneralConvertion;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {


    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
           @PathVariable("numberOne") String numberOne,
           @PathVariable("numberTwo") String numberTwo
    ) throws Exception {


        if(!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new RuntimeException("Please, set a numeric value");

        double convertedNumberOne = 0d;

        double convertedNumberTwo = 0d;

        convertedNumberOne = GeneralConvertion.convertStringToDouble(numberOne);

        convertedNumberTwo = GeneralConvertion.convertStringToDouble(numberTwo);

        return Calculator.sum(convertedNumberOne, convertedNumberTwo);

    }

    @RequestMapping("/divide/{numberOne}/{numberTwo}")
    public Double divide(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new RuntimeException("Please, set a numeric value");

        double convertedNumberOne = 0d;

        double convertedNumberTwo = 0d;

        convertedNumberOne = GeneralConvertion.convertStringToDouble(numberOne);

        convertedNumberTwo = GeneralConvertion.convertStringToDouble(numberTwo);

        return Calculator.divide(convertedNumberOne, convertedNumberTwo);

    }

    @RequestMapping("/multiple/{numberOne}/{numberTwo}")
    public Double multiple(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if(!isNumeric(numberOne) || !isNumeric(numberTwo))
            throw new RuntimeException("Please, set a numeric value");

        double convertedNumberOne = 0d;

        double convertedNumberTwo = 0d;

        convertedNumberOne = GeneralConvertion.convertStringToDouble(numberOne);

        convertedNumberTwo = GeneralConvertion.convertStringToDouble(numberTwo);

        return Calculator.multiple(convertedNumberOne, convertedNumberTwo);

    }

    @RequestMapping("/square-root/{number}")
    public Double squareRoot(
            @PathVariable("number") String number

    ) throws Exception {

        if(!isNumeric(number))
            throw new RuntimeException("Please, set a numeric value");

        double convertedNumber = 0d;

        convertedNumber = GeneralConvertion.convertStringToDouble(number);

        return Calculator.squareRoot(convertedNumber);

    }

    private boolean isNumeric(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()) {
            throw new RuntimeException("Please, set a numeric value");
        }

        try {
            Double.parseDouble(strNumber);
            return true;

        } catch (NumberFormatException e) {
            return false;
        }

    }


}
