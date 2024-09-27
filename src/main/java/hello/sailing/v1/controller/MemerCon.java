package hello.sailing.v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemerCon {

    @RequestMapping("/v1/member")
    public String doMember(){

        return "/v1/member/member";
    }
}
