package PhoneProfiles;

public class Main {

	public static void main(String[] args) {
		Phone iphone = new Phone(); //crate new object as iphone
		Phone xiaomi = new Phone(); //create second object as xiaomi
		Phone redmi = new Phone();  //create third object as redmi
		Phone oppo = new Phone();   //create fourth object as oppo
		
		System.out.println("IPHONE SPECIFICATION");
		iphone.printSpec("iPhone12", "BLUE", 128, 3450, 'Y', 69.54);
		iphone.printTotal(3450, 2);
		iphone.printWeight(2, 69.54);
		iphone.printPayment(3450, 12);
		
		System.out.println("XIAOMI SPECIFICATION");
		xiaomi.printSpec("Mi3", "BLACK", 64, 1020, 'N', 49.83);
		xiaomi.printTotal(1020, 3);
		xiaomi.printWeight(3, 49.83);
		xiaomi.printPayment(1020, 12);
		
		System.out.println("REDMI SPECIFICATION");
		redmi.printSpec("Note9", "GREY", 128, 1100, 'N', 52.49);
		redmi.printTotal(1100, 4);
		redmi.printWeight(4, 52.49);
		redmi.printPayment(1100, 12);
		
		System.out.println("OPPO SPECIFICATION");
		oppo.printSpec("Reno5", "RED", 256, 1320, 'N', 70.40);
		oppo.printTotal(1320, 5);
		oppo.printWeight(5, 70.40);
		oppo.printPayment(1320,12);
	}

}
