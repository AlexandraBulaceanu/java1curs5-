public class Exemplu5{
    public static void main(String [] args){
        Anotimp a1 = Anotimp.VARA;
        switch(a1){
            case VARA: 
            System.out.println("Este prea cald");
            break;
            case TOAMNA:
            case PRIMAVARA:
            System.out.println("Ploua!");
            break;
            case IARNA:
            System.out.println("Ninge!");
            break;
            default: System.out.println("nu exista anotimpul");
        }
        for(Anotimp x : Anotimp.values()){
            System.out.println(x+" "+x.ordinal()+" "+x.name());
        
        }
        Coffee.MEDIUM.afisareQty();
        Coffee.BIG.afisareQty();
        
        
        
        
        
        
    }
}