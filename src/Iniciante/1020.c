#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
    setlocale(LC_ALL, "");
    int ano = 0, mes = 0, dia = 0;
    scanf("%d", &dia);
    ano = dia / 365;
    int restodia = dia % 365;
    mes = restodia / 30;
    restodia = restodia % 30;

    printf("%d ano(s)\n", ano);
    printf("%d mes(es)\n", mes);
    printf("%d dia(s)\n", restodia);

    return 0;
}