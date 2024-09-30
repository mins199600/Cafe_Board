package hello.sailing.v1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHome {

    @GetMapping("v1/rest")
    public String doRest(){

        String strHtml = "Hello Rest Controller";
        return strHtml;
    }
}
