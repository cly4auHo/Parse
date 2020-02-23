package paket;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "heroes")
public class Heroes {
    List<Hero> heroList;

    public List<Hero> getHeroList() {
        return heroList;
    }

    @XmlElement(name = "hero")
    public void setHeroList(List<Hero> heroList) {
        this.heroList = heroList;
    }

    @Override
    public String toString() {
        return "Heroes [heroList=" + heroList + "]";
    }
}