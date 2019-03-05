#include <stdio.h>
int main() {
	//Type your code
  int n,r,q,l;
  scanf("%d",&n);
  l=n%10;
  while(n!=0)
  {
    r=n%10;
  //  s=s+r;
   n=n/10;
  }
  printf("%d",l+r);
	return 0;
}