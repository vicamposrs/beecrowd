#include <stdio.h>
 
int main() {
 
    int N;
    scanf("%d",&N);
    
    int quantidadePecas = (N + 1)*(N + 2)/2;
    
    printf("%d\n",quantidadePecas);
 
    return 0;
}