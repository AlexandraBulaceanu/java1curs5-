public class Exemplu1{
    public static void main(String [] args){
        Reptila r1 = new Reptila();
        Crocodil c1 = new Crocodil();
        Reptila a = new Crocodil();
        a.x = 10;
        //a.y = 10;
        a.m1();
        System.out.println(a.w);
    }
}