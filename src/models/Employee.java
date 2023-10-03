package models;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private String mName;
    private String city;
    private String address;
    private double nSalary;
    private double bonus;
    private LocalDate join;
    private LocalDate birth;
    private String bPlace;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getmName() {
        return mName;
    }
    public void setmName(String mname) {
        mName = mname;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getnSalary() {
        return nSalary;
    }
    public void setnSalary(double nsalary) {
        nSalary = nsalary;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public LocalDate getJoin() {
        return join;
    }
    public void setJoin(LocalDate join) {
        this.join = join;
    }
    public LocalDate getBirth() {
        return birth;
    }
    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
    public String getbPlace() {
        return bPlace;
    }
    public void setbPlace(String bplace) {
        this.bPlace = bplace;
    }
    
}
