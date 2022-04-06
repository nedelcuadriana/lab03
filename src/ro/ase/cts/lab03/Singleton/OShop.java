package ro.ase.cts.lab03.Singleton;

public class OShop {
    private static OShop instance;
    private String info = "infoo";

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private OShop() {
    }

    public static synchronized OShop getInstance() {
        if(instance == null) {
            instance = new OShop();
        }
        return instance;
    }


}
