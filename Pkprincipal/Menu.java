package Pkprincipal;

import java.util.Scanner;

public class Menu {
    String[] Camiones = new String[5];
    int opcion;
    int carga;
    int resp;
    int[] cargaActual = new int[4];
    int[] capacidad = new int[4];
    double[] consumo = new double[4];
    public Menu() {
        this.guardainfocamiones();
    }
    public void imprimemenu()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Bienvenido a la aplicacion para menejo de transporte pesado");
        System.out.println("Ingrese la acción que desea realizar:");
        System.out.println("1.-Información de los camiones"+"\n"+"2.-Cargar Camion"+"\n"+ "3.- Descargar Camion"+"\n"+
                "4.-Determinar el mejor camion"+"\n"+"5.-Estado de carga actual del camion"+"\n"+"6.-Salir");
        this.opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion)
        {
            case 1:
                imprimircamiones();
                break;

            case 2:
                cargarcamiones();
                break;

            case 3:
                descargarcamion();
                break;

            case 4:
                mejorCamion();
                break;
            case 5:
                infocarga();
                break;

            case 6:
                System.exit(0);
                break;

        }

    }

    public void guardainfocamiones()
    {
    this.Camiones[0]="Placa:PBS3040"+"\n"+"Capacidad de carga:6000 kg"+"\n"+"Consumo de gasolina:15.5 kilometros/galon";
    this.Camiones[1]="Placa:PDD3744"+"\n"+"Capacidad de carga:4000 kg"+"\n"+"Consumo de gasolina:15.8 kilometros/galon";
    this.Camiones[2]="Placa:PFV3230"+"\n"+"Capacidad de carga:7000 kg"+"\n"+"Consumo de gasolina:26.5 kilometros/galon";
    this.Camiones[3]="Placa:GFT3230"+"\n"+"Capacidad de carga:11000 kg"+"\n"+"Consumo de gasolina:40 kilometros/galon";
    this.capacidad[0]=6000;
    this.capacidad[1]=4000;
    this.capacidad[2]=7000;
    this.capacidad[3]=11000;
    this.consumo[0]=15.5;
    this.consumo[1]=15.8;
    this.consumo[2]=26.5;
    this.consumo[3]=40;
    }

    public void imprimircamiones(){
        System.out.println("Información de los camiones:");
        for(int i = 0; i <= 3; ++i) {
            System.out.println("Camion" +(i + 1) + this.Camiones[i]);
        }
        imprimemenu();

    }


    public void cargarcamiones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el camión que desea cargar:");
        this.resp = sc.nextInt();
        sc.nextLine();

        switch (resp) {
            case 1:
                System.out.println("Ingrese la carga que desea agregar (En kilogramos):");
                this.carga = sc.nextInt();
                sc.nextLine();
                if (carga <= 6000) {

                    cargaActual[0] += carga;
                    System.out.println("Carga agregada exitosamente al camión 1.");
                } else {
                    System.out.println("La carga excede la capacidad del camión 1.");
                }
                break;
            case 2:
                System.out.println("Ingrese la carga que desea agregar (En kilogramos):");
                this.carga = sc.nextInt();
                sc.nextLine();
                if (carga <= 4000) {

                    cargaActual[1] += carga;
                    System.out.println("Carga agregada exitosamente al camión 2.");
                } else {
                    System.out.println("La carga excede la capacidad del camión 2.");
                }
                break;
            case 3:
                System.out.println("Ingrese la carga que desea agregar (En kilogramos):");
                this.carga = sc.nextInt();
                sc.nextLine();
                if (carga <= 7000) {

                    cargaActual[2] += carga;
                    System.out.println("Carga agregada exitosamente al camión 3.");
                } else {
                    System.out.println("La carga excede la capacidad del camión 3.");
                }
                break;
            case 4:
                System.out.println("Ingrese la carga que desea agregar (En kilogramos):");
                this.carga = sc.nextInt();
                sc.nextLine();
                if (carga <= 11000) {

                    cargaActual[3] += carga;
                    System.out.println("Carga agregada exitosamente al camión 4.");
                } else {
                    System.out.println("La carga excede la capacidad del camión 4.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        imprimemenu();
    }


    public void descargarcamion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el camión que desea descargar:");
        this.resp = sc.nextInt();
        sc.nextLine();

        switch (resp) {
            case 1:
                System.out.println("Carga actual del camión 1: " + cargaActual[0] + " kg");
                cargaActual[0] = 0;
                System.out.println("Se ha descargado el camión 1 exitosamente.");
                break;
            case 2:
                System.out.println("Carga actual del camión 2: " + cargaActual[1] + " kg");
                cargaActual[1] = 0;
                System.out.println("Se ha descargado el camión 2 exitosamente.");
                break;
            case 3:
                System.out.println("Carga actual del camión 3: " + cargaActual[2] + " kg");
                cargaActual[2] = 0;
                System.out.println("Se ha descargado el camión 3 exitosamente.");
                break;
            case 4:
                System.out.println("Carga actual del camión 4: " + cargaActual[3] + " kg");
                cargaActual[3] = 0;
                System.out.println("Se ha descargado el camión 4 exitosamente.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        imprimemenu();
    }
    public void infocarga()
    {
        System.out.println("Estado de carga de los camiones:");
        for (int i = 0; i <=3; i++) {
            System.out.println("Camión " + (i + 1) + ": Carga actual = " + cargaActual[i] + " kg de " + capacidad[i] + " kg");
        }
        imprimemenu();
    }
    public void mejorCamion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la carga deseada:");
        int cargaDeseada = sc.nextInt();
        double consumoMinimo = Double.MAX_VALUE; // Inicializar con un valor muy grande
        int mejorCamionIndex = -1; // Para mantener el índice del mejor camión encontrado

        for (int i = 0; i < 4; i++) {
            if (cargaDeseada <= capacidad[i] - cargaActual[i] && consumo[i] < consumoMinimo) {
                consumoMinimo = consumo[i];
                mejorCamionIndex = i;
            }
        }

        if (mejorCamionIndex != -1) {
            System.out.println("El mejor camión para la carga deseada es el Camión " + (mejorCamionIndex + 1) + ".");
        } else {
            System.out.println("No hay camiones disponibles que puedan transportar la carga deseada.");
        }
        imprimemenu();
    }
    }







