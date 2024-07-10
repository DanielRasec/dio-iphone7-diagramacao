## DIO - Trilha Java Básico

### Autores

* Daniel Costa

### POO - Desafio

#### Modelagem e Diagramação de um Componente iPhone

    classDiagram
    class ReprodutorMusical {
       +tocar()
       +pausar()
       +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
