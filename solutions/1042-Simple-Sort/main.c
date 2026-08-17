#include <stdio.h>
 
int main() {
 
    int a,b,c;
    int maior,medio,menor;
    scanf("%d %d %d",&a,&b,&c);
    
    if(a > b){
        if( b > c){
            maior = a;
            medio = b;
            menor = c;
        }else{
            if(a > c){
                maior = a;
                medio = c;
                menor = b;
            }
            else{
                maior = c;
                medio = a;
                menor = b;
            }
        }
    }
    else{
        if(b > c){
            maior = b;
            if(c > a){
                medio = c;
                menor = a;
            }
            else{
                medio = a;
                menor = c;
            }
        }
        else{
            maior = c;
            medio = b;
            menor = a;
        }
    }
    printf("%d\n%d\n%d\n\n",menor,medio, maior);
    printf("%d\n%d\n%d\n",a,b,c);
 
    return 0;
}