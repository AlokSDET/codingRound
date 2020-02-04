package restTemplate;

public class UserDetails {

	public UserDetails() {

	}

	private UserDetailsData userDetailsData;

	public UserDetailsData getUserDetailsData() {
		return userDetailsData;
	}

	public void setUserDetailsData(UserDetailsData userDetailsData) {
		this.userDetailsData = userDetailsData;
	}

	public UserDetails(UserDetailsData userDetailsData) {
		super();
		this.userDetailsData = userDetailsData;
	}

}
