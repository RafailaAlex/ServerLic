package ServerLic.user.service;

import ServerLic.user.domain.Propertie;

public interface IPropertieService {
    Propertie savePropertie(Propertie p);
    Propertie getPropertie(Long id);
}
