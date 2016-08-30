package hibernate.mains;

import java.util.List;

import hibernate.pojos.Country;

public class DBManager {


	public static void main(String[] args){
		//UserCreator userCreator = new UserCreator();
		//Integer country_id=0;
		//Do an user
		//Integer result = userCreator.createUser("antonio", "sisma",country_id);

		//XXX Creates countries
		//CountryCreator countryCreator = new CountryCreator();
		//countryCreator.createCountries();
		//System.out.println("Success, check db ");

		//Select all the countries
		List<Country> countries = CountryCreator.selectCountries();
		for(Country country: countries){
			System.out.println(country.getCountryName());
		}
	}
}
