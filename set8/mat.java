class Matopn
{
 
 void matadd(int a[][],int b[][])
 {
  int [][]s=new int[2][2];
  int sum=0;
  for(int i=0;i<2;i++)
  {
   for(int j=0;j<2;j++)
   {
    s[i][j]=sum+a[i][j]+b[i][j];
   }
  }
  disp(s);
}
void matmul(int a[][],int b[][])
{
 int [][]c=new int[2][2];
 for(int i=0;i<2;i++)
 {
  for(int j=0;j<2;j++)
  {
   c[i][j]=0;
   for(int k=0;k<2;k++)
   {
    c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
   }
  }
 }
 disp(c);
}
 void disp(int s[][])
 {
  for(int i=0;i<2;i++)
  {
   for(int j=0;j<2;j++)
   {
    System.out.print(s[i][j]+" ");
   }
   System.out.println();
  }
  
 }
}



class Matrix
{
 public static void main(String[] args)
 {
  int r=2;
  int c=2;
  int [][]a=new int[r][c];
  int [][]b=new int[r][c];
  if(args.length<8)
  {
   return;
  }
  for(int i=0;i<2;i++)
  {
   for(int j=0;j<2;j++)
   {
    a[i][j]=Integer.parseInt(args[i*2+j]);
   }
  }
  for(int i=0;i<2;i++)
  {
   for(int j=0;j<2;j++)
   {
    b[i][j]=Integer.parseInt(args[i*2+j+4]);
   }
  }
  Matopn obj=new Matopn();
  System.out.println("Addition:");
  obj.matadd(a,b);
  System.out.println("Multiplication :");
  obj.matmul(a,b);
 /* obj.display(ma);
  int [][]mm=new int[2][2];
  mm=obj.matmul(a,b);
  obj.display(mm);
  */
 }
}
