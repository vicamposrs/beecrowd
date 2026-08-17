#include <stdio.h>
 
int main() {
 
    int p;
    scanf("%d",&p);
        
    int q,c;
    float soma = 0;
        
    for(int i = 0; i < p ; i++){
        scanf("%d %d",&c,&q);
        c -=1000;
        soma += (c + 0.5)*q;
    }
        
    printf("%.2f\n",soma) ;
 
    return 0;
}