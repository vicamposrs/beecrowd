#include <stdio.h>
 
int main() {
 
    float salario , novoSalario;
    int ajusto;
    scanf("%f",&salario);
    
    if( salario <= 400 ) ajusto = 15;
    else if(salario <= 800) ajusto = 12;
    else if(salario <= 1200) ajusto = 10;
    else if(salario <= 2000) ajusto = 7;
    else ajusto = 4;
    
    novoSalario = salario*(1.0 +ajusto/100.0);
    
    printf("Novo salario: %.2f\n",novoSalario);
    printf("Reajuste ganho: %.2f\n",novoSalario - salario);
    printf("Em percentual: %d %\n",ajusto);
 
    return 0;
}