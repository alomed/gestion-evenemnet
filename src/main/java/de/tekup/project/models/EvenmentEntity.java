package de.tekup.project.models;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class EvenmentEntity {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String nom ;
	private String type;
	private String addresse;
	private float prix ;
	private int place_disponible;
	private Date date;
	
	@OneToMany(mappedBy = "evenment",cascade = CascadeType.REMOVE)
	private Collection<ReactionEntity> reactions ;
	

	public EvenmentEntity() {
		// TODO Auto-generated constructor stub
	}

}
