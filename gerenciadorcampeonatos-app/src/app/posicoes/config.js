import ListController from './list.controller'
import FormController from './form.controller'

import PosicaoServico from './servico'

export const posicaoConfig = (modulo) => {

  modulo.service('PosicaoServico', PosicaoServico)
  
  return ['$stateProvider', '$urlRouterProvider', 
   ($stateProvider, $urlRouterProvider) => {
    $stateProvider
      .state('posicao', {
        template: require('@views/default.html'),
        url: '/posicoes',
        onEnter: ['$state', function($state) {
          $state.go('posicao.list')
        }]
      })
      .state('posicao.list', {
        template: require('@views/posicoes/list.html'),
        url: '/list',
        controller: ListController,
        controllerAs: 'vm'
      })
      .state('posicao.new', {
        template: require('@views/posicoes/form.html'),
        url: '/new',
        controller: FormController,
        controllerAs: 'vm'
      })
      .state('posicao.edit', {
        template: require('@views/posicoes/form.html'),
        url: '/{id}',
        controller: FormController,
        controllerAs: 'vm'
      });
  }]
}
