package ServerLic.user.controller;

import ServerLic.user.domain.Propertie;
import ServerLic.user.domain.User;
import ServerLic.user.repository.IPropertieRepository;
import ServerLic.user.service.IPropertieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/propertie")
public class PropertieController {
    private IPropertieRepository propertieRepository;
    private IPropertieService propertieService;
    @Autowired
    public PropertieController(IPropertieRepository propertieRepository, IPropertieService propertieService) {
        this.propertieRepository = propertieRepository;
        this.propertieService = propertieService;
    }
    @GetMapping("/all")
    public List<Propertie> getAllPropertie(){
        return propertieRepository.findAll();
    }
    @PostMapping("/savepropertie")
    public Propertie savePropertie(@RequestBody Propertie propertie) {
        return  propertieRepository.save(propertie);
    }
    @GetMapping("/get/{id}")
    public Propertie getPropertie(@PathVariable("id") Long id) {
        return propertieRepository.getOne(id);
    }
}
