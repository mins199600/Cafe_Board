package hello.sailing.v2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemerConV2 {

    @RequestMapping("/v2/member")
    public String doMember(){

        return "/v2/member/member";
    }
}
