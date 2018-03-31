package com.haha.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * App of WordLadder
 * @author 516030910460
 * @version 0.0.2
 */

@RestController
public class App {

    @RequestMapping(value = "/app",method = RequestMethod.GET)
    public String say(String[] args) throws IOException {
            // Build the dictionary.
            WordLadder map = new WordLadder("dictionary.txt", 3);

            // Main Step.
            return map.ladder("dog", "cat");
    }
}