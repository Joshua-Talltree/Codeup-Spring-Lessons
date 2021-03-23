package com.codeup.codeup_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
class MathController {

    @RequestMapping(path = "/add/2/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addTwo(@PathVariable int number){
        return number + " + 2 is " + (number + 2) + "!";
    }

    @RequestMapping(path = "/multiply/3/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String multiplyByThree(@PathVariable int number){
        return number + " * 3 is " + (number * 3) + "!";
    }

    @RequestMapping(path = "/divide/4/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String divideByFour(@PathVariable int number){
        return number + " / 4 is " + (number / 4) + "!";
    }

    @RequestMapping(path = "/subtract/5/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String subtractFive(@PathVariable int number){
        return number + " - 5 is " + (number - 5) + "!";
    }
}
