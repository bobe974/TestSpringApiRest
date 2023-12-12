package com.etienne.api.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data // Nul besoin d’ajouter les getters et les setters. La librairie Lombok s’en charge 
@Entity //indique que la classe correspond à une table de la base de données.
@Table(name = "employees") //indique le nom de la table associée.
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String LastName;
	
	private String mail;
	
	private String password;

}
