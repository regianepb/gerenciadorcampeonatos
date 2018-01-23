import ListController from './list.controller'
import FormController from './form.controller'

import DespesaServico from './servico'


export const despesaConfig = (modulo) => {

  modulo.service('DespesaServico', DespesaServico)
  
  return ['$stateProvider', '$urlRouterProvider', 
   ($stateProvider, $urlRouterProvider) => {
    $stateProvider
      .state('despesa', {
        template: require('@views/default.html'),
        url: '/despesas',
        onEnter: ['$state', function($state) {
          $state.go('despesa.list')
        }]
      })
      .state('despesa.list', {
        template: require('@views/despesas/list.html'),
        url: '/list',
        controller: ListController,
        controllerAs: 'vm'
      })
      .state('despesa.new', {
        template: require('@views/despesas/form.html'),
        url: '/new',
        controller: FormController,
        controllerAs: 'vm'
      })
      .state('despesa.edit', {
        template: require('@views/despesas/form.html'),
        url: '/{id}',
        controller: FormController,
        controllerAs: 'vm'
      });
  }]
}
