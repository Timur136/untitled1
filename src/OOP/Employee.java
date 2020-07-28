package OOP;

import java.math.BigInteger;

class Employee {
    protected String name = "";
    protected Integer salary = 0;
    protected Integer ID = 0;

    public void setSalary(Integer salary) {

    }

    public void work() {

    }
}

class Manager extends Employee {
    private Long time = 0L;
    private BigInteger projectMoney;
    private Byte countOfPaper = 0;

    public void throwPaper() {

    }
}

class Programmer extends Employee {
    private String task = "";
    private Integer stamina = 0;
    private String code = "";

    public String coding(String task) {
        return task;
    }

    public Boolean test(String code) {
        return true;
    }

    public void fix(String code) {

    }
}