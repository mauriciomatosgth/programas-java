package models.entities;

import models.exception.Exceptions;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    //Construtores
    public Account(){

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    //Getter e Setter

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }


    //Metodos

    public void deposit(Double deposit){
        balance += deposit;
    }

    public void withdraw(Double withdraw){
        validateWithdraw(withdraw);
        balance -=withdraw;

    }

    private void validateWithdraw(Double withdraw){
        if( withdraw > getBalance()){
            throw new Exceptions("Saldo Insuficiente");
        }
        if(withdraw > getWithdrawLimit()){
            throw new Exceptions("Seu limite de Saque é menor que o solicitado.");
        }

    }

    @Override
    public String toString(){
        return String.format("New Balance: $%.2f",balance);
    }
}
