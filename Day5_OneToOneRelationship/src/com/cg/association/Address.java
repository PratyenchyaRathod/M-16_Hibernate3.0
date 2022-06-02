package com.cg.association;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address implements Serializable
{
  private static final long serialVersionUID=1L;
  @Id
  @Column(name="Id")
  private int addressId;
  @Column(name="Street")
  private String Street;
  @Column(name="city")
  private String City;
  @Column(name="State")
  private String State;
  @Column(name="Zipcode")
  private int Zipcode;
public Address()
{
}
public Address(int addressId, String street, String city, String state, int zipcode) {
	super();
	this.addressId = addressId;
	Street = street;
	City = city;
	State = state;
	Zipcode = zipcode;
}
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public int getZipcode() {
	return Zipcode;
}
public void setZipcode(int i) {
	Zipcode = i;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", Street=" + Street + ", City=" + City + ", State=" + State
			+ ", Zipcode=" + Zipcode + "]";
}

}

