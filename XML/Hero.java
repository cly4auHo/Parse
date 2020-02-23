package paket;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "hero") // mapping of entity with xml
//@XmlType(propOrder = { "name", "id", "lvl", "ultimate" }) // in which order to parse xml
public class Hero {
    int id;

    private String name;
    private int lvl;
    private String ultimate;

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    @XmlElement
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public String getUltimate() {
        return ultimate;
    }

    @XmlElement
    public void setUltimate(String ultimate) {
        this.ultimate = ultimate;
    }

    public Hero(String name, int lvl, String ultimate) {
        super();
        this.name = name;
        this.lvl = lvl;
        this.ultimate = ultimate;
    }

    public Hero() {
        super();
    }

    @Override
    public String toString() {
        return "Hero [id=" + id + ", name=" + name + ", lvl=" + lvl + ", ultimate=" + ultimate + "]";
    }
}