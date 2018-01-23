export default class FormController {
    
    constructor($stateParams, $state, DespesaServico, Notification) {
        this.record = {}
        this.title = 'Adicionando Despesa'
        this._service = DespesaServico
        if ($stateParams.id) {
            this.title = 'Editando Despesa'
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
                this._state.go('despesa.list')
            }).catch(function(data){
                data._notify.error('Erro ao salvar o registro!')
            })
    }
}

FormController.$inject = ['$stateParams', '$state', 'DespesaServico', 'Notification']
    