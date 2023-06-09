public class Budget {
    // Class attributes
    private float income;
    private float expenses;
    private boolean viability;
    

    // Constructor

    public Budget(float income, float expenses, boolean viability) {
        this.income = income;
        this.expenses = expenses;
        this.viability = viability;
        
    }

    // The beginning of getters / setters:
    public float getIncome() {
        return this.income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public float getExpenses() {
        return this.expenses;
    }

    public void setExpenses(Float expenses) {
        this.expenses = expenses;
    }

    public boolean isViability() {
        return this.viability;
    }

    public void setViability(boolean viability) {
        this.viability = viability;
    }

  

   

    // end of getters and setters.
    //
    // Begin of Methods:

    // Method to check the budget Viability. Use Case: Number 10.
    // The method compares the 'income' and 'expenses' attributes and
    // returns true if the income is greater than the expenses (We have Viability).

    public boolean checkBudgetViability() {
        return (this.income > this.expenses);
    }

    // Method to calculate sales: Use Case: Number 13
    public float calculateSales() {
        // code..

        return 0.0f;
    }

    // Method to calculate revenue (=income ? ): Use Case: Number 13
    public float calculateRevenue() {
        // code..

        return 0.0f;
    }

}