package cours.spring.mvc.conf.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import cours.spring.mvc.conf.model.Session;

public interface SessionRepository extends JpaRepository<Session, Long > {
	public Session findByTheme(String theme); 
}
