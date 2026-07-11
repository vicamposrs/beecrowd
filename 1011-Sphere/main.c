#include <stdio.h>

#define pi 3.14159
 
int main() {
 
    float raio;
    scanf("%f",&raio);
    
    double volume = (double)((4.0/3)*pi*raio*raio*raio);
    
    printf("VOLUME = %.3f\n",volume);
 
    return 0;
}