package com.phuc.service.iplm;

import com.phuc.service.ICalculatorService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceIplm implements ICalculatorService {

    @Override
    public double calculator(double a, double b, String operation) {
        switch (operation) {
            case "+":
                return  (a + b);
            case "-":
                return  (a - b);
            case "*":
                return  (a * b);
            case "/":
                return  (a / b);
        }
        return 0;
    }


}
