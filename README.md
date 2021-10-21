# Desafio 1
<img alt="logo banco pan e gama academy" src="https://github.com/joaomhernandes/PAN-Academy/blob/main/Assets/gama-pan-academy-logo.svg" style="width: 300%, height: auto, margin-left: auto, margin-left: auto" />


# Turma 1 - Grupo 6 👩‍💻👨‍💻🚀

# Integrantes

 Bruno Claudino Matias, Charllyson Souza, João Maurício Hernandes Carrenho, Mateus Barros Almeida e Paulo Queiroz.

## Apresentação do desafio

 Será criado uma Loja virtual com Carrinho de Compras!

 Em resumo será possível buscar produtos por código, adicionar quantidades dos itens selecionados, somar os preços de diversos itens a serem comprados, cálculo das taxas e adicão de desconto dependendo da forma do pagamento.

# Requisitos:

A nossa loja deve conter estoque;
Caso produto esteja indisponível deve retornar a mensagem para o cliente “Produto Indisponível”;
Deverá ter 3 formas de pagamento: 
À vista (dinheiro ou pix) tem 20% de desconto;
À vista no crédito tem 10% de desconto;
Parcelado em até 3x não tem desconto;
Deve retornar a nota fiscal com o valor pago de tributos de 9% sobre a compra(Esse valor não deve ser somado ao total do carrinho, somente ser exibido na nota fiscal);
Caprichem no README lá vocês podem contar como fizeram e como foi o trabalho em equipe.
O Projeto pode ser feito somente em uma classe ou da forma que acharem melhor;
O PROGRAMA TEM QUE RODAR NO CONSOLE.


# Desenvolvimento

## 1º encontro em 20/11/2021

Inicialmente foi discutido e modelado o problema pelo grupo, chegando ao modelo abaixo:
<img src="https://user-images.githubusercontent.com/92064386/138007193-47cac947-928e-4909-a299-0ae99b35eed9.png" style="width: 244px, height: auto, margin-left: auto, margin-left: auto"/>

Em seguida foram desenvolvidas as classes Produtos e Loja. Na classe produto, além de seus atributos foram impementados o Constructor, os Getters e Setters, e Sobrescrita o metodo toString, a fim de formatar a saída do método.
Ja na classe Loja foram implementados os métodos div(), verMenuPrincipal(), verProdutos(), verCarrinho().
 - div() - Cria uma divisória, com ou sem titulo, para ajudar na formatação dos menus e formulários.
 - verMenuPrincipal() - Imprime a tela de menu, e utiliza a classe Scanner para ler a opção desejada. A estrutura de decisão utilizada foi uma estrutura de decisão condicional encadeada utilizando-se if else, e ao invés de se utilizar uma estrutura de repetição, optou-se por realizar um metodo recursivo, onde o método chama a si mesmo para efetuar uma repetição. 
 - verProdutos() - (To do) Levará para a lista de produtos disponíveis.
 - verCarrinho() - (To do) Levará para o carrinho de compras.

Nos próximos encontros serão tratados os (To do) e a implementação dos métodos pagamento(), emitirNota() e cancelarProduto(). 




