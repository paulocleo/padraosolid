package br.edu.unibratec.dataBase;

import br.edu.unibratec.Dados;
import br.edu.unibratec.Repositorio;
import br.edu.unibratec.acoes.Editar;
import br.edu.unibratec.acoes.Gravar;
import br.edu.unibratec.acoes.Remover;

/**
 * Created by Paulo Cruz on 08/06/2016.
 */
public class Postgres implements Repositorio{
    Editar edita = new Editar();
    Gravar grava = new Gravar();
    Remover remove = new Remover();
    String conn = getconexao();

    @Override
    public void gravar(Dados dados) {
        grava.gravarDados(dados, conn);
    }

    @Override
    public void editar(Dados dados) {
        edita.editardados(dados, conn);
    }

    @Override
    public void remover(Dados dados) {
        remove.removeDados(dados, conn);
    }

    @Override
    public String getconexao() {
        return "jdbc: URL PostGres";

    }
}
