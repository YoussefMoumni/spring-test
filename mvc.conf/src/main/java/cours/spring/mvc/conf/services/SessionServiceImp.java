package cours.spring.mvc.conf.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cours.spring.mvc.conf.model.Session;
import cours.spring.mvc.conf.repository.SessionRepository;

@Service("sessionService")	

public class SessionServiceImp implements SessionService {
	 @Autowired
	SessionRepository sessionRepository;
	 @Override
		public List<Session> getSessions(){
		return sessionRepository.findAll(); }
	 @Override
	public void ajouterSession(Session s) {
			sessionRepository.save(s);
		}
}
