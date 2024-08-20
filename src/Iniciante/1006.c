#include <stdio.h>
#include <stdlib.h>

int main()
{
    float media(float na, float nb, float nc)
    {

        float resultado;
        resultado = ((na * 2) + (nb * 3) + (nc * 5)) / 10;
        return resultado;
    }

    float a, b, c, resultado;
    scanf("%f", &a);
    scanf("%f", &b);
    scanf("%f", &c);

    resultado = media(a, b, c);
    printf("MEDIA = %.1lf\n", resultado);

    return 0;
}
