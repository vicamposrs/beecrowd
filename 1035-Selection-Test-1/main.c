#include <stdio.h>
 
int main() {
 
    int A , B , C , D;
    scanf("%d %d %d %d",&A,&B,&C,&D);
    int aceito = 1;
    
    if(B <= C) aceito = 0; 
    if(D <= A) aceito = 0; 
    if(C + D <= A + B) aceito = 0;
    if(C <=0 || D <= 0) aceito = 0; 
    if(A%2 == 1) aceito = 0;
    
    if(aceito == 1) printf("Valores aceitos\n");
    else printf("Valores nao aceitos\n");
 
    return 0;
}