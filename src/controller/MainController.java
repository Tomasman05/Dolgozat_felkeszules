package controller;

import models.Exercise;
import models.Filereader;

public class MainController {
    public MainController() {
        new Filereader().readFile();
    }
    public void sum(){
        new Exercise().sumNetto(new Filereader().readFile());
    }
}
