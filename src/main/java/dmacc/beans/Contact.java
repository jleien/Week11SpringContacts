/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Mar 7, 2022
**/
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jake
 *
 */
@Entity
public class Contact {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String phone;
	private String relationship;
	@Autowired
	private Address address;

	public Contact() {
		super();
	}

	public Contact(String name) {
		setName(name);
	}

	public Contact(String name, String phone, String relationship) {
		setName(name);
		setPhone(phone);
		setRelationship(relationship);
	}

	public Contact(int id, String name, String phone, String relationship) {
		setId(id);
		setName(name);
		setPhone(phone);
		setRelationship(relationship);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", " + (name != null ? "name=" + name + ", " : "")
				+ (phone != null ? "phone=" + phone + ", " : "")
				+ (relationship != null ? "relationship=" + relationship + ", " : "")
				+ (address != null ? "address=" + address : "") + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
