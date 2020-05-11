package ServerLic.user.controller;

import ServerLic.user.domain.Propertie;
import ServerLic.user.repository.IPropertieRepository;
import ServerLic.user.service.IPropertieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Propertie> getAllProperte(){
        return propertieRepository.findAll();
    }
}
