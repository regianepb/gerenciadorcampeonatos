package com.gerenciadorcampeonatos.api;

import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.AbstractCrudService;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.model.Times;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.service.TimesService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("times")
public class TimesResource extends AbstractCrudResource<Times> {
    
    @Inject
    private TimesService service;
    
    @Override
    protected AbstractCrudService<Times> getService() {
        return service;
    }
    
}
