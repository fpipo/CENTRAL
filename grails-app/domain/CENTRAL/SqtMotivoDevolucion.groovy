package CENTRAL

class SqtMotivoDevolucion {
    String clave
    String descripcion
    int ocultar
    int enviado
    String origen

    static constraints = {
        clave maxSize: 3, nullable: false
        descripcion maxSize: 50, nullable: false
        origen maxSize: 10
    }
}
