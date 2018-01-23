import AbstractCrudService from "../abstract.crud.service";

export default class TimeServico extends AbstractCrudService {

  constructor($http) {
    super($http, 'http://localhost:8080/gerenciadorcampeonatos-web/api/times')
  }

}

TimeServico.$inject = ['$http']
