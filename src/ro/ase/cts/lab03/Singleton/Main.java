package ro.ase.cts.lab03.Singleton;

public class Main {
    public static void main(String[] args) {
        OShop os = OShop.getInstance();
        OShop os1 = OShop.getInstance();
        //OShop os1 = new OShop()

        os1.setInfo("NewInfo");
        System.out.println(os.getInfo());
        System.out.println(os1.getInfo());

    }
}
