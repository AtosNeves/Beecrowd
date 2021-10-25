#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <math.h>

int main()
{
    setlocale(LC_ALL, "pt-br");
    float n1, n2, n3, n4, nexame;

    scanf("%f %f %f %f", &n1, &n2, &n3, &n4);

    float media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;
    printf("MEDIA: %.1f\n", media);
    if (media >= 7)
    {
        printf("Aluno aprovado.\n");
    }
    else if (media < 5)
    {
        printf("Aluno reprovado.\n");
    }

    else
    {
        printf("Aluno em exame.\n");
        scanf("%f", &nexame);
        printf("Nota do exame: %.1f\n", nexame);
        nexame = (media + nexame) / 2;
        if (nexame >= 5)
        {
            printf("Aluno aprovado.\n");
            printf("Media final: %.1f\n", nexame);
        }
        else
        {
            printf("Aluno reprovado.\n");
        }
    }

    return 0;
}