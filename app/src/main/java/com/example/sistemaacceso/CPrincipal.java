package com.example.sistemaacceso;

import java.security.ProtectionDomain;

public class CPrincipal {

   protected String Usuario="prueba@prueba.com";
   protected String PW="12345";

   public String Cliente;
   public String Password;

   public  void Obtener(String Usu,String PW){
       Cliente=Usu;
       Password=PW;
   }
}
