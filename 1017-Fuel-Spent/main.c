#include <stdio.h>
 
int main() {
    const float KM_POR_LITRO = 12.0;
    int tempo, velocidade;
    scanf("%d",&tempo);
    scanf("%d",&velocidade);
    
    float litros = (tempo*velocidade)/KM_POR_LITRO;
    printf("%.3f\n",litros);
 
    return 0;
}