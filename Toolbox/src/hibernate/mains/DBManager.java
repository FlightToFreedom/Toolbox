package hibernate.mains;

public class DBManager {


	public static void main(String[] args){
		//UserCreator userCreator = new UserCreator();
		//Integer country_id=0;
		//Do an user
		//Integer result = userCreator.createUser("antonio", "sisma",country_id);

		CountryCreator countryCreator = new CountryCreator();
		countryCreator.createCountries();
		System.out.println("Success, check db ");
	}

}
