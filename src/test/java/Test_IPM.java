public class Test_IPM {
    public static void main(String[] args){
        Empleado e = new Empleado("Esteban Aguila","12546",18,true,2100);
        Programador p1 = new Programador("Franz Garcia","536556",36,false,2000,111,"Java");
        p1.nombre = "Franz Garcia";
        p1.salario = 2000;
        p1.AumentarSalario(0.20);
        p1.ImprimirEmpleado();
    }
}
