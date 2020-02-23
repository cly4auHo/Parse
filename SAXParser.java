package paket;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.ArrayList;
import java.util.List;

public class SAXParser extends DefaultHandler {
    List<Hero> heroList = new ArrayList<Hero>();
    Hero hero = new Hero();
    private boolean name;
    private boolean lvl;
    private boolean ultimate;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("start document");
        super.startDocument();
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("end document");
        System.out.println(heroList);
        super.endDocument();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        /*System.out.println(qName); //node name

        if (attributes.getLength() > 0) {
            System.out.println(attributes.getValue(0));
        }*/

        if (qName.equals("name")) {
            hero.setId(Integer.valueOf(attributes.getValue(0)));
            name = true;
        } else if (qName.equals("lvl"))
            lvl = true;
        else if (qName.equals("ultimate"))
            ultimate = true;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("hero")) {
            heroList.add(hero);
            hero = new Hero(); //после того как пуджа добавило, обновить ссылку чтобы по новой заполнять (инвокера)
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String value = "";

        for (int i = start; i < start + length; i++)
            value += ch[i];

        value = value.trim();

        if (name) {
            hero.setName(value);
            name = false;
        } else if (lvl) {
            hero.setLvl(Integer.valueOf(value));
            lvl = false;
        } else if (ultimate) {
            hero.setUltimate(value);
            ultimate = false;
        }

        //if (value.length() > 0)
        //  System.out.println(value); //all nodes
    }
}
