
public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wilder user1 = new Wilder("Jean-Claude", true);
		Wilder user2 = new Wilder("Henri", false);
		Wilder user3 = new Wilder("Nasser", true);
		
		System.out.println(user1.whoAmI());
		System.out.println(user2.whoAmI());
		System.out.println(user3.whoAmI());
	}

}
