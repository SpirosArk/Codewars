#include <stdlib.h>
#include <stdio.h>

unsigned find_number(const unsigned *arr, size_t len)
{

unsigned int i, sum;

  sum = (len+1)*(len+2)/2;

  for (i=0; i < len; ++i)
  { 
    sum -= arr[i]; 
  }
  
  return sum;
  
}