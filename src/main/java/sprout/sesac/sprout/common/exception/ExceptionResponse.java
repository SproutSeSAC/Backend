package sprout.sesac.sprout.common.exception;

import lombok.Getter;

@Getter
public class ExceptionResponse {

    private int code;
    private String message;

    private ExceptionResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ExceptionResponse of(int code, String message) {
        return new ExceptionResponse(code, message);
    }
}
