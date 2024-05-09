package cuenta;

/**
 *
 * @author LuisaLucio
 */
class CuentaCorriente extends Informacion {
    
    public CuentaCorriente(Persona cliente, long noCuenta) {
        super(cliente, noCuenta);
    }
    @Override
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
                saldo -= cantidad;
            } else {
                System.out.println("No Hay Saldo Suficiente Para Retirar Esa Cantidad.");
            }
    }

    @Override
    public void actualizarSaldo() {
        saldo += saldo * 0.015;
        System.out.println("El Saldo Se Actualizo Correctamente.");
    }
}
