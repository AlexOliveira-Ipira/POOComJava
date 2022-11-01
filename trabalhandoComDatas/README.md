## Trabalhando com Data

# Data-[hora] local:
    - ano-mês-dia-[hora] sem fuso horário
    [hora] opcional

# Data-hora global:
    - ano-mês-dia-hora com fuso horário

# Duração:
    - tempo decorrido entre duas data-horas
    

## Quando usar?

# Data-[hora] local:
    - Quando o momento exto não interessa a pessoas de outro fuso horário.
    - Uso comum: sistemas de região única, Excel.
        - Data de nascimento: "15/06/2001"
        - Data-hora da venda: "13/08/2022 as 15:32" (Presumindo não interessar fuso horário)
    
# Data-hora global:
    - Quando o momento exato interessa a pessoas de outro fuso horário.
    - Uso commun: sistemas multi-região, web.
        - Quando será o sorteio? "21/08/2022 as 20h (horário de São Paulo)"
        - Quando o comentário foi postado? "há 17 minutos"
        - Qaudno foi realizada a venda? "13/08/2022 as 15:32 (horário de São Paulo)"
        - inicio e fim do evento? "21/08/2022 as 14h até as 16h (horário de São Paulo)"

## Timezone (fuso horário)

# GMT - Greewwich Mean Time
    - Horário de londres
    - Horário do padrão UTC - Coordinated Universal Time
    - Também chamado de "Z" time, ou Zulu time

# Outros fuso horários são relativos ao GMT/UTC:
    - São Paulo: GMT-3
    - Manaus: GMT-4
    - Portugal: GMT+1

# Muitas linguagens/tecnologias usam nomes para as timezones:
    - "US/Pacific"
    - "America/Sao_Paulo"
    - etc.

## Padrão ISO 8601

# Data-[hora] local:
    - 2022-07-21
    - 2022-07-21T14:52
    - 2022-07-21T14:52:09
    - 2022-07-21T14:52:09.4073

# Data-hota global:
    - 2022-07-23T14:52:09Z
    - 2022-07-23T14:52:09.254935Z
    - 2022-07-23T14:52:09-03:00

## Operações importantes com data-hora

# Instanciação
    - (agora) -> Data-hora
    - Texto ISO 8601 -> Data-hora
    - Texto formato customizado -> Data-hora
    - dia, mês, ano, [horário] -> Data-hora local

# Formatação
    - Data-hora -> Texto ISO 8601
    - Data-hora -> Texto formato customizado

# Obter dados de uma data-hora local
    - Data-hora local -> dia, mês, ano, horário

# Converter data-hora global para local
    - Data-hora global, timezone (sistema local) -> Data-hora local

# Cálculos com data-hora
    - Data-hora +/- tempo -> Data-hora
    - Data-hora 1, Data-hora 2 -> Duração

## Principais tipos Java (versão 8+) 

# Data-hora local
    - LocalDate
    - LocalDateTime

# Data-hora global
    - Instant

# Duração
    - Duration

# Outros
    - Zoneld
    - ChronoUnit