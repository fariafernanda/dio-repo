# List

`java.util.List`

* Elementos duplicados;
* Ordem de inserção;

### Implementações:
* ArrayList
* Vector
* LinkedList (implementa interface List e interface Queue)
* PriorityQueue

### ArrayList x LinkedList

**ArrayList** deve ser usado onde mais operações de pesquisa são necessárias.
**LinkedList** deve ser usado onde mais operações de inserção e exclusão são necessárias.

#### ArrayList

* Usa arrays dinâmicos para armazenar os elementos
* Suporta armazenamento de todos os tipos de objetos
* Manipulação um pouco mais demorada devido a implementação interna 
* Implementa List Interface &rarr; atua como uma lista
* Funciona melhor quando a aplicação demanda armazenar o dado e acessá-lo.


#### LinkedList
* Usa lista duplamente ligada para armazenar os elementos
* Suporta armazenamento de todos os tipos de objetos
* Manipulação mais rápida &rarr; não há mudança na memória, mas a referência muda.
* Implementa List Interface e Queue Interface &rarr; atua como lista e queue.
* Funciona melhor quando a aplicação demanda manipulação do dado armazenado.