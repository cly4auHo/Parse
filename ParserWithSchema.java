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

public class ParserWithSchema {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbfactory.newDocumentBuilder();
            Document document = builder.parse(new File("dota.xml"));
            NodeList nodeList = document.getElementsByTagNameNS("*", "*");

            for (int i = 0; i < nodeList.getLength(); i++){
                Node node = nodeList.item(i);
                System.out.println(node.getTextContent());
            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
