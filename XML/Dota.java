package paket;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dota2")
public class Dota {
    List<Heroes> heroesList;
    List<Items> itemsList;

    public List<Items> getItemsList() {
        return itemsList;
    }

    @XmlElement(name = "items")
    public void setItemsList(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public List<Heroes> getHeroesList() {
        return heroesList;
    }

    @XmlElement(name = "heroes")
    public void setHeroesList(List<Heroes> heroesList) {
        this.heroesList = heroesList;
    }

    @Override
    public String toString() {
        return "Dota [heroesList=" + heroesList + ", itemsList=" + itemsList + "]";
    }
}