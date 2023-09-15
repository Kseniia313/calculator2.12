package sky.pro.calculator22.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.calculator22.Exception.NoParametrsException;
import sky.pro.calculator22.Service.CalculatorService;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greeting() {
        return calculatorService.greeting();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam Integer num1,
                       @RequestParam Integer num2) {
        return calculatorService.plus(num1, num2);
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam Integer num1,
                       @RequestParam Integer num2) {
        return calculatorService.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multilpy(@RequestParam Integer num1,
                       @RequestParam Integer num2) {
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam Integer num1,
                       @RequestParam Integer num2) {

        return calculatorService.divide(num1, num2);
    }
}
