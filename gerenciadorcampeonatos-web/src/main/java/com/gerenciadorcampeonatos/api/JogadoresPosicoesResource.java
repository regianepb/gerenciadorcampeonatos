package com.gerenciadorcampeonatos.api;

import com.gerenciadorcampeonatos.gerenciadorcampeonatos.model.JogadoresPosicoes;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.AbstractCrudService;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.JogadoresPosicoesService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("jogadoresPosicoes")
public class JogadoresPosicoesResource extends AbstractCrudResource<JogadoresPosicoes> {
    
    @Inject
    private JogadoresPosicoesService service;
    
    @Override
    protected AbstractCrudService<JogadoresPosicoes> getService() {
        return service;
    }
    
}
