package hello.sailing.v1.controller;

import hello.sailing.v1.service.MenuSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/v1")
public class MenuCon {

    @Autowired
    MenuSvc menuSvc;

    @RequestMapping("/menu")
    public String doMenu(Model model){

        //Data 만들기, List, Map
        List<Map<String, Object>> list = menuSvc.doList();

        //Data 송부
        model.addAttribute("list",list);
        model.addAttribute("hello","========= MenuCon ========");

        return "/v1/menu/menu";
    }

    @GetMapping("/menu_ins")
    public String doInsert(){
        return "/v1/menu/menu_ins";
    }

    @PostMapping("/menu_ins")
    public String doInsertPost(@RequestParam("coffee") String strCoffee,
                               @RequestParam("kind") String strKind,
                               @RequestParam("price") String strPrice)
        {
        int i = menuSvc.doInsert(strCoffee,strKind,strPrice);
        return "/v1/menu/menu_ins";
    }
}
