package org.soa.tp6.jaxrsarcclient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
@Controller
@RequestMapping("/personnes")
public class SortieController {
    private static final Logger logger =
            LoggerFactory.getLogger(SortieController.class);
    @Autowired
    private ConsommeXMLReponse personneService;
    @GetMapping
    public String getPersonnes(Model model) {
// Récupérer les personnes depuis le service
        List<Personne> personnes =
                personneService.getAllPersonnes().getPersonnes();
// Ajouter la liste au modèle
        model.addAttribute("personnes", personnes);
        return "aff-personnes"; // nom du fichier HTML (aff-personnes.html)
    }
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("personne", new Personne());
        return "form";
    }
    @PostMapping("/add")
    public String ajouterPersonne(@ModelAttribute Personne personne) {
        logger.info(personne.getNom());
        personneService.ajouterPersonne(personne);
        return "redirect:/personnes";
    }
    @GetMapping("/{id}/delete")
    public String supprimerPersonne(@PathVariable int id) {
        personneService.supprimerPersonne(id);
        return "redirect:/personnes";
    }
}