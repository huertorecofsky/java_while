import hsa.Console;
class Desempenio39_Clase4
{
static Console c;
public static void main (String arg[])
{
int i, par, impar, cero, valor;
i=1;
par=0;
impar=0;
cero=0;
c = new Console ();
while (i <= 15)
{
c.print("Ingrese el valor: ");
valor = c.readInt();
if(valor % 2 == 0)
{
par++;
}
else
{
impar++;
}
if (valor % 10 == 00)
{
cero++;
}
i++;
}
c.println ("Terminados en cero: " + cero);
c.println("Pares: " + par );
c.println ("Impares: " + impar);
}
}

