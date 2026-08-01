#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vezes;
    int * raios;
    
    scanf("%d",&vezes);
    raios = (int*)malloc(vezes*sizeof(int));
    
    int r1, r2;
    
    for(int i = 0; i < vezes; i++){
        scanf("%d %d",&r1,&r2);
        raios[i] = r1 + r2;
    }
    for(int i = 0; i < vezes ; i++) printf("%d\n", raios[i]);

    return 0;
}