package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

	String id;
	String name;
	String year;
	String color;
	String pantone_value;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPantone_value() {
		return pantone_value;
	}
	public void setPantone_value(String pantone_value) {
		this.pantone_value = pantone_value;
	}

}
