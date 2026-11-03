package br.ufg.alphafield;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    private ProdutoRepository repositorio;

    @Override public void start(Stage palco) throws Exception {
        repositorio = new ProdutoRepository("alphafield.db");
        palco.setTitle("AlphaField - Cadastro de produtos");
        palco.setScene(new ProdutoController(repositorio).criarTela());
        palco.show();
    }

    @Override public void stop() throws Exception {
        if (repositorio != null) repositorio.close();
    }

    public static void main(String[] args) { launch(args); }
}
