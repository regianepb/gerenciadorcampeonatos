import AbstractCrudService from "../abstract.crud.service";

export default class PosicaoServico extends AbstractCrudService {

  constructor($http) {
    super($http, 'http://localhost:8080/gerenciadorcampeonatos-web/api/posicoes')
  }

}

PosicaoServico.$inject = ['$http']
