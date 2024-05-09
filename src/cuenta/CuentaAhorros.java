package cuenta;

/**
 *
 * @author LuisaLucio
 */
class CuentaAhorros extends Informacion {
    private double interesAnual;
    private double saldoMinimo;

    public CuentaAhorros(Persona cliente1, long noCuenta, double interesAnual, double saldoMinimo) {
        super(noCuenta, saldo, cliente);
        this.interesAnual = interesAnual;
        this.saldoMinimo = saldoMinimo;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
           
    @Override
    public void retirar(double cantidad) {
        if (saldo - cantidad >= saldoMinimo) {
            saldo -= cantidad;
        } else {
            System.out.println("No se puede retirar esa cantidad, saldo mínimo no permitido");
        }
    }

    @Override
    public void actualizarSaldo() {
        saldo += saldo * (interesAnual / 100);
        
    }
    
}
