package CENTRAL

class SqtPais {
    String descripcion
    int enviado

    static constraints = {
        descripcion maxSize: 30, nullable: false
    }
}
