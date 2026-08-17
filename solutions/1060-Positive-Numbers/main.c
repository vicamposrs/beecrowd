#include <stdio.h>
 
int main() {
 
    float val;
    int positivos = 0;
    
    for(int i = 0; i < 6; i++){
        scanf("%f",&val);
        if(val > 0) positivos++;
    }
    
    printf("%d valores positivos\n",positivos);
 
    return 0;
}