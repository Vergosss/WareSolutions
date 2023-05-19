public class Budget {
    private float income;
    private float expenses;
    private boolean viability;
    private Warehouse warehouse;

// Constructor

public Budget(float income, float expenses, boolean viability, Warehouse warehouse){
    this.income = income;    
    this.expenses = expenses;
    this.viability = viability;
    this.warehouse = warehouse;
}

//The beginning of getters / setters:
public float getIncome() {
    return income;
}

public void setIncome(float income) {
    this.income = income;
}

public float getExpenses() {
    return expenses;
}

public void setExpenses(Float expenses) {
    this.expenses = expenses;
}
public boolean isViability() {
    return viability;
}

public void setViability(boolean viability) {
    this.viability = viability;
}
}