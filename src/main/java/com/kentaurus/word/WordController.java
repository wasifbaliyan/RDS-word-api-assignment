package com.kentaurus.word;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
    String previousWord;

    @PostMapping("/word")
    public String postWord(@RequestBody Word body) {
        previousWord = body.getValue();
        return previousWord + " added!";
    }

    @RequestMapping("/word")
    public String word() {
        return previousWord;
    }
}
