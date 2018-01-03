package cours.spring.mvc.conf.services;

import java.util.List;

import cours.spring.mvc.conf.model.Intervenant;

public interface IntervenantService {
List<Intervenant> getIntervenants();
void ajouterIntervenant(Intervenant intervenant); 
Intervenant getIntervenant(String email);
Intervenant getIntevenant(long id) ;
void supprimerIntervenant(long id);


}
