package main.java.oleg.DAO.impl;

import main.java.oleg.DAO.KettleDAO;
import main.java.oleg.entity.Fridge;
import main.java.oleg.entity.Kettle;
import main.java.oleg.utils.Parser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KettleDAOimpl implements KettleDAO {

    Parser parser;

    public KettleDAOimpl() throws IOException, SAXException, ParserConfigurationException {
        parser = new Parser();
    }

    @Override
    public List<Kettle> allKettle() throws IOException, SAXException, ParserConfigurationException {
        ArrayList<Kettle> listOfKettle = parser.ParseAllKettle();
        return listOfKettle;
    }

    @Override
    public Kettle getById(int id) {
        Kettle kettle = parser.ParseKettleById(id);
        return kettle;
    }
}
