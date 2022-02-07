package com.mblin.oo.command;

public class Purchase implements Command {
	private CashRegister cashRegister;
	private Integer amount;

	public Purchase(CashRegister cashRegister, Integer amount) {
		this.cashRegister = cashRegister;
		this.amount = amount;
	}

	@Override
	public void execute() {
		cashRegister.addCash(amount);
	}
}