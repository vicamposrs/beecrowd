#include <stdio.h>
 
int main() {
 
    int code, quantity;
    float precos[5] = {4.0,4.5,5.0,2.0,1.5};
    scanf("%d %d",&code, &quantity);
    
    printf("Total: R$ %.2f\n", quantity*precos[code - 1]);
 
    return 0;
}