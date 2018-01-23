package com.gerenciadorcampeonatos.api;

import com.gerenciadorcampeonatos.gerenciadorcampeonatos.model.Jogadores;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.AbstractCrudService;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.JogadoresService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("jogadores")
public class JogadoresResource extends AbstractCrudResource<Jogadores> {
    
    @Inject
    private JogadoresService service;
    
    @Override
    protected AbstractCrudService<Jogadores> getService() {
        return service;
    }
    
}
