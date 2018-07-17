public interface Instrument{
    //int x;
    public static final int x = 10;
    int y = 8;
    public void play();//abstract pus automat, modificator redundat in acest context
    default void p1(){}
    static void p2(){}
}