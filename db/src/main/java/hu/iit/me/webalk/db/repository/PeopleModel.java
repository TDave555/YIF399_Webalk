package hu.iit.me.webalk.db.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PeopleModel {
	
	@Id
	@GeneratedValue
	private Long id;
	private int age;
	private String name;
	
	public Long getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public PeopleModel() {
    }

    public PeopleModel(Long id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

}
