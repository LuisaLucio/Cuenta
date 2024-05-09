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
}