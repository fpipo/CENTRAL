package CENTRAL

class SqtCaja {
    String caja
    Date diaOperacion
    String comentarios
    Date fechaMod
    int enviado
    SqtTienda tienda
    SqtEstatus estatus
    SqtUsuario usuarioMod

    static constraints = {
        caja maxSize: 2, nullable: false
    }
}
