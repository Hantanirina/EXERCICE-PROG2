package Budget.org;

import java.util.List;

public class User {
    private String id;
    private String userName;
    private double monthlyBudget;
    private List<Expense>expenses;

    public User(String id, String userName, double monthlyBudget, List<Expense> expenses) {
        this.id = id;
        this.userName = userName;
        this.monthlyBudget = monthlyBudget;
        this.expenses = expenses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public double getMonthlyBudget() {
        return monthlyBudget;
    }

    public void setMonthlyBudget(double monthlyBudget) {
        this.monthlyBudget = monthlyBudget;
    }
}
