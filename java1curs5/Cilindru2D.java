public class Cilindru2D extends Cerc2D{
    double h;
    @Override
    public double getArie(){
         //2*A+L*h
         
         return 2*super.getArie()+super.getLungime()*this.h;
        
    } 
}