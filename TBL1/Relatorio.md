## TBL 1 - Fase 3

## 1. Walkthrough

É uma técnica interessante de ser aplicada, pois, pessoas além do autor do programa estão envolvidas no processo, oferecendo diferentes pontos de vista sobre o artefato. Esse procedimento frequentemente expõe uma grande quantidade de erros e suas localizações precisas no código, permitindo que sejam corrigidos de uma só vez.


## 2. Pseudocódigo

### spaceX.py    

    IMPORTE Connect DE connections

    NEXT_LAUNCH = 1
    LATEST_LAUNCH = 2
    UPCOMING_LAUNCHES = 3
    PAST_LAUNCHES = 4

    ENQUANTO 1 FAÇA
        ESCREVA ("O que você deseja visualizar?")
        ESCREVA ("1) Próximo Lançamento")  
        ESCREVA ("2) Último Lançamento")   
        ESCREVA ("3) Próximos Lançamentos")  
        ESCREVA ("4) Lançamentos Passados")
        ESCREVA ("5) Sair")

        ESCREVA ("Insira uma opção: ")
        LEIA(option) 
        
        SE option != INTEIRO ENTÃO
            ESCREVA ("Você deve inserir somente números inteiros de preferencia de 1 a 5")
            option = 0
        FIM SE

        SE option < 1 OU option > 5 ENTÃO
            ESCREVA ("Essa opção não existe, por favor insira uma opção válida.")
            clean(3)
        FIM SE
        SENÃO
            SE option == 5 ENTÃO
                TERMINA_LOOP
            FIM SE
            SENÃO
                show_result(option)
                ESCREVA ("Deseja sair da aplicação? (S/N): ")
                LEIA(answer)
                SE answer[0] == "s" ENTÃO
                    TERMINA_LOOP
                FIM SE
                clean(1)
            FIM SENÃO
        FIM SENÃO
    FIM ENQUANTO

    FUNÇÃO show_result(option)
    INICIO
        SE option == NEXT_LAUNCH ENTÃO
            next_launch()
        FIM SE
        SENÃO SE option == LATEST_LAUNCH ENTÃO
            latest_launch()
        FIM SENÃO SE
        SENÃO SE option == UPCOMING_LAUNCHES ENTÃO
            upcoming_launches()
        FIM SENÃO SE
        SENÃO SE option == PAST_LAUNCHES ENTÃO
            past_launches()
        FIM SENÃO SE
        SENÃO
            ESCREVA ("Opção invalida")
        FIM SENÃO
    FIM

    FUNÇÃO clean(seconds)
    INICIO
        ESPERE(seconds)
        
        SE PLATAFORMA == WINDOWNS ENTÃO
            LIMPAR_TELA_WINDOWNS()
        FIM SE
        SENÃO
            LIMPAR_TELA_OUTRA_PLATAFORMA()
        FIM SENÃO
    FIM

    FUNÇÃO close()
    INICIO
        ESCREVA("Finalizando o programa...")
        ESPERE(1)
    FIM

    FUNÇÃO next_launch()
    INICIO
        connection = Connect("https://api.spacexdata.com/v3/launches/next")
        ESCREVA(connection.result)
    FIM

    FUNÇÃO upcoming_launches()
    INICIO
        connection = Connect("https://api.spacexdata.com/v3/launches/upcoming")
        PARA CADA result EM connection.result
            ESCREVA(result)
            ESCREVA("----------------------------------------------------------\n")
        FIM PARA
    FIM

    FUNÇÃO latest_launch()
    INICIO
        connection = Connect("https://api.spacexdata.com/v3/launches/latest")
        ESCREVA(connection.result)
    FIM

    FUNÇÃO past_launches():
    INICIO
        connection = Connect("https://api.spacexdata.com/v3/launches/past")
        PARA CADA result EM connection.result
            ESCREVA(result)
            ESCREVA("----------------------------------------------------------\n")
    FIM