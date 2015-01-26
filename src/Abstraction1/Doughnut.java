package Abstraction1;

/**
 *
 * @author Matthew
 */
public class Doughnut extends Pastry{
    
    private double weight;
    
    public Doughnut(int sugar, int fat, double weight){
        super(sugar, fat);
        this.weight = weight;
    }
    
    @Override
    public void eat(){
        
    }
}
