## TBL 1 - Fase 3

## 1. Walkthrough

É uma técnica interessante de ser aplicada, pois, pessoas além do autor do programa estão envolvidas no processo, oferecendo diferentes pontos de vista sobre o artefato. Esse procedimento frequentemente expõe uma grande quantidade de erros e suas localizações precisas no código, permitindo que sejam corrigidos de uma só vez.


## 2. Pseudocódigo

### spaceX.py    

```
    IMPORT Connect DE connections

    NEXT_LAUNCH = 1
    LATEST_LAUNCH = 2
    UPCOMING_LAUNCHES = 3
    PAST_LAUNCHES = 4

    WHILE 1 DO
        PRINT ("O que você deseja visualizar?")
        PRINT ("1) Próximo Lançamento")  
        PRINT ("2) Último Lançamento")   
        PRINT ("3) Próximos Lançamentos")  
        PRINT ("4) Lançamentos Passados")
        PRINT ("5) Sair")

        PRINT ("Insira uma opção: ")
        SCAN(option) 
        
        IF option != INTEIRO THEN
            PRINT ("Você deve inserir somente números inteiros de preferencia de 1 a 5")
            option = 0
        END IF

        IF option < 1 OU option > 5 THEN
            PRINT ("Essa opção não existe, por favor insira uma opção válida.")
            clean(3)
        END IF
        ELSE
            IF option == 5 THEN
                END_LOOP
            END IF
            ELSE
                show_result(option)
                PRINT ("Deseja sair da aplicação? (S/N): ")
                SCANF(answer)
                IF answer[0] == "s" THEN
                    END_LOOP
                END IF
                clean(1)
            END ELSE
        END ELSE
    END WHILE

    FUNCTION show_result(option)
    BEGIN
        IF option == NEXT_LAUNCH THEN
            next_launch()
        END IF
        ELSE IF option == LATEST_LAUNCH THEN
            latest_launch()
        END ELSE IF
        ELSE IF option == UPCOMING_LAUNCHES THEN
            upcoming_launches()
        END ELSE IF
        ELSE IF option == PAST_LAUNCHES THEN
            past_launches()
        END ELSE IF
        ELSE
            PRINT ("Opção invalida")
        END ELSE
    END
    FUNCTION clean(seconds)
    BEGIN
        ESPERA(seconds)
        
        IF PLATAFORMA == WINDOWNS THEN
            LIMPAR_TELA_WINDOWNS()
        END IF
        ELSE
            LIMPAR_TELA_OUTRA_PLATAFORMA()
        END ELSE
    END

    FUNCTION close()
    BEGIN
        PRINT("Finalizando o programa...")
        ESPERE(1)
    END

    FUNCTION next_launch()
    BEGIN
        connection = Connect("https://api.spacexdata.com/v3/launches/next")
        PRINT(connection.result)
    END

    FUNCTION upcoming_launches()
    BEGIN
        connection = Connect("https://api.spacexdata.com/v3/launches/upcoming")
       FOR EACH result IN connection.result
            PRINT(result)
            PRINT("----------------------------------------------------------\n")
        END FOR
    END

    FUNCTION latest_launch()
    BEGIN
        connection = Connect("https://api.spacexdata.com/v3/launches/latest")
        PRINT(connection.result)
    END

    FUNÇÃO past_launches():
    BEGIN
        connection = Connect("https://api.spacexdata.com/v3/launches/past")
        FOR EACH result IN connection.result
            PRINT(result)
            PRINT("----------------------------------------------------------\n")
    END

```


### api_connection.py

```
IMPORT launch FROM models


CLASS Connect
BEGIN
    constructor(url, header<-None, params<-none)
    IF header != NIL then
        self.__headers <- headers
    END IF
    ELSE then
        header <- {'Accept': 'application/json'}
    END ELSE

    try
    BEGIN

    IF params != NIL then
        self.__response <- request.get(url, self.__headers, params=params)
    END IF
    ELSE then
        self.__response <- requests.get(url, self.__headers)
    END ELSE

    self.__result <- self.__response.json()

    END

    except
    BEGIN
        print("Ocorreu um erro na comunicação com a API SpaceX")
    END


    FUNCTION result():
    BEGIN
        IF result type == dict type then
            return Launch(
                flight_number<-self.__result.get('flight_number'),
                mission_name<-self.__result.get('mission_name'),
                rocket<-self.__result.get('rocket').get('rocket_name'),
                rocket_type<-self.__result.get('rocket').get('rocket_type'),
                launch_success<-self.__result.get('launch_success'),
                launch_date<-self.__result.get('launch_date_utc'),
                launch_year<-self.__result.get('launch_year')
            )
        END IF

        launchs <- []

        FOR each result in self.__result
            launchs.append(
                Launch(
                    flight_number<-result.get('flight_number'),
                    mission_name<-result.get('mission_name'),
                    rocket<-result.get('rocket').get('rocket_name'),
                    rocket_type<-result.get('rocket').get('rocket_type'),
                    launch_success<-result.get('launch_success'),
                    launch_date<-result.get('launch_date_utc'),
                    launch_year<-result.get('launch_year')
                )
            )
        END FOR

        return launchs
    END

    FUNCTION response
    BEGIN
        return self.__response
    END

END
```

### launch.py

```
FROM datetime IMPORT datetime

CLASS launch
BEGIN

    FUNCTION init(flight_number, mission_name, rocket,
                 rocket_type, launch_success,
                 launch_year, launch_date)
    BEGIN

        flight_number <- flight_number
        mission_name <- mission_name
        launch_date <- launch_date
        launch_year <- launch_year
        rocket <- rocket
        rocket_type <- rocket_type
        launch_success <- launch_success
    
    END

    FUNCTION str
    BEGIN

        IF launch_success != NIL then
            print( flight_number, mission_name, rocket,
             launch_year, launch_date, launch_success
        END IF
        
        print( flight_number, mission_name, rocket,
             launch_year, launch_date, launch_success

    END

    FUNCTION flight_number
    BEGIN

        print ("Número do Voo", flight_number)

    END

    FUNCTION mission_name
    BEGIN

        print( "Missão", mission_name)

    END
    
    FUNCTION launch_date
    BEGIN

        date <- datetime.(launch_date)

        print( "Data de Lançamento (UTC):",date)

    END
    
    FUNCTION launch_year
    BEGIN

        print( "Ano de Lançamento",launch_year)

    END

    
    FUNCTION rocket
    BEGIN

        print( "Foguete",rocket,rocket_type)

    END

    
    FUNCTION launch_success
    BEGIN

        IF launch_success == TRUE then
            print( "Lançamento realizado com sucesso!")
        END IF

        ELSE then
            print( "Lançamento falhou!")
        END ELSE
    
    END

END
```