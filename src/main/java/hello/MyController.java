package hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MyController {

    @RequestMapping
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/David")
    @ResponseBody
    String David () {
//        return "<html><head><body><h1>Dit is mijn pagina</h1></body></head></html>";
//        dit is ook mogelijk

        return "foo";
    }
}
