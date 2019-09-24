# BibliotecaPOO

Desenvolva um aplicativo para gerenciar as atividades de empréstimo e devolução da Biblioteca.

Classes básicas:
1-biblioteca,
2-conteúdo,
3-livros,
4-artigos,
5-mídia digital,
6-assinantes,
7-registros de empréstimos.

As classes  possuem os seguintes relacionamentos:
Os conteúdos de uma biblioteca podem ser um livro, um artigo em um journal ou mídia digital.
Um assinante pode pegar emprestado qualquer conteúdo da biblioteca por três semanas; os assinantes ouro podem pegar emprestado por três meses. Após o término do prazo da locação, uma taxa será cobrada do assinante até que o item emprestado seja devolvido.

Fornece uma interface para o usuário:
Adicionar / editar / excluir instâncias pertencentes a cada classe;
Assinante navegando pelo conteúdo da biblioteca e selecione os itens a serem emprestados.
Assinante devolver o item emprestado, verificar seu saldo e paga qualquer taxa de atraso, se houver.
Admin pode imprimir relatórios de itens emprestados em atraso.