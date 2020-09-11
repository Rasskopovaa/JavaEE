package service;

import pojo.Calculator;
import repository.dao.CalculatorDao;
import repository.dao.CalculatorDaoImpl;

import java.util.List;

public class CalculatorServiceImpl implements CalculatorService {
    private CalculatorDao calculatorDao;

    public CalculatorServiceImpl() {
        calculatorDao = new CalculatorDaoImpl();
    }

    public CalculatorServiceImpl(CalculatorDao calculatorDao) {
        this.calculatorDao = calculatorDao;
    }

    @Override
    public List<Calculator> getAllResults()
        {
            return calculatorDao.getAllResults();
        }

    @Override
    public boolean addResult(Calculator calculator) {
        return calculatorDao.addResult(calculator);
    }
}
