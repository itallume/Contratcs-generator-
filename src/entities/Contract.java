package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Contract {
    private int number;
    private LocalDate date;
    private double totalValue;
    private ArrayList<Installment> installments = new ArrayList<>();

    public Contract(int number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public ArrayList<Installment> getInstallments() {
        return installments;
    }

    public void addInstallments(Installment installment){
        this.installments.add(installment);
    }
}

