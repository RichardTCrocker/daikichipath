package com.daikichi.daikichipath;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichipathController {

    @RequestMapping("/travel/{city}")
    public String city(@PathVariable("city") String City) {
        return "Congratulations! You will soon travel to " + City + ".";
    }

    @RequestMapping("/lotto/{num}")
    public String num(@PathVariable("num") int Num){
        if (Num % 2 == 0){
            return "You will take a grand journey in the near future, but be weary of tempting offers.";
        }
        else {
            return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
        }
    }
}