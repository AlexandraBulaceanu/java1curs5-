public class Exemplu2{
    public static void main(String [] args){
        Punct2D p1 = new Punct2D(0,0);
        Punct2D p2 = new Cerc2D();
        Punct2D p3 = new Cilindru2D();
        p2.x = 10;
        p2.y = 10;
        //p2.raza = 10;
        //p2.getArie();
        Cerc2D c2 = (Cerc2D)p2;
        //Cerc2D t = (Cerc2D)p1;
        c2.raza = 10;
        c2.getArie();
        //Cilindru2D c = (Cilindru2D)p2;-ClassCastException
        String s = "Hello";
        //Cerc2D c4 = (Cerc2D)s;-eroare de sintaxa
        if(p2 instanceof Cilindru2D)
        {System.out.println("p2 este un cil");}
        if(p2 instanceof Cerc2D)
        {System.out.println("p2 este un cerc");}
        if(null instanceof Punct2D){
            System.out.println(":(");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}