import hsa.Console;
class Desempenio38_Clase4
{
static Console c;
public static void main (String arg[])
{
float i, a, valor, prom;
c = new Console();
i = 1;
a = 0;
while (i<=7)
{
c.print("Ingrese el valor: ");
valor = c.readFloat();
a = a + i;
i++;
}
prom = a / 7;

if (prom >= 100)
{
c.print("El promedio es mayor o igual a 100");
}
else
{
c.print ("El promedio es menor a 100");
}
}
}

