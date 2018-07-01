package main.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 注解@ResponseStatus标记的异常类
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "用户名不允许为空！！！")
public class UsernameIsNonException extends RuntimeException {
    public UsernameIsNonException() {
    }

    public UsernameIsNonException(String message) {
        super(message);
    }

    public UsernameIsNonException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameIsNonException(Throwable cause) {
        super(cause);
    }

    public UsernameIsNonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
