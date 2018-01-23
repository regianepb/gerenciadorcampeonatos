package com.gerenciadorcampeonatos.gerenciadorcampeonatos.service;

import com.gerenciadorcampeonatos.gerenciadorcampeonatos.model.Patrocinadores;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class PatrocinadoresService extends AbstractCrudService<Patrocinadores> {
    
    @Inject
    private GenericDao<Patrocinadores> dao;

    @Override
    protected GenericDao<Patrocinadores> getDao() {
        return dao;
    }
}