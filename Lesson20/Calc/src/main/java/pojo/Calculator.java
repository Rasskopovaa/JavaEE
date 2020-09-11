package pojo;

import java.io.Serializable;

public class Calculator implements Serializable {
    private int id;
    private double number1;
    private double number2;
    private String sign;
    private double result;

    public Calculator(double number1, double number2, String sign, double result) {
        this.number1 = number1;
        this.number2 = number2;
        this.sign = sign;
        this.result = result;
    }

    public Calculator(int id, double number1, double number2, String sign, double result) {
        this.id = id;
        this.number1 = number1;
        this.number2 = number2;
        this.sign = sign;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", sign='" + sign + '\'' +
                ", result=" + result +
                '}';
    }
}
