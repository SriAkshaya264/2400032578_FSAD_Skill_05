package klu.Spring_Autowiring_DemoSkill_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component


public class Student {
	
	

	 
		int id;
		String name;
		char gender;
		@Autowired
		Certification certification;
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
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public Certification getCertification() {
			return certification;
		}
		public void setCertification(Certification certification) {
			this.certification = certification;
		}
		
		
		
		
	}

