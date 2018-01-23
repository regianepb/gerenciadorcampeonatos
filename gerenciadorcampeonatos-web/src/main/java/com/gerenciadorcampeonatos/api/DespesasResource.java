package com.gerenciadorcampeonatos.api;

import com.gerenciadorcampeonatos.gerenciadorcampeonatos.model.Despesas;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.AbstractCrudService;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.DespesasService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("despesas")
public class DespesasResource extends AbstractCrudResource<Despesas> {
    
    @Inject
    private DespesasService service;
    
    @Override
    protected AbstractCrudService<Despesas> getService() {
        return service;
    }
    
}
