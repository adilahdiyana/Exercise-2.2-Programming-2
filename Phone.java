package PhoneProfiles;

public class Phone {
	
	//declare all type of variable and variable name
	String model;
	String color;
	int storage;
	int price;
	int quantity;
	int month;
	char siri;
	double weight;
	
	void printSpec(String model, String color, int storage, int price, char siri, double weight) { //method to print specification
		System.out.println("Model \t\t\t: " + model);
		System.out.println("Color \t\t\t: " + color);
		System.out.println("Storage \t\t: " + storage + "GB");
		System.out.println("Price \t\t\t: RM" + price);
		System.out.println("Siri \t\t\t: " + siri);
		System.out.println("Weight \t\t\t: " + weight + "\tgram");
		System.out.println("___________________________________________");
	}
	
	void printTotal(int price, int quantity) { //method to print total
		int totalPrice = price*quantity;
		System.out.println("Quantity of purchases \t: " + quantity + " units");
		System.out.println("Total price \t\t: RM" + totalPrice);
		System.out.println("___________________________________________");
	    
	}
	
	void printWeight(int quantity, double weight) { //method to print weight
		double totalWeight = quantity*weight;
		System.out.println("Quantity of purchases \t: " + quantity);
		System.out.println("Total weight \t\t: " + totalWeight + " gram");
		System.out.println("___________________________________________");
	}
	
	void printPayment(int price, int month) { //method to print payment
		int totalPayment = price/month;
		System.out.println("Total months for payment :" + month + " months");
		System.out.println("Total payment \t\t: RM" + totalPayment);
		System.out.println("___________________________________________");
	}



}
