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

---

# Set

`java.util.Set`

* Não permite elementos duplicados;
* Não possui índice.

### Implementações:

#### HashSet:
* usa internamente HashMap para armazenar elementos
* não mantém ordem entre os elementos
* melhor performance
* permite, no máximo, um elemento null

#### LinkedHashSet
* usa internamente LinkedHashMap para armazenar elementos
* mantém ordem de inserção dos elementos
* performance mediana
* permite, no máximo, um elemento null

#### TreeSet
* usa internamente TreeMap para armaenar elementos
* mantém ordem natural dos elementos
* menor performance
* não permite nenhum elemento null