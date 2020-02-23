package paket;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class HeroMapper {
    public Object getObject(File file, Class clazz) {
        Object obj = null;
        try {
            JAXBContext ctx = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = ctx.createUnmarshaller();
            obj = unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return obj;
    }

    public void saveObject(File file, Object obj) {
        try {
            JAXBContext ctx = JAXBContext.newInstance(obj.getClass());
            Marshaller marshaller = ctx.createMarshaller();
            marshaller.marshal(obj, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
