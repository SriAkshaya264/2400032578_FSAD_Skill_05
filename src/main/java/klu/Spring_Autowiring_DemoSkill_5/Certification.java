package klu.Spring_Autowiring_DemoSkill_5;

import org.springframework.stereotype.Component;

@Component
public class Certification {
	int id;
	String name;
	int dateOfCompletion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDateOfCompletion() {
		return dateOfCompletion;
	}
	public void setDateOfCompletion(int dateOfCompletion) {
		this.dateOfCompletion = dateOfCompletion;
	}

}
