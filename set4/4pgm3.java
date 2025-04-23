class Matrix
{
 public static void main(String args[])
 {
  int a[][]=new int[2][2];
  int b[][]=new int[2][2];
  int c[][]=new int[2][2];
  int l=args.length;
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
  for(int i=0;i<2;i++)
  {
   for(int j=0;j<2;j++)
   {
   c[i][j]=a[i][j]+b[i][j];
   }
  }
   System.out.println("Addition of Matrices:");
  for(int i=0;i<2;i++)
  {
   for(int j=0;j<2;j++)
   {
   System.out.print(c[i][j]+" ");;
   }
   System.out.println();
  }
 for(int i=0;i<2;i++)
  {
   
   for(int j=0;j<2;j++)
   {
   c[i][j]=0;
    for(int k=0;k<2;k++)
    {
     c[i][j]=c[i][j]+a[i][k]*b[k][j];
    }
   }
  }
   System.out.println("Multiplication of Matrices:");
  for(int i=0;i<2;i++)
  {
   for(int j=0;j<2;j++)
   {
   System.out.print(c[i][j]+" ");;
   }
   System.out.println();
  }
  
 }
}
