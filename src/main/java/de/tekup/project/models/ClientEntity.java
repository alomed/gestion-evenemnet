package de.tekup.project.models;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ClientEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nom ;
	private String prenom ;
	private String email ;
	private String Password ;

	public ClientEntity() {
		// TODO Auto-generated constructor stub
	}

}
