export default class FormController {
    
    constructor($stateParams, $state, TimeServico, Notification) {
        this.record = {}
        this.title = 'Adicionando Time'
        this._service = TimeServico
        if ($stateParams.id) {
            this.title = 'Editando Time'
            this._service.findById($stateParams.id)
                .then(data => {
                    this.record = data
                })
        }
        this._state = $state
        this._notify = Notification
    }

    save() {
        this._service.save(this.record)
            .then(resp => {
                this._notify.success('Registro salvo com sucesso!')
                this._state.go('time.list')
            }).catch(erro => {
                this._notify.error('Erro ao salvar o registro!')
                console.log(erro)
            })
    }
}

FormController.$inject = ['$stateParams', '$state', 'TimeServico', 'Notification']
    