package paket;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "items")
public class Items {
    List<Item> itemList;

    public List<Item> getItemList() {
        return itemList;
    }

    @XmlElement(name = "item")
    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "Items [itemList=" + itemList + "]";
    }
}