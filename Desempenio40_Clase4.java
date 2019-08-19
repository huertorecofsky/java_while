import hsa.Console;
class Desempenio40_Clase4
{
static Console c;
public static void main (String arg[])
{
int i, a, n;
c= new Console();
i = 1;
a = 0;
while (i <= 10)
{
c.print("Ingrese un numero: ");
n = c.readInt();
if (i > 5)
{
a = a + n;
}
i++;
}
c.print ("La suma de los ultimos 5 numeros ingresados es: " + a);
}
}
