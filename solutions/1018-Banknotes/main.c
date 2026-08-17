#include <stdio.h>

int main()
{
    int valores[7] = {100,50,20,10,5,2,1};
    int quantidades[7];
    int total;
    scanf("%d",&total);
    printf("%d\n",total);
    
    for(int i = 0; i < 7; i++){
        quantidades[i] = total/valores[i];
        total = total%valores[i];
        printf("%d nota(s) de R$ %d,00\n",quantidades[i],valores[i]);
    }

    return 0;
}