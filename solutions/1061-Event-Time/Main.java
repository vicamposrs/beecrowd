import java.util.Scanner;
class DiaHora{
    byte dia,hora,minuto,segundo;

    public DiaHora(){}
    public DiaHora(String d,String h){
        dia =  Byte.parseByte(d.substring(4));
        hora = Byte.parseByte(h.substring(0,2));
        minuto = Byte.parseByte(h.substring(5,7));
        segundo = Byte.parseByte(h.substring(10,12));
    }

}
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // le data inicial e final
        DiaHora dataInicial = new DiaHora(sc.nextLine(),sc.nextLine());
        DiaHora dataFinal = new DiaHora(sc.nextLine(),sc.nextLine());

        // final menos inicial
        DiaHora resultado = new DiaHora();
        resultado.dia = (byte)(dataFinal.dia - dataInicial.dia);
        resultado.hora = (byte)(dataFinal.hora - dataInicial.hora);
        resultado.minuto = (byte)(dataFinal.minuto - dataInicial.minuto);
        resultado.segundo = (byte)(dataFinal.segundo - dataInicial.segundo);
        // ajusta valores negativos
        if(resultado.segundo < 0){
            resultado.minuto--;
            resultado.segundo += 60;
        }
        if(resultado.minuto < 0){
            resultado.hora--;
            resultado.minuto += 60;
        }
        if(resultado.hora < 0){
            resultado.dia--;
            resultado.hora += 24;
        }
        //exibe
        System.out.println(resultado.dia + " dia(s)");
        System.out.println(resultado.hora + " hora(s)");
        System.out.println(resultado.minuto + " minuto(s)");
        System.out.println(resultado.segundo + " segundo(s)");

        sc.close();
    }
}