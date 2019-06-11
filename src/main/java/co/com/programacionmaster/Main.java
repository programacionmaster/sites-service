package co.com.programacionmaster;

import co.com.programacionmaster.model.Site;

public class Main {

    public static void main(String[] args) {

        Site site1 = new Site();
        site1.setId("12345ko");
        site1.setName("San Andres");
        site1.setLongitude("12.546784");
        site1.setLatitude("-81.702317");
        site1.setType("Isla");

        Site site2 = new Site();
        site2.setId("1u76321");
        site2.setName("Machu Picchu");
        site2.setLongitude("-13.161804");
        site2.setLatitude("-72.543461");
        site2.setType("Lugar Historico");
    }
}
