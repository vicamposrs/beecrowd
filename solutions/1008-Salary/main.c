// 19-03-2026

#include <stdio.h>
 
int main() {
 
    int number , workedHours;
    float salaryPerHour;
    
    scanf("%d", &number);
    scanf("%d", &workedHours);
    scanf("%f", &salaryPerHour);
    
    printf("NUMBER = %d\n",number);
    printf("SALARY = U$ %.2f\n",workedHours*salaryPerHour);
 
    return 0;
}