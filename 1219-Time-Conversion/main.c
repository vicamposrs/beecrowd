
#include <stdio.h>
#include <math.h>

#define PI 3.1415926535897

int main()
{
    int a, b ,c;
    scanf("%d %d %d",&a,&b,&c);
    
    double p = (a + b + c)/2;
    double triangleArea = sqrt(p*(p-a)*(p-b)*(p-c));
    
    double biggerRadius = (a*b*c)*(1/(4*triangleArea));
    //float biggerCircleArea = PI*pow(biggerRadius,2);
    double biggerCircleArea = PI*biggerRadius*biggerRadius;
    
    double smallerRadius = triangleArea/p;
    double smallerCircleArea =  PI*pow(smallerRadius,2);
    
    double sunflowerArea = biggerCircleArea - triangleArea;
    double violetArea = triangleArea - smallerCircleArea;
    double roseArea = smallerCircleArea;
    
   
    
    printf("%.4lf %.4lf %.4lf\n",sunflowerArea,violetArea,roseArea);

    return 0;
}
