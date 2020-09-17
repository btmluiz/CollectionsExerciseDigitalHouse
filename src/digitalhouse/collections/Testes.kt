package digitalhouse.collections

fun main() {
    val peca1 = Peca("ma1", "mo1")
    val peca2 = Peca("ma2", "mo2")

    val guardaVolumes = GuardaVolumes()

    val idpeca = guardaVolumes.guardarPeca(peca1, peca2)

    guardaVolumes.mostrarPecas()
    guardaVolumes.mostrarPecas(idpeca)

    guardaVolumes.devolverPecas(idpeca)

    guardaVolumes.mostrarPecas()
    guardaVolumes.mostrarPecas(idpeca)
}