import java.util.ArrayList;

public class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    private static ArrayList<CuentaBancaria>listaDeCuentasBancarias = new ArrayList<>();

    public CuentaBancaria(Persona titular, double saldo){
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = (int)(Math.random() * (999999 - 100000 + 1)) + 100000;
        listaDeCuentasBancarias.add(this);
    }

    public CuentaBancaria(Persona titular){
        this(titular, 0.0);
    }

    //depositar(double monto): Añade el monto especificado al saldo de la cuenta.
    public void depositar(double monto){
        this.saldo = monto;
    }

    //retirar(double monto): Retira el monto especificado del saldo de la cuenta, si hay suficientes fondos.
    public void retirar(double monto){
        if(monto <= saldo){
            saldo-=monto;
        }else{
            System.out.println("no hay saldo suficiente en la cuenta: "+ numeroCuenta);
        }
    }

    //despliegaInformacion(): Muestra la información de la cuenta incluyendo la información del titular.
    public String despliegaInformacion(){
        return "CuentaBancaria [numeroCuenta=" + numeroCuenta  + ", titular=" + titular + ", Saldo=" + saldo + "]";
    }

    //imprimeInformacionDeTodasLasCuentas(): Método estático que recorre la lista de cuentas bancarias e imprime su información.
    public static void imprimeInformacionDeTodasLasCuentas(){
        for(CuentaBancaria cuentaBancaria: listaDeCuentasBancarias){
            System.out.println(cuentaBancaria);
        }
    }

    //Implementa getters y setters para todos los atributos.
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [saldo=" + saldo + ", titular=" + titular + ", numeroCuenta=" + numeroCuenta + "]";
    }

    

    
}
