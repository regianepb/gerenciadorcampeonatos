import * as angular from 'angular'

import { default as uiRouter } from '@uirouter/angularjs'
import { default as uiNotification } from 'angular-ui-notification'
import { default as inputMasks } from 'angular-input-masks'
import { mainConfig } from './main/config'
import { jogadorConfig } from './jogadores/config'
import { timeConfig } from './times/config'
import { despesaConfig } from './despesas/config'
import { posicaoConfig } from './posicoes/config'


require('angular-i18n/angular-locale_pt-br.js')

export const appModule = 'app'

var modulo = angular.module(appModule, [uiRouter, uiNotification, inputMasks])

modulo.config(mainConfig(modulo))
      .config(jogadorConfig(modulo))
      .config(timeConfig(modulo))
      .config(despesaConfig(modulo))
      .config(posicaoConfig(modulo))

