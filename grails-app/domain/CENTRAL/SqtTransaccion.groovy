package CENTRAL

class SqtTransaccion {
    String descripcion
    int enviado
    SqtFuncion funcion

    static constraints = {
        descripcion maxSize: 50, nullable: false
    }
}
