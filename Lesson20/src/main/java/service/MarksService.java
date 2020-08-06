package service;

import pojo.Marks;

import java.util.List;

public interface MarksService {
    boolean addMarks(Marks mark);

    List<Marks> getAllMarks();
}
