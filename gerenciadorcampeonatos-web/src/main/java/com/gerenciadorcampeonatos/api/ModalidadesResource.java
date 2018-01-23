package com.gerenciadorcampeonatos.api;

import com.gerenciadorcampeonatos.gerenciadorcampeonatos.model.Modalidades;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.AbstractCrudService;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.ModalidadesService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("modalidades")
public class ModalidadesResource extends AbstractCrudResource<Modalidades> {
    
    @Inject
    private ModalidadesService service;
    
    @Override
    protected AbstractCrudService<Modalidades> getService() {
        return service;
    }
    
}
