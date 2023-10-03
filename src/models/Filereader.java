package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
//  A számításokat is ide a models mappába kell tenni 
public class Filereader {
    ArrayList<Employee>emplist= new ArrayList<>();
    public ArrayList<Employee> readFile() {
        try {
            tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("A file nem található!");
            System.err.println(e.getMessage());
        }
        return emplist;
    }

    public ArrayList<Employee> tryReadFile() throws FileNotFoundException {
        File file = new File("dolgozok.txt");
        Scanner sc = new Scanner(file, "utf-8");
        sc.nextLine();
        while (sc.hasNextLine()) {
            String lineB = sc.nextLine();
            String line = lineB.replace("\"", "");
            String[] list = line.split(";");
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
            this.emplist.add(emp);
        }
        sc.close();
        return emplist;
    }
}
