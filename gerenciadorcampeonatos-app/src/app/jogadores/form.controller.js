export default class FormController {

    constructor($stateParams, $state, JogadorServico, PosicaoServico, Notification) {
        this.record = {}
        this.title = 'Adicionando Jogador'
        this._service = JogadorServico
        if ($stateParams.id) {
            this.title = 'Editando registro'
            this._service.findById($stateParams.id)
                .then(data => {
                    this.record = data
                })
        }
        this._state = $state
        this._notify = Notification

        this.posicoes = []
        PosicaoServico.findAll()
            .then(data => {
                this.posicoes = data
            }, erro => {
                this._notify.error('Erro ao carregar as posições!')
            })
        
    }

    save() {
        this._service.save(this.record)
            .then(resp => {
                this._notify.success('Registro salvo com sucesso!')
                this._state.go('jogador.list')
            }).catch(function(){
                this._notify.error('Erro ao salvar o registro!')
            })
    }
}

FormController.$inject = ['$stateParams', '$state', 'JogadorServico', 'PosicaoServico', 'Notification']
