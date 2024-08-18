package sprout.sesac.sprout.common.exception;

import lombok.Getter;

public class BusinessException extends RuntimeException {

    @Getter
    private final ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public BusinessException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getMessage(), cause);
        this.errorCode = errorCode;
    }

    public ExceptionResponse getExceptionResponse() {
        return ExceptionResponse.of(errorCode.getCode(), errorCode.getMessage());
    }

    public int getCode() {
        return errorCode.getCode();
    }

    public int getResponseCode() {
        return errorCode.getResponseCode();
    }

}
