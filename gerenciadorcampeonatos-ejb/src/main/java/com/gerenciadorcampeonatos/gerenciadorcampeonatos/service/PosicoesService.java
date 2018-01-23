package com.gerenciadorcampeonatos.gerenciadorcampeonatos.service;

import com.gerenciadorcampeonatos.gerenciadorcampeonatos.model.Posicoes;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class PosicoesService extends AbstractCrudService<Posicoes> {
    
    @Inject
    private GenericDao<Posicoes> dao;

    @Override
    protected GenericDao<Posicoes> getDao() {
        return dao;
    }
}