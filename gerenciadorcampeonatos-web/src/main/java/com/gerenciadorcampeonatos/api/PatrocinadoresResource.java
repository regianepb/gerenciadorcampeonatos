package com.gerenciadorcampeonatos.api;

import com.gerenciadorcampeonatos.gerenciadorcampeonatos.model.Patrocinadores;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.AbstractCrudService;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.PatrocinadoresService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("patrocinadores")
public class PatrocinadoresResource extends AbstractCrudResource<Patrocinadores> {
    
    @Inject
    private PatrocinadoresService service;
    
    @Override
    protected AbstractCrudService<Patrocinadores> getService() {
        return service;
    }
    
}
