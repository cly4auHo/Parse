package paket;

public class Hero {
    private String name;
    private int lvl;
    private String ultimate;
    private int id;

    public Hero() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getUltimate() {
        return ultimate;
    }

    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", ultimate='" + ultimate + '\'' +
                ", id=" + id +
                '}';
    }
}

