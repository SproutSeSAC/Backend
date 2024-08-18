package sprout.sesac.sprout.common.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    INVALID_INPUT_VALUE(400001, "입력값을 확인해주세요.")
    ;

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getResponseCode() {
        return code / 1000;
    }
}
