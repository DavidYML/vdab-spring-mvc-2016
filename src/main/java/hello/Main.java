package hello;

import org.springframework.stereotype.Controller;


        import org.springframework.boot.*;
        import org.springframework.boot.autoconfigure.*;
        import org.springframework.stereotype.*;
        import org.springframework.web.bind.annotation.*;


@SpringBootApplication
public class Main
{

//    @RequestMapping("/")
//    @ResponseBody
//    String home() {
//        return "Hello World!";
//    }
//    @RequestMapping("/David")
//    @ResponseBody
//String David () {
//    return "<html><head><body><h1>Dit is mijn pagina</h1></body></head></html>";
//}
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }
}

