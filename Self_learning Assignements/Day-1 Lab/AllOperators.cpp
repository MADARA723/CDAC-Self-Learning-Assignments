/*Implement all operators in C++ 
*logical,unary,ternary,Assignment.

*/

#include<iostream>
using namespace std;

int main()
{ 
    int a=10,b=20,c=30;
    cout<<" a ="<<a<<"  b ="<<b<<"  c ="<<c<<endl;
        //logical operator;
    cout<<"logical operator "<<endl;
    //AND operator
    //If all the conditions are true then it will execute the block of code
    if(a>b && a>c)
{
    cout<<" a > b and c"<<endl;
} 
else{
    cout<<" a < b and c"<<endl;
}
 //OR operator
 //If any one condition is true then it will execute the block of code
 cout<<"OR operator "<<endl;
if(b==20 || c==30)
{
    cout<<" values of b and c are correct"<<endl;
}
else
{
    cout<<"values of b and c are incorrect"<<endl;
}
 //NOT operator
 cout<<"NOT operator "<<endl;
if(a!=10)
{
    cout<<"value of a is not 10"<<endl;
}
else{
    cout<<"value of a is 10"<<endl;
}
//unary operator
cout<<"unary operator "<<endl;
int x_y = ++a;
cout<<"value after increment of x_y is "<<x_y<<endl;
cout<<"value after increment is "<<a<<endl;
a--;
cout<<"value of a after decrement is "<<a<<endl;
//unary plus and minus operator
int x =5;
cout<<"value of x after unary + is "<<+x<<endl;
cout<<"value of x after unary - is "<<-x<<endl;
//adress of operator
cout<<"address of operator "<<endl;
cout<<"address of a , b and c is "<<&a<<" "<<&b<<" "<<&c<<endl;
//derefrence operator
cout<<"derefrence operator "<<endl;
int *ptr =&a;
cout<<"value of a using derefrence operator is "<<*ptr<<endl;
//sizeof operator
cout<<"sizeof operator "<<endl;
cout<<"size of int a is "<<sizeof(a)<<" bytes"<<endl;


//Ternary operator
cout<<"Ternary operator "<<endl;
int max = (a > b) ? a : b;
cout<<"the maximum value is "<<max<<endl;

//Assignement operator
cout<<"Assignment operator "<<endl;
cout<<"value of x before assignment is "<<x<<endl;
x += 3;// x = x+3
cout<<"value of x after assignment is "<<x<<endl;
x-=2;// x= x-2
cout<<"value of x after assignment is "<<x<<endl;
x *= 2; // x =x*2

cout<<"value of x after assignment is "<<x<<endl;
x /= 2; // x = x/2
cout<<"value of x after assignment is "<<x<<endl;   
x%=3; // x = x%2
cout<<"value of x after assignment is "<<x<<endl;
x<<=2; // x = x<<2
cout<<"value of x after assignment is "<<x<<endl;



   


//    cout<<"Enter the size of the array "<<endl;
//    cin>>n;
//    cout<<"enter the elements of the array "<<endl;
//    for (int i=0;i<n;i++)
//    {
//     cin>>a[i];
//    } 
//     cout<<" the elements of the array are "<<endl;
//     for (int i=0;i<n;i++)
//     {
//         cout<<a[i]<<" ";
//     }
//     //logical operator
//     cout<<endl;
//     cout<<"logical operator "<<endl;
//     if(a[0]>a[1] && a[0]>a[2]
//     {
//         cout<<""
//     })
}


