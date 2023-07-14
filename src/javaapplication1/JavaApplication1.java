/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author mezcl
 */
public class JavaApplication1 {
    //Contador
    int cont;
    //Una bandera
    boolean aceptado;
    //Arreglo para almacenar la cadena
    static char[] car;
    
    public static void main(String[] args) {
      JavaApplication1 aut = new JavaApplication1();
      String cadena ="aaabbbabcd";
      car = cadena.toCharArray();
      aut.inicio();
      if(aut.aceptado){
          System.out.print("La cadena es aceptada");
      }else{
      System.out.print("La cadena no es aceptada");
      }
    }
    
    //donde partira la automata
    public void inicio(){
    cont=0;
    aceptado = false;
    q0();
    }
  
    public void q0(){
    System.out.println("Entro en el estado q0: enciendo la lavadora");
    //Donde partira q0 pero no es aceptado
    aceptado=false;
    //Si existe un valor en la cadena y leght el tamaño de arreglo que lee
    if(cont<car.length){
    if(car[cont] == 'a'){
        cont++;
        q1();
        //El arreglo en su posición con es igual a 'b'
    }else if(car[cont]=='x'){
    cont++;
    q2();
    }else if(car[cont]=='y'){
    cont++;
    q3();
    }
    }
    }
    
    public void q1(){
    System.out.println("Entro en el estado q1: Llenar nivel, ajusta temperatura, llenar con suavitel");
    aceptado=false;
    //Si existe un valor en la cadena
    if(cont<car.length){
    if(car[cont] == 'a'){
        cont++;
        q1();
        //El arreglo en su posición con es igual a 'b'
    }else if(car[cont]=='b'){
    cont++;
    q2();
    }
    }
    }
   
    public void q2(){
    System.out.println("Entro en el estado q2: drenamos el suavitel, ciclo de enguaje, drenar");
    aceptado=false;
    //Si existe un valor en la cadena
    if(cont<car.length){
    if(car[cont] == 'b'){
        cont++;
        q2();
    //El arreglo en su posición con es igual a 'b'
    }else if(car[cont]=='c'){
    cont++;
    q3();
    }else if(car[cont]=='a'){
        cont++;
        q1();
    }
    }
    }
  
     public void q3(){
    System.out.println("Entro en el estado q3: centifrugar");
    aceptado=false;
    //Si existe un valor en la cadena
    if(cont<car.length){
    if(car[cont] == 'c'){
        cont++;
        q3();
    //El arreglo en su posición con es igual a 'b'
    }else if(car[cont]=='d'){
    cont++;
    q4();
    }else if(car[cont]=='b'){
        cont++;
        q2();
    }
    }
    }
    
    public void q4(){
    System.out.println("Entro en el estado final q4: termina el lavado");
    aceptado = true;
    }
     
     
    }
    
 
    
    
     /*
    
     public void q3(){
    System.out.println("Entro en el estado q3");
    aceptado=true;
    //Si existe un valor en la cadena
    if(cont<car.length){
    if(car[cont] == 'a'){
        cont++;
        q3();
        //El arreglo en su posición con es igual a 'b'
    }else if(car[cont]=='b'){
    cont++;
    q4();
    }
    }
    }
    
    
    public void q4(){
    System.out.println("Entro en el estado q4");
    aceptado = false;
    }
     
     */
     
    /*
     public void q0(){
    System.out.println("Entro en el estado q0");
    //Donde partira q0 pero no es aceptado
    aceptado=false;
    //Si existe un valor en la cadena y leght el tamaño de arreglo que lee
    if(cont<car.length){
    if(car[cont] == 'a'){
        cont++;
        q0();
        //El arreglo en su posición con es igual a 'b'
    }else if(car[cont]=='b'){
    cont++;
    q1();
    }
    }
    }
    
    public void q1(){
    System.out.println("Entro en el estado q1");
    aceptado=true;
    //Si existe un valor en la cadena
    if(cont<car.length){
    if(car[cont] == 'a'){
        cont++;
        q1();
        //El arreglo en su posición con es igual a 'b'
    }else if(car[cont]=='b'){
    cont++;
    q0();
    }
    }
    }
    */
    
    

