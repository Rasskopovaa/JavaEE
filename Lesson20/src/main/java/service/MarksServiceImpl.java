package service;

import pojo.Marks;
import repository.dao.MarksDao;
import repository.dao.MarksDaoImpl;

import java.util.List;

public class MarksServiceImpl implements MarksService {
    private MarksDao marksDao;

    public MarksServiceImpl() {
        marksDao = new MarksDaoImpl();
    }

    public MarksServiceImpl(MarksDao marksDao) {
        this.marksDao = marksDao;
    }

    @Override
    public boolean addMarks(Marks mark) {
        return marksDao.addMark(mark);
    }

    @Override
    public List<Marks> getAllMarks() {
        return marksDao.getAllMarks();
    }
}
