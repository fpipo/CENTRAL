package CENTRAL

class SqtRedq {
    String id
    String plaza
    Date fechaAdmin
    Date fechaNatural
    String hora
    Double monto
    String idTarjeta
    String autorizacion
    String referencia
    int error
    Double saldo
    int enviado
    int enviadoRedq
    SqtVenta venta
    SqtTienda tienda
    SqtCaja caja

    static mapping = {
        id generator: 'uuid', name:'id'
    }

    static constraints = {
        plaza maxSize: 5, nullable: false
        idTarjeta maxSize: 20, nullable: false
        autorizacion maxSize: 30, nullable: false
        referencia maxSize: 50, nullable: false
    }
}
