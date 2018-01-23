import ListController from './list.controller'
import FormController from './form.controller'

import TimeServico from './servico'

export const timeConfig = (modulo) => {

  modulo.service('TimeServico', TimeServico)
  
  return ['$stateProvider', '$urlRouterProvider', 
   ($stateProvider, $urlRouterProvider) => {
    $stateProvider
      .state('time', {
        template: require('@views/default.html'),
        url: '/times',
        onEnter: ['$state', function($state) {
          $state.go('time.list')
        }]
      })
      .state('time.list', {
        template: require('@views/times/list.html'),
        url: '/list',
        controller: ListController,
        controllerAs: 'vm'
      })
      .state('time.new', {
        template: require('@views/times/form.html'),
        url: '/new',
        controller: FormController,
        controllerAs: 'vm'
      })
      .state('time.edit', {
        template: require('@views/times/form.html'),
        url: '/{id}',
        controller: FormController,
        controllerAs: 'vm'
      });
  }]
}
