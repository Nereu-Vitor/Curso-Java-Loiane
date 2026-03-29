package com.loiane.cursojava.aula46;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {

    public void abrirConexao();

    public void fecharConexao();

}
