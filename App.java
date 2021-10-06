public class App {
    public static void main(String[] args) throws Exception {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("dada");
        grafo.adicionarVertice("dede");
        grafo.adicionarVertice("didi");
        grafo.adicionarVertice("dodo");
        grafo.adicionarVertice("dudu");

        grafo.adicionarAresta(1.0, "dada", "dede");
        grafo.adicionarAresta(1.0, "dede", "didi");
        grafo.adicionarAresta(1.0, "didi", "dodo");
        grafo.adicionarAresta(1.0, "dodo", "dudu");
        grafo.adicionarAresta(1.0, "didi", "dada");
        grafo.adicionarAresta(1.0, "dodo", "dudu");
        grafo.adicionarAresta(1.0, "didi", "dudu");

        grafo.buscaEmLargura();
    }
}
