package cours.spring.mvc.conf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cours.spring.mvc.conf.model.Intervenant;

public interface IntervenantRepository extends JpaRepository<Intervenant, Long > {
public Intervenant findByEmail(String email); 
public List<Intervenant> findAll();





}
