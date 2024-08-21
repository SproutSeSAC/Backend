package sprout.sesac.sprout.authentication.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sprout.sesac.sprout.authentication.excpetion.TestException;
import sprout.sesac.sprout.common.exception.ErrorCode;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class OauthController {

    @GetMapping("/social-login")
    public void socialLogin() {
        log.trace("trace");
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");

        throw new TestException(ErrorCode.INVALID_INPUT_VALUE);
    }
}
