package br.edu.unibratec;

/**
 * Created by Paulo Cruz on 08/06/2016.
 */
public interface Repositorio {

    void gravar(Dados dados);
    void editar(Dados dados);
    void remover(Dados dados);
    String getconexao();

}
