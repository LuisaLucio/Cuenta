package cuenta;

/**
 *
 * @author LuisaLucio
 */
abstract class Informacion {
    private long noCuenta;
    double saldo;
    String cliente;

    public Informacion(long noCuenta, double saldo, String cliente) {
        this.noCuenta = noCuenta;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    public long getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(long noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public void ingresar(double cantidad) {
        saldo += cantidad;
        actualizarSaldo();
    }

    public abstract void retirar(double cantidad);
        /**if (saldo >= cantidad) {
            saldo -= cantidad;
            actualizarSaldo();
        } else {
            System.out.println("No Hay Saldo Suficiente Para Retirar Esa Cantidad.");
        
    }**/

    public abstract void actualizarSaldo();/* {
        System.out.println("El Saldo Se Actualizo Correctamente.");
    }  **/
    
    
}
