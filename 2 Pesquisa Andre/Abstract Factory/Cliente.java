class Cliente {
    private ProdutoAbstratoA produtoA;
    private ProdutoAbstratoB produtoB;

    Cliente(FabricaAbstrata fabrica) {
        produtoA = fabrica.createProdutoA();
        produtoB = fabrica.createProdutoB();
    }

    void executar() {
        produtoB.interagir(produtoA);
    }
}