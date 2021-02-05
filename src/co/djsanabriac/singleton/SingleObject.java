package co.djsanabriac.singleton;

public class SingleObject {

   //crea un objeto SingleObject
   private static SingleObject instance = new SingleObject();

   //Constructor privado para que la clase no pueda ser instanciada
   private SingleObject(){}

   //Obtiene el unico objeto disponible para el exterior
   public static SingleObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}