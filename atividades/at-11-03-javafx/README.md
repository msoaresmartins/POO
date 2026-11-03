# AT-11-03: AlphaField JavaFX

Tela simples para listar e cadastrar produtos de uma mercearia. A entidade Produto tem código, nome, preço, quantidade e validade. Usei MVC: `Produto` (modelo), `ProdutoController` (controlador), a tela montada com componentes JavaFX (visão) e `ProdutoRepository` para persistência SQLite com ORMLite.

## Executar

Instale JDK 21 e Maven. Nesta pasta, execute `mvn javafx:run`. O arquivo `alphafield.db` é criado no diretório de execução. Cadastre um produto, feche e abra novamente para conferir a persistência.

## Capturas para a entrega

Adicionar depois de executar: `prints/01-lista-inicial.png`, `prints/02-produto-cadastrado.png` e `prints/03-persistencia-apos-reabrir.png`.
