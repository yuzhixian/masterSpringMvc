package masterSpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/")
//    @ResponseBody
    public String hello(@RequestParam(value = "name",defaultValue = "world") String username, Model model){
        model.addAttribute("message","Hello "+username);
        return "resultPage";
    }
}
