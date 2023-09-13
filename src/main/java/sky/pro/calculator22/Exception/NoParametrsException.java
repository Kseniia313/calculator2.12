package sky.pro.calculator22.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Вам необходимо ввести число")
public class NoParametrsException extends RuntimeException{
    public NoParametrsException() {
    }
}
