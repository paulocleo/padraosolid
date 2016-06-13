package br.edu.unibratec.acoes;

import br.edu.unibratec.Dados;

/**
 * Created by Paulo Cruz on 08/06/2016.
 */
public class Editar {

    public void editardados(Dados dado, String conn){
        System.out.println("Conexão: " + conn);
        System.out.println("Dados editados! " + dado.getDados());
    }
}
