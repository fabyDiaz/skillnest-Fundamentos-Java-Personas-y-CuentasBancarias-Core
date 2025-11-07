public class Aplicacion {
    public static void main(String[] args) {
        //Crea al menos tres instancias de la clase Persona.
        Persona persona1 = new Persona("Sofía", 20);
        Persona persona2 = new Persona("Felipe", 24);
        Persona persona3 = new Persona("Carlos", 18);

        //Crea al menos tres instancias de la clase CuentaBancaria, asociando cada una con una persona creada previamente.
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria(persona1, 5000.0);
        CuentaBancaria cuentaBancaria2 = new CuentaBancaria(persona2, 7000.0);
        CuentaBancaria cuentaBancaria3 = new CuentaBancaria(persona3, 1000.0);
        
        //Realiza algunas operaciones de depósito y retiro en las cuentas bancarias creadas.
        cuentaBancaria1.depositar(500);
        cuentaBancaria2.retirar(200);
        cuentaBancaria3.retirar(1500);

        //Imprime el saldo actual de cada cuenta bancaria después de realizar las operaciones.
        System.out.println("Información de cada cuenta: ");
        System.out.println(cuentaBancaria1.despliegaInformacion());
        System.out.println(cuentaBancaria2.despliegaInformacion());
        System.out.println(cuentaBancaria3.despliegaInformacion());

        System.out.println("\n\n Información de todas las cuentas");
        //Ejecuta el método imprimeInformacionDeTodasLasCuentas().
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
