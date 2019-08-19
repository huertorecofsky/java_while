import hsa.Console;
class Desempenio42_Clase4
{
static Console c;
public static void main (String arg[])
{
int i,t;
c = new Console();
i=1;
t=500;
c.println("Impresion de 15 terminos la serie: ");
c.println();
while (i <= 15)
{
c.print(t+" ");
t = t + 25;
i++;
}
}
}
