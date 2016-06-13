package br.edu.unibratec;

import br.edu.unibratec.dataBase.Mysql;
import br.edu.unibratec.dataBase.Oracle;
import br.edu.unibratec.dataBase.Postgres;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mysql mysql = new Mysql();
        Postgres postgres = new Postgres();
        Oracle oracle = new Oracle();

        System.out.println("GRAVANDO DADOS");
        mysql.gravar(new Dados("dados para a base mysql"));
        postgres.gravar(new Dados("dados para a base postgres"));
        oracle.gravar(new Dados("dados para a base oracle"));

        System.out.println("----------");
        System.out.println(" ");

        System.out.println("EDITANDO DADOS");
        mysql.editar(new Dados("dados editados da base mysql"));
        postgres.editar(new Dados("dados editados da base postgres"));
        oracle.editar(new Dados("dados editados da base oracle"));

        System.out.println("----------");
        System.out.println(" ");

        System.out.println("REMOVENDO DADOS");
        mysql.remover(new Dados("dados removidos da base mysql"));
        postgres.remover(new Dados("dados removidos da base postgres"));
        oracle.remover(new Dados("dados removidos da base oracle"));

    }
}
