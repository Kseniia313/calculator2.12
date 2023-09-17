package sky.pro.calculator22.Service;

import org.springframework.stereotype.Service;
import sky.pro.calculator22.Exception.ArithmeticException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public long plus(int num1, int num2) {
        return (long) num1+ num2;
    }

    @Override
    public long minus(int num1, int num2) {
        return (long) num1 - num2;
    }

    @Override
    public long multiply(int num1, int num2) {
       return (long) num1 * num2;

    }

    @Override
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Делить на ноль нельзя!");
        }
        return (double) num1 / num2;
    }
}
