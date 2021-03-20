package jpabook.jpashop.controlloer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeControlloer {

    @RequestMapping("/")
    public String home(){
        log.info("home controlloer");
        return "home";
    }
}
