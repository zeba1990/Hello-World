#include <stdio.h>

int persistence(int n) {
    int num;
    for(int i = 0; ; i++ ) {
       
        if((n / 100)==0) {
          n = ((n%100)/10)*(n%10);
        } else {
          n =(n / 100)*((n%100)/10)*(n%10);
        }
        num = i+1;
        if((n / 10) == 0)
        break;
      
      
    }
    
    
  return num;
}

int main()
{
    int  num = persistence(999);
    printf("%d", num);

    return 0;
}