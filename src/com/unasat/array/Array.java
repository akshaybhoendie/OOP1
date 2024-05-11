package com.unasat.array;

public class Array {

    static String[] namen = new String[] {"Cedric", "Amtul", "Jane"};
    static String[] lesdagen = new String[] {"MAANDAG",
                                            "DINSDAG",
                                            "WOENSDAG",
                                            "DONDERDAG",
                                            "VRIJDAG"};
    static int[] cijfer = new int[] {1,2,3,4,5,6,7,8,9,10};


    public static void main(String[] args){
        //tafelVanZeven(cijfer);
        tafels(cijfer, 2);
        //tafelOpBasisVanNaam("Amtul");
        //waarheidWordtBeloond(5);
        //indienCedricDoeTafelVan25(namen);

        /*boolean isErLes = isErlesOpDag(lesdagen, "ZATERDAG");

        if (isErLes) {
            System.out.println("Er is les");
        } else {
            System.out.println("Er is geen les");
        }*/

    }

    static void tafelVanZeven(int[] cijfers){
        for(int i = 0; i < cijfers.length; i++){
            System.out.println((i + 1) + " x " + " 7 = " + (cijfers[i] * 7));
        }
    }

    static void tafels(int[] cijfers, int tafel){
        for(int i = 0; i < cijfers.length; i++){
            System.out.println((i + 1) + " x " + tafel + " = " + (cijfers[i] * tafel));
        }
    }

    static void tafelOpBasisVanNaam(String naam) {
        switch (naam) {
            case "Cedric" :
                tafels(cijfer, 5);
                break;
            case "Amtul":
                tafels(cijfer, 10);
                break;
            case "Jane":
                tafels(cijfer, 20);
                break;

            default:
                System.out.println("Je naam komt niet voor");

        }
    }

    static void waarheidWordtBeloond(int salaris){
        while(salaris < 10) {
            System.out.println("Wordt beloond");

            salaris++;
        }
    }

    static void indienCedricDoeTafelVan25(String[] namen){
        for(int i = 0; i < namen.length; i++){
            if(namen[i].equalsIgnoreCase("cedric")){
                tafels(cijfer, 25);
            }
        }
    }

    static boolean isErlesOpDag(String[] weekdagen, String dagNaam){
        boolean isErLes = false;
        for (int i = 0; i < weekdagen.length; i++) {
            switch (dagNaam){
                case "MAANDAG":
                    return isErLes;

                case "DINSDAG":
                    return isErLes;

                case "WOENSDAG":
                    return isErLes = true;

                case "DONDERDAG":
                    return isErLes;

                case "VRIJDAG":
                    return isErLes = true;

                default:
                    System.out.println("Weekdag komt niet voor");
                    return isErLes;
            }
        }

        return isErLes;
    }
}
