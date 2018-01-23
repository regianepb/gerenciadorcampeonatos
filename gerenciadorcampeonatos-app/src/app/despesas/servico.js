import AbstractCrudService from "../abstract.crud.service";

export default class DespesaServico extends AbstractCrudService {

  constructor($http) {
    super($http, 'http://localhost:8080/gerenciadorcampeonatos-web/api/despesas')
  }

}

DespesaServico.$inject = ['$http']
