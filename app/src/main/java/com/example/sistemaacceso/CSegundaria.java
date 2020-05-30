package com.example.sistemaacceso;

public class CSegundaria extends CPrincipal {

    public int Loggeo(){
        if (Usuario.equals(Cliente) )
        {
            if(Password.equals(PW)){
                return 1;
            }
        }
        return 0;
    }
}
