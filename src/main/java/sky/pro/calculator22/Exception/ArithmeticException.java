package sky.pro.calculator22.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Делить на ноль нельзя!")
public class ArithmeticException extends RuntimeException{
    public ArithmeticException() {
    }
}
