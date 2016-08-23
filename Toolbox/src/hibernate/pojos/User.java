package hibernate.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@Column(name="user_id")
	@GeneratedValue()
	private int userId;
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="country_id")
	private int countryId;


	public User(String userName, String password,int countryId){
		this.userName=userName;
		this.password=password;
		this.countryId=countryId;
	}

	public int getCountryId() {
		return countryId;
	}


	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

