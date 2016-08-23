package hibernate.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class Country {

	@Id
	@GeneratedValue()
	@Column(name="country_id")
	private int CountryId;
	@Column(name="country_name")
	private String countryName;


	public Country(String countryName){
		this.countryName=countryName;
	}

	public int getCountryId() {
		return CountryId;
	}
	public void setCountryId(int countryId) {
		this.CountryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
