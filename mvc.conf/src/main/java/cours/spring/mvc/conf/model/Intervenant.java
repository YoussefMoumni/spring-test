package cours.spring.mvc.conf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Intervenant {
@Id
@GeneratedValue(strategy = GenerationType.AUTO) 
@Column(nullable = false)
private long id;
@Column(nullable = false)
private String nom;
@Column(nullable = false)
private String email;
public String getEmail() {
return email; }
public void setEmail(String email) { this.email = email;
}
public long getId() { return id;
}
public String getNom() { return nom;
  
}
public void setNom(String nom) {
this.nom = nom; }
public void setId(long id) {
	this.id = id;
}

}











