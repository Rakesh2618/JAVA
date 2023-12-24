package com.jspider.Cardekhocasestudy.entity;

public class Car 
{

	private int id;
	private String Car_name;
	private String brand_name;
    private String Fuel_type;
    private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCar_name() {
		return Car_name;
	}
	public void setCar_name(String car_name) {
		Car_name = car_name;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getFuel_type() {
		return Fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		Fuel_type = fuel_type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
    
}
