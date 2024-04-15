package com.MMG.HolaMundo;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        String sql = "select * from clientes c";
        sql += " where c.activo = 'S'";
        System.out.println(sql);


    }
}
