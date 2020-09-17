package digitalhouse.collections

class GuardaVolumes {
    val volumes = mutableMapOf<Int, List<Peca>>()

    fun guardarPeca(vararg listaDePeca: Peca): Int {
        val id = volumes.size
        volumes.put(id, listaDePeca.asList())
        return id
    }

    fun mostrarPecas() {
        println(if (volumes.size > 0) volumes else "Nenhuma peça no guarda-volumes")
    }

    fun mostrarPecas(numero: Int){
        println(if (volumes.containsKey(numero)) volumes[numero] else "Volume não existe!")
    }

    fun devolverPecas(numero: Int) {
        volumes.remove(numero)
    }
}