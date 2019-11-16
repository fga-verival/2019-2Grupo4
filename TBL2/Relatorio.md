# Grupo 4

|Estudante|Matricula|Participação|
|:--|:--|:--|
|Guilherme de Lyra P.|15/0128231||
|Heron Rodrigues Sousa|16/0124484|100|
|Lucas Ganda Carvalho|17/0039668|90|
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

### Crítica sobre as técnicas

**Dificuldades** 
- Fazer os testes para o primeiro caso foi um desafio, já que era uma maneira nova de testar, e tudo deveria ser feito com muita atenção. 
- Alguns cálculos da implementação também tiveram sua dificuldade.
- Falta de conhecimento com a linguagem.

**Facilidades** 
 - Depois do primeiro caso, os outros dois foram mais tranquilos. 
 - Enquanto alguns cálculos da implementação estavam difíceis, outros estavam relativamente simples.
 - Técnicas ajudam no entendimento e escrita dos testes, desde a utilização da falsificação até testes que forçam a generalização da implementação.
 

## Referências

[1] Test-driven development, Kent Beck
