import AbstractCrudService from "../abstract.crud.service";

export default class JogadorServico extends AbstractCrudService {

  constructor($http) {
    super($http, 'http://localhost:8080/gerenciadorcampeonatos-web/api/jogadores')
  }

}

JogadorServico.$inject = ['$http']
