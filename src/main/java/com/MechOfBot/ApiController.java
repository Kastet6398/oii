package com.MechOfBot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
public class ApiController {
    @GetMapping("/start")
    public String start() throws IOException {
        if (!new File("lock").exists()) {
            new Thread(()->AIBotMain.main(null)).start();
            new File("lock").createNewFile();
        }
        return "";
    }
}
