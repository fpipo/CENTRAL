package CENTRAL

class SqtPoliza {
    String id
    Date fechaDocumento
    String sociedad
    Date fechaContabilizacion
    String periodo
    String comentarios
    Date fechaMod
    int enviado
    SqtUsuario usuarioMod

    static hasMany = [detalles:SqtDetallePoliza]

    static mapping = {
        id generator: 'uuid', name:'id'
    }

    static constraints = {
        sociedad maxSize: 4, nullable: false
        periodo maxSize: 2, nullable: false
        comentarios maxSize: 250
    }
}
