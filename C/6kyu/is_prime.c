#include <stdbool.h>
#include <stdio.h>


bool is_prime(int num)
{
int j;
int flag = 0;
     
   if (num <= 1)
    {
        return false;
    }
    flag = 0;
    for (j = 2; j <= num / 2; j++)
    {
        if ((num % j) == 0)
        {
            flag = 1;
            break;
        }
    }
    if (flag == 0)
        return true;
     else
        return false;
}