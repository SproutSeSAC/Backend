package sprout.sesac.sprout.authentication.excpetion;

import sprout.sesac.sprout.common.exception.BusinessException;
import sprout.sesac.sprout.common.exception.ErrorCode;

public class TestException extends BusinessException {

    public TestException(ErrorCode errorCode) {
        super(errorCode);
    }

    public TestException(ErrorCode errorCode, Throwable cause) {
        super(errorCode, cause);
    }

}
