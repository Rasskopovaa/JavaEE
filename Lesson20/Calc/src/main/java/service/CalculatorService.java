package service;

import pojo.Calculator;

import java.util.List;

public interface CalculatorService {

    List<Calculator> getAllResults();

    boolean addResult(Calculator calculator);
}
