/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstraction1;

/**
 *
 * @author Matthew
 */
abstract class Vehicle {
    
    private String name;
    private String manufacture;
    
    public Vehicle(String name, String manufacture){
        this.name = name;
        this.manufacture = manufacture;
    }
    
}
