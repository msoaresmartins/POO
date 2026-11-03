package br.ufg.alphafield;

import java.sql.SQLException;
import java.util.List;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class ProdutoRepository implements AutoCloseable {
    private final JdbcConnectionSource conexao;
    private final Dao<Produto, String> dao;

    public ProdutoRepository(String arquivo) throws SQLException {
        conexao = new JdbcConnectionSource("jdbc:sqlite:" + arquivo);
        dao = DaoManager.createDao(conexao, Produto.class);
        TableUtils.createTableIfNotExists(conexao, Produto.class);
    }

    public List<Produto> listar() throws SQLException { return dao.queryForAll(); }
    public void cadastrar(Produto produto) throws SQLException { dao.create(produto); }
    public boolean existe(String codigo) throws SQLException { return dao.idExists(codigo); }
    @Override public void close() throws Exception { conexao.close(); }
}
