package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){ //model 에 data를 실어서 view에 전송
        model.addAttribute("data", "hello!!"); //data라는 key에, hello라는 view를 모델에 넘김
        return "hello"; //리턴은 화면이름. html은 뒤에 자동으로 옴
    }
}
