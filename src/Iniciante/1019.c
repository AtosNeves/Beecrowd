#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "");
    int segundos = 0, minutos = 0, horas = 0;
    scanf("%d", &segundos);

    while (segundos >= 60)
    {

        minutos += 1;
        segundos -= 60;
    }
    while (minutos >= 60)
    {
        horas += 1;
        minutos -= 60;
    }
    printf("%d:%d:%d\n", horas, minutos, segundos);
    return 0;
}