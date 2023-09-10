package za.ac.cput.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

    @GetMapping({"/", "/home"})
    public String index() {
        return "index"; //
    }

}
