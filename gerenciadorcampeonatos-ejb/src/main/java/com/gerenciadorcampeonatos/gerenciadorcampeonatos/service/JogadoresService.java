package com.gerenciadorcampeonatos.gerenciadorcampeonatos.service;

import com.gerenciadorcampeonatos.gerenciadorcampeonatos.model.Jogadores;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class JogadoresService extends AbstractCrudService<Jogadores> {
    
    @Inject
    private GenericDao<Jogadores> dao;

    @Override
    protected GenericDao<Jogadores> getDao() {
        return dao;
    }
}