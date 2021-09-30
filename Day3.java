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
public class Day3 {

    public static void main(String[] args) {
        Car aCar = new Car(4, "Honda");
        System.out.println(aCar.startEngine());
        System.out.println(aCar.accelarate());
        System.out.println(aCar.brake());
       
        Mitsubishi myCar = new Mitsubishi(4, "Outlander");
        System.out.println(myCar.startEngine());
        System.out.println(myCar.accelarate());
        System.out.println(myCar.brake());
        
        Car newCar;
        newCar = getCar();
        System.out.println(newCar.startEngine());
        System.out.println(newCar.accelarate());
        System.out.println(newCar.brake());
    }
    
    public static Car getCar(){
        System.out.println("Ramdom pick a car: ");
        int i = (int)(Math.random() *4 + 1);
        switch(i){
            case 1:
                return new Mitsubishi(4, "Outlander");
               
            case 2:
                return new Toyota(6, "Crown");
                
            case 3:
                return new Kia(5, "Sorento");
                
            default:
                return new Audi(6, "A4");
        }
    }
    
     public static Car getCar1(){
        System.out.println("Ramdom pick a car: ");
        int i = (int)(Math.random() *4 + 1);
        Car aCar = new Car(4, "Honda");
        switch(i){
            case 1:
                aCar = new Mitsubishi(4, "Outlander");
                break;
            case 2:
                aCar = new Toyota(6, "Crown");
                break;
                
            case 3:
                aCar = new Kia(5, "Sorento");
                break;
                
            default:
                aCar = new Audi(6, "A4");
                break;
        }
        return aCar;
    }
}
