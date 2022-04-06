/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Mar 7, 2022
**/
package dmacc.beans;

import javax.persistence.Embeddable;

/**
 * @author jake
 *
 */
@Embeddable
public class Address {
	private String street;
	private String city;
	private String state;

	public Address() {
		super();
	}

	public Address(String street, String city, String state) {
		setStreet(street);
		setCity(city);
		setState(state);
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "address [" + (street != null ? "street=" + street + ", " : "")
				+ (city != null ? "city=" + city + ", " : "") + (state != null ? "state=" + state : "") + "]";
	}

}
