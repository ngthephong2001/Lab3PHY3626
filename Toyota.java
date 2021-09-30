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
public class Toyota extends Car{
    private String model;

    public Toyota(int cylinders, String model) {
        super(cylinders, "Toyota");
        this.model = model;
    }

    @Override
    public String brake() {
       return "Toyota-" + this.model + " stopped";
    }

    @Override
    public String accelarate() {
        return "Toyota-" + this.model + " is accelarating";
    }

    @Override
    public String startEngine() {
        return "Toyota-" + this.model + " started";
    }
}
