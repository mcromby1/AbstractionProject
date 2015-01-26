package Abstraction1;

/**
 *
 * @author Matthew
 */
public class Pulsar implements Star{
    private double brightness;
    private int rotation = 0;
    
    @Override
    public void rotate(int r){
        rotation += r;
    }
    
    @Override
    public void setBrightness(double b){
        brightness = b;
    }
    
}