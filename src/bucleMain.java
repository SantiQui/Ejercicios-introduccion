public class bucleMain {
    public static void main(String[] args) {
        var numeroF = -8;
        if (numeroF>0){
            System.out.println("Es un numero positivo");
        } else if (numeroF==0) {
            System.out.println("Es 0");
        }else {
            System.out.println("Es un numero negativo");
        }
        var numeroWhile = -10;
        while (numeroWhile<3){
            System.out.println("El numero es "+ numeroWhile);
            numeroWhile++;
        }
        var numeroDoWhile = 2;
        do  {
            System.out.println("El numero es "+ numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile<3);

        for (int numeroFor = 0; numeroFor <=3; numeroFor++){
            System.out.println(numeroFor);
        }
        var estacion = "Otoño";
        switch(estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Otoño":
                System.out.println("Es otoño");
            default:
                System.out.println("Escriba bien la estacion");
        }
    }



}
