package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public BankAccount() {
    }

    public void deposit(int sum){
        amount +=sum;
        System.out.println("Вы пополнили счет на "+getAmount());
    }
    public void withDraw(int sum) throws LimitException {
        if(amount<sum){
            throw new LimitException("Сумма списания не может превышать остаток на счете. Ваш остаток :"+amount+
                    "\nСумма которую вы хотите списать :"+sum);
        }
        amount-=sum;
        System.out.println("Вы сняли "+sum+
                "\nОстаток на счету "+amount);
    }
}
