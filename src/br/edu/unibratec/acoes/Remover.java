package br.edu.unibratec.acoes;

import br.edu.unibratec.Dados;

/**
 * Created by Paulo Cruz on 08/06/2016.
 */
public class Remover {

    public void removeDados(Dados dado, String conn){
        System.out.println("Conexão: " + conn);
        System.out.println("Removido dados com sucesso: " + dado.getDados());
    }
}
