package controller;

import models.Filereader;

public class MainController {
    public MainController() {
        new Filereader().readFile();
    }
}
