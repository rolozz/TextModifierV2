package com.java.project.lolifier.controllers;

import com.java.project.Mod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TMController {

    @GetMapping("/result")
    public ResponseEntity<String> oneMethod(@RequestParam("input") String text) {
        return ResponseEntity.ok(Mod.textModifier(text));
    }
}

