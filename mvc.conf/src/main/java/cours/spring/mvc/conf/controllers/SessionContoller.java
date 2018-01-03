package cours.spring.mvc.conf.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cours.spring.mvc.conf.model.Session;
import cours.spring.mvc.conf.services.SessionService;

@Controller 
@RequestMapping("session") 
public class SessionContoller {
	@Autowired
	SessionService sessionService;
	
	@GetMapping("sessions")
	@ResponseBody
	public List<Session> afficher() {
	return sessionService.getSessions(); 
	}
	
	@GetMapping("/liste")
	public String main(Model m) {
		m.addAttribute("sessions", sessionService.getSessions());
		return "sessions/main";
	}
	
	@GetMapping("/add")
	public String ajout(Model m) {
	m.addAttribute(new Session());
	return "/sessions/ajout"; }

	@PostMapping("/add")
	public String enregistrer(@ModelAttribute Session s, BindingResult result) {
	if (result.hasErrors()) {
		return "error";
	} else {
		sessionService.ajouterSession(s);;
	return "redirect:/sessions/main";
	}
	}
	

	
}
