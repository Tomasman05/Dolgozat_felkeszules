package models;

import java.util.ArrayList;

public class Exercise {
    public double sumNetto(ArrayList<Employee> emplist){
        double res = 0;
        for(Employee emp : emplist){
           res+= emp.getnSalary();
        }
        
        return res;
    }
}
