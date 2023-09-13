package sky.pro.calculator22.Service;

import org.springframework.stereotype.Service;
import sky.pro.calculator22.Exception.NoParametrsException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        if ((num1 == null) || (num2 == null)) {
                throw new NoParametrsException();
        }
        int sum = num1+ num2;
        return num1+ "+" +num2+ "=" +sum;
    }

    @Override
    public String minus(int num1, int num2) {
        int minus = num1 - num2;
        return num1+ "-" + num2+ "="+minus;
    }

    @Override
    public String multiply(int num1, int num2) {
        int multiply = num1 * num2;
        return num1 + "*"+ num2 + "=" +multiply;
    }

    @Override
    public String divide(int num1, int num2) {
        int divide = num1 / num2;
        return num1 + "/"+ num2 + "="+divide;
    }
}
