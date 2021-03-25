package com.codeup.codeup_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;


@Controller
class HelloController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("aName", name.toUpperCase());
        return "hello";
    }

    @GetMapping("/join")
    public String renderForm() {
        return "join";
    }

    // handling info from the form

    @PostMapping("/join")
    public String submitForm(@RequestParam(name = "cohort") String cohort, Model viewModel) {
        viewModel.addAttribute("cohort", "Welcome to " + cohort + "!");
        return "join";
    }

    @GetMapping("/role-dice")
    public String renderNumber() {
        return "role-dice";
    }

    @PostMapping("/role-dice/n")
    public String submitNumber(@RequestParam(name = "dice") int n, Model viewModel) {

        Random random = new Random();
        random.nextInt(6);
        int number = random.nextInt(5) + 1;
        if (n == number){
            viewModel.addAttribute("dice", "congratulations, your number: " + n + " matches our number: " + number);
        } else {
            viewModel.addAttribute("dice", "Your number is: " + n + " the actual number is: " + number);
        }
        return "dice-display";

    }
}