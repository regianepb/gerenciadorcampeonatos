package com.gerenciadorcampeonatos.gerenciadorcampeonatos.service;

import com.gerenciadorcampeonatos.gerenciadorcampeonatos.model.Despesas;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class DespesasService extends AbstractCrudService<Despesas> {
    
    @Inject
    private GenericDao<Despesas> dao;

    @Override
    protected GenericDao<Despesas> getDao() {
        return dao;
    }
}
    
    
    
    