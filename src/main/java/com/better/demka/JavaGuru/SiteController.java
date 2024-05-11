package com.better.demka.JavaGuru;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller("/api/v1")
public class GreetingController {

    @ModelAttribute("roles")
        public List<Role> getRole(){
            return Arrays.asList(Role.values());
        }


        public String hello(Model model){

        }


}
