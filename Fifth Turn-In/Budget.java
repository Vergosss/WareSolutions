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

public Warehouse getWarehouse() {
    return warehouse;
}
public void setWarehouse(Warehouse warehouse) {
    this.warehouse = warehouse;
}
//end of getters and setters.
//
//Begin of Methods:  

//Method to check the budget Viability. Use Case: Number 10.
//The method compares the 'income' and 'expenses' attributes and 
//returns true if the income is greater than the expenses (We have Viability).

public boolean checkBudgetViability() { 
    return (income > expenses);
}

//Method to calculate sales: Use Case: Number 13
public float calculateSales() {
    //code..

    return 0.0f;
}

//Method to calculate revenue (=income ? ): Use Case: Number 13
public float calculateSales() {
    //code..

    return 0.0f;
}


}