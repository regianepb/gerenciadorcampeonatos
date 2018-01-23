import ListController from './list.controller'
import FormController from './form.controller'

import JogadorServico from './servico'

export const jogadorConfig = (modulo) => {

  modulo.service('JogadorServico', JogadorServico)
  
  return ['$stateProvider', '$urlRouterProvider', 
   ($stateProvider, $urlRouterProvider) => {
    $stateProvider
      .state('jogador', {
        template: require('@views/default.html'),
        url: '/jogadores',
        onEnter: ['$state', function($state) {
          $state.go('jogador.list')
        }]
      })
      .state('jogador.list', {
        template: require('@views/jogadores/list.html'),
        url: '/list',
        controller: ListController,
        controllerAs: 'vm'
      })
      .state('jogador.new', {
        template: require('@views/jogadores/form.html'),
        url: '/new',
        controller: FormController,
        controllerAs: 'vm'
      })
      .state('jogador.edit', {
        template: require('@views/jogadores/form.html'),
        url: '/{id}',
        controller: FormController,
        controllerAs: 'vm'
      });
  }]
}
