package main.java.oleg.DAO.impl;

import main.java.oleg.DAO.FridgeDAO;
import main.java.oleg.entity.Fridge;
import main.java.oleg.utils.Parser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FridgeDAOimpl implements FridgeDAO {

    Parser parser;
    public FridgeDAOimpl() throws IOException, SAXException, ParserConfigurationException {
        parser = new Parser();
    }

    @Override
    public List<Fridge> allFridge() throws IOException, SAXException, ParserConfigurationException {
        ArrayList<Fridge> listOfFridge = parser.ParseAllFridge();
        return listOfFridge;
    }

    @Override
    public Fridge getById(int id) {
        Fridge fridge = parser.ParseFridgeById(id);
        return fridge;
    }
}
