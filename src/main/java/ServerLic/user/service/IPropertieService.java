package ServerLic.user.service;

import ServerLic.user.domain.Propertie;

import java.util.List;

public interface IPropertieService {
    Propertie savePropertie(Propertie p);
    Propertie getPropertie(Long id);
    Propertie getOneById(Long id);
    List<Propertie> getAll();
    void remove(Long id);
}
