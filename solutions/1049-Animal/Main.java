import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vertebrado = sc.nextLine();
        String tipo = sc.nextLine();
        String alimentacao =sc.nextLine();
        String animal ="";
        
        switch(vertebrado){
            case "vertebrado":
                switch(tipo){
                    case "ave":
                        switch(alimentacao){
                            case "carnivoro": animal = "aguia"; break;
                            case "onivoro": animal = "pomba"; break;
                        }
                        break;

                    case "mamifero":
                        switch(alimentacao){
                            case "onivoro": animal = "homem"; break;
                            case "herbivoro": animal = "vaca"; break;
                        }
                        break;
                }
                break;
            case "invertebrado":
                switch(tipo){
                    case "inseto":
                        switch(alimentacao){
                            case "hematofago": animal = "pulga"; break;
                            case "herbivoro": animal = "lagarta"; break;
                        }
                        break;
                    case "anelideo":
                        switch(alimentacao){
                            case "hematofago": animal = "sanguessuga"; break;
                            case "onivoro": animal = "minhoca"; break;
                        }
                        break;
                }

        }
        System.out.println(animal);
        sc.close();
    }
}