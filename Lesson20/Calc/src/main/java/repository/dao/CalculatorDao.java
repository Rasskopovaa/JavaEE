package repository.dao;

import pojo.Calculator;

import java.util.List;

public interface CalculatorDao {
    List<Calculator> getAllResults();

    boolean addResult(Calculator calculator);
}
