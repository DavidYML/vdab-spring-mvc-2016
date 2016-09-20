package be.vdab.spring.mvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @Autowired
    FilmRepository fr;

    /**
     * A controller that renders directly without a view
     */
    @RequestMapping("/direct")
    @ResponseBody
    String directExample() {
        return "Hello World!";
    }

    /**
     * A controller that uses an explicit view name
     */
    @RequestMapping("/bar")
    String anyMethodName() {
        return "foo";
    }

    @RequestMapping("/index")
    String index() {
        return "index";
    }

    @RequestMapping("/filmList")
    public String ex(Model model) {
        model.addAttribute("filmList", fr.findAll());
        return "films";
    }

    @RequestMapping("/addfilm")
    public String addFilm() {
        return "addfilm";
    }
    @RequestMapping(value = "/processfilm", method = RequestMethod.POST)
    public String processForm(Film film) {
        fr.save(film);
        return "redirect:/filmList";
    }

    @RequestMapping(value = "/delete.html", method = RequestMethod.GET)
     public String remove(@RequestParam(value = "id") Integer Id){
                fr.delete(Id);
                return "redirect:/filmList";
            }
}
