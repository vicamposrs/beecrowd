#include <stdio.h>
 
int main() {
 
    int N;
    scanf("%d",&N);
    int i = 1;
    while(i <= N/2){
        if(N%i == 0) printf("%d\n",i);
        i++;
    }
    printf("%d\n",N);
 
    return 0;
}