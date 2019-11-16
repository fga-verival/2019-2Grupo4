# Grupo 4

|Estudante|Matricula|Participação|
|:--|:--|:--|
|Guilherme de Lyra P.|15/0128231||
|Heron Rodrigues Sousa|16/0124484||
|Lucas Ganda Carvalho|17/0039668||
|Victor Rodrigues Silva|16/0019516||
|Marcos Vinícius R. da Conceição|17/0150747||
|Henrique Martins de Messias|17/0050394|100|
|Weiller Fernandes Pereira|13/0137995||

-----

## Falsificação e Triangularização

A técnica de falsificação, também conhecida como fake it, parte do princípio que o testador necessita que o teste passe o mais rápido possível. Consiste em retorna, da unidade a ser testada, o valor esperado.

Sobre a técnica de triangularização, Kent Beck, em seu livro, descreve essa como a técnica mais conservadora utilizada no *Test-Driven-Development*, pois primeiramente são usados casos mais simples até testes mais específicos. É uma analogia com a triangularização de radares, dois ou mais radares são usados para determinar a posição exata de uma objeto.

### Como triangularizar com parâmetros em frameworks de testes unitários 

Para triangularizar nessas situações, primeiramente se generaliza a aplicação escrevendo casos especiais e óbvios para passar em testes simples, posteriormente adicionando casos específicos de testes para aumentar a complexidade das especificações e a generalização da implementação, para finalizar remove-se os aspectos redundantes do código.

## Referências

[1] Test-driven development, Kent Beck
