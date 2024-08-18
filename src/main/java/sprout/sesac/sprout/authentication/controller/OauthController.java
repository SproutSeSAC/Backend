package sprout.sesac.sprout.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sprout.sesac.sprout.authentication.excpetion.TestException;
import sprout.sesac.sprout.common.exception.ErrorCode;

@RestController
@RequestMapping("/api/v1")
public class OauthController {

    @GetMapping("/social-login")
    public void socialLogin() {
        throw new TestException(ErrorCode.INVALID_INPUT_VALUE);
    }
}
