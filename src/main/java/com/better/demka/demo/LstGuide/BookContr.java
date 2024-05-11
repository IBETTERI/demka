package com.better.demka.demo.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookContr {

    @GetMapping("/all")
    public String showAllBooks(Model model) {
        model.addAttribute("books",bookService.findAll());
        return "books/allBooks";
    }

}
