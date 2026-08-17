#include <stdio.h>
 
int main() {
 
    int x;
    scanf("%d",&x);
    // se imprime os numeros impares de 1 ate o numero digitado
    for(int i = 1; i <= x ; i++)
        if(i%2 == 1) printf("%d\n",i);
 
    return 0;
}