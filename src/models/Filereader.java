package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class Filereader {
    public void readFile(){
        try {
            tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("A file nem található!");
            System.err.println(e.getMessage());
        }
    }
    public void tryReadFile()throws FileNotFoundException{
        File file = new File("dolgozok.txt");
        Scanner sc = new Scanner(file, "utf-8");
        sc.nextLine();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String [] list =line.split(";");
            Employee emp = new Employee();
            emp.setId(Integer.parseInt(list[0]));
            emp.setName(list[1]);
            emp.setmName(list[2]);
            emp.setCity(list[3]);
            emp.setAddress(list[4]);
            emp.setnSalary(Double.parseDouble(list[5]));
            emp.setBonus(Double.parseDouble(list[6]));
            emp.setJoin(LocalDate.parse(list[7]));
            emp.setBirth(LocalDate.parse(list[8]));
            emp.setbPlace(list[9]);
        }
        sc.close();
    }
}
