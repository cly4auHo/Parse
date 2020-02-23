package paket;

import java.io.File;

public class App {
    public static void main(String[] args) {
        HeroMapper mapper = new HeroMapper();
        Dota hero = (Dota) mapper.getObject(new File("dota.xml"), Dota.class);

        System.out.println(hero);
        mapper.saveObject(new File("dota.copy.xml"), hero);
    }
}