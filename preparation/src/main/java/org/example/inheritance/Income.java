package org.example.inheritance;

public class Income {
    private double amount;
    private double taxRate;

    public Income(double amount, double taxRate) {
        this.amount = amount;
        this.taxRate = taxRate;
    }

    public double getAmount() { return amount; }
    public double getTaxRate() { return taxRate; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setTaxRate(double taxRate) { this.taxRate = taxRate; }

    public double calculateTax() {
        return 0.0;
    }
}

class SalaryIncome extends Income {
    private double bonus;

    public SalaryIncome(double amount, double taxRate, double bonus) {
        super(amount, taxRate);
        this.bonus = bonus;
    }

    @Override
    public double calculateTax() {
        return getAmount() * getTaxRate() + bonus * 0.10;
    }
}

class InvestmentIncome extends Income {
    private String investmentType;

    public InvestmentIncome(double amount, double taxRate, String investmentType) {
        super(amount, taxRate);
        this.investmentType = investmentType;
    }

    @Override
    public double calculateTax() {
        return getAmount() * getTaxRate() * 1.15;
    }
}
