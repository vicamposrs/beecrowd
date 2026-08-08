#include <stdio.h>
 
int main() {
 
    int n,valorTotal;
    scanf("%d %d",&n,&valorTotal);
    int valor, menorValor;
    menorValor = valorTotal;
    
    for(int i = 0; i < n ; i++){
        scanf("%d",&valor);
        valorTotal += valor;
        if(valorTotal < menorValor) menorValor = valorTotal;
    }
    printf("%d\n",menorValor);
 
    return 0;
}