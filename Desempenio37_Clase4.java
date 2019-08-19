import hsa.Console;
class Desempenio37_Clase4
{
static Console c;
public static void main (String arg[])
{
int i, a;
c = new Console();
i = 1;
a = 0;
c.print("Impresion de la suma de todos los numeros del 1 al 100: ");
while (i<=100)
{
a = a + i;
i++;
}
c.print(a);
}
}

