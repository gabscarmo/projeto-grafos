# projeto-grafos

A equipe irá encontrar o número de componentes conectadas do grafo

Grafos são estruturas matemáticas que permitem codificar arestas entre pares de objetos nos quais esses objetos podem ser chamados de vértices (ou nós) do grafo. São representados como um conjunto de nós (vértices) conectados par a par por linhas (arestas).

Tipos de grafos:
Grafo orientado: Todas as arestas são orientadas
Grafo não orientado: Não há arestas orientadas
Grafos não-dirigido: Um grafo não-dirigido é conexo se existir um caminho entre quaisquer dois vértices do grafo.
Grafo Orientado (Dígrafo): É fortemente conexo se existir um caminho de a para b e de b para a, para cada par a,b de vértice do grafo.
Grafos fracamente conexos: Um grafo é dito fracamente conexo se, ao substituir os arcos (setas) por arestas (retas), temos um grafo não-dirigido conexo. Esse grafo não-dirigido é chamado de grafo não orientado subjacente.

Busca em largura em grafos:
Em teoria seria um algoratimo de busca utilizado para realizar uma busca ou tragetoria de um grafo e estrutura de grafo do tipo árvore. Individualmente, iremos iniciar pelo vértice raiz e explora os vértices dos vizinhos seguintes. Assim, para cada um desses vértices mais próximos, exploramos os seus vértices vizinhos inexplorados e assim sucessivamente, até que ele encontre o alvo da busca.

Vamos utilizar a busca em largura em grafos pois ela melhor atende a finalidade do projeto.
Para solucionar esse problema, vamos selecionar um vértice e inicializar um número inteiro com 1, (O x=1) e daí iniciamos nossa contagem.
Para haver uma solução é preciso percorrer o primeiro vértice até o seguinte, sem que se repita o vértice e some ao x de forma errônea. Por tanto, vamos marcar os elementos que já foram adicionados ao x, depois vamos adicionar uma fila para que tenhamos o controle de qual caminho estamos tomando.
E um vértice chamado atual, que vai começar com o vértice 0 do arraylist dos vértices

Vamos criar uma estrutura de repetição enquanto (while), que enquanto houver elementos na fila percorrida, o laço continuará ocorrendo.
Atribuiremos o primeiro elemento da fila ao vértice visitado e iniciaremos um laço for que irá ser percorrido até que todas as arestas que estão ligadas ao grafo sejam percorridas e daí iremos entrar com a solução do número de grafos conectados. 
Vai haver um vértice chamado próximo que irá receber a próxima aresta utilizando o ponteiro i
Se a lista de vértices marcados não contiver o próximo, o número x não será incrementado. Se o vértice próximo não tiver sido marcado, o x será incrementado e o vértice próximo irá ser marcado. E assim todos os laços irão obedecer as condições e o console irá retornar todos os elementos conectados e o número de elementos conectados.



Alunos da equipe:

Gabriela Silva Do Carmo

Matrícula: 201607040024

Maxwell Wilhames Araujo Lobato

Matrícula: 202007040032

Yasmim Carvalho da Silva

Matrícula: 202007040025
