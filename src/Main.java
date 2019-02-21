public class Main{

    public static void main(String[] args) {

        Ship titanic = new Ship(100, "TITANIC", 233);
        titanic.setWeight(20000);
        titanic.setHeight(200);
        titanic.printStaticShipPrice();

        Ship blackPearl = new Ship(200,"BLACKPEARL", 333, 2000, 100, 150, 10, 71);
        blackPearl.printShipPrice();

        System.out.println("First one: " + titanic.toString());

        System.out.println("Second one: " + blackPearl.toString());
    }
}


