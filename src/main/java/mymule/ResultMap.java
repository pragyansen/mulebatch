package mymule;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultMap {


	@JsonProperty("_id")
	@org.codehaus.jackson.annotate.JsonProperty
	private Id id;
	private String title;
	private String name;
	private double salary;
	private double gross;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getGross() {
		return gross;
	}
	public void setGross(double gross) {
		this.gross = gross;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}

}
