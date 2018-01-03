
package cours.spring.mvc.conf.services;
import java.util.List;
import cours.spring.mvc.conf.model.Session;

public interface SessionService {
	public void ajouterSession(Session s);
	public List<Session> getSessions();

}
