#include <stdio.h>
 
int main() {
 
    int C[4];
    scanf("%d %d %d %d",&C[0],&C[1],&C[2],&C[3]);
    int bean;
    for(int i = 0; i < 4; i ++){
        if(C[i] == 1) printf("%d\n",i + 1);
    }
 
    return 0;
}