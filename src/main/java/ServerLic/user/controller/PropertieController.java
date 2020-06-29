package ServerLic.user.controller;

import ServerLic.user.domain.Propertie;
import ServerLic.user.domain.User;
import ServerLic.user.repository.IPropertieRepository;
import ServerLic.user.service.IPropertieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/propertie")
public class PropertieController {
    private IPropertieService propertieService;
    @Autowired
    public PropertieController( IPropertieService propertieService) {
        this.propertieService = propertieService;
    }
    @GetMapping("/all")
    public List<Propertie> getAllPropertie(){
        return propertieService.getAll();
    }
    @PostMapping("/savepropertie")
    public Propertie savePropertie(@RequestBody Propertie propertie) {
        return propertieService.savePropertie(propertie);
    }
    @DeleteMapping("/delete/{id}")
    public  void removePropertie(@PathVariable("id") Long id){
        try{
            propertieService.remove(id);
        }catch (Exception e){

        }
    }
    @GetMapping("/get/{id}")
    public Propertie getPropertie(@PathVariable("id") Long id) {
        return  propertieService.getOneById(id);
    }
    @GetMapping("/get/fromUser/{id}")
    public List<Propertie> getAllPropertieOfUser(@PathVariable("id") String id){
        List<Propertie> all=propertieService.getAll();
        List<Propertie> good= new ArrayList();
        for(int i=0;i<all.size();i++){
            if(all.get(i).getUserId().equals(id)){
                good.add(all.get(i));
            } }
        return good;
    }

}
