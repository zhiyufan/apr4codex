package com.codex;

import java.util.*;

public class Solution {
#include<stdio.h>
#include<math.h>
int main()
{
  float x1,x2,x3,y1,y2,y3,D,D1,D2,D3;
  printf("enter the values of the vertices");
  scanf("%f %f %f %f %f %f",&x1,&y1,&x2,&y2,&x3,&y3);
  D=(x1)*(y2-y3)+(x2)*(y3-y1)+(x3)*(y1-y2);
  D1=((x1)*(y2-y3)+(x2)*(y3-y1)+(x3)*(y1-y2))/2;
  D2=((x3)*(y1-y2)+(x2)*(y3-y1)+(x1)*(y2-y3))/2;
  D3=((x1)*(y3-y1)+(x2)*(y1-y2)+(x3)*(y2-y3))/2;
  printf("(%f,%f)\n",(D1/D),(D2/D));
  printf("(%f,%f)\n",(D1/D),(D2/D));
  printf("(%f,%f)",(D1/D),(D2/D));
  return 0;
}
}