package cuenta;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LuisaLucio
 */
abstract class Cuenta {

    public Cuenta(Persona cliente, long noCuenta) {
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> clientes = new ArrayList<>();
        ArrayList<Cuenta> cuentas = new ArrayList<>();

        System.out.print("Ingrese la cantidad de clientes: ");
        int cantidadClientes = sc.nextInt();

        for (int i = 0; i < cantidadClientes; i++) {
            System.out.println("\nIngrese los datos del cliente " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.next();
            System.out.print("Apellidos: ");
            String apellidos = sc.next();
            System.out.print("NIF: ");
            String nif = sc.next();

            Persona cliente = new Persona(nombre, apellidos, nif);
            clientes.add(cliente);

            System.out.println("\nIngrese los datos de la cuenta corriente del cliente " + (i + 1) + ":");
            System.out.print("Número de cuenta: ");
            long numeroCuentaCorriente = sc.nextLong();
            System.out.print("Saldo inicial: ");
            double saldoInicialCorriente = sc.nextDouble();

            CuentaCorriente cuentaCorriente = new CuentaCorriente(cliente, numeroCuentaCorriente);
            cuentaCorriente.setSaldo(saldoInicialCorriente);
            cuentas.add(cuentaCorriente);

            System.out.println("\nIngrese los datos de la cuenta de ahorro del cliente " + (i + 1) + ":");
            System.out.print("Número de cuenta: ");
            long numeroCuentaAhorro = sc.nextLong();
            System.out.print("Interés anual: ");
            double interesAnual = sc.nextDouble();
            System.out.print("Saldo mínimo necesario: ");
            double saldoMinimo = sc.nextDouble();
            System.out.print("Saldo inicial: ");
            double saldoInicialAhorro = sc.nextDouble();

            CuentaAhorros cuentaAhorro = new CuentaAhorros(cliente, numeroCuentaAhorro, interesAnual, saldoMinimo);
            cuentaAhorro.setSaldo(saldoInicialAhorro);
         }
        
        for (Cuenta cuenta : cuentas) {
            System.out.println("\nInformación de la cuenta:");
            System.out.println("Cliente: " + cuenta.cliente);
            System.out.println("Número de cuenta: " + cuenta.getNoCuenta());
            System.out.println("Saldo actual: " + cuenta.getSaldo());
        }

        sc.close();
    }
        /**Scanner scanner = new Scanner(System.in);
        double ingresar;
        
        public void ingresar(double cantidad) {
        saldo += cantidad;
        actualizarSaldo();
        }   
        
        public void retirar(double cantidad) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
                actualizarSaldo();
            } else {
                System.out.println("Saldo insuficiente para retirar la cantidad especificada.");
            }
        }
        int opcion;
        
        
        do {

            System.out.println("QUE TIPO DE CUENTA TIENE");
            System.out.println("1. Cuenta Corriente");
            System.out.println("2. Cuanta Ahorros ");
            System.out.println("3. Mostrar Códigos Asignaturas ");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1: 
                    Asignatura materia = new Asignatura();
                    materia.registrar(mapaAsignaturas.size());
                    mapaAsignaturas.put(materia.getCodigo(), materia);
                break;
                case 2: 
                    System.out.println("Codigo a buscar: ");            
                    codigo = sc.nextInt();
                    Asignatura asignaturaObtenida = mapaAsignaturas.get(codigo);
                    if ( != ) {
                        System.out.println();
                    } else {
                        System.out.println();
                    }
                    
                break;
                case 3:
                    
                break;
                default:
                    break;
            }
        } while(opcion!=10);{
        sc.close();
        }
    

        // Solicitar al usuario ingresar los datos del cliente
        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese los apellidos del cliente:");
        String apellidos = scanner.nextLine();
        System.out.println("Ingrese el NIF del cliente:");
        String nif = scanner.nextLine();

        
        Persona cliente = new Persona(nombre, apellidos, nif);

        System.out.println("Ingrese el número de cuenta:");
        long numeroCuenta = scanner.nextLong();
        System.out.println("Ingrese el saldo inicial de la cuenta:");
        double saldoInicial = scanner.nextDouble();
        
        Cuenta cuenta = new Cuenta(cliente, numeroCuenta);
        cuenta.ingresar(saldoInicial);

        System.out.println("Información de la cuenta:");
        System.out.println(cuenta);

    private void actualizarSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
    *****/    
}