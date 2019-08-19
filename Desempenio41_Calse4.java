import hsa.Console;
class Desempenio41_Calse4
{
static Console c;
public static void main (String arg[])
{
int i, t, suma, mul, resultado;
c = new Console();
i=1;
t=5;
suma=0;
mul=0;
resultado=0;
c.print("Impresion de la serie:");
c.println(); 
while (i <= 50)
{
t = t + 1;
mul = 5 * t;
suma = mul + suma;
i++;
}
{
resultado = suma;
}
{
c.print("El resultado es : " + resultado);
}
}
}
