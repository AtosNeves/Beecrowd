#include <stdio.h>
#include <stdlib.h>

double total(double s, double v)
{
    double porcentagem;
    porcentagem = s + (v * 0.15);
    return (porcentagem);
}

int main()
{

    char nome;
    double salario, vendas, final;

    scanf("%s", &nome);
    scanf("%lf", &salario);
    scanf("%lf", &vendas);
    final = total(salario, vendas);
    printf("TOTAL = R$ %.2f\n", final);

    return 0;
}