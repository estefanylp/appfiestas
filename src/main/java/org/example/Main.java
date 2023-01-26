package org.example;

public class Main {
    public static void main(String[] args) {
        //En el Main llamo a mis clases
        //En el main creo los objectos de mis clases
        //En el main creo una instancia de mi clase
        //En el main le saco copia a mis clases y creo objetos

        Invitado objetoDeClaseInvitado=new Invitado();
        Invitado objecto2=new Invitado(20,true,"estefany",10000);
        Invitado objecto3=new Invitado();

        //Obtener el valor de los atributos
        System.out.println(objetoDeClaseInvitado.valorEntrada);
        System.out.println(objecto2.valorEntrada);
    }
}