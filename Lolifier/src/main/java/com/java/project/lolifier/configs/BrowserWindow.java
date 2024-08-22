package com.java.project.lolifier.configs;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;

public class BrowserWindow {

    public static void launch() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My Browser");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            JFXPanel jfxPanel = new JFXPanel();
            frame.add(jfxPanel, BorderLayout.CENTER);

            Platform.runLater(() -> {
                WebView webView = new WebView();
                WebEngine webEngine = webView.getEngine();
                webEngine.load("http://localhost:8080/form.html");
                jfxPanel.setScene(new Scene(webView));
            });

            frame.setVisible(true);
        });
    }
}
