/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author HP
 */
public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheel;

    public Car(){
                
    }
    
    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheel = 4;
        this.cylinders = cylinders;
        this.name = name;
        
    }

    public String startEngine(){
       return "Car's engine started";
    }
    
    public String accelarate(){
        return "Car is accelarating";
    }
    
    public String brake(){
        return "Car stopped";
    }
    
    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
