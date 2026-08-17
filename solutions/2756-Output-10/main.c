#include <stdio.h>
 
int main() {
    char letra;
    for(int i = 0; i < 5; i++){
        letra = 65 + i;
        for(int j = 0; j < 7-i; j++) printf(" ");
        printf("%c",letra);
        if(i != 0){
            for(int j =0; j < 2*i - 1; j++) printf(" ");
            printf("%c",letra);
        }
        printf("\n");
    }
    for(int i = 3; i >= 0 ; i--){
        letra = 65 + i;
        for(int j = 0; j < 7-i; j++) printf(" ");
        printf("%c",letra);
        if(i != 0){
            for(int j =0; j < 2*i - 1;j++) printf(" ");
            printf("%c",letra);
        }
        printf("\n");
    }
 
    return 0;
}