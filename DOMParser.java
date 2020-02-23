package paket;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMParser {

    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbfactory.newDocumentBuilder();
            Document document = builder.parse(new File("dota.xml"));

            NodeList nodeList = document.getElementsByTagName("hero");
            NodeList names = document.getElementsByTagName("name");
            NodeList lvls = document.getElementsByTagName("lvl");
            NodeList ults = document.getElementsByTagName("ultimate");

            /*List<Hero> heroList = new ArrayList<Hero>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Hero hero = new Hero();
                Node node = nodeList.item(i);
                Node childNode = node.getChildNodes().item(1);
                hero.setName(names.item(i).getTextContent());
                hero.setLvl(Integer.valueOf(lvls.item(i).getTextContent()));
                hero.setUltimate(ults.item(i).getTextContent());
                heroList.add(hero);
            }
            System.out.println(heroList);*/

            /*
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                for (int j = 0; j < node.getChildNodes().getLength(); j++) {
                    Node childNode = node.getChildNodes().item(j);
                    System.out.println(childNode.getNodeName() + " : " + childNode.getTextContent());
                }
            }*/
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
