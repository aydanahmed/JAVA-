package builderpattern;

public class Test {
	public static void main(String[] args) {
		User user = new User.UserBuilder("manqka", "123456")
				.firstName("Manqk")
				.lastName("Manqkov")
				.email("manqka@abv.bg")
				.build();
		
		System.out.println(user.getEmail());
	}			
}
