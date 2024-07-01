package com.som;
import com.som.vendingstates.State;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
		VendingMachine vendingMachine = new VendingMachine();
		try {
			System.out.println("Filling up the inventory...");
			fillUpInventory(vendingMachine);
			displayInventory(vendingMachine);

			System.out.println("Clicking on Insert money button");

			State vmState = vendingMachine.getVendingMachineState();
			vmState.clickOnInsertMoneyButton(vendingMachine);

			vmState = vendingMachine.getVendingMachineState();
			vmState.insertMoney(vendingMachine, 99.00);

			System.out.println("Clicking on Product selection button");
			vmState.clickOnProductSelectionButton(vendingMachine);
			vmState = vendingMachine.getVendingMachineState();
			vmState.chooseProduct(vendingMachine, 102);

			displayInventory(vendingMachine);

		} catch (Exception e){
			displayInventory(vendingMachine);
		}
	}

	private static void displayInventory(VendingMachine vendingMachine) {
		Map<Integer, Product> inventory = vendingMachine.getInventory().getInventory();
		for(Map.Entry<Integer, Product> item: inventory.entrySet()){
			System.out.println(item.getKey()+" --> "+item.getValue());
		}
	}

	private static void fillUpInventory(VendingMachine vendingMachine) {
		int starterCode=101;
		for(int i=0;i< 10;i++){
			Product product = new Product();
			if(i>=0 && i<3){
				product.setType(ProductType.COKE);
				product.setPrice(12.00);
			} else if(i>=3 && i<5){
				product.setType(ProductType.PEPSI);
				product.setPrice(9.00);
			} else if(i>=5 && i<7){
				product.setType(ProductType.JUICE);
				product.setPrice(13.00);
			} else {
				product.setType(ProductType.SODA);
				product.setPrice(7.00);
			}
			try{
				vendingMachine.getInventory().addItem(product, starterCode++);
			}
			catch (Exception e){
				System.err.println(e.getMessage());
			}
		}
	}

}
