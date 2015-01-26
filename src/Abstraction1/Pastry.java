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
abstract class Pastry implements Food{
    private int sugar, fat;
    
    public Pastry(int sugar, int fat){
        this.sugar = sugar;
        this.fat = fat;
    }
    
}
