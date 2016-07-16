
package controller;

import model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Piotrek
 */
@Controller
@RequestMapping("/person")
public class PersonControler {
    @RequestMapping("/add")
    public ModelAndView add(){
        ModelAndView model = new ModelAndView("add");
        model.addObject("person", new Person());
        return model;
    }
}
