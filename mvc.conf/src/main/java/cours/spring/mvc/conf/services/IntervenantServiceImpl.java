package cours.spring.mvc.conf.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cours.spring.mvc.conf.model.Intervenant;
import cours.spring.mvc.conf.repository.IntervenantRepository;


@Service("intervenantService")
public class IntervenantServiceImpl implements IntervenantService { 
	
	@Autowired
IntervenantRepository intervenantRepository;
	
	@Override
public List<Intervenant> getIntervenants() {
return intervenantRepository.findAll(); }

	@Override
public void ajouterIntervenant(Intervenant intervenant) {
intervenantRepository.save(intervenant); }

@Override
public Intervenant getIntervenant(String email) {
return intervenantRepository.findByEmail(email); }


@Override
public void supprimerIntervenant(long id) { 
	intervenantRepository.delete(id);
}

@Override
public Intervenant getIntevenant(long id) {
	return intervenantRepository.findOne(id);
}





}

