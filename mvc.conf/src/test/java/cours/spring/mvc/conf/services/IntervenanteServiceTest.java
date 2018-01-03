package cours.spring.mvc.conf.services;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import cours.spring.mvc.conf.model.Intervenant;
import cours.spring.mvc.conf.repository.IntervenantRepository;

@RunWith(MockitoJUnitRunner.class)
public class IntervenanteServiceTest {
	
@Mock
IntervenantRepository intervenantRepository;

@InjectMocks
IntervenantService service = new IntervenantServiceImpl();

@Test 
 public void TesterIntervenant()  {
	
	Intervenant i=new Intervenant();
	i.setId(1);
    i.setNom("inter1");
    when (intervenantRepository.findOne(1l)).thenReturn(i);
    assertThat(service.getIntevenant(1l).getNom(),is("inter1") );
	
}
public void TesterIntervenants() {
	
	List<Intervenant> liste = new ArrayList<>();
	liste.add(new Intervenant());
	liste.add(new Intervenant());
	liste.add(new Intervenant());
	liste.add(new Intervenant());
	liste.add(new Intervenant());
	when (intervenantRepository.findAll()).thenReturn(liste);
	assertThat(service.getIntervenants().size() , is (5));
}

	

}
