#include <stdio.h>
 
int main() {
    float nota1,nota2,nota3;
    scanf("%f",&nota1);
    scanf("%f",&nota2);
    scanf("%f",&nota3);
    
    float media = (nota1*2 + nota2*3 + nota3*5)/10;
    printf("MEDIA = %.1f\n",media);
 
    return 0;
}