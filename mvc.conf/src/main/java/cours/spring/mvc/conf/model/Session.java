package cours.spring.mvc.conf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "session")
public class Session {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(nullable = false)
	private long id;
	@Column(nullable = false)
	private String theme;
	@Column(nullable = false)
	private String description;
	@Column(nullable = false)
	private java.util.Date Date;
	@ManyToOne
	private Intervenant intervenant;
	public Session() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public java.util.Date getDate() {
		return Date;
	}
	public void setDate(java.util.Date date) {
		Date = date;
	}
	public Intervenant getIntervenant() {
		return intervenant;
	}
	public void setIntervenant(Intervenant intervenant) {
		this.intervenant = intervenant;
	}


	

}

