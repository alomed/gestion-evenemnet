package de.tekup.project.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@OneToMany(mappedBy = "client",cascade = CascadeType.REMOVE)
	private java.util.List<ReactionEntity> reactions;
	
	public ClientEntity() {
		// TODO Auto-generated constructor stub
	}

}
