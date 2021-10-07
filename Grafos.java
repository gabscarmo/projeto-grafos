import java.util.ArrayList;

public class Grafo<TIPO> {
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;
    
    public Grafo(){
        this.vertices = new ArrayList<Vertice<TIPO>>();
        this.arestas = new ArrayList<Aresta<TIPO>>();
    }
    
    public void adicionarVertice(TIPO dado){
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.vertices.add(novoVertice);
    }
    
    public void adicionarAresta(Double peso, TIPO dadoInicio, TIPO dadoFim){
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);
        Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
        inicio.adicionarArestaSaida(aresta);
        fim.adicionarArestaEntrada(aresta);
        this.arestas.add(aresta);
    }
    
    public Vertice<TIPO> getVertice(TIPO dado){
        Vertice<TIPO> vertice = null;
        for(int i=0; i < this.vertices.size(); i++){
            if (this.vertices.get(i).getDado().equals(dado)){
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }
    
    //Solução da equipe
    public void buscaEmLargura(){
        int x = 1; //Iniciamos com x=1 pois iniciamos apartir de um vertice
        ArrayList<Vertice<TIPO>> marcados = new ArrayList<Vertice<TIPO>>(); //Lista para guardar os vértices que já foram contabilizados
        ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>();//Fila para guardaro caminho percorrido
        Vertice<TIPO> atual = vertices.get(0); // Vertice de início
        marcados.add(atual);//adicionar o vértice atual à lista de marcados
        System.out.println(atual.getDado());
        fila.add(atual);//adicionar a fila do caminho percorrido
        while(fila.size() > 0){
            Vertice<TIPO> visitado = fila.get(0);
            for(int i=0; i < visitado.getArestasSaida().size(); i++){
                Vertice<TIPO> proximo = visitado.getArestasSaida().get(i).getFim();
                if (!marcados.contains(proximo)){ //boleano para saber se a lista de marcados contém o vértice próximo
                    marcados.add(proximo);//adicina o vértice à lista de marcados
                    System.out.println(proximo.getDado());
                    fila.add(proximo); //adiciona o o vértice à fila
                    x= 1 + x; //incrementa valor de vértices conectados
                }
            }
            fila.remove(0);//remove o valor inicial da fila
        }
        System.out.println(x);//Saída do valor de vértices conectados
    }

}
