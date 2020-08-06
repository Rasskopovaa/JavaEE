package repository.dao;

import pojo.Marks;

import java.util.List;

public interface MarksDao {
    boolean addMark(Marks mark);

    List<Marks> getAllMarks();
}
