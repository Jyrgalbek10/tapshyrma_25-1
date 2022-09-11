import javax.swing.*;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,Dannye> mashyna = new HashMap<>();
        mashyna.put(new Car(1,222),new Dannye(2022,"Ford mustang GT500",30000,"Kara"));
        mashyna.put(new Car(2,333),new Dannye(2022,"BMW X6",40000,"Kara"));
        mashyna.put(new Car(3,444),new Dannye(2022,"AUDI A7",50000,"Kara"));
        mashyna.put(new Car(4,555),new Dannye(2022,"Mercedes S500",30000,"Kara"));
        for (Map.Entry<Car, Dannye> entry: mashyna.entrySet()) {
            System.out.println(entry);
        }
    }
}