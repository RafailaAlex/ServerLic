package ServerLic.user.service;

import ServerLic.user.domain.Propertie;
import ServerLic.user.repository.IPropertieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertieServiceImpl implements IPropertieService {
    private IPropertieRepository iPropertieRepository;
    @Autowired
    public PropertieServiceImpl(IPropertieRepository iPropertieRepository){
        this.iPropertieRepository=iPropertieRepository;
    }

    @Override
    public Propertie getOneById(Long id) {
        return iPropertieRepository.getOne(id);
    }

    @Override
    public List<Propertie> getAll(){
        return iPropertieRepository.findAll();
    }
    @Override
    public  Propertie  savePropertie(Propertie p) {
        return  iPropertieRepository.save(p);
    }

    @Override
    public Propertie getPropertie(Long id) {
        return  iPropertieRepository.getOne(id);
    }

    @Override
    public void remove(Long id) {
        try{
            Propertie p=iPropertieRepository.getOne(id);
            iPropertieRepository.delete(p);
        }catch (Exception e){

        }
    }
}
