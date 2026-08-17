#include <stdio.h>
 
int main() {
 
    int n;
    scanf("%d",&n);
    // se for par passa para proximo impar
    if(n%2 == 0) n++;
    
    // exibe o atual impar e os 5 proximos
    for(int i = 0; i < 6; i++){
        printf("%d\n",n + 2*i);
    }
 
    return 0;
}