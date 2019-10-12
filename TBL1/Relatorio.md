## TBL 1 - Fase 3

## 1. Walkthrough

É uma técnica interessante de ser aplicada pois, pessoas além do autor do programa estão envolvidas no processo, oferecendo diferentes pontos de vista sobre o artefato. Esse procedimento frequentemente expõe uma grande quantidade de erros e suas localizações precisas no código, permitindo que sejam corrigidos de uma só vez.


## 2. Pseudocódigo

### spaceX.py

    function SpaceX()

        NEXT_LAUNCH <- 1
        LATEST_LAUNCH <- 2
        UPCOMING_LAUNCHES <- 3
        PAST_LAUNCHES <- 4

        while VERDADEIRO do
            escreva ("O que você deseja visualizar?")
            escreva ("1) Próximo Lançamento")  
            escreva ("2) Último Lançamento")   
            escreva ("3) Próximos Lançamentos")  
            escreva ("4) Lançamentos Passados")
            escreva ("5) Sair")

            try:
                escreva ("Insira uma opção: ")
                leia(option) 
            catch VariavelNãoForInteiro:
                escreva ("Você deve inserir somente números inteiros de preferencia de 1 a 5")
                option <- 0

        if option < 1 ou option > 5 then
            escreva ("Essa opção não existe, por favor insira uma opção válida.")
        else
            if option == 5 then
                break
            else
                show_result(option)
                escreva ("Deseja sair da aplicação? (S/N): ")
                leia(answer)
                if answer[0] == "s" then
                    break