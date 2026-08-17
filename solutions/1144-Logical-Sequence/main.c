#include <stdio.h>
 
int main() {
 
    int n;
    scanf("%d",&n);
    int i2, i3;
    
    for(int i = 1 ; i <= n;i++){
        i2 = i*i;
        i3 = i*i*i;
        printf("%d %d %d\n",i,i2,i3);
        printf("%d %d %d\n",i,i2 + 1,i3 + 1);
    }
 
    return 0;
}