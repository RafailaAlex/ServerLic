package ServerLic.user.service;

import ServerLic.user.domain.Propertie;
import ServerLic.user.repository.IPropertieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertieServiceImpl implements IPropertieService {
    private IPropertieRepository iPropertieRepository;
    @Autowired
    public PropertieServiceImpl(IPropertieRepository iPropertieRepository){
        this.iPropertieRepository=iPropertieRepository;
    }
    @Override
   public  Propertie  savePropertie(Propertie p) {
        return  iPropertieRepository.save(p);
    }

    @Override
    public Propertie getPropertie(Long id) {
        return  iPropertieRepository.getOne(id);
    }
}
