import java.util.HashMap;
import java.util.Scanner;

public class MapExercise {

	public static void main(String[] args) {
		HashMap<String, String> carDealer = new HashMap<>();
		
		// hashmap has the following structure: Model : Make
		carDealer.put("Civic", "Honda");
		carDealer.put("Accord", "Honda");
		carDealer.put("CRV", "Honda");
		carDealer.put("Odyssey", "Honda");
		carDealer.put("Camry", "Toyota");
		carDealer.put("Corolla", "Toyota");
		carDealer.put("Prius", "Toyota");
		carDealer.put("Supra", "Toyota");
		carDealer.put("Tahoe", "Chevrolet");
		carDealer.put("Silverado", "Chevrolet");
		carDealer.put("Camaro", "Chevrolet");
		
		System.out.println(carDealer.get("Camaro"));
		Scanner input = new Scanner(System.in); 
		
		System.out.println("What car model are you looking for?");
		String customerSearch=input.nextLine();
		
		if (carDealer.containsKey(customerSearch)==true) {
			String associatedModel = carDealer.get(customerSearch);
			System.out.println("Oh, you're looking for "+customerSearch +"? Our "+associatedModel +" selection is right over here!");
		} else {
			System.out.println("Sorry we currently do not sell that car make");
		};
		
	}

}

