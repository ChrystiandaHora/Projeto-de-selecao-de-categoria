import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     
   System.out.println("\nBem vindo \nAo Museu do Conhecimento");
   System.out.println("Hoje iremos mostrar de forma interativa algumas espécies. \nPor Favor, selecione uma classe \nEscolha atrávés dos números.");
   System.out.println("\nVertebrado - 01 \nInvertebrado - 02");
   
   int escolha1= 0;
   int escolha2= 0;
   int escolha3= 0;
   int escolha4= 0;
   int escolha5= 0;
   int escolha6= 0;
   int escolha7= 0;
   int escolha8= 0;

   Scanner primeiro = new Scanner(System.in);
   escolha1 = primeiro.nextInt();

   if (escolha1 == 01){
     System.out.println("Classe dos Vertebrados!");
     System.out.println("\nVamos para mais uma classe");
     System.out.println("\nClasse das Aves - 03 \nClasse dos Mamíferos - 05");

     //Classe das Aves e Mamiferos ja escolha

     Scanner segundo = new Scanner(System.in);
     escolha2 = segundo.nextInt();

     if (escolha2 ==03){
     System.out.println("Classe das Aves!");
     System.out.println("\nVamos para mais uma classe");

     }else{
     System.out.println("Classe dos Mamíferos!");
     System.out.println("\nVamos para mais uma classe");
     System.out.println("\nClasse dos Onívoros - 11 \nClasse dos Herbívoros - 13");
     Scanner quarto = new Scanner(System.in);
     escolha4 = quarto.nextInt();
      if (escolha4 ==11){
     System.out.println("Classe dos Onívoros!");
     
     System.out.println("\nHomem");
     return;
     }else{
     System.out.println("Classe dos Herbívoros!");
     
     System.out.println("\nVaca");
     return;
     }
     }
     System.out.println("\nClasse dos Carnívoros - 07 \nClasse dos Onívoros - 09");
     Scanner terceiro = new Scanner(System.in);
     escolha3 = terceiro.nextInt();

     if (escolha3 ==07){
     System.out.println("Classe dos Carnívoros!");
     
     System.out.println("\nÁguia");
     return;

     }else{
     System.out.println("Classe dos Onívoros!");
     
     System.out.println("\nPomba");
     return;
    }


   }else{
     System.out.println("Classe dos Invertebrados!");
     System.out.println("\nVamos para mais uma classe");
   }if (escolha1 == 02){
     System.out.println("\nClasse dos Insetos - 04 \nClasse dos Anelídeos - 06");

     Scanner quinto = new Scanner(System.in);
     escolha5 = quinto.nextInt();

     if (escolha5 ==04){
     System.out.println("Classe dos Insetos!");
     System.out.println("\nVamos para mais uma classe");

     }else{
     System.out.println("Classe dos Anelídeos!");
     System.out.println("\nVamos para mais uma classe");
     System.out.println("\nClasse dos Hematofago - 12 \nClasse dos Onívoros - 14");
     Scanner sexto = new Scanner(System.in);
     escolha6 = sexto.nextInt();
      if (escolha6 ==12){
     System.out.println("Classe dos Hematofagos!");
     
     System.out.println("\nSanguessuga");
     return;
     }else{
     System.out.println("Classe dos Onívoros!");
     
     System.out.println("\nMinhoca");
     return;
     }
     }
     System.out.println("\nClasse dos Hematofagos - 8 \nClasse dos Herbivoros - 10");
     Scanner setimo = new Scanner(System.in);
     escolha7 = setimo.nextInt();

     if (escolha7 == 8){
     System.out.println("Classe dos Hematofagos!");
     
     System.out.println("\nPulga");
     return;

     }else{
     System.out.println("Classe dos Herbivoros!");
     
     System.out.println("\nLagarta");
     return;
   
   
    }
   }
    //NAO MEXE ISSO
  }
}