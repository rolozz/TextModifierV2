package com.java.project.lolifier;

import com.java.project.lolifier.configs.JavaFXApplication;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LolifierApplication {

    public static void main(String[] args) {

        SpringApplication.run(LolifierApplication.class, args);


        new Thread(() -> {

            Application.launch(JavaFXApplication.class);
        }).start();
    }
}

