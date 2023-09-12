import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;
 
    public Die(int numberOfFaces) {
        this.random = new Random();
       
        this.numberOfFaces = numberOfFaces;
    }
 
    public int throwDie() {
     
        Random r = new Random();
        return r.nextInt(numberOfFaces) + 1;
    }
}
