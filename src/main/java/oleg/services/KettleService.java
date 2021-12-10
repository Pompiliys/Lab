package main.java.oleg.services;

import main.java.oleg.entity.Kettle;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public interface KettleService {

    List<Kettle> allKettle() throws IOException, SAXException, ParserConfigurationException;
    Kettle getById(int id);

}
