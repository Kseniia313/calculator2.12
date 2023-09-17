package sky.pro.calculator22.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class ArithmeticException extends IllegalArgumentException{
    public ArithmeticException(String s) {
        super(s);
    }

}
