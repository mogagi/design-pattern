package com.mblin.oo.command;

import java.util.List;

public class RegisterClient {
	private static CashRegister cashRegister = new CashRegister(0);
	private static PurchaseInvoker purchaseInvoker = new PurchaseInvoker();

	public static void main(String[] args) {
		Command purchase1 = new Purchase(cashRegister, 100);
		Command purchase2 = new Purchase(cashRegister, 50);

		// Invoke commands, check register total.
		purchaseInvoker.executePurchase(purchase1);
		purchaseInvoker.executePurchase(purchase2);
		System.out.println("After purchases: " + cashRegister.getTotal());

		// Replay purchases
		cashRegister.reset();
		System.out.println("Register reset to 0");
		List<Command> purchases = purchaseInvoker.getPurchaseHistory();
		for (Command purchase : purchases) {
			purchase.execute();
		}
		System.out.println("After replay: " + cashRegister.getTotal());
	}
}