package cours.spring.mvc.conf.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cours.spring.mvc.conf.model.Intervenant;
import cours.spring.mvc.conf.services.IntervenantService;



@Controller 
@RequestMapping("intervenant") 
public class IntervenantController {
@Autowired
IntervenantService intervenantService;

@GetMapping("/intervenants")
@ResponseBody
public List<Intervenant> afficher() {
return intervenantService.getIntervenants(); 
}

@GetMapping("/liste")
public String main(Model m) {
m.addAttribute("intervenants", intervenantService.getIntervenants()); 
return "/intervenants/main";
}


@GetMapping("/add")
public String ajout(Model m) {
m.addAttribute(new Intervenant());
return "/intervenants/ajout"; }

@PostMapping("/add")
public String enregistrer(@ModelAttribute Intervenant I, BindingResult result) {
if (result.hasErrors()) {
	return "/error";
} else {
	intervenantService.ajouterIntervenant(I);
return "redirect:/intervenant/liste";
}
}
@GetMapping("/del")
public String supprimer(@PathVariable long id) {
intervenantService.supprimerIntervenant(id); 
return "redirect:/intervenants";
}

@DeleteMapping("/details/{id}")
public String details(@PathVariable long id,Model model){
           Intervenant i=intervenantService.getIntevenant(id);
model.addAttribute("intervenant",i); 
return "/intervenants/ajout";
}
@GetMapping("/error")
public String Error() {

return "/error";
}

@GetMapping("/test")
public String test(Model m) {
m.addAttribute("intervenants", intervenantService.getIntervenants()); 
return "/intervenants/test";
}

}

