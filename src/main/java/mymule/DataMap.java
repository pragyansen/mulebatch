package mymule;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
@org.codehaus.jackson.annotate.JsonAutoDetect
public class DataMap {
	


	@JsonProperty("_id")
	@org.codehaus.jackson.annotate.JsonProperty
	private Id id;
	private String title;
	private String name;
	private String salary;
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	


	
	

	
}
