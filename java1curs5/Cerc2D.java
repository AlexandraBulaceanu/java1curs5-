public class Cerc2D extends Punct2D{
    double raza;//adaugare de atribut
    String x;//modificare de atribut(hiding fields)
    
    
    
    public Cerc2D(){
        this(0);
    }
    public Cerc2D(double r){
        super(0,0);
        this.raza =r;
        super.x = 10;
        //super.raza = 10;
        super.y = 10;
        this.x = "Buna";
        this.y = 10;
        
    }
    public double getArie(){
        return 3.14*this.raza*this.raza;//adaugare de comportament
    }
    public double getLungime(){
        return 2*this.raza*3.14;
    }
    
}