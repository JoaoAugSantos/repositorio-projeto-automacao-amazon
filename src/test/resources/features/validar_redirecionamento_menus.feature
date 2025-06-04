#language:pt
Funcionalidade: Validar redirecionamento dos links do menu na home

  Cenario:Usuário clica em "Venda na Amazon"
    Dado que o usuário está na página inicial da Amazon
    Quando ele clicar em "Venda na Amazon"
    Entao o sistema deve redirecionar para a pagina com titulo "comece a vender na amazon"

  Cenario:Usuário clica em "Mais vendidos"
    Dado que o usuário está na página inicial da Amazon
    Quando ele clicar em "Mais vendidos"
    Entao o sistema deve redirecionar para a pagina com titulo "mais vendidos"

  Cenario:Usuário clica em "Ofertas do dia"
    Dado que o usuário está na página inicial da Amazon
    Quando ele clicar em "Ofertas do dia"
    Entao o sistema deve redirecionar para a pagina com titulo "ofertas e promoções"

  Cenario:Usuário clica em "Prime"
    Dado que o usuário está na página inicial da Amazon
    Quando ele clicar em "Prime"
    Entao o sistema deve redirecionar para a pagina com titulo "amazon prime - teste grátis"

  Cenario:Usuário clica em "Livros"
    Dado que o usuário está na página inicial da Amazon
    Quando ele clicar em "Livros"
    Entao o sistema deve redirecionar para a pagina com titulo "livros"

  Cenario:Usuário clica em "Música"
    Dado que o usuário está na página inicial da Amazon
    Quando ele clicar em "Música"
    Entao o sistema deve redirecionar para a pagina com titulo "amazon music unlimited"

  Cenario:Usuário clica em "Ideias de presentes"
    Dado que o usuário está na página inicial da Amazon
    Quando ele clicar em "Ideias de presentes"
    Entao o sistema deve redirecionar para a pagina com titulo "dicas de presentes"
