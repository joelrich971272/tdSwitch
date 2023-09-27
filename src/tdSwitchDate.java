import clavier.In;

public class tdSwitchDate {
    public static void main(String[] args) {
        int menu = 0;

        /*System.out.println("Entrer une valeur 1 et 7 correspondant au jour de la semaine ");
        menu = In.readInteger();

        switch ( menu ){
            case 1 :
                System.out.println("Aujourd'hui est Lundi");
                break;
            case 2 :
                System.out.println("Aujourd'hui est Mardi");
                break;
            case 3 :
                System.out.println("Aujourd'hui c'est Mercredi");
                break;
            case 4 :
                System.out.println("Aujourd'hui est Jeudi");
                break;
            case 5 :
                System.out.println("Aujourd'hui est Vendredi");
                break;
            case  6 :
                System.out.println("Aujourd'hui est Samedi");
                break;
            case 7 :
                System.out.println("Auhourd'hui est Dimanche");
                break;
        }*/
        int choix = 0;

        /*System.out.println("Entrer une valeur entre 1 et 12 qui correspond a un mois");
        choix = In.readInteger();

        switch (choix){
            case 1 :
                System.out.println("Nous sommes en Janvier");
                break;
            case  2 :
                System.out.println("Noussommes en Fevrier");
                break;
            case  3 :
                System.out.println("Nous sommes en Mars");
                break;
            case 4 :
                System.out.println("Nous sommes en Avril");
                break;
            case 5 :
                System.out.println("Nous sommes en Mai");
                break;
            case 6 :
                System.out.println("Nous sommes en Juin");
                break;
            case  7 :
                System.out.println("Nous sommes en Juillet");
                break;
            case 8 :
                System.out.println("Nous sommes en Aout");
                break;
            case 9 :
                System.out.println("Nous sommes en Septembre");
                break;
            case 10 :
                System.out.println("Nous sommes en Octobre ");
                break;
            case 11 :
                System.out.println("Nous sommes en Novembre");
                break;
            case 12 :
                System.out.println("Nous sommes en Decembre");
        }*/
        int mois = 0;

        System.out.println("Entrer une valeur entre 1 et 12 qui correspond a un mois pour savoir le nombre de jours qu'il contient : ");
        mois = In.readInteger();

        switch (mois){
            case 1 :
                System.out.println("Janvier comporte 31 jours");
                break;
            case 2 :
                System.out.println("fevrier comporte 28 jours");
                break;
            case 3 :
                System.out.println("Mars comporte 31 jours");
                break;
            case 4 :
                System.out.println("Avril comporte 30 jours");
                break;
            case 5 :
                System.out.println("Mai comporte 31 jours");
                break;
            case 6 :
                System.out.println("Juin comporte 30 jours");
                break;
            case 7 :
                System.out.println("Juillet comporte 31 jours");
                break;
            case 8 :
                System.out.println("Aout comporte 31 jours");
                break;
            case 9 :
                System.out.println("Septembre comporte 30 jours");
                break;
            case 10 :
                System.out.println("Octobre comporte 31 jours");
                break;
            case 11 :
                System.out.println("Novembre comporte 30 jours");
                break;
            case 12 :
                System.out.println("Decembre comporte 31 jours");
        }
    }
}
