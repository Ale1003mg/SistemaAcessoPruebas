package com.example.sistemaacceso;

public class CSegundaria extends CPrincipal {

    public int Loggeo(){
        if (Usuario==Cliente && Password==PW)
        {
            return 1;
        }
        return 0;
    }
}
