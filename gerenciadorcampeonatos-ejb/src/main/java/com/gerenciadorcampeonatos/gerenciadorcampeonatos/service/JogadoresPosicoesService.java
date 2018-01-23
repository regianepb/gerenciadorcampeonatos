package com.gerenciadorcampeonatos.gerenciadorcampeonatos.service;

import com.gerenciadorcampeonatos.gerenciadorcampeonatos.model.JogadoresPosicoes;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class JogadoresPosicoesService extends AbstractCrudService<JogadoresPosicoes> {
    
    @Inject
    private GenericDao<JogadoresPosicoes> dao;

    @Override
    protected GenericDao<JogadoresPosicoes> getDao() {
        return dao;
    }
}