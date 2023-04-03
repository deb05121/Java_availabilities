package fj.sb_availabilities_mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdb")
public class Availabilities {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "addressid")
	private int addressId;
	
	@Column(name = "mobil")
	private int mobil;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private int phone;
	
	public Availabilities(int id, int addressId, int mobil, String email, int phone) {
		super();
		this.id = id;
		this.addressId = addressId;
		this.mobil = mobil;
		this.email = email;
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getMobil() {
		return mobil;
	}
	public void setMobil(int mobil) {
		this.mobil = mobil;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Availabilities [id=" + id + ", addressId=" + addressId + ", mobil=" + mobil + ", email=" + email
				+ ", phone=" + phone + "]";
	}

	
}
