public class Main { 
	        public static void main(String[] args) { 
		                Customer customer; 
		                RegularCustomer regularCustomer = new RegularCustomer("Rocelle", 2500); 
		                SeniorCustomer seniorCustomer = new SeniorCustomer("Maui", 2500); 

		                customer = regularCustomer; 
		                System.out.println(customer.getName()+" " +customer.calculateBill()); 

		                customer = seniorCustomer; 
		                System.out.println(customer.getName()+" "+customer.calculateBill()); 
	        } 
}
