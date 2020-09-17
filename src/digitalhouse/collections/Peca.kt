package digitalhouse.collections

class Peca (
        var marca: String,
        var modelo: String
) {
    fun retirada(){

    }

    override fun toString(): String {
        return "Peca(Marca: $marca, Modelo: $modelo)"
    }
}