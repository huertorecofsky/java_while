import hsa.Console;
class Desempenio43_Clase4
{
static Console c;
public static void main (String arg[])
{
int i, menores, mayores, medio;
float a, cantidad, precio;
c= new Console();
i=1;
a=0;
menores=0;
mayores=0;
medio=0;
cantidad=0;
c.print("Ingrese el precio del producto: ");
precio = c.readFloat();
while (i <= 12)
{
cantidad++;
if (precio < 50)
{
menores++;
}
if (precio >=50 && precio <=100)
{
medio++;
}
if (precio > 100)
{
mayores++;
}
a = a + precio;
c.print("Ingrese el precio del producto: ");
precio = c.readFloat();
i++;
}

c.println("Precios mayores a 100: " + mayores);
c.println("Precios menores a 50: " + menores);
c.println("Precios entre 50 y 100: " + medio);
}
}
