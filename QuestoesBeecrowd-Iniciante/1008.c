#include <stdio.h>
#include <stdlib.h>

float salario(int a, float b)
{
    float s;
    s = a * b;
    return (s);
}
int main()
{
    int num, hora;
    float preco, s;
    scanf("%d", &num);
    scanf("%d", &hora);
    scanf("%f", &preco);

    s = salario(hora, preco);
    printf("NUMBER = %d\n", num);
    printf("SALARY = U$ %.2f\n", s);

    return 0;
}
