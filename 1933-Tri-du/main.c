#include <stdio.h>
 
int main() {
 
    int A,B;
    scanf("%d %d",&A,&B);
    
    int maior = (A >B)?A:B;
    
    printf("%d\n",maior);
 
    return 0;
}