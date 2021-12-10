package main.java.oleg.services.impl;

import main.java.oleg.DAO.FridgeDAO;
import main.java.oleg.DAO.impl.FridgeDAOimpl;
import main.java.oleg.entity.Fridge;
import main.java.oleg.services.FridgeService;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class FridgeServiceImpl implements FridgeService {

    private FridgeDAO fridgeDAO;

    public FridgeServiceImpl() throws ParserConfigurationException, SAXException, IOException {
        fridgeDAO = new FridgeDAOimpl();
    }

    @Override
    public List<Fridge> allFridge() throws IOException, SAXException, ParserConfigurationException {
        return fridgeDAO.allFridge();
    }

    @Override
    public Fridge getById(int id) {
        return fridgeDAO.getById(id);
    }
}
