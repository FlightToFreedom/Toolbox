package hibernate.mains;

public class DBManager {

	public static void main(String[] args){
		UserCreator userCreator = new UserCreator();
		//Do an user
		Integer result = userCreator.createUser("antonio", "sisma");
		System.out.println("Created an user with id "+result);
	}

}
