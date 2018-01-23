package com.gerenciadorcampeonatos.gerenciadorcampeonatos.service;

import com.gerenciadorcampeonatos.gerenciadorcampeonatos.model.Modalidades;
import com.gerenciadorcampeonatos.gerenciadorcampeonatos.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class ModalidadesService extends AbstractCrudService<Modalidades> {
    
    @Inject
    private GenericDao<Modalidades> dao;

    @Override
    protected GenericDao<Modalidades> getDao() {
        return dao;
    }
}
