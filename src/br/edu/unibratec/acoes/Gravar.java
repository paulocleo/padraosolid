package br.edu.unibratec.acoes;

import br.edu.unibratec.Dados;

/**
 * Created by Paulo Cruz on 08/06/2016.
 */
public class Gravar {

    public  void gravarDados(Dados dado, String conn){
        System.out.println("Conexão: " + conn);
        System.out.println("Dados gravados com sucesso: " + dado.getDados());
    }
}
