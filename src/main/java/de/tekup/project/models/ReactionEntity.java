package de.tekup.project.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class ReactionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date datedereaction;
	
	@ManyToOne
	private  ClientEntity client ;
	@ManyToOne
	private EvenmentEntity evenment;
	
	public ReactionEntity() {
		// TODO Auto-generated constructor stub
	}

}
