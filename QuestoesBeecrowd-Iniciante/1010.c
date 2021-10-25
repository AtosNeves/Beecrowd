#include <stdio.h>
#include <stdlib.h>

float valor(int a2, float a3, int b2, float b3)
{
    float custo;
    custo = (a2 * a3) + (b2 * b3);
    return (custo);
}

int main()
{
    int cod1, qt1, cod2, qt2;
    float preco1, preco2, preco;
    scanf("%d %d %f", &cod1, &qt1, &preco1);

    scanf("%d %d %f", &cod2, &qt2, &preco2);

    preco = valor(qt1, preco1, qt2, preco2);
    printf("VALOR A PAGAR: R$ %.2f\n", preco);

    return 0;
}
