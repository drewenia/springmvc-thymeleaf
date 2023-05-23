package com.example.springthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    /* SpringMVC Controller yapisi ile model'e attribute olarak something adinda bir attribute tanimliyoruz
    *  Bu attribute resources/templates klasöründe yer alan people.html'de kullanılıyor
    *  hello-world end pointi çağırıldığında HTML sayfası olarak "this is controller" yazili bir cikti uretiyor
    * */
    @GetMapping("/hello-world")
    String getPeople(Model model) {
        model.addAttribute("something", "this is controller");
        return "people";
    }
}
