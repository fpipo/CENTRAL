package CENTRAL

class SqtAjuste {
    String id
    Date fecha
    String comentarios
    int opcion
    Date fechaMod
    int enviado
    String referencia

    SqtUsuario usuarioMod
    SqtTienda tienda
    SqtMovimiento movimiento
    SqtArea area
    SqtEstatus estatus
    SqtInventario inventario

    static hasMany = [ajustes:SqtDetalleAjuste]

    static mapping = {
        id generator: 'uuid', name:'id'
    }

    static constraints = {
        comentarios maxSize: 250
        referencia maxSize: 32
    }
}
