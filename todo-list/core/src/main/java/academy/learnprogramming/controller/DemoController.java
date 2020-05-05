package academy.learnprogramming.controller;

import academy.learnprogramming.DemoServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class DemoController {

    // == fields ==
    private final DemoServiceImpl demoService;

    // == constructors ==
    @Autowired
    public DemoController(DemoServiceImpl demoService) {
        this.demoService = demoService;
    }

    // == request methods ==
    // http://localhost:8080/core/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    // http://localhost:8080/core/welcome
    @GetMapping("welcome")
    public String welcome(Model model) {

        model.addAttribute("helloUser",demoService.getHelloMessage("David"));
        log.info("model = {}", model);
        // prefix + name + suffix
        // /WEB-INF/view/welcome.jsp
        return "welcome";
    }

    // == model attributes ==
    // model attribute is added to the model by Spring
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        log.info("welcomeMessage() called");
        return demoService.getWelcomeMessage();
    }
}
