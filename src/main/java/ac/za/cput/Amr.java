package ac.za.cput;

import java.util.UUID;

public class Amr {
    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
