package com.gerenciadorcampeonatos.api;

import com.gerenciadorcampeonatos.gerenciadorcampeonatos.model.Posicoes;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.AbstractCrudService;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.PosicoesService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("posicoes")
public class PosicoesResource extends AbstractCrudResource<Posicoes> {
    
    @Inject
    private PosicoesService service;
    
    @Override
    protected AbstractCrudService<Posicoes> getService() {
        return service;
    }
    
}
