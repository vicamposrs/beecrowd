#include <stdio.h>
 
int main() {
 
    int a,b;
    scanf("%d %d", &a,&b);
    int temp;
    if(a > b){
       temp = a;
       a = b;
       b = temp;
    }
    
    if(b%a == 0){
        printf("Sao Multiplos\n");
    }
    else{
        printf("Nao sao Multiplos\n");
    }
 
    return 0;
}