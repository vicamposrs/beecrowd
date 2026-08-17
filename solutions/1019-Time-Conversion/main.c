#include <stdio.h>
 
int main() {
 
    int N;
    scanf("%d",&N);
    int h, m,s;
    h = N/3600;
    N %=3600;
    m = N/60;
    s = N%60;
    
    printf("%d:%d:%d\n",h,m,s);
 
    return 0;
}